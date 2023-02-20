package com.jwt.pfe.controller;

import com.jwt.pfe.dto.request.CustomerRequest;
import com.jwt.pfe.dto.response.CustomerResponse;
import com.jwt.pfe.repository.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Validated
@RequestMapping("customer")
public interface CustomerController {

    @PostMapping
    ResponseEntity<CustomerResponse> create(@Valid @RequestBody CustomerRequest customerRequest);

    @GetMapping("all")
    ResponseEntity<List<Customer>> getAll();

    @PutMapping("{id}")
    ResponseEntity<CustomerResponse> update(@Valid @RequestBody CustomerRequest customerRequest,@PathVariable("id") @NotNull Long id);

    @DeleteMapping("{id}")
    ResponseEntity<Void> delete(@PathVariable("id") @NotNull Long id);


}
