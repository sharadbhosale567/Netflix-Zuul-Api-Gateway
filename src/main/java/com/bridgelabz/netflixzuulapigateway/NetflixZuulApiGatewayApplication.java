package com.bridgelabz.netflixzuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetflixZuulApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulApiGatewayApplication.class, args);

        System.out.println("Welcome to Netflix Zuul Api Gateway......");
    }

}
