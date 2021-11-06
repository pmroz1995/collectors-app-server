package com.example.collectorsApp.dao;

import com.example.collectorsApp.dao.entity.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {

    void deleteWatchById(Long id);

    Watch findWatchById(Long id);
}
