package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City, Long> {
}
