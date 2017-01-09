package business.database.login;

import java.sql.*; 
import business.database.db.EdiaryDBConnection;

public class LoginVerifier {

	public boolean verify(String name,String password) throws Exception {

	EdiaryDBConnection  db = new EdiaryDBConnection () ; 
	Connection conn = db.openConnection();
	PreparedStatement p = conn.prepareStatement("select password from user_profile where user_name=?");
	p.setString(1,name);
	
	String temppass = null ; 
	
	ResultSet r = p.executeQuery();
	if (r.next()) 
	temppass = r.getString("password");
	else temppass = null ; // no such user!
	
	p.close();
	conn.close();
	db.closeConnection(); 

	if ((temppass != null) && (temppass.equals(password)))
	return true; 	// yes, the user exists and the password matches.
	else return false; // no, he may be a fraud! 
	}

}

