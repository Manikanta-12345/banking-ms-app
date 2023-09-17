package com.techapps.tellicaller.controller;

import com.techapps.tellicaller.dto.CustomerDto;
import com.techapps.tellicaller.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/customers/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer-details/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerDetails(@PathVariable String customerId){

        return new ResponseEntity<CustomerDto>(customerService.getCustomerDetails(customerId), HttpStatus.OK);
    }
}
