package com.yg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yg.dao.LoginDAO;
import com.yg.dto.NoticeDTO;
import com.yg.dto.UserDTO;

@Service
@Qualifier("service")
public class LoginService  {
	
	@Autowired
	@Qualifier("dao")
	LoginDAO dao;
	
	public UserDTO login(UserDTO dto) {
		return dao.login(dto);
	}
	
	public List<NoticeDTO> list(){
		return dao.list();
	}
}
