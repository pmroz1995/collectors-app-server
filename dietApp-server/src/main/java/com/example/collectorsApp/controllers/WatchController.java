package com.example.collectorsApp.controllers;

import com.example.collectorsApp.dao.entity.Watch;
import com.example.collectorsApp.services.watch.WatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/watch")
public class WatchController {

    private WatchService watchService;

    public WatchController(WatchService watchService) {
        this.watchService = watchService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Watch>> getAllWatches() {
        List<Watch> watches = watchService.findAll();
        return new ResponseEntity<>(watches, HttpStatus.OK);
    }


    @GetMapping("/find{id}")
    public ResponseEntity<Watch> getWatch(@PathVariable("id") Long id) {
        Watch watch = watchService.findWatchById(id);
        return new ResponseEntity(watch, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Watch> addWatch(@RequestBody Watch watch) {
        Watch watchForAdding = watchService.addWatch(watch);
        return new ResponseEntity(watch, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Watch> updateWatch(@RequestBody Watch watch) {
        Watch watchForAdding = watchService.updateWatch(watch);
        return new ResponseEntity(watch, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteWatch(@PathVariable("id") Long id) {
        watchService.deleteWatch(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
