package business.database.purchase;

import java.sql.*; 
import business.database.db.EdiaryDBConnection;

public class PlaceOrder {

	public void placeOrder (String user_name,String book_isbn,String receiver_name,String phone,String email,String credit_no,String shipping_address, String amount_paid, String status, String date_of_order) throws Exception {

	EdiaryDBConnection  db = new EdiaryDBConnection () ; 
	Connection conn = db.openConnection();
	PreparedStatement p = conn.prepareStatement("insert into user_purchase_history values(?,?,?,?,?,?,?,?,?,?)");
	p.setString(1,user_name);
	p.setString(2,book_isbn);
	p.setString(3,receiver_name);
	p.setString(4,phone);
	p.setString(5,email);
	p.setString(6,credit_no);
	p.setString(7,shipping_address);
	p.setString(8,amount_paid);
	p.setString(9,status);
	p.setDate(10,new java.sql.Date( System.currentTimeMillis() ) ); 


	p.executeUpdate();
	p.close();
	conn.close();
	db.closeConnection(); 
	}

}

