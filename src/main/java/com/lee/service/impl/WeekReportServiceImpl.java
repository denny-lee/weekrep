package com.lee.service.impl;

import com.lee.dao.UserMapper;
import com.lee.dao.WeekReportMapper;
import com.lee.model.Developer;
import com.lee.model.WeekReport;
import com.lee.service.WeepReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WeekReportServiceImpl implements WeepReportService {
    @Autowired
    private WeekReportMapper mapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(WeekReport weekReport) {
        mapper.save(weekReport);
    }

    @Override
    public List<WeekReport> listAll() {
        return mapper.listAll();
    }

    @Override
    public List<WeekReport> findByName(String name) {
        return mapper.findByName(name);
    }

    @Override
    public void delete(Long id) {
        mapper.delete(id);
    }

    @Override
    public void realDel(Long id) {
        mapper.del(id);
    }

    @Override
    public List<Developer> listUsers() {
        return userMapper.listAll();
    }
}
