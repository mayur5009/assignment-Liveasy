package com.example.load.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.load.entities.LoadEntity;

@Repository
public interface LoadDao extends JpaRepository<LoadEntity, Integer> {

}
