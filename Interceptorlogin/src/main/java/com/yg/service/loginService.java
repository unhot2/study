package com.yg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yg.dao.loginDAO;
import com.yg.dto.userDTO;

@Service
@Qualifier("service")
public class loginService  {
	
	@Autowired
	@Qualifier("dao")
	loginDAO dao;
	
	public userDTO login(userDTO dto) {
		return dao.login(dto);
	}
}
