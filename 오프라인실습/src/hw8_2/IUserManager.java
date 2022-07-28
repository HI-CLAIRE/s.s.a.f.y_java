package hw8_2;

public interface IUserManager {
	void add(User user);
	User[] getList();
	User[] getUsers();
	VipUser[] getVipUsers();
	User[] searchByName(String name);
	double getAgeAvg();
}
