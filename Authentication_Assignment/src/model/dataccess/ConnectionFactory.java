package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.User;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public ConnectionFactory() {}
	public Connection getConnection(String database) throws ClassNotFoundException, SQLException{
		if(database.equals(null)) {
			return null;
		}
		if(database.equals("authentication")) {
			final String URL = "jdbc:postgresql://localhost:5432/authentication";

			final String USER = "postgres";

			final String PWD = "123";

			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(URL, USER, PWD);
			return connection;
		}
		return null;
	}
}
