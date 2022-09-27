package com.ssafy.phone.model.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ssafy.phone.model.dto.User;

public interface UserDao {
	public User loginUser(String userId, String userPwd) throws SQLException;
}
