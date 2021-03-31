package com.example.demo.repository;

import com.example.demo.dto.CityDTO;
import com.example.demo.model.City;
import com.example.demo.model.Country;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CityRepoImpl implements CityCustomRepo{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<City> getEventByCondition(CityDTO cityDTO) {
        StringBuilder sql = new StringBuilder();
        sql.append("from City where 1=1");
        if (cityDTO.getName() != null && !"".equals(cityDTO.getName().trim())) {
            sql.append(" and name like '%").append(cityDTO.getName()).append("%'");
        }
        return entityManager.createQuery(sql.toString()).getResultList();
    }

    @Override
    public List<Country> getListOfCountry() {
        String sql = "select c from Country c";
        return entityManager.createQuery(sql).getResultList();
    }


}
