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
@ConfigurationProperties(prefix = "spring.datasource.one")
public class DB1Config {

    @Value("${spring.datasource.one.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.one.username}")
    private String username;

    @Value("${spring.datasource.one.password}")
    private String password;
}
