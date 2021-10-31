package com.example.invoice_service;

import com.example.invoice_service.Services.ServiceInvoice;
import com.example.invoice_service.dto.RequestDtoInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@EnableFeignClients
@SpringBootApplication
public class InvoiceServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(InvoiceServiceApplication.class, args);
    }

 /*   @Bean
    CommandLineRunner commandLineRunner(ServiceInvoice serviceInvoice){
        return args -> {
            serviceInvoice.save(new RequestDtoInvoice(BigDecimal.valueOf(190000),"M1"));
            serviceInvoice.save(new RequestDtoInvoice(BigDecimal.valueOf(980000),"Y1"));
            serviceInvoice.save(new RequestDtoInvoice(BigDecimal.valueOf(80000),"L1"));

        };

    }*/


}
