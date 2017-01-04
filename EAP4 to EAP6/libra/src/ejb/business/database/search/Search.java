package business.database.search;

import java.sql.*; 

import java.util.*;
import business.ejb.general.*;

import business.database.db.EdiaryDBConnection;

public class Search{

	public List search(String key) throws Exception {

	EdiaryDBConnection  db = new EdiaryDBConnection () ; 
	Connection conn = db.openConnection();

	String query = "select * from stack where book_isbn = '" + key + "' or book_name like '%" + key + "%' or book_authors like '%" + key + "%' ";

	Statement s = conn.createStatement();
	ResultSet r = s.executeQuery(query);


	// I want to use escape char, so I am not going to use prepared statement
	/* 
	String tempKey = "'%" + key + "%'" ;
	PreparedStatement p = conn.prepareStatement("select * from stack where book_isbn = ? or book_name like ? or book_authors like ? ");
	p.setString(1,key);
	p.setString(2,tempKey);
	p.setString(3,tempKey);
	ResultSet r = p.executeQuery();

	*/
	
	List books = new ArrayList() ;
		
	
	System.out.println("Now the query looks like this: " + s.toString() ) ;

	while (r.next()) 
	{
	Book b = new Book();
	b.setIsbn(r.getString("book_isbn"));
	b.setBookName(r.getString("book_name"));
	b.setAuthors(r.getString("book_authors"));
	b.setPrice(r.getString("price"));

	books.add(b);
	
	}
	s.close();
	conn.close();
	db.closeConnection(); 
	
	return books; 
	
		}

}

