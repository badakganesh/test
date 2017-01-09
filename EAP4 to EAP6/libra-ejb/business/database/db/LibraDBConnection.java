
package business.database.db;

import java.sql.*;


public class LibraDBConnection {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://192.168.1.125/libra?user=root&password=root";
	Connection conn = null;


	public Connection openConnection()  throws Exception 	{
	
      Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url);

	return conn; 

	}

	public void closeConnection() throws Exception {
	
	conn.close() ; 

	}

}

