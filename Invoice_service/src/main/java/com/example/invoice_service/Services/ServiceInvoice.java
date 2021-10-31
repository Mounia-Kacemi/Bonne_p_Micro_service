package com.example.invoice_service.Services;

import com.example.invoice_service.dto.ReponseDtoInvoice;
import com.example.invoice_service.dto.RequestDtoInvoice;

import java.util.List;

public interface ServiceInvoice {

    ReponseDtoInvoice save(RequestDtoInvoice requestDtoInvoice);
    ReponseDtoInvoice getinvoice(String invoiceId);
    List<ReponseDtoInvoice> invoicesByCustomerId(String customerId);
}
