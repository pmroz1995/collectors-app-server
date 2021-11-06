package com.example.collectorsApp.services.stamp;

import com.example.collectorsApp.dao.entity.Stamp;
import java.util.List;

public interface StampService {

    List<Stamp> findAll();

    Stamp addStamp(Stamp stamp);

    Stamp updateStamp(Stamp stamp);

    void deleteStamp(Long id);

    Stamp findStampById(Long id);
}
