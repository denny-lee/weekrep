package com.lee.controller;

import com.alibaba.fastjson.JSONObject;
import com.lee.model.Developer;
import com.lee.model.Resp;
import com.lee.model.WeekReport;
import com.lee.service.WeepReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private WeepReportService weekReportService;

	@RequestMapping("/")
	public String home() {
		return "redirect:/index.html";
	}
	@RequestMapping("/save")
	@ResponseBody
	public Resp save(WeekReport weekReport) {
		try {
			weekReport.setRemoved(false);
			weekReportService.save(weekReport);
		} catch (Exception e) {
			e.printStackTrace();
			return new Resp(false, "fail");
		}
		return new Resp(true, "success");
	}

	@RequestMapping("/listAll")
	@ResponseBody
	public List<WeekReport> listAll() {
		return weekReportService.listAll();
	}

	@RequestMapping("/list")
	@ResponseBody
	public List<WeekReport> listByName(String name) {
		return weekReportService.findByName(name);
	}

	@RequestMapping("/delete/{id}")
	@ResponseBody
	public Resp delete(@PathVariable(name = "id") Long id) {
		weekReportService.delete(id);
		return new Resp(true, "success");
	}

	@RequestMapping("/del")
	@ResponseBody
	public Resp realDel(@PathVariable(name = "id") Long id) {
		weekReportService.realDel(id);
		return new Resp(true, "success");
	}

	@RequestMapping("/users")
	@ResponseBody
	public Object users() {
		List<Developer> users = weekReportService.listUsers();
		JSONObject o = new JSONObject();
		for (Developer d : users) {
			o.put(d.getName(), d.getDep());
		}
		return o;
	}
}
