package com.leilei.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.leilei.mapper.three",sqlSessionFactoryRef = "threeSqlSessionFactory")
public class ThreeDataSourceConfig {

    @Bean(name = "threeDataSource")
    public DataSource masterDataSource(DB3Config ThreeConfig){
        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
        mysqlXADataSource.setUrl(ThreeConfig.getUrl_jdbc());
        mysqlXADataSource.setUser(ThreeConfig.getUsername());
        mysqlXADataSource.setPassword(ThreeConfig.getPassword());
        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(mysqlXADataSource);
        atomikosDataSourceBean.setUniqueResourceName("threeDataSource");
        return atomikosDataSourceBean;
    }

    @Bean(name = "threeSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("threeDataSource") DataSource dataSource) throws Exception {
        //配置myabtisSqlSession
        MybatisSqlSessionFactoryBean sessionFactoryBean = new MybatisSqlSessionFactoryBean();
        // 指明mapper.xml位置(配置文件中指明的xml位置会失效用此方式代替，具体原因未知)
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/leilei/mapper/three/*Mapper.xml"));
        // 指明实体扫描(多个package用逗号或者分号分隔)
        sessionFactoryBean.setTypeAliasesPackage("com.leilei.domain.three");

        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
        //mybatisConfiguration.setJdbcTypeForNull(JdbcType.NULL);
        //驼峰
        mybatisConfiguration.setMapUnderscoreToCamelCase(true);
        //是否开启缓存
        mybatisConfiguration.setCacheEnabled(false);
        //多数据源下分页模式
        mybatisConfiguration.addInterceptor(new PaginationInterceptor());
        // 配置打印sql语句
        mybatisConfiguration.setLogImpl(StdOutImpl.class);
        sessionFactoryBean.setConfiguration(mybatisConfiguration);
        //数据源注入
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean.getObject();
    }
    @Bean(name = "threeSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("threeSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
