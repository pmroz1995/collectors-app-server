package com.example.collectorsApp.dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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

    private int prizePln;

    private String dateOfProduction;

    public String getUsername() {
        return username;
    }

    private String username;

    @Lob
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

    public Coin prizePln(int prizePln) {
        this.prizePln = prizePln;
        return this;
    }

    public Coin username(String username) {
        this.username = username;
        return this;
    }
}