package com.example.payment.service;

import com.example.payment.model.Payment;
import com.example.payment.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.List;

@Service
public class PaymentService {

  @Autowired
  private KafkaTemplate<String,String> kafkaTemplate;

  @Autowired
  private PaymentRepo paymentRepo;

  public Payment create(Payment payment,Long id){
    sendMessage(String.valueOf(id));
    return paymentRepo.saveAndFlush(payment);
  }

  public void delete(Long id){
    paymentRepo.deleteById(id);
  }

  public List<Payment> getAll(){
    return paymentRepo.findAll();
  }

  public Payment getById(Long id){
    return paymentRepo.getById(id);
  }

  public Payment update(Payment payment){
    return paymentRepo.saveAndFlush(payment);
  }

  public void sendMessage(String message) {

    ListenableFuture<SendResult<String, String>> future =
        kafkaTemplate.send("payment", message);

    future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

      @Override
      public void onSuccess(SendResult<String, String> result) {
        System.out.println("Sent message=[" + message +
            "] with offset=[" + result.getRecordMetadata().offset() + "]");
      }
      @Override
      public void onFailure(Throwable ex) {
        System.out.println("Unable to send message=["
            + message + "] due to : " + ex.getMessage());
      }
    });
  }
}
