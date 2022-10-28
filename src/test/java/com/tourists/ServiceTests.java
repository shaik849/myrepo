package com.tourists;


import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tourists.reposiratory.TouristReposiratory;
import com.tourists.service.TouristsService;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {

	@Mock
	private TouristReposiratory tr;
	//@InjectMocks //here we invoke country service

	private TouristsService ts;
	
	
	@BeforeEach
	void setUp() {
		this.ts = new TouristsService();
	}
	
	@Test
	public void test_getALLTourists() {
	
		ts.getAllTourists();
		verify(tr).findAll();
	}	
}
