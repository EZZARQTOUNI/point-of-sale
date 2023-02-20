package com.jwt.pfe.process.Imp;

import com.jwt.pfe.dto.request.CustomerRequest;
import com.jwt.pfe.dto.response.CustomerResponse;
import com.jwt.pfe.exception.CustomException;
import com.jwt.pfe.mapper.CustomerMapper;
import com.jwt.pfe.process.CustomerProcess;
import com.jwt.pfe.repository.entity.Customer;
import com.jwt.pfe.service.CustomerService;
import com.sun.javaws.exceptions.InvalidArgumentException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerProcessImp implements CustomerProcess {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        Customer c = customerService.createOrUpdateCustomer(
                customerMapper.customerRequestToCustomer(customerRequest)
        );
        return customerMapper.customerToCustomerResponse(
                c
        );
    }

    @Override
    public void deleteCustomer(Long id) {
        customerService.deleteCustomer(id);
    }

    @Override
    public CustomerResponse updateCustomer(CustomerRequest customerRequest,Long id) throws RuntimeException{
        Optional<Customer> c = customerService.findCustomerById(id);
        if(c.isPresent())
            return customerMapper.customerToCustomerResponse(
                    customerService.createOrUpdateCustomer(
                            customerMapper.updateCustomer(customerRequest,c.get())
                    )
            );
        throw new CustomException("Bad Request",404);
    }

    @Override
    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
