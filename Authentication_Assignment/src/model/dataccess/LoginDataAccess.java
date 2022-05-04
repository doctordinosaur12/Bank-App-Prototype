package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.User;
import model.dataccess.*;

public class LoginDataAccess {
	private static LoginDataAccess instance;
	private String database;
	private ConnectionFactory cf = new ConnectionFactory();
	private LoginDataAccess (String database) {
		this.database=database;
	}

	public static LoginDataAccess getInstance(String database) {
		if(instance==null) {
			instance = new LoginDataAccess(database);
		}else {
			instance.setDatabase(database);
		}
		return instance;
	}
	private void setDatabase(String database) {
		this.database=database;
	}
	public Boolean verifyCredentials(User user) throws ClassNotFoundException, SQLException {

		Connection conection = cf.getConnection(database);

		final PreparedStatement stmt = conection.prepareStatement("SELECT * FROM users WHERE username=? and password=?");

		stmt.setString(1, user.getUserName());
		stmt.setString(2, user.getPassword());

		ResultSet rs = stmt.executeQuery();

		return rs.next();
		
	}

}

