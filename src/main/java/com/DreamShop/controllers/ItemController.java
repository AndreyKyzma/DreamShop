package com.dreamshop.controllers;

import com.dreamshop.model.ItemsSKU;
import com.dreamshop.repository.ItemsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Kyza on 12.03.2016.
 */
@RestController
@RequestMapping(value = "/items")

public class ItemController {

    @Resource
    private ItemsRepository itemsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<ItemsSKU>> getAllItems() {
        Iterable<ItemsSKU> allItems = itemsRepository.findAll();
        return new ResponseEntity<>(allItems, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemsSKU> getSingleItem(@PathVariable("id") Integer id) {
        ItemsSKU itemsSKU = itemsRepository.findOne(id);
        if (itemsSKU != null) {
            return new ResponseEntity<>(itemsSKU, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
