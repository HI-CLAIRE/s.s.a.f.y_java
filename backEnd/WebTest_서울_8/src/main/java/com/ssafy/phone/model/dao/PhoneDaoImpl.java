package com.ssafy.phone.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.ssafy.phone.model.dto.Phone;
import com.ssafy.phone.util.DBUtil;

public class PhoneDaoImpl implements PhoneDao {

	private final DBUtil util = DBUtil.getInstance();

	// 싱글턴
	private static PhoneDaoImpl instance = new PhoneDaoImpl();
	
	private PhoneDaoImpl() {
		
	}
	
	public static PhoneDaoImpl getInstance() {
		return instance;
	}
	
	// 2. 핸드폰 목록 -5
	@Override
	public List<Phone> selectAll() throws SQLException {
		
		List<Phone> lst = new ArrayList<>();
		
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT (*) FROM phone";
		
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Phone phone  = new Phone();
				phone.setSerialNum(rs.getString("serial_num"));
				phone.setModelName(rs.getString("model_name"));
				phone.setYearOfManufacture(rs.getShort("year_of_manufacture"));
				phone.setViewCnt(rs.getInt("view_cnt"));
				phone.setPrice(rs.getInt("price"));
				phone.setManufacturerCode(rs.getInt("manufacturer_code"));
				
				lst.add(phone);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}
		
		return lst;
	}

	// 3. 핸드폰 상세 정보 -6
	@Override
	public Phone selectOne(String serialNum) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT (*) FROM phone";
		Phone phone = new Phone();
		
		try {
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, serialNum);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			phone.setSerialNum(rs.getString("serial_num"));
			phone.setModelName(rs.getString("model_name"));
			phone.setYearOfManufacture(rs.getShort("year_of_manufacture"));
			phone.setViewCnt(rs.getInt("view_cnt"));
			phone.setPrice(rs.getInt("price"));
			phone.setManufacturerCode(rs.getInt("manufacturer_code"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			pstmt.close();
			con.close();
		}
		
		
		return null;
	}

	// 1. 핸드폰 등록 -4
	@Override
	public void insertPhone(Phone notebook) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO phone (serial_num, model_name, year_of_manufacture, view_cnt, price, manufacturer_code) VALUES (?,?,?,?,?,?)";
		
		try {
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, notebook.getSerialNum());
			pstmt.setString(2, notebook.getModelName());
			pstmt.setShort(3, notebook.getYearOfManufacture());
			pstmt.setInt(4, notebook.getViewCnt());
			pstmt.setInt(5, notebook.getPrice());
			pstmt.setInt(6, notebook.getManufacturerCode());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pstmt.close();
			con.close();
		}
		
	}
	
	
	// update sql = "UPDATE     SET   =?"

	// 5. 핸드폰 수정 
	@Override
	public void updatePrice(Phone notebook) {
		// TODO Auto-generated method stub
		
	}

	//5. 핸드폰 수정 
	@Override
	public void updateViewCnt(String serialNum) {
		// TODO Auto-generated method stub
		
	}

	
	// "DELETE FROM  WHERE "
	// 4. 핸드폰 삭제 
	@Override
	public void deletePhone(String serialNum) {
		// TODO Auto-generated method stub
		
	}

}
