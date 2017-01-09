package business.ejb.login;


//import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import business.database.login.*;

@Stateless
public class LoginVerifierBean implements login
{

   public boolean verifyLogin(String user, String password)
   { 
	
		try {

		LoginVerifier  r = new LoginVerifier();
		if (r.verify(user,password))
		 return true; // Login ok		 
	
		    }	
		catch(Exception e)
		{
			e.printStackTrace();
	      System.out.println("user login failed: Due to: " + e.toString()) ;
		}
		
	return false; 
   }


  // public void ejbCreate() throws CreateException {}
   
//public void setSessionContext( SessionContext sessionContext ) {}
	
   //public void ejbActivate() {}
	
  //public void ejbPassivate() {}
	
  //public void ejbRemove() {}
	
}  
