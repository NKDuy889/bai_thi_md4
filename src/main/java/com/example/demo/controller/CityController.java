package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @ModelAttribute("listCountry")
    public List<Country> getListCountry(){
       return cityService.getListCountry();
    }

    @GetMapping("/country")
    public ModelAndView home(){
        ModelAndView model = new ModelAndView("view");
        return model;
    }
}
