package com.example.dietApp.config;

import com.example.dietApp.dao.CoinRepository;
import com.example.dietApp.dao.entity.Coin;
import com.example.dietApp.services.CoinService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class InsertIngIntoDb {
    private CoinService coinService;

    public InsertIngIntoDb(CoinService coinService) {
        this.coinService = coinService;
    }

    @Bean
    public CommandLineRunner coinDateToInitDb(CoinRepository repo) {
        return args -> {

            repo.save(
                    new Coin()
                            .coinCode(UUID.randomUUID().toString())
                            .coinName("Złotówka")
                            .dateOfProduction("2024")
                            .id(3422L)
            );
            repo.save(
                    new Coin()
                            .coinCode(UUID.randomUUID().toString())
                            .coinName("Dolar")
                            .dateOfProduction("2011")
                            .id(3422L)
            );

        };
    }

}
