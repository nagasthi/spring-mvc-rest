package com.anusha.springframework.springmvcrest.service;

import com.anusha.springframework.springmvcrest.domain.Customer;
import com.anusha.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long Id) {
        return customerRepository.findById(Id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomers(Customer customer) {
        return customerRepository.save(customer);
    }
}
