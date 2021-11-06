package com.example.collectorsApp.services.coin;

import com.example.collectorsApp.dao.CoinRepository;
import com.example.collectorsApp.dao.entity.Coin;
import com.example.collectorsApp.errors.CoinNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CoinServiceImpl implements CoinService {

    private final static String COIN_NOT_FOUND = "Coin not found.";
    private CoinRepository coinRepository;

    @Autowired
    public CoinServiceImpl(CoinRepository productRepository) {
        this.coinRepository = productRepository;
    }

    @Override
    public List<Coin> findAll() {
        return coinRepository.findAll();
    }

    @Override
    public Coin addCoin(Coin coin) {
        coin.setCoinCode(UUID.randomUUID().toString());
        return coinRepository.save(coin);
    }

    @Override
    public Coin updateCoin(Coin coin) {
        return coinRepository.save(coin);
    }

    @Override
    public void deleteCoin(Long id) {
        coinRepository.deleteCoinById(id);
    }

    @Override
    public Coin findCoinById(Long id) {
        return coinRepository.findById(id)
                .orElseThrow(() -> new CoinNotFoundException(COIN_NOT_FOUND));
    }

}
