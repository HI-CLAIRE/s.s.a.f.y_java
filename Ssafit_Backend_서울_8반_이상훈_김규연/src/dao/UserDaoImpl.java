package dao;

import java.util.ArrayList;
import java.util.List;

import dto.User;

public class UserDaoImpl implements UserDao {
	private static UserDao instance = new UserDaoImpl();
	private List<User> users;
	
	private UserDaoImpl() {
		users = new ArrayList<>();
	}
	
	public static UserDao getInstance() {
		return instance;
	}
	
	@Override
	public void signIn(User user) {
		users.add(user);
	}

	@Override
	public User logIn(String userId, String userPassword) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUserId().equals(userId)&&users.get(i).getUserPassword().equals(userPassword)) {
				return users.get(i);
			}
		}
		return null;
	}

}
