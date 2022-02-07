package com.ldp.assignment.LDP.dao;

import com.ldp.assignment.LDP.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
