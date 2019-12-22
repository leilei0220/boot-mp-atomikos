package com.leilei;

import com.leilei.config.DB1Config;
import com.leilei.config.DB2Config;
import com.leilei.config.DB3Config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan(basePackages = "com.leilei.mapper")
@EnableConfigurationProperties(value = {DB1Config.class, DB2Config.class, DB3Config.class})
public class SpringbootMysqlMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlMybatisplusApplication.class, args);
    }

}
