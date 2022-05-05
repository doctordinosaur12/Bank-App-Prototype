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
	public DatabaseConnection getConnection(String database) throws ClassNotFoundException, SQLException{
		if(database.equals(null)) {
			return null;
		}
		if(database.equals("postgres")) {
			
			DatabaseConnection connection = new PostgresConnection();
			return connection;
		}
		if(database.equals("mySQL")) {
			DatabaseConnection connection = new MySQLConnection();
			return connection;
		}
		return null;
	}
}
