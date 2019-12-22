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
@ConfigurationProperties(prefix = "spring.datasource.three")
public class DB3Config {

    @Value("${spring.datasource.three.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.three.username}")
    private String username;

    @Value("${spring.datasource.three.password}")
    private String password;
}
