package com.betterbound.finaltraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betterbound.finaltraining.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}
