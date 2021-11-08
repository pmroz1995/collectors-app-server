package com.example.collectorsApp.controllers;

import com.example.collectorsApp.services.totalPrice.TotalPriceService;
import com.example.collectorsApp.services.totalPrice.TotalPriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/totalPrice")
public class TotalPriceController {

    private TotalPriceService totalPriceService;

    @Autowired
    public TotalPriceController(TotalPriceService totalPriceService) {
        this.totalPriceService = totalPriceService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<TotalPriceServiceImpl.ObjectForPrint>> getTotalPrice() {
        List<TotalPriceServiceImpl.ObjectForPrint> totalPrice = totalPriceService.getTotalPrice();
        return new ResponseEntity(totalPrice, HttpStatus.OK);
    }

}
