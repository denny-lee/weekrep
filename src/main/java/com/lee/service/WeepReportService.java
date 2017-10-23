package com.lee.service;

import com.lee.model.WeekReport;

import java.util.List;

public interface WeepReportService {
    void save(WeekReport weekReport);
    List<WeekReport> listAll();
    WeekReport findByName(String name);
    void delete(Long id);

    void realDel(Long id);
}
