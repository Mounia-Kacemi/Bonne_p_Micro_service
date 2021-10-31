package com.example.customer_service_openlab.Web;

import com.example.customer_service_openlab.Dto.ReponseDtoCustomer;
import com.example.customer_service_openlab.Dto.RequestDtoCustomer;
import com.example.customer_service_openlab.Services.ServiceCustomer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api")
public class RestApiCustomer {

    private ServiceCustomer serviceCustomer;

    public RestApiCustomer( ServiceCustomer  serviceCustomer) {

        this.serviceCustomer=serviceCustomer;
    }

    @GetMapping(path="/customers")
    public List<ReponseDtoCustomer> customers(){

        return serviceCustomer.getCustomers();
    }

    @RequestMapping(path="/customers/{id}")
    public ReponseDtoCustomer customerById(@PathVariable String id ){

        return serviceCustomer.getCustomer(id);

    }


    @PostMapping(path="/customers")
    public ReponseDtoCustomer save( @RequestBody RequestDtoCustomer requestDtoCustomer ){
        requestDtoCustomer.setId(UUID.randomUUID().toString());
        return serviceCustomer.save(requestDtoCustomer);

    }

    @PutMapping(path="/customers/update/{id}")
    public ReponseDtoCustomer update( @RequestBody RequestDtoCustomer  requestDtoCustomer,@PathVariable  String id){

        return serviceCustomer.save(requestDtoCustomer);
    }

    @DeleteMapping(path="/customers/update/{id}")
    public ReponseDtoCustomer delete( @PathVariable  String id){

        return serviceCustomer.delete(id);

    }

}