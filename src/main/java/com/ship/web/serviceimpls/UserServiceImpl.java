package com.ship.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.web.domains.UserDTO;
import com.ship.web.mappers.UserMapper;
import com.ship.web.services.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired UserMapper userMapper;
	
	@Override
	public boolean join(UserDTO param) {
		
		return userMapper.insertUser(param);
	}
	/*@Override
	public int countUser() {
		// TODO Auto-generated method stub
		return userMapper.countUser();
	}*/

	@Override
	public UserDTO login(UserDTO param) {
		
		return userMapper.selectUserById(param);
	}

	@Override
	public List<UserDTO> search(UserDTO param) {
		
		return null;
	}
	
}
