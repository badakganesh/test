/**
  * @(#)SearchForm.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description This is SearchForm action-form for /search action mapping.
  */

package com.libra.search;

import javax.servlet.http.HttpServletRequest ; 
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping; 


public  class SearchForm extends ActionForm {

/** This is the key entered by the customer for searching books */
private String key;


/** The plain old getter for key!*/
public String getKey() {
	return this.key;
}

/** The plain old setter for key!*/
public void setKey(String key) {
	this.key = key;
}


public void reset(ActionMapping mapping, HttpServletRequest request) {
	this.key = null;

}


public ActionErrors validate(ActionMapping mapping,
				 HttpServletRequest request) {

	ActionErrors errors = new ActionErrors();

	if ((key == null) || (key.length() < 1));
	//  errors.add("key", new ActionError("libra.search.key.error"));
	// do later


	// checkout the errors and pass it to SearchAction
	


	return errors;
    }





}