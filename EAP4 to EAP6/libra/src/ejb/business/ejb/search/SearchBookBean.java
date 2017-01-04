package business.ejb.search;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import business.database.search.*;
import java.util.List;
import java.util.ArrayList;


 
public class SearchBookBean implements SessionBean
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


   public void ejbCreate() throws CreateException {}
   
	public void setSessionContext( SessionContext sessionContext ) {}
	
   public void ejbActivate() {}
	
   public void ejbPassivate() {}
	
   public void ejbRemove() {}
	
}  
