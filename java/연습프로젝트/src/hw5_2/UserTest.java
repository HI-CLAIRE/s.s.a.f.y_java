package hw5_2;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("aaa", "aaa", "김싸피", "aaa@aaa.com", 27);
		User user2 = new User();
		UserManager addUser = new UserManager();
		
		user2.setId("bbb");
		user2.setPassword("bbb");
		user2.setName("박싸피");
		user2.setEmail("bbb@bbb.com");
		user2.setAge(35);
		
		addUser.add(user1);
		addUser.add(user2);
		
		User[] tmp = addUser.getList();
		for(int i=0; i < tmp.length; i++)
		{	
			System.out.println(tmp[i]);
		}
		System.out.println("등록된 사용자 수 : " + tmp.length);
		System.out.println("----------------");
		
		User temp = addUser.searchByName("김싸피");
		System.out.println(temp);
		
		System.out.println("----------------");
		
		
		
		System.out.println("----------------");
		
		System.out.println(user1);
	}

}
