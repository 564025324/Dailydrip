package com.Dailydrip.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dailydrip.domain.User;
import com.Dailydrip.utils.LeeJsonResult;

//@Controller
//@RequestMapping("/user")
// @RestController = @Controller + @RequestMapping
@RestController
public class UserController {

	@RequestMapping("/getuser")
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setUsername("李京文");
		return user;
	}

	@RequestMapping("/getuserjson")
	@ResponseBody
	public LeeJsonResult getUserJson() {
		User user = new User();
		user.setUsername("李京文");
		user.setBirthday(new Date());
		user.setPassword("lijingwen123");
		return LeeJsonResult.ok(user);
	}
}
