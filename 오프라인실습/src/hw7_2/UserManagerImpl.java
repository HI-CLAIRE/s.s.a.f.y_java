package hw7_2;

public class UserManagerImpl implements IUserManager {
	private final int MAX_SIZE = 100;
	private User[] userList = new User[MAX_SIZE];
	private int size = 0;
	
	private static IUserManager um = new UserManagerImpl();
	
	private UserManagerImpl() {}
	
	public static IUserManager getInstance() {
		return um;
	}

	@Override
	public void add(User user) {
		if(size < MAX_SIZE)
			userList[size++] = user;
	}

	@Override
	public User[] getList() {
		User[] tmp = new User[size];
		for(int i=0; i<size; i++)
			tmp[i] = userList[i];
		return tmp;
	}

	@Override
	public User[] getUsers() {
		int cnt = 0;
		for(int i=0; i<size; i++)
		{
			if(!(userList[i] instanceof VipUser))
				cnt++;
		}		
		VipUser[] tmp = new VipUser[cnt]; //vipuser 수가 cnt
		cnt = 0;
		for(int i=0; i<size; i++)
		{
			if(!(userList[i] instanceof VipUser))
				tmp[cnt++] = (VipUser) userList[i];
		}
		return tmp;
	}

	@Override
	public VipUser[] getVipUsers() {
		int cnt = 0;
		for(int i=0; i<size; i++)
		{
			if(userList[i] instanceof VipUser)
				cnt++;
		}		
		VipUser[] tmp = new VipUser[cnt]; //vipuser 수가 cnt
		cnt = 0;
		for(int i=0; i<size; i++)
		{
			if(userList[i] instanceof VipUser)
				tmp[cnt++] = (VipUser) userList[i];
		}
		return tmp;
	}

	@Override
	public User[] searchByName(String keyword) {
		//1. 찾고
		//2. 찾은 거의 갯수
		//3. 갯수만큼의 tmp배열을 반환
		int cnt = 0;
		for(int i=0; i<size; i++)
			if(userList[i] 
		
	}

	@Override
	public double getAgeAvg() {
		
		return 0;
	}
}
