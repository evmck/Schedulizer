package com.BurlApp.Schedulizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.BurlApp.Schedulizer"})
@EnableJpaRepositories(basePackages="com.BurlApp.Schedulizer")
@EnableTransactionManagement
@EntityScan("com.BurlApp.Schedulizer")
public class SchedulizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulizerApplication.class, args);
	}

}