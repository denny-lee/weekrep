package com.lee.controller;

import com.lee.model.Resp;
import com.lee.model.WeekReport;
import com.lee.service.WeepReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private WeepReportService weekReportService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/add")
	@ResponseBody
	public Resp save(WeekReport weekReport) {
		try {
			weekReportService.save(weekReport);
		} catch (Exception e) {
			e.printStackTrace();
			return new Resp(false, "fail");
		}
		return new Resp(true, "success");
	}

	@RequestMapping("/listAll")
	@ResponseBody
	public List<WeekReport> listAll(WeekReport weekReport) {
		return weekReportService.listAll();
	}

	@RequestMapping("/listByName")
	@ResponseBody
	public WeekReport listByName(String name) {
		return weekReportService.findByName(name);
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Resp delete(Long id) {
		weekReportService.delete(id);
		return new Resp(true, "success");
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Resp realDel(Long id) {
		weekReportService.realDel(id);
		return new Resp(true, "success");
	}
}
