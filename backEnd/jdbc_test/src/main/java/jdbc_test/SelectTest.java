package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String sql = "SELECT * FROM user";
		
		/*
		 * JDBC 연결
		 * 1. MySQL 드라이버 로드
		 * 2. Connection 객체 얻어옴
		 * 3. Statement 객체 만듦
		 * 4. Statement 실행
		 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, "ssafy", "ssafy");
		Statement  st = conn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		rs.next();
		String userId = rs.getString("user_id");
		String userPwd = rs.getString("user_pwd");
		
		System.out.println("user id: " + userId + ", user pwd: " + userPwd);
		
		rs.close();
		st.close();
		conn.close();

	}

}
