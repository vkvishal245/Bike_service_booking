package com.example.demo.Entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bikeId;
    private String bikeName;
    private String modelNum;
    private String bikeNum;
}
