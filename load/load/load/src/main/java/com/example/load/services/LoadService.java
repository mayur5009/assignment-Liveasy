package com.example.load.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.load.entities.LoadEntity;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface LoadService {
	
	List<LoadEntity> getAll();
	
	LoadEntity getById(Integer id);
	
	LoadEntity upadateLoad(LoadEntity load);
	
	String deleteLoad(Integer id);
	
	LoadEntity addLoad(LoadEntity load);

}
