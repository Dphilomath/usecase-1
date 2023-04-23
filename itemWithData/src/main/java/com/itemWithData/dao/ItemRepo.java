package com.itemWithData.dao;

import com.itemWithData.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends CrudRepository<Item, String> {

}
