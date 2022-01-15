package com.devmvk.springpetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEnvironmentConfig {

    private final String dbUserName;
    private final String dbPassword;
    private final String jdbcUrl;

    public ApplicationEnvironmentConfig(@Value("${devmvk.springpetclinic.dbUserName}") String dbUserName,
                                        @Value("${devmvk.springpetclinic.dbPassword}") String dbPassword,
                                        @Value("${devmvk.springpetclinic.jdbcurl}") String jdbcUrl) {
        this.dbUserName = dbUserName;
        this.dbPassword = dbPassword;
        this.jdbcUrl = jdbcUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
