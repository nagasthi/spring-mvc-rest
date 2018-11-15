package com.anusha.springframework.springmvcrest.controllers;

import com.anusha.springframework.springmvcrest.domain.Customer;
import com.anusha.springframework.springmvcrest.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nagasthi on 11/15/2018.
 */
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
    public static final String BASE_URL = "/api/customers";
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer saveCustomers(@RequestBody Customer customer){
        return customerService.saveCustomers(customer);

    }

}
