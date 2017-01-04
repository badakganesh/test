
/**
  * @(#)LogoutAction.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 20th May 2006
  * Description Logout Action removes the user name from the session and returns the 'loginSuccess'ActionForward
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



public class LogoutAction extends Action {


    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
    throws Exception {

	 MessageResources messages = getResources(request);


	ActionErrors errors = new ActionErrors();
	
		HttpSession session = request.getSession();
		session.setAttribute("user",null);
		session.invalidate();
		session = null;

	// I hope, no logoutFailed actionforward requires. So, always
	
		return (mapping.findForward("logoutSuccess"));

    }


}


