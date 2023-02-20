package com.jwt.pfe.repository;

import com.jwt.pfe.repository.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends GenericRepository<Customer,Long>{
    Optional<Customer> findCustomerById(Long id);
}
