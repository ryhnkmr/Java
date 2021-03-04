package com.getapi.getapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.getapi.getapi.domain.Item;
import com.getapi.getapi.service.ItemService;

@RestController
@RequestMapping("api/items")
public class ItemRestController {
    @Autowired
    ItemService itemService;

    /**
     * 商品一覧取得API
     * @return List<item>
     */
    @GetMapping
    List<Item> getItems() {
        List<Item> customers = itemService.findAll();
        return customers;
    }
    
    /**
     * 商品登録API
     * @param item
     * @return item
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Item postItem(@RequestBody Item item) {
    	return itemService.create(item);
    }

    /**
     * 商品削除API
     * @param id
     */
    @DeleteMapping(path = "{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteItem(@PathVariable Integer id) {
    	itemService.delete(id);
    }
    
    /**
     * 商品更新API
     * @param id
     * @param item
     * @return item
     */
    @PutMapping(path = "{id}")
    Item putItem(@PathVariable Integer id, @RequestBody Item item) {
    	item.setId(id);
    	return itemService.update(item);
    }

}
