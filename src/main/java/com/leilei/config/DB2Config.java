package com.leilei.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author leilei
 * @Date 2019/12/21 17:20
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource.two")
public class DB2Config {

    @Value("${spring.datasource.two.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.two.username}")
    private String username;

    @Value("${spring.datasource.two.password}")
    private String password;
}
