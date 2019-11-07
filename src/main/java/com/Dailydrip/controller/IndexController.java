package com.Dailydrip.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping(value = "/index")
	public String index(HashMap<String, Object> map, Model model) {
		model.addAttribute("username", "li Jingwen");
		map.put("username", "lijingwen map");
		System.out.println("model :" + JSONObject.toJSONString(model));
		return "index";
	}

	@RequestMapping(value = "/center")
	public String center() {
		return "center/center";
	}
}
