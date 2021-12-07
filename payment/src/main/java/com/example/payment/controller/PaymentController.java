package com.example.payment.controller;

import com.example.payment.model.Payment;
import com.example.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @RequestMapping(method = RequestMethod.POST, value = "/create/user/{userId}")
  public Payment create(@RequestBody Payment payment, @PathVariable Long userId) {
    return paymentService.create(payment, userId);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
  public void delete(@PathVariable Long id) {
    paymentService.delete(id);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/get/all")
  public List<Payment> getAll() {
    return paymentService.getAll();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/get/{id}")
  public Payment getById(@PathVariable Long id) {
    return paymentService.getById(id);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/update")
  public Payment update(@RequestBody Payment payment) {
    return paymentService.update(payment);
  }

}
