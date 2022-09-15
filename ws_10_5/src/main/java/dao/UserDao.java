package dao;

import java.sql.SQLException;

import dto.User;

public interface UserDao {
	/*
	 * createUser
	 * login - id, pwd => 일치?
	 */
	
	public void createUser(User user) throws SQLException;
	public User loginUser(String userId, String userPwd) throws SQLException;

}
