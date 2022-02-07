package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{cust_id}")
    public Customer getCustomer(@PathVariable int cust_id){

        Customer customer=customerService.getCustomer(cust_id);

        if(customer==null){
            throw new CustomerNotFoundException("Customer id not found :"+ cust_id);
        }

        return customer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){


        //set id as 0 as it is saveorupdate() in he=ibernate;
        customer.setId(0);
        customerService.saveCustomer(customer);
        return customer;
    }

    @PatchMapping("/customers")
    public Customer patchCustomer(@RequestBody Customer customer){

        customerService.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable int id){

        if(customerService.getCustomer(id)==null){
            throw new CustomerNotFoundException("Customer is not exixting to delete " +id);
        }
        customerService.deleteCustomer(id);

        return "Customer has been deleted"+ id;
    }
}
