/**
  * @(#)RegistrationAction.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description This RegistrationAction register the customer info passed by RegistrationForm. 
  */

package com.libra.registration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import business.ejb.registration.*;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;


import org.apache.struts.util.MessageResources;

import org.apache.commons.beanutils.PropertyUtils;



public class RegistrationAction extends Action {


    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
    throws Exception {

	 MessageResources messages = getResources(request);


	ActionErrors errors = new ActionErrors();
	
	String name = (String) PropertyUtils.getSimpleProperty(form, "name");
	String password = (String) PropertyUtils.getSimpleProperty(form, "password");
	String email = (String) PropertyUtils.getSimpleProperty(form, "email");
	String phone = (String) PropertyUtils.getSimpleProperty(form, "phone");
	String address = (String) PropertyUtils.getSimpleProperty(form, "address");

	try {
		InitialContext ctx = new InitialContext(); 
		//RegisterUserHome lHome = (RegisterUserHome) lContext.lookup("RegisterUserBean");
		Registration bean=(Registration) ctx.lookup("java:global/libra-ejb/RegisterUserBean!business.ejb.registration.Registration");
		//RegisterUserLocal h1 = lHome.create(); 
			
		if (bean.registerUser(name,password,email,phone,address))
			return (mapping.findForward("registrationSuccess"));
		else 
			{
			errors.add("nameDuplication", new ActionError("com.libra.registration.name.duplication.error"));
			return (mapping.findForward("registrationFailed"));
			
			}
	    }
	catch (Exception e)	
	{
			System.out.println("Registration failed due to: " + e.toString() );
			return (mapping.findForward("registrationFailed"));
	}

	

    }


}

