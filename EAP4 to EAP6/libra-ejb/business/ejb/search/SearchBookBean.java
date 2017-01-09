package business.ejb.search;

import javax.ejb.CreateException;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import business.database.search.*;
import java.util.List;
import java.util.ArrayList;


@Stateless
public class SearchBookBean implements search
{

   public List search(String key)
   { 
	
		try {

		Search s = new Search ();
		return s.search(key);

		    }	
		catch(Exception e)
		{
	      System.out.println("Searching failed: Due to: " + e.toString()) ;
		return null;
		}
		
	   }

	
}  
