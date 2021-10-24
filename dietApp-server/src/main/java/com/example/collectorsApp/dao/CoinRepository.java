package com.example.collectorsApp.dao;

import com.example.collectorsApp.dao.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
    void deleteCoinById(Long id);

    Coin findCoinById(Long id);
}
