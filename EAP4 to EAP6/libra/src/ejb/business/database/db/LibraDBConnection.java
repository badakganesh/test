
package business.database.db;

import java.sql.*;


public class LibraDBConnection {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/libra?user=root&password=sun";
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

