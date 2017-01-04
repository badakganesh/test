package business.ejb.registration;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import business.database.registration.*;

 
public class RegisterUserBean implements SessionBean
{

   public boolean registerUser(String user, String password,String email, String phone, String address )
   { 
	
 	try {
		RegisterUser r = new RegisterUser();
		r.addUser(user,password,email,phone,address);
		r = null;

	    }
	catch(Exception e)
	{
       System.out.println ("user registration failed: Due to: " + e.toString() );
		return false ;
	}
	return  true;
   }


   public void ejbCreate() throws CreateException {}
   
	public void setSessionContext( SessionContext sessionContext ) {}
	
   public void ejbActivate() {}
	
   public void ejbPassivate() {}
	
   public void ejbRemove() {}
	
}  
