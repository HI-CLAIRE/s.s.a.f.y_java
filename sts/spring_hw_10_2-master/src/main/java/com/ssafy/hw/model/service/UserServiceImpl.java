package com.ssafy.hw.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.hw.model.dao.UserDao;
import com.ssafy.hw.model.dto.SearchCondition;
import com.ssafy.hw.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public User searchById(String id) {
		return userDao.searchById(id);
	}

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

	@Override
	public List<User> searchByName(String name) {
		return userDao.searchByName(name);
	}

	@Override
	public List<User> searchByCondition(SearchCondition con) {
		return userDao.searchByCondition(con);
	}

}
