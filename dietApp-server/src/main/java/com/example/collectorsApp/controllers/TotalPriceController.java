package com.example.collectorsApp.controllers;

import com.example.collectorsApp.services.totalPrice.TotalPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/totalPrize")
public class TotalPriceController {

    private TotalPriceService totalPriceService;

    @Autowired
    public TotalPriceController(TotalPriceService totalPriceService) {
        this.totalPriceService = totalPriceService;
    }

    @GetMapping("/get")
    public ResponseEntity<Integer> getTotalPrize() {
        int totalSum = totalPriceService.getTotalPrize();
        return new ResponseEntity(totalSum, HttpStatus.OK);
    }
}
