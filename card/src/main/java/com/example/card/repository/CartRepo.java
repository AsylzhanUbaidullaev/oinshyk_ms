package com.example.card.repository;

import com.example.card.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepo extends JpaRepository<Cart,Long> {
    Cart getById(Long id);
    List<Cart> getAllByClientId(Long clientId);
    void deleteAllByClientId(Long id);
}
