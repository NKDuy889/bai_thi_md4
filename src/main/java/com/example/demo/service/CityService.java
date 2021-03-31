package com.example.demo.service;

import com.example.demo.dto.CityDTO;
import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.CityRepo;
import com.example.demo.repository.CityRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService implements ICityService {
    @Autowired
    private CityRepoImpl cityRepoImpl;

    @Autowired
    private CityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City add(City city) {
        return null;
    }

    @Override
    public void remove(City city) {
        cityRepo.delete(city);
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public City findById(Long id) {
        return cityRepo.getOne(id);
    }

    @Override
    public List<City> search(CityDTO cityDTO) {
        return cityRepoImpl.getEventByCondition(cityDTO);
    }

    @Override
    public void deleteById(Long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public City save(City city, String acreage, String population, String GPA) {
        city.setAcreage(Double.parseDouble(acreage));
        city.setPopulation(Double.parseDouble(population));
        city.setGPA(Double.parseDouble(GPA));
        return cityRepo.save(city);
    }

    @Override
    public City findEventByStringId(String id, String name, String note, String country) {
        City city = findById(Long.parseLong(id));
        city.setName(name);
        city.setNote(note);
        city.setCountry(country);
        return city;
    }

    public List<Country> getListCountry(){
       return cityRepoImpl.getListOfCountry();
    }
}
