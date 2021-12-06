package com.example.collectorsApp.dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Setter
@NoArgsConstructor
public class Watch {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String watchName;

    private Integer weight;

    private String dateOfProduction;

    private int prizePln;

    public String getUsername() {
        return username;
    }

    private String username;

    @Lob
    private String imageUrl;

    private String watchCode;

    public Watch id(Long id) {
        this.id = id;
        return this;
    }

    public Watch watchName(String watchName) {
        this.watchName = watchName;
        return this;
    }

    public Watch weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Watch dateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public Watch imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Watch watchCode(String watchCode) {
        this.watchCode = watchCode;
        return this;
    }

    public Watch prizePln(int prizePln) {
        this.prizePln = prizePln;
        return this;
    }

    public Watch username(String username) {
        this.username = username;
        return this;
    }
}
