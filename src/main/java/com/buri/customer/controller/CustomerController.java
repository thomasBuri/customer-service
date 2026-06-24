package com.buri.customer.controller;

import com.buri.customer.dao.Customer;
import com.buri.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/register-customer")
    public boolean registerCustomer(@RequestBody Customer customer){
        log.info("Customer successfully registered with these data : {}", customer);
        return customerService.registerCustomer(customer);
    }

    @GetMapping("/customer-list")
    public List<Customer> getCustomerList(){
        log.info("customer-list endpoint called");
        return customerService.getCustomreList();
    }

    @PostMapping("/get-customer-by-id-card-number")
    public Customer getCustomerByIdCardNumber(@RequestBody String idCardNumber){
        log.info("get-customer-by-id-card-number endpoint called");
        return customerService.getCustomerByIdCardNumber(idCardNumber);
    }

    @PostMapping("/get-customer-by-email")
    public Customer getCustomerByEmail(@RequestBody String email){
        log.info("get-customer-by-email endpoint called");
        return customerService.getCustomerByEmail(email);
    }
}
