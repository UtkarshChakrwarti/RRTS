package com.typhoone.rrts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RrtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RrtsApplication.class, args);
    }

}
