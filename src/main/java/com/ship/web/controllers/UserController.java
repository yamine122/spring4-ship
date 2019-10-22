package com.ship.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ship.web.domains.UserDTO;
import com.ship.web.serviceimpls.UserServiceImpl;
import com.ship.web.services.UserService;


@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired Map<String, Object> map;
	@Autowired UserDTO user;
	@Autowired UserServiceImpl userService;
	
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO param) {
		
		logger.info("ajax가 보낸 아이디와 비번 {}",param.getUid()+","+param.getUpw()+","+param.getUname());
		HashMap<String, String> map = new HashMap<>();
		map.put("uid", param.getUid());
		map.put("upw", param.getUpw());
		map.put("uname", param.getUname());
		userService.join(param);
		logger.info("map에 담긴 아이디와 비번 {}",map.get("uid")+","+map.get("upw"));
		
		return map;
	}

	@PostMapping("/login")
	public @ResponseBody UserDTO login(@RequestBody UserDTO param) {
		
		logger.info("ajax가 보낸 login아이디와 비번 {}",param.getUid()+","+param.getUpw());
		
		user.setUid(param.getUid());
		user.setUpw(param.getUpw());
		
		
		user = userService.login(param);
		logger.info("user에 담긴 login아이디와 비번 {}",user.toString());
		return user;
	}
		
	
	
	/*@GetMapping("/count")
	public String count(Model model) {
		int count = userService.countUser();
		model.addAttribute("count" , count);
		return "home";
	}*/
		
}
