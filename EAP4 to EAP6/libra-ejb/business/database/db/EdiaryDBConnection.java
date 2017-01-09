
package business.database.db;

import java.sql.*;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.sql.*;
import javax.sql.*;

 
public class EdiaryDBConnection {

Connection con = null; 
	public Connection openConnection()  throws Exception 	{

	/* My job is to get a connection object from the pool and return to you; You break the head with Exceptions;
	*/

	InitialContext lContext = new InitialContext(); 
	DataSource ds = (DataSource) lContext.lookup("java:/jboss/mysqlds"); 
	 con = ds.getConnection() ;

	return con;
	
	}

	public void closeConnection() throws Exception {
	
	con.close() ; 

	}

}

