package br.com.philippesis.testespringhsqldb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    public DataSourceConfig() {}

    @ConfigurationProperties(prefix = "datasource.postgres")
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.hsqldb.jdbc.JDBCDriver");
        dataSourceBuilder.url("jdbc:hsqldb:hsql://localhost/spring-test-db");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
