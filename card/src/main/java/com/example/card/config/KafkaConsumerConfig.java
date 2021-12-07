//package com.example.card.config;
//
//import com.example.card.service.ClientService;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConsumerConfig {
//
//  @Autowired
//  private ClientService clientService;
//  @Bean
//  public ConsumerFactory<String, String> consumerFactory() {
//    Map<String, Object> props = new HashMap<>();
//    props.put(
//        ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
//        "payment");
//    props.put(
//        ConsumerConfig.GROUP_ID_CONFIG,
//        "payment");
//    props.put(
//        ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
//        StringDeserializer.class);
//    props.put(
//        ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
//        StringDeserializer.class);
//    return new DefaultKafkaConsumerFactory<>(props);
//  }
//
//  @Bean
//  public ConcurrentKafkaListenerContainerFactory<String, String>
//  kafkaListenerContainerFactory() {
//
//    ConcurrentKafkaListenerContainerFactory<String, String> factory =
//        new ConcurrentKafkaListenerContainerFactory<>();
//    factory.setConsumerFactory(consumerFactory());
//    return factory;
//  }
//  @KafkaListener(topics = "payment", groupId = "payment")
//  public void listenGroupFoo(String message) {
//    System.out.println("Received Message in group foo: " + message);
//    clientService.subscribed(Long.valueOf(message));
//  }
//}
