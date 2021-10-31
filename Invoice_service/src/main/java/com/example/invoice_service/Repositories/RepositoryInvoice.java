package com.example.invoice_service.Repositories;

import com.example.invoice_service.Entitie.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryInvoice extends JpaRepository<Invoice,String> {
    List<Invoice> findByCustomerId(String customerId);

}
