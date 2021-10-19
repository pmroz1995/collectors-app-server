package com.example.dietApp.controllers;

import com.example.dietApp.dao.entity.Coin;
import com.example.dietApp.services.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/coin")
public class CoinController {

    private CoinService coinService;

    @Autowired
    public CoinController(CoinService productService) {
        this.coinService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Coin>> getAllCoins() {
        List<Coin> coins = coinService.findAll();
        return new ResponseEntity<>(coins, HttpStatus.OK);
    }


    @GetMapping("/find{id}")
    public ResponseEntity<Coin> getCoin(@PathVariable("id") Long id) {
        Coin coin = coinService.findCoinById(id);
        return new ResponseEntity(coin, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Coin> addCoin(@RequestBody Coin coin) {
        Coin coinForAdding = coinService.addCoin(coin);
        return new ResponseEntity(coin, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Coin> updateCoin(@RequestBody Coin coin) {
        Coin coinForAdding = coinService.updateCoin(coin);
        return new ResponseEntity(coin, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteCoin(@PathVariable("id") Long id) {
        coinService.deleteCoin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
