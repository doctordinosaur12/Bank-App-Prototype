package business;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;
import java.sql.SQLException;

public class LoginBusiness {
	private static LoginBusiness instance;
	private User user;
	private LoginDataAccess lda = LoginDataAccess.getInstance();
	
	private LoginBusiness(String username, String pass) {
		user = User.getInstance(username,pass);
	}
	public static LoginBusiness getInstance(String username,String pass) {
		if(instance==null) {
			instance= new LoginBusiness(username,pass);
			instance.validate();
		}else {
			instance.update(username,pass);
			instance.validate();
		}
		return instance;
	}
	private void validate() {
		if(user.getUserName().equals("")) {
			throw new MessageException("Username not informed");
		}else if(user.getPassword().equals("")) {
			throw new MessageException("Password not informed");
		}
	}
	private void update(String username,String pass) {
		user.setUserName(username);
		user.setPassword(pass);
	}
	public User getUser() {
		return user;
	}
	public boolean verify() throws ClassNotFoundException, SQLException{
		try {
			if(lda.verifyCredentials(user)) {
				return true;
			}else {
				return false;
			}
		}
		catch(ClassNotFoundException e) {
			throw e;
		}catch(SQLException e) {
			throw e;
		}
	}
}
