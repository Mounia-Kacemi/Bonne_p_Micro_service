package com.example.invoice_service.Services;

import com.example.invoice_service.Entitie.Customer;
import com.example.invoice_service.Entitie.Invoice;
import com.example.invoice_service.Mapper.MapperInvoice;
import com.example.invoice_service.Openfeign.RestClientCustomer;
import com.example.invoice_service.Repositories.RepositoryInvoice;
import com.example.invoice_service.Services.ServiceInvoice;
import com.example.invoice_service.dto.ReponseDtoInvoice;
import com.example.invoice_service.dto.RequestDtoInvoice;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ServiceInvoiceImpl implements ServiceInvoice {
    private RepositoryInvoice repositoryInvoice;
    private MapperInvoice mapperInvoice;
    private RestClientCustomer restClientCustomer;

    public ServiceInvoiceImpl(RepositoryInvoice repositoryInvoice, MapperInvoice mapperInvoice, RestClientCustomer restClientCustomer) {
        this.repositoryInvoice = repositoryInvoice;
        this.mapperInvoice = mapperInvoice;
        this.restClientCustomer = restClientCustomer;
    }

    @Override
    public ReponseDtoInvoice save(RequestDtoInvoice RequestDtoInvoice) {
        Invoice invoice=mapperInvoice.fromRequestDtoInvoice(RequestDtoInvoice);
        invoice.setId(UUID.randomUUID().toString());
        Invoice saveInvoice=repositoryInvoice.save(invoice);
        return mapperInvoice.fromInvoice(saveInvoice);
    }

    @Override
    public ReponseDtoInvoice getinvoice(String invoiceId) {
        Invoice invoice=repositoryInvoice.findById(invoiceId).get();
        Customer customer=restClientCustomer.getCustomer(invoice.getCustomerId());
        invoice.setCustomer(customer);
        return mapperInvoice.fromInvoice(invoice);
    }

    @Override
    public List<ReponseDtoInvoice> invoicesByCustomerId(String customerId) {
        List<Invoice> invoices=repositoryInvoice.findByCustomerId(customerId);
        return invoices.
                stream()
                .map(invoice->mapperInvoice.fromInvoice(invoice))
                .collect(Collectors.toList());

    }
}
