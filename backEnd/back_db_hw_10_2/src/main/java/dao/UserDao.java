package dao;

import java.sql.SQLException;
import java.util.List;

import dto.User;

public interface UserDao {

	List<User> selectAllUsers() throws SQLException; 
	
	boolean insertUser(User user)throws SQLException;
	
	int userCount() throws SQLException;
	
}
