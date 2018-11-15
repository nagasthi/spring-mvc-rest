package com.anusha.springframework.springmvcrest.bootstrap;

import com.anusha.springframework.springmvcrest.domain.Customer;
import com.anusha.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Anusha");
        c1.setLastname("Agasthi");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Sahiti");
        c2.setLastname("Pandu");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Harika");
        c3.setLastname("Guntupalli");
        customerRepository.save(c3);

        Customer c4 = new Customer();
        c4.setFirstname("Pavan");
        c4.setLastname("Kumar");
        customerRepository.save(c4);


        System.out.println("Customers Saved"+customerRepository.count());
    }
}
