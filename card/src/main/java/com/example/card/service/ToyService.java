package com.example.card.service;

import com.example.card.model.Toy;
import com.example.card.repository.ToyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ToyService {
    @Autowired
    private ToyRepo toyRepo;

    public Toy create(Toy cart){
        return toyRepo.saveAndFlush(cart);
    }

    public List<Toy> getAll(){
        return toyRepo.findAll();
    }

    public void delete(Long id){
        toyRepo.deleteById(id);
    }

    public List<Toy> getAllByQuantityGreater(Long quan) {
        return toyRepo.getAllByQuantityGreaterThanEqual(quan);
    }
    public List<Toy> getAllByQuantityLess(Long quan) {
        return toyRepo.getAllByQuantityLessThanEqual(quan);
    }
    public List<Toy> getAllByName(String name) {
        return toyRepo.getAllByName(name);
    }
    public List<Toy> getByDescContains(String desc) {
        return toyRepo.getAllByDescriptionContains(desc);
    }
    public List<Toy> getAllByPrice(BigDecimal start, BigDecimal end) {
        return toyRepo.getAllByPriceIsBetween(start,end);
    }
}
