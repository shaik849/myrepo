package com.tourists.reposiratory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourists.entity.TouristsData;
@Repository
public interface TouristReposiratory extends JpaRepository<TouristsData, Integer>{
List<TouristsData> findByOrderByFirstnameDesc();
}
