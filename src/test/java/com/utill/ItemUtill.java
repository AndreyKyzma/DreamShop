package com.utill;

import com.dreamshop.model.ItemsSKU;

/**
 * Created by Kyza on 12.03.2016.
 */
public class ItemUtill {
    public static ItemsSKU createItem(){
        ItemsSKU itemsSKU = new ItemsSKU();
        itemsSKU.setNameItems("Cola");
        return itemsSKU;
    }
}
