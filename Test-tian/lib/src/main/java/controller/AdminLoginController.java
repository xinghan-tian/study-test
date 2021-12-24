package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.AdminUser;
import requestdto.LoginForm;
import service.AdminLoginService;

@Controller
@RequestMapping("/login")
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminloginservice;
	
	@PostMapping("/adminLogin")
	public AdminUser login(@RequestBody LoginForm form) {
		
		return adminloginservice.getAdminUser(form.getUsername(),form.getPassword());
	}
	
}
