package com.anusha.springframework.springmvcrest.repositories;

import com.anusha.springframework.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
