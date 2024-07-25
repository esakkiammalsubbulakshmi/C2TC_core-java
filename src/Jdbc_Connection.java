import java.sql.Connection;
import java.sql.DriverManager;
import	java.sql.*;
public class Jdbc_Connection {
	public static Connection getConnection() throws SQLException

	{//establish	the	connection
		String	url="jdbc:mysql://localhost:3306/MiniProject";
		String	userName="root";
		String	password="Esai@28122003";
		Connection	con=DriverManager.getConnection(url,userName,password);
		return	con;
	}
}