package com.jwt.pfe.controller.Imp;

import com.jwt.pfe.controller.CustomerController;
import com.jwt.pfe.dto.request.CustomerRequest;
import com.jwt.pfe.dto.response.CustomerResponse;
import com.jwt.pfe.process.CustomerProcess;
import com.jwt.pfe.repository.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerControllerImp implements CustomerController {


    @Autowired
    CustomerProcess customerProcess;


    @Override
    public ResponseEntity<CustomerResponse> create(CustomerRequest customerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                customerProcess.createCustomer(customerRequest)
        );
    }

    @Override
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(customerProcess.findAll());
    }

    @Override
    public ResponseEntity<CustomerResponse> update(CustomerRequest customerRequest,Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                customerProcess.updateCustomer(customerRequest,id)
        );
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        customerProcess.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
