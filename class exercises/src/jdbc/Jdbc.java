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
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData resultSetMeta;
	
	public Jdbc()
	{
		this(ORACLE_DRIVER, ORACLE_URL);
	}
	
	public Jdbc(String driver, String url)
	{
		this.driver = driver;
		this.url = url;
	}
		
	
	public void openConnection()
	{
		try 
		{
			// step1 load the driver class
			Class.forName(driver);

			// step2 create the connection object
			connection = DriverManager.getConnection(url, "hr", "hr");

			// step3 create the statement object
			statement = connection.createStatement();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}   
	}
	
	public void closeConnection()
	{
		try
		{
			// step5 close the connection object
			connection.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public ArrayList<Map<String, String>> query(String query)
	{
		ArrayList<Map<String, String>> mapArray =
				new ArrayList<Map<String, String>>();
		
		try
		{
			// step4 execute query
			resultSet = statement.executeQuery(query);
			resultSetMeta = resultSet.getMetaData();
			
			while (resultSet.next())
			{
				Map<String, String> map = new HashMap<String, String>();
				
				for (int i = 1; i < resultSet.getFetchSize(); i++)
				{
					map.put(resultSetMeta.getColumnName(i),
							(String)resultSet.getString(i));
				}
				
				mapArray.add(map);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return mapArray;
	}
	
	public String queryString(String query)
	{
		String output = null;
		
		try
		{
			// step4 execute query
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next())
			{
				output = resultSet.getString(1);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return output;	
	}
	
	public int queryInteger(String query)
	{
		int output = 0;
		
		try
		{
			// step4 execute query
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next())
			{
				output = resultSet.getInt(1);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return output;	
	}
	
	public double queryDouble(String query)
	{
		double output = 0;
		
		try
		{
			// step4 execute query
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next())
			{
				output = resultSet.getDouble(1);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return output;	
	}
}
