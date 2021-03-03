package com.getapi.getapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getapi.getapi.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
}
