package com.mercury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.TomcatDataSourceConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@ComponentScan
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@Import(RepositoryRestMvcConfiguration.class)
@ImportResource("classpath:spring-config.xml")
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
