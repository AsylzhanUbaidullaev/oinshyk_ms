package com.example.card.service;

import com.example.card.model.CartItem;
import com.example.card.repository.CartItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepo cartItemRepo;

    public CartItem create(CartItem cart){
        return cartItemRepo.saveAndFlush(cart);
    }

    public List<CartItem> getAll(){
        return cartItemRepo.findAll();
    }

    public void delete(Long id){
        cartItemRepo.deleteById(id);
    }
    public void deleteByCardId(Long id){
        cartItemRepo.deleteAllByCartId(id);
    }

    public List<CartItem> getAllByCart(Long id) {
        return cartItemRepo.getAllByCartId(id);
    }
    public List<CartItem> getAllByToy(Long id) {
        return cartItemRepo.getAllByToyId(id);
    }
    public List<CartItem> getAllByQuantityGreater(Long quan) {
        return cartItemRepo.getAllByQuantityGreaterThanEqual(quan);
    }
    public List<CartItem> getAllByQuantityLess(Long quan) {
        return cartItemRepo.getAllByQuantityLessThanEqual(quan);
    }
}
