package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "items")
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// public class Item implements Serializable{
// 	@Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
// 	private Integer id;
// 	@Column(nullable = false)
// 	private String name;
// 	@Column(nullable = false)
// 	private Integer price;
// 	@Column(nullable = false)
// 	private String imgPath;
// }

@Entity
@Table(name = "items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Integer price;
	@Column(nullable = false)
	private String imgPath;

	Integer getId() {
		System.out.println("hoge");
			return this.id;
	}

	String getName() {
			return this.name;
	}

	Integer getPrice() {
			return this.price;
	}

	String getImgPath() {
		return this.imgPath;
	}

	protected void setId(final Integer id) {
			this.id = id;
	}

	protected void setName(final String name) {
			this.name = name;
	}

	protected void setPrice(final Integer price) {
			this.price = price;
	}

	protected void setImgPath(final String imgPath) {
		this.imgPath = imgPath;
	}
}
