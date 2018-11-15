package com.anusha.springframework.springmvcrest.service;

import com.anusha.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long Id);
    List<Customer> findAllCustomers();

    Customer saveCustomers(Customer customer);
}
