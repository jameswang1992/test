package com.james.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.james.entity.DVD;
import com.james.service.DvdService;

@RequestMapping("DVD")
@Controller
public class DvdController {
	
	@Autowired
	private DvdService dvdService;
	
	@RequestMapping("queryAllDVDs")
	public String queryAllDVDs(Model model) {
		List<DVD> dvds= dvdService.queryAllDVDs();
		model.addAttribute("dvds",dvds);
		return "show";
	}
	
	@RequestMapping("addDVD1")
	public String addDVD1() {
		return "add";
	}
	
	@RequestMapping("addDVD2")
	public String addDVD2(String name) {
		DVD dvd = new DVD(0, name, 0, null, "available");
		dvdService.addDVD(dvd);	
		return "forward:/DVD/queryAllDVDs";
	}
	
	@RequestMapping("lend")
	public String update(Integer id) {
		DVD dvd = dvdService.queryDVDbyId(id);
		dvd.setLendCount(dvd.getLendCount()+1);
		dvd.setLendDate(new Date());
		dvd.setStatus("unavailable");
		int res = dvdService.updateDVD(dvd);
		System.out.println(res);
		return "forward:/DVD/queryAllDVDs";
	}
	
	@RequestMapping("return")
	public String update1(Integer id) {
		DVD dvd = dvdService.queryDVDbyId(id);
		dvd.setLendDate(null);
		dvd.setStatus("available");
		int res = dvdService.updateDVD(dvd);
		System.out.println(res);
		return "forward:/DVD/queryAllDVDs";
	}
}
































