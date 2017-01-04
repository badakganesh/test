package business.ejb.login;

import javax.ejb.*;


public interface LoginVerifierHome extends EJBLocalHome
{

   public LoginVerifierLocal create() throws CreateException;

}
