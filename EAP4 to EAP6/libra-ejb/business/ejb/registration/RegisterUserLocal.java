package business.ejb.registration;

import javax.ejb.*; 


public interface RegisterUserLocal    extends EJBLocalObject
{

   public boolean registerUser(String user, String password,String email, String phone, String address );

}
