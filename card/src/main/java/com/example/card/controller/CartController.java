package com.example.card.controller;

import com.example.card.model.Cart;
import com.example.card.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Cart create(@RequestBody Cart cart){
        return cartService.create(cart);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<Cart> getAll(){
        return cartService.getAll();
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        cartService.delete(id);
    }
    @RequestMapping(value = "/delete/client/{id}",method = RequestMethod.DELETE)
    public void deleteByClientId(@PathVariable Long id){
        cartService.deleteByClientId(id);
    }
    @RequestMapping(value = "/get/client/{id}",method = RequestMethod.GET)
    public List<Cart> getAllByClientId(@PathVariable Long id){
        return cartService.getAllByClientId(id);
    }

}
