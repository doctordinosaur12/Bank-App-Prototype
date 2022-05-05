package model.entities;

public class User {
	private static User instance;
	private String userName;
	
	private String password;
	
	private User (String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public static User getInstance(String username,String pass) {
		if(instance==null) {
			instance=new User(username,pass);
		}
		return instance;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
