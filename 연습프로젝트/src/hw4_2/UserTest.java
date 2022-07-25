package hw4_2;

public class UserTest {

	public static void main(String[] args) {
		User us1 = new User("ssafy", "ssafy", "박싸피", "ssafy@ssafy.com", 28);
		
		System.out.println("id : " + us1.getId());
		System.out.println("Password : " + us1.getPassword());
		System.out.println("Name : " + us1.getName());
		System.out.println("Email : " + us1.getEmail());
		System.out.println("Age : " + us1.getAge());
	}

}
