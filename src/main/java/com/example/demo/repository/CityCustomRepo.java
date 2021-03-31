package com.example.demo.repository;

import com.example.demo.dto.CityDTO;
import com.example.demo.model.City;
import com.example.demo.model.Country;

import java.util.List;

public interface CityCustomRepo {
    List<City> getEventByCondition(CityDTO cityDTO);
    List<Country> getListOfCountry();
}
