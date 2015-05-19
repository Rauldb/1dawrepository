package jdbc;

import java.sql.*;
import java.util.*;

public class Jdbc
{
	// public constants
	public static final String ORACLE_DRIVER =
			"oracle.jdbc.driver.OracleDriver";
	public static final String SQL_DRIVER = 
			"com.mysql.jdbc.Driver";
	public static final String ORACLE_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	// user needs to add database name to SQL URL
	public static final String SQL_URL = 
			"jdbc:mysql://localhost:3306/";
	
	// private properties
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection connection;

	
	public Jdbc(String driver, String url,String user,String password)
	{
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password=password;
	}
		
	
	public boolean openConnection()
	{
		try 
		{
			
			Class.forName(driver);

			
			connection = DriverManager.getConnection(url, user, password);

						
		} 
		catch (Exception e)
		{
			System.out.println(e);
			return false;
		} 
		return true;
	}
	
	public void closeConnection()
	{
		try
		{
			
			connection.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
		
		
	
}
