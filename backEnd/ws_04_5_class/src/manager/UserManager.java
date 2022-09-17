package manager;

import java.util.ArrayList;
import java.util.List;

import dto.User;

public class UserManager {
	// 2. 유일한 인스턴스를 static으로 생성
	private static UserManager instance = new UserManager();
	private List<User> users; // 유저 리스트
	private int userSeq; // auto increment를 기능을 dummy로 구현
	
	// 1. 외부에서 생성 못하도록 생성자를 private으로 만듦
	private UserManager() {
		users = new ArrayList<User>();
		User user = new User(userSeq++, "a", "a", "a", "a", "a");
		users.add(user);
	}
	
	// 3. 외부에서 단일한 인스턴스에 접근할 수 있도록 getter 함수
	// 클래스 이름으로 바로 접근 가능해야 하므로 static으로 만들어줘야...
	public static UserManager getInstance() {
		return instance;
	}
	
	// 리스트에 유저를 추가(signup때 활용)
	public void addUser(User user) {
		user.setUserSeq(userSeq++);
		users.add(user);
	}
	
	// 리스트에서 특정 유저(id, password) 가져오기
	// 로그인 기능에서 사용.
	public User getUser(String userId, String password) {
		for(int i=0; i<users.size(); i++) {
			User temp = users.get(i);
			if(temp.getUserId().equals(userId) && temp.getPassword().equals(password)) {
				return temp;
			}
		}
		return null;
	}
	
	public String getUserName(int userSeq) {
		for(int i=0; i<users.size(); i++) {
			User temp = users.get(i);
			if(temp.getUserSeq() == userSeq) {
				return temp.getUserName();
			}
		}
		return "";
	}
	
	
}
