package com.example.invoice_service.dto;

import com.example.invoice_service.dto.ReponseDtoInvoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor
public class RequestDtoInvoice extends ReponseDtoInvoice {
        private BigDecimal amount;
        private String clientID;
}
