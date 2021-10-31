package com.example.customer_service_openlab.Services;

import com.example.customer_service_openlab.Dto.ReponseDtoCustomer;
import com.example.customer_service_openlab.Dto.RequestDtoCustomer;

import java.util.List;

public interface ServiceCustomer {

    ReponseDtoCustomer update(RequestDtoCustomer  requestDtoCustomer) ;
    ReponseDtoCustomer  getCustomer(String  id) ;
    ReponseDtoCustomer  save(RequestDtoCustomer  customerRequestDTO) ;
    List<ReponseDtoCustomer> getCustomers() ;
    ReponseDtoCustomer  delete(String  id);
}
