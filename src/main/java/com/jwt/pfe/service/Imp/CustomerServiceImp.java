package com.jwt.pfe.service.Imp;

import com.jwt.pfe.repository.CustomerRepository;
import com.jwt.pfe.repository.entity.Customer;
import com.jwt.pfe.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createOrUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Optional<Customer> c = customerRepository.findCustomerById(id);
        if(c.isPresent())
            customerRepository.delete(c.get());
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return (customerRepository.findCustomerById(id));
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
