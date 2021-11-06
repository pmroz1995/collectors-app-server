package com.example.collectorsApp.services.watch;

import com.example.collectorsApp.dao.entity.Watch;

import java.util.List;

public interface WatchService {

    List<Watch> findAll();

    Watch addWatch(Watch watch);

    Watch updateWatch(Watch watch);

    void deleteWatch(Long id);

    Watch findWatchById(Long id);
}
