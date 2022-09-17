package dto;

public class User {
	private String userId;
	private String userName;
	private String email;
	private String userPassword;
	
	public User(String userId, String userName, String email, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
