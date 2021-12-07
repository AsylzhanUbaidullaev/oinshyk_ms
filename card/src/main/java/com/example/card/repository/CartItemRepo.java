package com.example.card.repository;

import com.example.card.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {
    CartItem getById(Long id);
    List<CartItem> getAllByCartId(Long id);
    List<CartItem> getAllByToyId(Long id);
    List<CartItem> getAllByQuantityGreaterThanEqual(Long quantity);
    List<CartItem> getAllByQuantityLessThanEqual(Long quantity);
    void deleteAllByCartId(Long id);
}
