package com.example.collectorsApp.services.totalPrice;

import com.example.collectorsApp.dao.CoinRepository;
import com.example.collectorsApp.dao.StampRepository;
import com.example.collectorsApp.dao.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TotalPriceServiceImpl implements TotalPriceService {

    private CoinRepository coinRepository;
    private WatchRepository watchRepository;
    private StampRepository stampRepository;

    @Autowired
    public TotalPriceServiceImpl(CoinRepository coinRepository, WatchRepository watchRepository, StampRepository stampRepository) {
        this.coinRepository = coinRepository;
        this.watchRepository = watchRepository;
        this.stampRepository = stampRepository;
    }

    @Override
    public int getTotalPrize() {
        return Stream.of(
                coinRepository.findAll()
                        .stream()
                        .map(r -> r.getPrizePln())
                        .collect(Collectors.summingInt(Integer::intValue)),
                watchRepository.findAll()
                        .stream()
                        .map(r -> r.getPrizePln())
                        .collect(Collectors.summingInt(Integer::intValue)),
                stampRepository.findAll()
                        .stream()
                        .map( r -> r.getPrizePln())
                        .collect(Collectors.summingInt(Integer::intValue))
                ).mapToInt(Integer::valueOf)
                .sum();
    }
}
