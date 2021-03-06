package com.betterbound.finaltraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betterbound.finaltraining.domain.Customer;
import com.betterbound.finaltraining.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	/**
	 * 顧客一覧取得サービス
	 * @return List<customer>
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	/**
	 * 顧客登録サービス
	 * @param customer
	 * @return customer
	 */
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * 顧客削除サービス
	 * @param id
	 */
	public void delete(Integer id) {
		customerRepository.deleteById(id);
	}
	
	/**
	 * 顧客更新サービス
	 * @param customer
	 * @return customer
	 */
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}
	
}
