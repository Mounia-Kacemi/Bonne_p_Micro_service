package com.example.customer_service_openlab.Services;

import com.example.customer_service_openlab.Dto.ReponseDtoCustomer;
import com.example.customer_service_openlab.Dto.RequestDtoCustomer;
import com.example.customer_service_openlab.Entities.Customer;
import com.example.customer_service_openlab.Mappers.MapperCustomer;
import com.example.customer_service_openlab.Repositories.RepositoryCustomer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCustomerImpl implements ServiceCustomer{


    private RepositoryCustomer customerRepository;

    private MapperCustomer customerMapper;

    public ServiceCustomerImpl(RepositoryCustomer customerRepository,MapperCustomer customerMapper) {

        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;

    }


    @Override
    public ReponseDtoCustomer update(RequestDtoCustomer requestDtoCustomer) {
        Customer customer = customerMapper.customerRequestDTOTocustomer(requestDtoCustomer);
        Customer customerUpdate = customerRepository.save(customer);
        ReponseDtoCustomer customerReponseDTO = customerMapper.customerTocustomerReponseDTO(customerUpdate);
        return customerReponseDTO;
    }

    @Override
    public ReponseDtoCustomer getCustomer(String id) {
        Customer customer = customerRepository.findById(id).get();
        ReponseDtoCustomer customerReponseDTO = customerMapper.customerTocustomerReponseDTO(customer);

        return customerReponseDTO;
    }

    @Override
    public ReponseDtoCustomer save(RequestDtoCustomer customerRequestDTO) {
        Customer customer = customerMapper.customerRequestDTOTocustomer(customerRequestDTO);
        Customer customerSave = customerRepository.save(customer);
        ReponseDtoCustomer reponseDtoCustomer = customerMapper.customerTocustomerReponseDTO(customerSave);

        return reponseDtoCustomer;
    }

    @Override
    public List<ReponseDtoCustomer> getCustomers() {

        List<Customer> listCustomers = customerRepository.findAll();

        List<ReponseDtoCustomer> listCustomersDTO =
                listCustomers.stream()
                        .map(customer -> customerMapper.customerTocustomerReponseDTO(customer))
                        .collect(Collectors.toList());

        return listCustomersDTO;
    }

    @Override
    public ReponseDtoCustomer delete(String id) {

        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
       ReponseDtoCustomer customerReponseDTO = customerMapper.customerTocustomerReponseDTO(customer);

        return customerReponseDTO;
    }
}
