package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@RestController
// @RequestMapping("api/v1/customer")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;

    /**
     * 顧客取得API
     * @return List<customer>
     */
    @GetMapping("api/v1/customer/{customer_id}")
    Customer getCustomer(@PathVariable String customer_id) {
      Customer customer = customerService.findByCusomerId(customer_id);
      return customer;
    }
    
    /**
     * 顧客登録API
     * @param customer
     * @return customer
     */
    @PostMapping("api/v1/customer")
    @ResponseStatus(HttpStatus.CREATED)
    Customer postCustomer(@RequestBody Customer customer) {
    	return customerService.create(customer);
    }

    /**
     * 顧客削除API
     * @param id
     */
    @DeleteMapping("api/v1/customer/{customer_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCustomer(@PathVariable String customer_id) {
    	customerService.deleteByCustomerId(customer_id);
      
    }
    
    /**
     * 顧客更新API
     * @param id
     * @param customer
     * @return customer
     */
    @PutMapping(value = "api/v1/customer/{customer_id}")
    Customer putCustomer(@PathVariable String customer_id, @RequestBody Customer customer) {
    	customer.setCustomerId(customer_id);
    	return customerService.update(customer);
    }
}
