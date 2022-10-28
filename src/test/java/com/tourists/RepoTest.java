package com.tourists;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourists.entity.TouristsData;
import com.tourists.reposiratory.TouristReposiratory;
@SpringBootTest
public class RepoTest {

	@Autowired
	private TouristReposiratory tr;
	
	@Test
	void isTouristById() {
		TouristsData td = new TouristsData(3,"shaik","sanavulla","male",22,"mp",2);
		tr.save(td);
		Boolean r = tr.existsById(3);
		assertThat(r).isTrue();
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("teardown");
		tr.deleteAll();
	}
	@BeforeEach
	void setUp() {
		System.out.println("setting");
	}
	
}
