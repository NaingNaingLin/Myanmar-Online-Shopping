package com.mos.service;

import com.mos.domain.User;

public interface UserService {
	
	User findUserByEmail(String email);
	void saveUser(User user);
}
