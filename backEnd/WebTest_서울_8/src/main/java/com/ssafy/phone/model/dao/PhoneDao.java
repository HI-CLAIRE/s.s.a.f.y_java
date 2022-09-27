package com.ssafy.phone.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.phone.model.dto.Phone;


public interface PhoneDao {
	public List<Phone> selectAll() throws SQLException;

	public Phone selectOne(String serialNum) throws SQLException;

	public void insertPhone(Phone notebook) throws SQLException;

	public void updatePrice(Phone notebook);

	public void updateViewCnt(String serialNum);

	public void deletePhone(String serialNum);

}
