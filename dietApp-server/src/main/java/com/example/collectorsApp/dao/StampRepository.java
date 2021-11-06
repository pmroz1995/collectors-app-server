package com.example.collectorsApp.dao;

import com.example.collectorsApp.dao.entity.Stamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StampRepository extends JpaRepository<Stamp, Long>  {

    void deleteStampById(Long id);

    Stamp findStampById(Long id);
}
