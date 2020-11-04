package com.yg.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yg.dto.NoticeDTO;
import com.yg.dto.UserDTO;

@Repository
@Qualifier("dao")
public class LoginDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public UserDTO login(UserDTO dto) {
		return sqlSession.selectOne("sql.login",dto);
	}
	
	public List<NoticeDTO> list() {
		return sqlSession.selectList("sql.list"); 
	}
	
	public NoticeDTO detail(NoticeDTO dto) {
		return sqlSession.selectOne("sql.detail",dto);
	}
}
