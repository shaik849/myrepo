package com.tourists.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourists.entity.TouristsData;
import com.tourists.service.TouristsService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/tourist")
public class TouristsController {
	@Autowired
	private TouristsService tService;
	@PostMapping("/save")
	public TouristsData saveAllTourists(@RequestBody TouristsData td) {
		return tService.saveAllTourists(td);
	}
	@GetMapping("/get")
	public List<TouristsData> getALLTourists(){
		return tService.getAllTourists();
	}
}
