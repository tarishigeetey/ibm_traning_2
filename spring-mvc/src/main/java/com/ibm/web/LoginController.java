package com.ibm.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.bean.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value ="/login.do",  method = RequestMethod.GET)
	public String validate(Login login, Map<String, String> model) {
		
		if(login.getUserid().equals("potato") && login.getPasswd().equals("chips"))
		//if(login.getUserId().equals("potato") && login.getPasswd().equals("chips"))
		//if(userid.equals("potato") && passwd.equals("chips"))	
			model.put("message", "Login Successful");
		else
			model.put("message", "Invalid Login");
		
		return "output";
	}
}
