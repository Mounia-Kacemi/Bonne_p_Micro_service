package com.example.invoice_service.Openfeign;

import com.example.invoice_service.Entitie.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
@FeignClient(name="CUSTOMER-SERVICE")
public interface RestClientCustomer {
    @GetMapping(path="/api/customers/{id}")
    Customer getCustomer(@PathVariable(name="id") String id);
    @GetMapping(path="/api/customers")
    List<Customer> allCustomers();
}
