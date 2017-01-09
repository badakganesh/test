package business.ejb.login;

import javax.ejb.Remote;
@Remote
public interface login {

	public boolean verifyLogin(String user, String password);
}

