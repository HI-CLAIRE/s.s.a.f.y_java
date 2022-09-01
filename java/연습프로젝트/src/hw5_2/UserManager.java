package hw5_2;

public class UserManager {
	private final int MAX_NUM = 100;
	private User[] users = new User[MAX_NUM];
	private int idx = 0;
	
	public void add(User user)
	{
		users[idx++] = user;
	}
	
	public User[] getList()
	{
		User[] tmp = new User[idx];
		for(int i=0; i<idx; i++)
			tmp[i] = users[i];
		return tmp;
	}
	
	public User searchByName(String name)
	{
		for(int i=0; i<idx; i++)
		{
			if(name.equals(this.users[i].getName()))
				return this.users[i];
		}
		return null;
	}
}
