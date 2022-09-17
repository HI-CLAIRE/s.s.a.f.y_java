package dao;

import dto.User;

public interface UserDao {
	public void signIn(User user);
	public User logIn(String userId, String userPassword);
}
