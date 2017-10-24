package com.lee.dao;

import com.lee.model.WeekReport;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WeekReportMapper {
    @Insert("insert into weekreport(name,dep,thisWeek,risk,nextWeek,gain,removed) values(#{name},#{dep},#{thisWeek},#{risk},#{nextWeek},#{gain},#{removed})")
    boolean save(WeekReport weekReport);

    @Select("select id, name,dep,thisWeek,risk,nextWeek,gain,removed,createGmt from weekreport")
    List<WeekReport> listAll();

    @Select("select id, name,dep,thisWeek,risk,nextWeek,gain,removed,createGmt from weekreport where name=#{name} order by createGmt desc")
    List<WeekReport> findByName(@Param("name") String name);

    @Update("update weekreport set removed=true where id=#{id}")
    void delete(@Param("id") Long id);

    @Delete("delete from weekreport where id=#{id}")
    void del(@Param("id") Long id);

}
