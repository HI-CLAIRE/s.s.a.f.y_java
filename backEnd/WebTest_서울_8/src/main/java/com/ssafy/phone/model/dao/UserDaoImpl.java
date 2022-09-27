package com.ssafy.phone.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ssafy.phone.model.dto.User;
import com.ssafy.phone.util.DBUtil;

public class UserDaoImpl implements UserDao {

	private final DBUtil util = DBUtil.getInstance();

	// 싱글턴
	private static UserDaoImpl instance = new UserDaoImpl();
	
	private UserDaoImpl() {
		
	}
	
	public static UserDaoImpl getInstance() {
		return instance;
	}
	

	@Override
	public User loginUser(String userId, String userPwd) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = new User();
		
		String sql = "SELECT * FROM userinfo WHERE id = ? and password = ?";
		
		try {
			
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			user.setId(rs.getString(1));
			user.setPassword(rs.getString(2));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			pstmt.close();
			con.close();
		}
		
		return user;
	}

	
}
