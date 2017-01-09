
/**
  * @(#)RegistrationForm.java
  * @author   Manivannan Palanichamy 
  * @version  1.0, 19th May 2006
  * Description This is RegistrationForm for new customer account registration. This form is mapped with /register action
  */

package struts.com.libra.registration;

import javax.servlet.http.HttpServletRequest ; 
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping; 


public  class RegistrationForm extends ActionForm {

/** New customer name */
private String name;

/** New customer password*/
private String password;

/** New customer email */
private String email;

/** New customer phone */
private String phone;

/** New customer address */
private String address;


/** The plain old getters! */
public String getName() {
	return this.name;
}

public String getPassword() {
	return this.password;
}

public String getEmail() {
	return this.email;
}

public String getPhone() {
	return this.phone;
}

public String getAddress() {
	return this.address;
}



/** The plain old setters!*/
public void setName(String name) {
	this.name = name;
}

public void setPassword(String password) {
	this.password = password;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public void setAddress(String address) {
	this.address = address;
}



public void reset(ActionMapping mapping, HttpServletRequest request) {
	this.name =null ;
	this.password =null ;
	this.email =null ;
	this.phone =null ;
	this.address =null ;

}


public ActionErrors validate(ActionMapping mapping,
				 HttpServletRequest request) {

	ActionErrors errors = new ActionErrors();

/** I am just ensuring non-null values. No hi-fy validation! */

	if ((name == null) || (name.length() < 1))
	    errors.add("name", new ActionError("com.libra.registration.name.error"));

	if ((password == null) || (password.length() < 1))
	    errors.add("password", new ActionError("com.libra.registration.password.error"));

	if ((email == null) || (email.length() < 1))
	    errors.add("email", new ActionError("com.libra.registration.email.error"));

	if ((phone == null) || (phone.length() < 1))
	    errors.add("phone", new ActionError("com.libra.registration.phone.error"));

	if ((address == null) || (address.length() < 1))
	    errors.add("address", new ActionError("com.libra.registration.address.error"));

	return errors;

    }





}