package com.example.collectorsApp.services.watch;

import com.example.collectorsApp.dao.WatchRepository;
import com.example.collectorsApp.dao.entity.Watch;
import com.example.collectorsApp.errors.CoinNotFoundException;
import com.example.collectorsApp.errors.WatchNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class WatchServiceImpl implements WatchService{

    private final static String Watch_NOT_FOUND = "Watch not found.";
    private WatchRepository watchRepository;

    public WatchServiceImpl(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @Override
    public List<Watch> findAll() {
        return watchRepository.findAll();
    }

    @Override
    public Watch addWatch(Watch watch) {
        watch.watchCode(UUID.randomUUID().toString());
        return  watchRepository.save(watch);
    }

    @Override
    public Watch updateWatch(Watch watch) {
        return watchRepository.save(watch);
    }

    @Override
    public void deleteWatch(Long id) {
        watchRepository.deleteWatchById(id);
    }

    @Override
    public Watch findWatchById(Long id) {
        return watchRepository.findById(id)
                .orElseThrow(() -> new WatchNotFoundException(Watch_NOT_FOUND));

    }
}
