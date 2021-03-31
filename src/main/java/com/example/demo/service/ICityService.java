package com.example.demo.service;

import com.example.demo.dto.CityDTO;
import com.example.demo.model.City;

import java.util.List;

public interface ICityService extends IService<City> {
    List<City> search(CityDTO cityDTO);
    void deleteById(Long id);
    City save(City city, String acreage, String population, String GPA);
    City findEventByStringId(String id, String name, String note,String country);
}
