package com.example.invoice_service.Mapper;

import com.example.invoice_service.Entitie.Invoice;
import com.example.invoice_service.dto.ReponseDtoInvoice;
import com.example.invoice_service.dto.RequestDtoInvoice;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface MapperInvoice {
    Invoice fromRequestDtoInvoice(RequestDtoInvoice requestDtoInvoice);
    ReponseDtoInvoice fromInvoice(Invoice invoice);
}
