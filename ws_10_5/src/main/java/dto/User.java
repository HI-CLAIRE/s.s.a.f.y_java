package dto;

public class User {
	private int userSeq;
	private String userId;
	private String password;
	private String userName;
	private String nickName;
	private String email;
	private String joinedAt;
	
	
	public String getJoinedAt() {
		return joinedAt;
	}



	public void setJoinedAt(String joinedAt) {
		this.joinedAt = joinedAt;
	}



	public User() {
		super();
	}



	public User(String userId, String password, String userName, String nickName, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.nickName = nickName;
		this.email = email;
	}



	public int getUserSeq() {
		return userSeq;
	}



	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", nickName=" + nickName + ", email=" + email + "]";
	}
	
	
	
	
	
}
