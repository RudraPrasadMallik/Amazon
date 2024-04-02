package HotelApp;

import java.sql.*;

public class DBConnection 
{
	private static Connection con;
	public DBConnection()
	{
	}
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection DBgetConnection()
	{
		return con;
	}
}
