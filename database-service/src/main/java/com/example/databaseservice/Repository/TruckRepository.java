package com.example.databaseservice.Repository;

import com.example.databaseservice.model.TruckModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<TruckModel, Long> {
    public List<TruckModel> findAll();
}