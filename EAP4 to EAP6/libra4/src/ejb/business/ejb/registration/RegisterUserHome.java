package business.ejb.registration;

import javax.ejb.*;


public interface RegisterUserHome extends EJBLocalHome
{

   public RegisterUserLocal create() throws CreateException;

}
