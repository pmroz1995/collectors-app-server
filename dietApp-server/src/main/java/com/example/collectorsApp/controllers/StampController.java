package com.example.collectorsApp.controllers;

import com.example.collectorsApp.dao.entity.Stamp;
import com.example.collectorsApp.services.stamp.StampService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/stamp")
public class StampController {

    private StampService stampService;

    public StampController(StampService stampService) {
        this.stampService = stampService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Stamp>> getAllStamps() {
        List<Stamp> stamps = stampService.findAll();
        return new ResponseEntity<>(stamps, HttpStatus.OK);
    }


    @GetMapping("/find{id}")
    public ResponseEntity<Stamp> getStamp(@PathVariable("id") Long id) {
        Stamp stamp = stampService.findStampById(id);
        return new ResponseEntity(stamp, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Stamp> addStamp(@RequestBody Stamp stamp) {
        Stamp stampForAdding = stampService.addStamp(stamp);
        return new ResponseEntity(stamp, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Stamp> updateStamp(@RequestBody Stamp stamp) {
        Stamp stampForAdding = stampService.updateStamp(stamp);
        return new ResponseEntity(stamp, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStamp(@PathVariable("id") Long id) {
        stampService.deleteStamp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
