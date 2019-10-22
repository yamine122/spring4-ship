package com.ship.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ship.web.domains.UserDTO;
@Component
public interface UserService {

	public boolean join(UserDTO param);
	//public int countUser();
	public UserDTO login(UserDTO param);
	public List<UserDTO> search(UserDTO param);
}
