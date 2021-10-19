package com.example.dietApp.dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Entity
@Setter
@NoArgsConstructor
public class Coin implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String coinName;

    private Integer weight;

    private String ore;

    private String dateOfProduction;

    private String imageUrl;

    private String coinCode;

}