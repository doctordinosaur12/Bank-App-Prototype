package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.entities.User;
public interface DatabaseConnection {
	public Connection getDatabaseConnection()throws ClassNotFoundException, SQLException;
}
