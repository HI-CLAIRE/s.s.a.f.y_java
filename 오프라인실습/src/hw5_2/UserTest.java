package hw5_2;

public class UserTest {

	public static void main(String[] args) {
		// static이 아니므로 객체를 하나 만들어줘야 한다.
		UserManager um = new UserManager();
		um.add(new User("aaa", "aaa", "이싸피", "aaa@aaa.com", 40));
		um.add(new User("bbb", "bbb", "박싸피", "bbb@bbb.com", 35));
		um.add(new User("ccc", "ccc", "김싸피", "ccc@ccc.com", 30));

		// 원래 출력
		User[] users = um.getList();
		for (int i = 0; i < users.length; i++)
			System.out.println(users[i]);
		System.out.println("------------");

		// 지우고 출력
		um.remove("aaa");
		User[] users2 = um.getList();
		for (int i = 0; i < users2.length; i++)
			System.out.println(users2[i]);
		System.out.println("------------");

		// 2)덮어씌우기 -> 순서가 뒤바뀔 수 있음
		um.rm2("ccc");
		User[] users3 = um.getList();
		for (int i = 0; i < users3.length; i++)
			System.out.println(users3[i]);
		System.out.println("------------");

		// 싱글턴 출력할 때는 getInstance
		// 외부에서 호출할 수 있는 메소드를 선언해서 사용
		// UserManager um2 = UserManager.getInstance();

		// 6_2 상속

		VipUser vu1 = new VipUser("ddd", "ddd", "윤싸피", "ddd@ddd.com", 20, "Platinum", 10000);
		VipUser vu2 = new VipUser("eee", "eee", "남궁싸피", "eee@eee.com", 21, "Gold", 1000);
		VipUser vu3 = new VipUser("fff", "fff", "제갈싸피", "fff@fff.com", 22, "Platinum", 50000);
		um.add(vu1);
		um.add(vu2);
		um.add(vu3);

//		User[] users3 = um.searchByName("남궁");
//		for(int i=0; i<users3.length; i++)
//			System.out.println(users3[i]);

		VipUser[] vipusers = um.getVipUsers();
		for (int i = 0; i < vipusers.length; i++)
			System.out.println(vipusers[i]);

		User[] users4 = um.getUsers();
		if (users4 != null) 
			for (int i = 0; i < users4.length; i++)
				System.out.println(users4[i]);
		
	}

}
