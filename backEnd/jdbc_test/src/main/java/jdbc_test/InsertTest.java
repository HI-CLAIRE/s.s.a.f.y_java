package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String sql = "INSERT INTO user (user_id, user_pwd) VALUES ('ssafy', 'ssafy')";
		
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
		st.executeUpdate(sql);
		
		st.close();
		conn.close();
	}

}
