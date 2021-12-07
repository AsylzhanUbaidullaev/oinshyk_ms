package com.example.card.repository;

import com.example.card.model.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ToyRepo extends JpaRepository<Toy,Long> {
    Toy getById(Long id);
    List<Toy> getAllByDescriptionContains(String desc);
    List<Toy> getAllByPriceIsBetween(BigDecimal start, BigDecimal end);
    List<Toy> getAllByName(String name);
    List<Toy> getAllByQuantityGreaterThanEqual(Long quantity);
    List<Toy> getAllByQuantityLessThanEqual(Long quantity);
}
