package com.dreamshop.repository;

import com.dreamshop.model.ItemsSKU;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kyza on 10.03.2016.
 */

public interface ItemsRepository extends JpaRepository<ItemsSKU, Integer> {


}
