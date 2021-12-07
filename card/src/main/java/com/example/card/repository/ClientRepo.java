package com.example.card.repository;

import com.example.card.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {
    Client getById(Long id);
    Client getByPhoneNumber(String phoneNumber);
}
