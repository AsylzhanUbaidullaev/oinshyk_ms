package com.example.card.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id",insertable = false,updatable = false)
    private Cart cart;

    @Column(name="cart_id")
    private Long cartId;

    @ManyToOne
    @JoinColumn(name = "toy_id",insertable = false,updatable = false)
    private Toy toy;

    @Column(name="toy_id")
    private Long toyId;


    private Long quantity;
}
