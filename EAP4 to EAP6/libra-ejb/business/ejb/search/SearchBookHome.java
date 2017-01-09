package business.ejb.search;

import javax.ejb.*;


public interface SearchBookHome extends EJBLocalHome
{

   public SearchBookLocal create() throws CreateException;

}
