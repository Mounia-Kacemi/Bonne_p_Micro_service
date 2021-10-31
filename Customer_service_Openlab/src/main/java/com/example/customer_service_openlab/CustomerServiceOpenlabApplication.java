package com.example.customer_service_openlab;

import com.example.customer_service_openlab.Dto.RequestDtoCustomer;
import com.example.customer_service_openlab.Services.ServiceCustomer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceOpenlabApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerServiceOpenlabApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ServiceCustomer serviceCustomer){
        return args -> {
          serviceCustomer.save(new RequestDtoCustomer("M1","Mounia","mounia@gmail.com"));
            serviceCustomer.save(new RequestDtoCustomer("A1","kacemi","kacemi@gmail.com"));
            serviceCustomer.save(new RequestDtoCustomer("Y1","yasmine","yasmine@gmail.com"));
            serviceCustomer.save(new RequestDtoCustomer("L1","Lamia","lamia@gmail.com"));

        };

    }

}
