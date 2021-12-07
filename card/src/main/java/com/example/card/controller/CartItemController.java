package com.example.card.controller;

import com.example.card.model.CartItem;
import com.example.card.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-item")
public class CartItemController {

    @Autowired
    CartItemService cartItemService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CartItem create(@RequestBody CartItem cart){
        return cartItemService.create(cart);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<CartItem> getAll(){
        return cartItemService.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        cartItemService.delete(id);
    }
    @RequestMapping(value = "/delete/card/{id}", method = RequestMethod.DELETE)
    public void deleteByCardId(@PathVariable Long id){
        cartItemService.deleteByCardId(id);
    }

    @RequestMapping(value = "/get/all/cart/{id}", method = RequestMethod.GET)
    public List<CartItem> getAllByCart(@PathVariable Long id) {
        return cartItemService.getAllByCart(id);
    }

    @RequestMapping(value = "/get/all/toy/{id}", method = RequestMethod.GET)
    public List<CartItem> getAllByToy(@PathVariable Long id) {
        return cartItemService.getAllByToy(id);
    }

    @RequestMapping(value = "/get/all/quantity/greater" , method = RequestMethod.GET)
    public List<CartItem> getAllByQuantityGreater(@Param(value = "quan") Long quan) {
        return cartItemService.getAllByQuantityGreater(quan);
    }
    @RequestMapping(value = "/get/all/quantity/less", method = RequestMethod.GET)
    public List<CartItem> getAllByQuantityLess(@Param(value = "quan") Long quan) {
        return cartItemService.getAllByQuantityLess(quan);
    }
}
