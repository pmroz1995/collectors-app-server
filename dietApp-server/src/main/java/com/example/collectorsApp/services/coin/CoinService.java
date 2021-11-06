package com.example.collectorsApp.services.coin;

import com.example.collectorsApp.dao.entity.Coin;

import java.util.List;

public interface CoinService {

    List<Coin> findAll();

    Coin addCoin(Coin product);

    Coin updateCoin(Coin coin);

    void deleteCoin(Long id);

    Coin findCoinById(Long id);
}
