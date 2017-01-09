package business.ejb.search;

import javax.ejb.*; 
import java.util.*;

public interface SearchBookLocal    extends EJBLocalObject
{

  public List search(String key) ; 

}
