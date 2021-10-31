package com.example.invoice_service.Web;

import com.example.invoice_service.Services.ServiceInvoice;
import com.example.invoice_service.dto.ReponseDtoInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class RestControllerInvoice {

    private ServiceInvoice serviceInvoice;

    public RestControllerInvoice() {
    }

    public RestControllerInvoice(ServiceInvoice serviceInvoice) {
        this.serviceInvoice = serviceInvoice;
    }

    @GetMapping(path="/invoices/{id}")
    public ReponseDtoInvoice getInvoice(@PathVariable(name="id") String invoiceId){
        return serviceInvoice.getinvoice(invoiceId);
    }

    @GetMapping(path="/invoices/{customerId}")
    public List<ReponseDtoInvoice> getInvoicesByCustomer(@PathVariable String customerId){
        return serviceInvoice.invoicesByCustomerId(customerId);
    }
}
