package struts.com.libra.login;
/**
  * @(#)LoginForm.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description This login form is invoked by the /login action-mapping.
  */


import javax.servlet.http.HttpServletRequest ; 
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping; 


public  class LoginForm extends ActionForm {

/** This is customer login name */
private String name;

/** This is customer password */
private String password;





public String getName() {
	return this.name;
}


public String getPassword() { 
	return this.password;
}

public void setName(String name) {
	this.name = name;
}

public void setPassword(String password) {
	this.password = password;
}



public void reset(ActionMapping mapping, HttpServletRequest request) {
	this.name = null;
	this.password = null;

	
	
}


public ActionErrors validate(ActionMapping mapping,
				 HttpServletRequest request) {

	ActionErrors errors = new ActionErrors();

	if ((name == null) || (name.length() < 1))
	  errors.add("name", new ActionError("com.libra.login.name.error"));
	

	if ((password == null) || (password.length() < 1))
	    errors.add("password", new ActionError("com.libra.login.password.error"));
	
	return errors;
    }





}