package com.example.collectorsApp.services.totalPrice;

import com.example.collectorsApp.services.coin.CoinService;
import com.example.collectorsApp.services.stamp.StampService;
import com.example.collectorsApp.services.watch.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TotalPriceServiceImpl implements TotalPriceService {

    private CoinService coinService;
    private WatchService watchService;
    private StampService stampService;

    @Autowired
    public TotalPriceServiceImpl(CoinService coinService, WatchService watchService, StampService stampService) {
        this.coinService = coinService;
        this.watchService = watchService;
        this.stampService = stampService;
    }


    @Override
    public List<ObjectForPrint> getTotalPrice() {
        return List.of(
                new ObjectForPrint()
                        .totalPrice(
                                Stream.of(
                                        coinService.findAll()
                                                .stream()
                                                .map(r -> r.getPrizePln())
                                                .collect(Collectors.summingInt(Integer::intValue)),
                                        watchService.findAll()
                                                .stream()
                                                .map(r -> r.getPrizePln())
                                                .collect(Collectors.summingInt(Integer::intValue)),
                                        stampService.findAll()
                                                .stream()
                                                .map(r -> r.getPrizePln())
                                                .collect(Collectors.summingInt(Integer::intValue))
                                ).mapToInt(Integer::valueOf)
                                        .sum()
                        )
        );
    }

    public class ObjectForPrint {

        Integer totalPrice;

        public ObjectForPrint totalPrice(Integer totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Integer getTotalPrice() {
            return totalPrice;
        }
    }

}
