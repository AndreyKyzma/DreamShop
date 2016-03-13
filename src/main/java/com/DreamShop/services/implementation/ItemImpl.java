package com.dreamshop.services.implementation;

import com.dreamshop.model.ItemsSKU;
import com.dreamshop.repository.ItemsRepository;
import com.dreamshop.services.ItemsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Kyza on 12.03.2016.
 */
@Service
public class ItemImpl implements ItemsService {

    @Autowired
    ItemsRepository itemsRepository;


    @Override
    public List<ItemsSKU> getAll() {
        return itemsRepository.findAll();
    }

    @Override
    public ItemsSKU addItem(ItemsSKU itemsSKU) {
        return itemsRepository.saveAndFlush(itemsSKU);
    }

}
