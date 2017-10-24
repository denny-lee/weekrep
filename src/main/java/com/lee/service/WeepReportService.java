package com.lee.service;

import com.lee.model.Developer;
import com.lee.model.WeekReport;

import java.util.List;

public interface WeepReportService {
    void save(WeekReport weekReport);
    List<WeekReport> listAll();
    List<WeekReport> findByName(String name);
    void delete(Long id);

    void realDel(Long id);

    List<Developer> listUsers();
}
