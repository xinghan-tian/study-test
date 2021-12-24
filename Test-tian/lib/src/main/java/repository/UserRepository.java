package repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import entity.AdminUser;

@Repository
public interface UserRepository {
	
	public AdminUser selectAdminUser(@Param("userName") String userName,@Param("passWord") String passWord);
}
