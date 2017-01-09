package business.ejb.login;

import javax.ejb.*; 


public interface LoginVerifierLocal    extends EJBLocalObject
{

  public boolean verifyLogin(String user, String password);

}
