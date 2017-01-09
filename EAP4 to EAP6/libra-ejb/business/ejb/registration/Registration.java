package business.ejb.registration;

import javax.ejb.Remote;
@Remote

public interface Registration {
	public boolean registerUser(String user, String password,String email, String phone, String address );

}
