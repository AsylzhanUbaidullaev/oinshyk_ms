package com.example.card.controller;

import com.example.card.model.Toy;
import com.example.card.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/toy")
public class ToyController {

    @Autowired
    ToyService toyService;


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Toy create(@RequestBody Toy cart){
        return toyService.create(cart);
    }

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Toy> getAll(){
        return toyService.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        toyService.delete(id);
    }
    @RequestMapping(value = "/get/all/quantity/greater", method = RequestMethod.GET)
    public List<Toy> getAllByQuantityGreater(@Param(value = "quan") Long quan) {
        return toyService.getAllByQuantityGreater(quan);
    }

    @RequestMapping(value = "/get/all/quantity/less", method = RequestMethod.GET)
    public List<Toy> getAllByQuantityLess(@Param(value = "quan") Long quan) {
        return toyService.getAllByQuantityLess(quan);
    }

    @RequestMapping(value = "/get/all/{name}", method = RequestMethod.GET)
    public List<Toy> getAllByName(@PathVariable String name) {
        return toyService.getAllByName(name);
    }

    @RequestMapping(value = "/get/all/desc", method = RequestMethod.GET)
    public List<Toy> getByDescContainsString(@Param(value = "desc") String desc) {
        return toyService.getByDescContains(desc);
    }

    @RequestMapping(value = "/get/all/price", method = RequestMethod.GET)
    public List<Toy> getByDescContainsRange(@Param(value = "start") BigDecimal start,@Param(value = "end") BigDecimal end) {
        return toyService.getAllByPrice(start,end);
    }
}
