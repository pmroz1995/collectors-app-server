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

    public Coin id(Long id) {
        this.id = id;
        return this;
    }

    public Coin coinName(String coinName) {
        this.coinName = coinName;
        return this;
    }

    public Coin weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Coin ore(String ore) {
        this.ore = ore;
        return this;
    }

    public Coin dateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public Coin imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Coin coinCode(String coinCode) {
        this.coinCode = coinCode;
        return this;
    }
}