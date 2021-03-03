package com.getapi.getapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getapi.getapi.domain.Item;
import com.getapi.getapi.service.ItemService;

@RestController
@RequestMapping("api/items")
public class ItemRestController {
    @Autowired
    ItemService itemService;
    
    @GetMapping
    List<Item> getItems() {
        List<Item> items = itemService.findAll();
        System.out.print(items);
        return items;
    }

}
