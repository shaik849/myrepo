package com.tourists.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourists.entity.TouristsData;
import com.tourists.reposiratory.TouristReposiratory;
@Service
public class TouristsService {
@Autowired
private TouristReposiratory tRepo;

public TouristsData saveAllTourists(TouristsData td) {
	return tRepo.save(td);
}

public List<TouristsData> getAllTourists() {
	return tRepo.findByOrderByFirstnameDesc();
}
}
