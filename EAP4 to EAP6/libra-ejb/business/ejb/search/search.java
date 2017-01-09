package business.ejb.search;

import java.util.*;
import javax.ejb.Remote;
@Remote

public interface search {
	public List search(String key) ; 

}


