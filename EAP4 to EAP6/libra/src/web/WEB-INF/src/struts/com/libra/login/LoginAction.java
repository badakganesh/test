
/**
  * @(#)LoginAction.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description LoginAction verifies the customer login and password.
  */

package com.libra.login;

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

import org.apache.struts.util.MessageResources;

import org.apache.commons.beanutils.PropertyUtils;

import business.ejb.login.*;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;



public class LoginAction extends Action {


    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
    throws Exception {

	 MessageResources messages = getResources(request);


	ActionErrors errors = new ActionErrors();
	
	String name = (String) PropertyUtils.getSimpleProperty(form, "name");
	String password= (String) PropertyUtils.getSimpleProperty(form, "password");

	try{

		InitialContext lContext = new InitialContext(); 
		LoginVerifierHome lHome = (LoginVerifierHome) lContext.lookup("LoginVerifierBean"); 
		LoginVerifierLocal h1 = lHome.create(); 
			
		
		if (h1.verifyLogin(name,password)) 
		{
		HttpSession session = request.getSession();
		session.setAttribute("user",name);
		return (mapping.findForward("loginSuccess"));
		}
		else  return (mapping.findForward("loginFailed"));

		
	}
	catch(Exception e){
	
	System.out.println("Exception e:" + e.toString() );
		 return (mapping.findForward("loginFailed"));
	}

   }

}

