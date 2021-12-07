package com.example.card.service;

import com.example.card.model.Cart;
import com.example.card.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepo cartRepo;

    public Cart create(Cart cart){
        return cartRepo.saveAndFlush(cart);
    }

    public List<Cart> getAll(){
        return cartRepo.findAll();
    }

    public void delete(Long id){
        cartRepo.deleteById(id);
    }
    public void deleteByClientId(Long id){
        cartRepo.deleteAllByClientId(id);
    }

    public List<Cart> getAllByClientId(Long id){
        return cartRepo.getAllByClientId(id);
    }

}
