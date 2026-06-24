package com.buri.customer.service;

import com.buri.customer.dao.Customer;

import java.util.List;

public interface CustomerService {
    boolean registerCustomer(Customer user);
    List<Customer> getCustomreList();
    Customer getCustomerByIdCardNumber(String userId);
    Customer getCustomerByEmail(String email);
}
