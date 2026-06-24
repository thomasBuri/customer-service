package com.buri.customer.service;

import com.buri.customer.dao.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Override
    public boolean registerCustomer(Customer user) {
        return true;
    }

    @Override
    public List<Customer> getCustomreList() {
        return List.of(new Customer(1L, "Thomas","Buri", "java.thomasburi@gmail.com", "S1234567"),
                new Customer(1L, "Julia","Buri", "juliaburi@gmail.com", "S2345678"));
    }

    @Override
    public Customer getCustomerByIdCardNumber(String userId) {
        return new Customer(1L,"Thomas", "Buri", "java.thomasburi@gmail.com", "S1234567");
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return new Customer(1L,"Thomas", "Buri", "java.thomasburi@gmail.com", "S1234567");
    }
}
