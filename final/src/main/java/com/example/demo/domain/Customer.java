package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable{
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "CustomerIdGenerator", strategy = "com.example.demo.util.CustomerIdGenerator") 
    // generatorには@GenericGeneratorのnameを指定
	@GeneratedValue(generator = "CustomerIdGenerator") 
	private String customerId;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String birthday;

  @Column(nullable = false)
	private String tel;

  @Column(nullable = false)
	private String postalCode;

  @Column(nullable = false)
	private String address;

  @Column()
	private Integer purchasedTimes;

  @Column()
	private String lastPurchasedAt;
}
