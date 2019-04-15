package com.esri.service.impl;

import com.esri.dao.CityDao;
import com.esri.pojo.China;
import com.esri.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public void add(China city) {
        cityDao.insert(city);
    }
}
