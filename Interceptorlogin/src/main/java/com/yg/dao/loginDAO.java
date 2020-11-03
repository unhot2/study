package com.yg.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yg.dto.userDTO;

@Repository
@Qualifier("dao")
public class loginDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public userDTO login(userDTO dto) {
		return sqlSession.selectOne("sql.login",dto);
	}
}
