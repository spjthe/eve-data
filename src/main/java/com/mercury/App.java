package com.mercury;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@ComponentScan
@EnableAutoConfiguration
@Import(RepositoryRestMvcConfiguration.class)
@ImportResource("classpath:spring-config.xml")
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
