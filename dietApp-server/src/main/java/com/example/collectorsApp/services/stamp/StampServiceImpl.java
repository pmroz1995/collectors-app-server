package com.example.collectorsApp.services.stamp;

import com.example.collectorsApp.dao.StampRepository;
import com.example.collectorsApp.dao.entity.Stamp;
import com.example.collectorsApp.errors.CoinNotFoundException;
import com.example.collectorsApp.errors.StampNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@Transactional
public class StampServiceImpl implements StampService {

    private final static String STAMP_NOT_FOUND = "Stamp not found.";
    private StampRepository stampRepository;

    private String getUsername() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        return userDetails.getUsername();
    }

    @Autowired
    public StampServiceImpl(StampRepository stampRepository) {
        this.stampRepository = stampRepository;
    }

    @Override
    public List<Stamp> findAll() {
       return stampRepository.findAll().stream()
               .filter(r -> r.getUsername().equals(getUsername().trim()))
               .collect(Collectors.toList());
    }

    @Override
    public Stamp addStamp(Stamp stamp) {
        stamp.stampCode(UUID.randomUUID().toString());
        stamp.username(getUsername());
        return stampRepository.save(stamp);
    }

    @Override
    public Stamp updateStamp(Stamp stamp) {
        return stampRepository.save(stamp);
    }

    @Override
    public void deleteStamp(Long id) {
        stampRepository.deleteStampById(id);
    }

    @Override
    public Stamp findStampById(Long id) {
        return stampRepository.findById(id)
                .orElseThrow(() -> new StampNotFoundException(STAMP_NOT_FOUND));
    }
}
