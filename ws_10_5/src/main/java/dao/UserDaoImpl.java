package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.User;
import util.DBUtil;

public class UserDaoImpl implements UserDao {
	private final DBUtil util = DBUtil.getInstance();
	private static UserDaoImpl instance = new UserDaoImpl();
	
	private UserDaoImpl() {
		
	}
	
	public static UserDaoImpl getInstance() {
		return instance;
	}

	@Override
	public void createUser(User user) throws SQLException {
		// 객체 준비하기
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// SQL 문 준비하기
		String sql = "INSERT INTO user (user_id, user_pwd, user_name, nick_name, email) VALUES (?,?,?,?,?)";
		
		// try catch 문 안에서 query 수행
		try {
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4,  user.getNickName());
			pstmt.setString(5, user.getEmail());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pstmt.close();
			con.close();
		}
	}

	@Override
	public User loginUser(String userId, String userPwd) throws SQLException {
		// 객체 준비하기
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				User user = new User();
				
				// SQL 문 준비하기
				String sql = "SELECT * FROM user WHERE user_id = ? and user_pwd = ?";
				
				// try catch 문 안에서 query 수행
				try {
					con = util.getConnection();
					pstmt = con.prepareStatement(sql);

					pstmt.setString(1, userId);
					pstmt.setString(2, userPwd);
					
					rs = pstmt.executeQuery();
					rs.next();
					
					user.setUserSeq(rs.getInt(1));
					user.setUserId(rs.getString(2));
					user.setPassword(rs.getString(3));
					user.setUserName(rs.getString(4));
					user.setNickName(rs.getString(5));
					user.setEmail(rs.getString(6));
					user.setJoinedAt(rs.getString(7));
					
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
