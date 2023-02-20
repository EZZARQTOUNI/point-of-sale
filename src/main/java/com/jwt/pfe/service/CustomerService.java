package com.jwt.pfe.service;

import com.jwt.pfe.repository.entity.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer createOrUpdateCustomer(Customer customer);

    void deleteCustomer(Long id);

    Optional<Customer> findCustomerById(Long id);

    List<Customer> findAll();
}
