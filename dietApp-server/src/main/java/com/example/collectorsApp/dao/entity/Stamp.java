package com.example.collectorsApp.dao.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Setter
@NoArgsConstructor
public class Stamp {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String stampName;

    private String dateOfProduction;

    private int prizePln;

    @Lob
    private String imageUrl;

    private String stampCode;

    public Stamp id(Long id) {
        this.id = id;
        return this;
    }

    public Stamp stampName(String stampName) {
        this.stampName = stampName;
        return this;
    }

    public Stamp dateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public Stamp imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Stamp stampCode(String stampCode) {
        this.stampCode = stampCode;
        return this;
    }

    public Stamp prizePln(int PrizePln) {
        this.prizePln = PrizePln;
        return this;
    }
}
