package hw8_2;

import java.util.ArrayList;
import java.util.List;

public class UserManagerImpl implements IUserManager {
	private List<User> userList = new ArrayList<User>();
	private UserManagerImpl um = new UserManagerImpl();
	
	@Override
	public void add(User user) {
		userList.add(user);
	}
	@Override
	public User[] getList() {
		User[] tmp = new User[userList.size()];
		for(int i=0; i<userList.size(); i++)
			tmp[i] = userList.get(i);
		return tmp;
	}
	@Override
	public User[] getUsers() {
		
		return null;
	}
	@Override
	public VipUser[] getVipUsers() {
		
		return null;
	}
	@Override
	public User[] searchByName(String name) {
		
		return null;
	}
	@Override
	public double getAgeAvg() {
		
		return 0;
	}
	
	
}
