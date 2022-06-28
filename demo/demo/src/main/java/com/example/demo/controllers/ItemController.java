package com.example.demo.controllers;


import com.example.demo.DTO.ItemDTO;
import com.example.demo.entities.Item;
import com.example.demo.services.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value= "/Assignment/item", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity newItem(@RequestBody ItemDTO itemDTO) {
        Item item = modelMapper.map(itemDTO, Item.class);
        Item savedItem = itemService.addItem(item);
        ItemDTO savedItemDTO = modelMapper.map(savedItem,ItemDTO.class);
        return new ResponseEntity<>(savedItemDTO, HttpStatus.CREATED);
    }
}
