
/**
  * @(#)PurchaseForm.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 20th May 2006
  * Description This form is populated by /purchase action. This form validate the purchase details.
  * Then, forwarded to PurchaseAction.
  */

package com.libra.purchase;

import javax.servlet.http.HttpServletRequest ; 
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping; 


public  class PurchaseForm extends ActionForm {

/** This is the isbn chosen by the customer */
private String isbn;

/** Book name corresponding to the isbn */
private String bookName;

/** Author(s) name(s) of the book*/
private String authors;

/** Price of the book in number. (you can consider it Dollar, RS, Penny whatever you want )*/
private String price;

/** customer/receiver's name*/
private String customerName;

/** Phone of the customer/receiver*/
private String phone;

/** email of the customer/receiver*/
private String email;

/** credit no (from which the amount will be availed)*/
private String credit;

/** shipping address*/
private String address;


/** List of POG (Plain Old Getter)s */

public String getIsbn() {
	return this.isbn;
}

public String getBookName() {
	return this.bookName;
}
public String getAuthors() {
	return this.authors;
}

public String getPrice() {
	return this.price;
}

public String getcustomerName() {
	return this.customerName;
}

public String getPhone() {
	return this.phone;
}

public String getEmail() {
	return this.email;
}

public String getCredit() {
	return this.credit;
}

public String getAddress() {
	return this.address;
}

/** List of POS (Plain Old Setter)s*/

public void setIsbn(String isbn) {
	 this.isbn = isbn;
}

public void setBookName(String bookName) {
	 this.bookName = bookName;
}
public void setAuthors(String authors) {
	 this.authors = authors;
}

public void setPrice(String price) {
	 this.price = price;
}

public void setcustomerName(String customerName) {
	 this.customerName = customerName;
}

public void setPhone(String phone) {
	 this.phone = phone;
}

public void setEmail(String email) {
	 this.email = email ;
}

public void setCredit(String credit) {
	 this.credit = credit;
}

public void setAddress(String address) {
	 this.address = address;
}



public void reset(ActionMapping mapping, HttpServletRequest request) {

	this.isbn = null;
	this.bookName = null;
	this.authors = null;
	this.price = null;
	this.customerName = null;
	this.phone = phone;
	this.email = email;
	this.credit = null;
	this.address = null;	
	
}


public ActionErrors validate(ActionMapping mapping,
				 HttpServletRequest request) {

	ActionErrors errors = new ActionErrors();

	if ((credit == null) || (credit.length() < 1))
	  errors.add("credit", new ActionError("com.libra.purchase.credit.error"));

	// will do the remaining credit no check later!

	
	return errors;
    }





}