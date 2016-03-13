package com.dreamshop.services;

import com.dreamshop.model.ItemsSKU;

import java.util.List;

/**
 * Created by Kyza on 12.03.2016.
 */
public interface ItemsService {
    List<ItemsSKU> getAll();
    ItemsSKU addItem(ItemsSKU itemsSKU);

}
