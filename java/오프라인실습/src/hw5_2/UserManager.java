package hw5_2;

public class UserManager {
	
	private final int MAX_NUM = 100; //그냥 멤버변수가 아닌 바꿀 수 없는 상수가 된다.
	private User[] users = new User[MAX_NUM];
	private int idx = 0; //유저인덱스 관리 멤버 변수
						 //배열의 인덱스 -> 현재 배열의 크기
	
	
	public void add(User user)
	{
		users[this.idx++] = user; //인덱스를 관리할 멤버 변수 必
								 //idx를 하나씩 늘리면서 배열에 값을 집어 넣음
	}
	
	public User[] getList()
	{
		User[] tmp = new User[this.idx]; // 현재 크기만큼의 빈 배열 만들기
		for(int i=0; i< this.idx; i++)
			tmp[i] = this.users[i];
		return tmp;
	}
	
	
	public VipUser[] getVipUsers()
	{
		int cnt = 0;
		for(int i=0; i<idx; i++)
		{
			if(users[i] instanceof VipUser)
				cnt++;
		}
		
		//일반 유저의 수가 0이면 null을 리턴
		if(cnt == 0) return null;
		
		//일반 유저가 있으면, 그 수만큼의 크기의 배열을 만든다.
		VipUser[] temp = new VipUser[cnt]; //일반 유저를 담는 임시 배열
		cnt = 0; //배열에 값을 집어넣기 위한 임시 인덱스
		for(int i=0; i<idx; i++)
			if(users[i] instanceof VipUser) //일반유저라면
				temp[cnt++] = (VipUser) users[i]; //임시배열에 해당하는 유저를 넣음
												  //명시적 형변환
		return temp;
	}
	
	public User[] getUsers()
	{
		int cnt = 0;
		for(int i=0; i<idx; i++)
			if(!(users[i] instanceof VipUser)) //user[i]가 vipuser인가요?
				cnt++;
		
		if(cnt == 0) return null;
		
		User[] temp = new User[cnt];
		cnt = 0;
		for(int i=0; i<idx; i++)
			if(!(users[i] instanceof VipUser))
				temp[cnt++] = users[i];
		return temp;
	}
	
	//average
	public int getAverage() //만약에 배열의 크기가 0이면 0으로 나눌 수 없으므로 그냥 0을 리턴
	{
		int sum = 0; 
		for(int i=0; i<idx; i++)
			sum += users[i].getAge();
		return sum / idx; //합을 개수로 나눠서 리턴
	}
	
	/*
	public User searchByName(String name) //string인 것이 확실하니 .equals 사용 -> 일치하는 것
	{
		for(int i=0; i<this.idx; i++)
		{
			if(name.equals(this.users[i].getName())) //i번째가 null일수도 있으므로 순서
				return this.users[i];
		}
		return null; //객체는 null로 초기화가 되니까
	}
	*/
	
	//6-2 VipUser
	public User[] searchByName(String keyword) //일치 포함
	{
		int cnt = 0;
		for(int i=0; i<this.idx; i++)
		{
			if(users[i].getName() != null) //null이 혹시 나올 수도 있으니
				if(users[i].getName().contains(keyword))
					cnt++;
		}
		if(cnt == 0) return null;
		
		User[] temp = new User[cnt];
		cnt = 0;
		for(int i=0; i<this.idx; i++)
		{
			if(users[i].getName() != null) //null이 혹시 나올 수도 있으니
				if(users[i].getName().contains(keyword))
					temp[cnt++] = users[i];
		}
		return temp;
	}
	
	//지우기
	//1) 지운 후 한칸씩 당기는 방식 2)덮어쓰고 마지막을 null 채우기 
	
	// 1)한칸씩 당기기
	public void remove(String id)
	{
		int targetIdx = -1;
		for(int i=0; i<this.idx; i++)
		{
			if(id.equals(this.users[i].getId()))
			{	
				targetIdx = i;
				break;
			}
		}
		if(targetIdx != -1)
		{	
			for(int i=targetIdx+1; i<this.idx; i++) //idx발견
				this.users[i-1] = this.users[i]; // 한칸씩 당기기
			this.users[this.idx - 1] = null;
			this.idx--;
		}
		else //targetIdx를 못 찾았을 때
			System.out.println("그런 사용자가 없습니다.");
	}
	//2)덮어씌우기
	public void rm2(String id)
	{
		int targetIdx = -1;
		for(int i=0; i<idx; i++) //this. 써도되고 안 써도 됨
		{
			if(id.equals(users[i].getId()))
			{
				targetIdx = i;
				break;
			}
		}
		if(targetIdx != -1)
		{
			users[targetIdx] = users[idx - 1];
			users[idx-1] = null;
			idx--;
		}
	}
	
	/*
	//싱글턴 패턴
	//밖에서 생성을 못하게 막아야 한다.
	//step5_2 MovieManager 참고
	private static UserManager manager = new UserManager;
	private final int MAX_NUM = 100; //그냥 멤버변수가 아닌 바꿀 수 없는 상수가 된다.
	private User[] users = new User[MAX_NUM];
	private int idx = 0;
	
	private UserManager(){
	}
	
	public static UserManager getInstance()
	{
		return manager;
	}
	*/
	
	
	
}
