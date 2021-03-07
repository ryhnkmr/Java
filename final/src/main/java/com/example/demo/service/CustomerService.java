package com.example.demo.service;

import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	/**
	 * 顧客一覧取得サービス
	 * @return List<customer>
	 */
	public Customer findByCusomerId(String id) {
		return customerRepository.findByCustomerId(id);
	}
	
	/**
	 * 顧客登録サービス
	 * @param customer
	 * @return customer
	 */
	public Customer create(Map<String, String> customer) {
		return customerRepository.save(customer);
	}

	/**
	 * 顧客削除サービス
	 * @param id
	 */
	public void deleteByCustomerId(String id) {
		customerRepository.deleteByCustomerId(id);
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
