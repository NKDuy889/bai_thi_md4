package com.example.demo.controller;

import com.example.demo.dto.CityDTO;
import com.example.demo.model.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityDataController {
    @Autowired
    private CityService cityService;

    @PostMapping("show")
    public List<City> getEventList(@RequestBody CityDTO cityDTO) {
        return cityService.search(cityDTO);
    }

    @PostMapping("upload")
    public ResponseEntity uploadEvent(@RequestParam String city, @RequestParam String country, @RequestParam String acreage, @RequestParam String population, @RequestParam String GPA, @RequestParam String note) {
        cityService.save(new City(city, country, note), acreage, population, GPA);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("edit")
    public ResponseEntity editEvent(@RequestParam String id,@RequestParam String city, @RequestParam String country, @RequestParam String acreage, @RequestParam String population, @RequestParam String GPA, @RequestParam String note) {
        cityService.save(cityService.findEventByStringId(id,city,note,country), acreage, population, GPA);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PostMapping("delete")
    public ResponseEntity deleteEvent(@RequestParam String id) {
        cityService.deleteById(Long.parseLong(id));
        return new ResponseEntity(HttpStatus.OK);
    }
}
