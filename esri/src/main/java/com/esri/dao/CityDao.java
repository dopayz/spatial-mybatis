package com.esri.dao;

import com.esri.pojo.China;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityDao {
    @Insert("INSERT INTO china(id,name,geom) VALUES(#{id}, #{name}, GeomFromText(#{geom}))")
    void insert(China china);
}
