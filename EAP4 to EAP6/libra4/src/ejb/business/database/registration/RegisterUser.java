package business.database.registration;

import java.sql.*; 
import business.database.db.EdiaryDBConnection;

public class RegisterUser {

	public void addUser (String name,String password,String email, String phone, String address) throws Exception {

	EdiaryDBConnection  db = new EdiaryDBConnection () ; 
	Connection conn = db.openConnection();
	PreparedStatement p = conn.prepareStatement("insert into user_profile values(?,?,?,?,?)");
	p.setString(1,name);
	p.setString(2,password);
	p.setString(3,email);
	p.setString(4,address);
	p.setString(5,phone);
	p.executeUpdate();
	p.close();
	conn.close();
	db.closeConnection(); 
	}

}

