package com.example.invoice_service.dto;
import com.example.invoice_service.Entitie.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class ReponseDtoInvoice {
    private String id;
    private Date date;
    private BigDecimal amount;
    private Customer customer;
}
