/**
  * @(#)SearchAction.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description This SearchAction retrieves search result based on the key passed to the SearchForm
  */

package com.libra.search;

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

import business.ejb.search.*;
import business.ejb.login.login;
import business.ejb.general.Book;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.*;


public class SearchAction extends Action {


    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
    throws Exception {

	 MessageResources messages = getResources(request);


	ActionErrors errors = new ActionErrors();
	
	String key = (String) PropertyUtils.getSimpleProperty(form, "key");
 System.out.println("Key is:::::::::::"+key);


	try{

		InitialContext ctx = new InitialContext(); 
		//SearchBookHome lHome = (SearchBookHome) lContext.lookup("SearchBookBean"); 
		//SearchBookLocal h1 = lHome.create(); 
		search bean=(search) ctx.lookup("java:global/libra-ejb/SearchBookBean!business.ejb.search.search"); 
		System.out.println("lookup sucessfully");
			
		List books =bean.search(key) ; 

		if (books == null)

				 return (mapping.findForward("searchResult"));
		
		else 
			{
			System.out.println("else condition");
			Iterator it = books.iterator(); 

			while (it.hasNext()) { 
			Book b = (Book)it.next(); 
			System.out.println(b.getIsbn() + ":" + b.getBookName() + ":" + b.getAuthors() + ":" + b.getPrice()); 
			}

			request.setAttribute("books", books);
			return (mapping.findForward("searchResult"));
			
			}
	}
	catch(Exception e){
	e.printStackTrace();
	System.out.println("in /search action class Exception e:" + e.toString() );
	return (mapping.findForward("searchResult"));
	
	
	}

	

    }


}

