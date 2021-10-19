package com.example.dietApp.services;

import com.example.dietApp.dao.entity.Coin;

import java.util.List;

public interface CoinService {
    List<Coin> findAll();

    Coin addCoin(Coin product);

    Coin updateCoin(Coin coin);

    void deleteCoin(Long id);

    Coin findCoinById(Long id);
}
