package com.example.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(GatewayServiceApplication.class, args);
    }
    /*
    @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

        return builder.routes()
                .route((r)->r.path("/customers/**").uri("http://localhost:8082/").id("r1"))
                .route((r)->r.path("/invoices/**").uri("http://localhost:8083/").id("r2"))
                .build();


    }
*/
    //dynamique
    /*
@Bean
RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

    return builder.routes()

            .route(r->r.path("/customers/**").uri("lb://CUSTOMER-SERVICE") .id("r1"))
            .route(r->r.path("/invoices/**").uri("lb://BILLING-SERVICE") .id("r2"))
            .build();

}*/
/*
@Bean
DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,
                                                    DiscoveryLocatorProperties dlp){

    return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);

}*/
}
