package com.exchange.coinex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CoinexEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinexEurekaApplication.class, args);
    }

}
