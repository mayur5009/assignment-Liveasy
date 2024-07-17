package com.example.load.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.load.entities.LoadEntity;
import com.example.load.services.LoadService;



@RequestMapping("/load")
@RestController
public class LoadController {
	
	
	@Autowired
	private LoadService loadServ;
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addNew(@RequestBody LoadEntity load){
		return ResponseEntity.ok(loadServ.addLoad(load));
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getLoadById(@RequestParam Integer id) {
		return ResponseEntity.ok(loadServ.getById(id));
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<?> getAllLoads() {
		return ResponseEntity.ok(loadServ.getAll());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<?> updateLoad( @RequestBody LoadEntity load) {
		return ResponseEntity.ok(loadServ.upadateLoad(load));
	}
	
	
	

}
