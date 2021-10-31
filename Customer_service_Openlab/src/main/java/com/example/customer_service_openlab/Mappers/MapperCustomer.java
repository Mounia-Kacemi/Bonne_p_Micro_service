package com.example.customer_service_openlab.Mappers;

import com.example.customer_service_openlab.Dto.ReponseDtoCustomer;
import com.example.customer_service_openlab.Dto.RequestDtoCustomer;
import com.example.customer_service_openlab.Entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface MapperCustomer {

   ReponseDtoCustomer customerTocustomerReponseDTO(Customer customer);
    Customer  customerRequestDTOTocustomer(RequestDtoCustomer requestDtoCustomer);

}
