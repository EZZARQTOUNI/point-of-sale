package com.jwt.pfe.mapper;

import com.jwt.pfe.dto.request.CustomerRequest;
import com.jwt.pfe.dto.response.CustomerResponse;
import com.jwt.pfe.repository.entity.Customer;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface CustomerMapper {
    Customer customerRequestToCustomer(CustomerRequest customerRequest);
    CustomerResponse customerToCustomerResponse(Customer customer);
    Customer updateCustomer(CustomerRequest customerRequest, Customer customer);
}
