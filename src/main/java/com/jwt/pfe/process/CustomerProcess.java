package com.jwt.pfe.process;

import com.jwt.pfe.dto.request.CustomerRequest;
import com.jwt.pfe.dto.response.CustomerResponse;
import com.jwt.pfe.repository.entity.Customer;

import java.util.List;

public interface CustomerProcess {
    CustomerResponse createCustomer(CustomerRequest customerRequest);
    void deleteCustomer(Long id);

    CustomerResponse updateCustomer(CustomerRequest customerRequest,Long id);

    List<Customer> findAll();
}
