package business.ejb.registration;

import javax.ejb.CreateException;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import business.database.registration.*;

@Stateful
public class RegisterUserBean implements Registration
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
	
}  
