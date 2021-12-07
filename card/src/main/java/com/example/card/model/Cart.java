package com.example.card.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id",insertable = false,updatable = false)
    private Client client;

    @Column(name = "client_id")
    private Long clientId;


}
