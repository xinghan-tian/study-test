package service;

import entity.AdminUser;

public interface AdminLoginService {
	
	public AdminUser getAdminUser(String username,String password);
}
