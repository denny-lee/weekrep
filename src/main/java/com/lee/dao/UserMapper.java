package com.lee.dao;

import com.lee.model.Developer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id,name,dep from developer")
    List<Developer> listAll();

}
