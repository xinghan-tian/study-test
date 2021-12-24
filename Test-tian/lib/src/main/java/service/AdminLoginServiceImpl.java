package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.powerup.bookmng.exception.BusinessFailureException;

import entity.AdminUser;
import repository.UserRepository;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public AdminUser getAdminUser(String username, String password) {
		// TODO Auto-generated method stub
		
		AdminUser user=userRepository.selectAdminUser(username, password);
		
		if(user==null) {
			throw new BusinessFailureException(false);
		}
		return user;
	}

}
