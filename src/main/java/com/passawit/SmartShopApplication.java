package com.passawit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SmartShopApplication {
    public static void main(String[] args) {
      SpringApplication.run(SmartShopApplication.class, args);
    }
}
