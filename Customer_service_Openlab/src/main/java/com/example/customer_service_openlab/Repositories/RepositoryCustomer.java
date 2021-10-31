package com.example.customer_service_openlab.Repositories;

import com.example.customer_service_openlab.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCustomer extends JpaRepository<Customer, String> {

}
