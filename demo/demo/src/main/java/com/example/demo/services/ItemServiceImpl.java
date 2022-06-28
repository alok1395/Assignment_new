package com.example.demo.services;

import com.example.demo.DAO.ItemDao;
import com.example.demo.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemDao itemDao;

    @Autowired
    ItemService itemService;
    @Override
    public Item addItem(Item item) {

        itemService.addItem(Item.getItem_id());
        itemDao.save(item);
        return item;

    }
}
