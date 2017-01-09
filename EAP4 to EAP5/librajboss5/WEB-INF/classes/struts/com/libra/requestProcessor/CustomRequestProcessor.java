
/**
  * @(#)CustomRequesProcessor.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 17th May 2006
  * Description LoginAction verifies the customer login and password.
  */

package struts.com.libra.requestProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.RequestProcessor;
import org.apache.struts.tiles.*;


public class CustomRequestProcessor extends TilesRequestProcessor {
	protected boolean processPreprocess(HttpServletRequest request,HttpServletResponse response) {
			HttpSession session = request.getSession(false);

		//If user has already logged in then dont check

		if( session != null && session.getAttribute("user") != null)	
			{
			System.out.println("libra-testing: session is set; so, go ahead");
			return true;
			}


		// If user requests the welcome page then, dont prompt
		if( request.getServletPath().equals("/welcome.do") || request.getServletPath().equals("/login.do") || request.getServletPath().equals("/register.do") )
			{
			System.out.println("libra-testing: login/welcome requested");
			return true;
			}
		//Check if userName attribute is there is session. If yes then that means user has allready loggedIn
		else{
			try{
				//If no redirect user to login Page

				System.out.println("libra-testing: redirecting to /welcome ");
				request.getRequestDispatcher("/welcome.do").forward(request,response);
			}catch(Exception ex){
			}
		}
		return false;
	}
	
	protected void processContent(HttpServletRequest request,HttpServletResponse response) {
			//Check if user is requesting ContactImageAction if yes then set image/gif as content type
			if( request.getServletPath().equals("/contactimage.do")){
				response.setContentType("image/gif");
				return;
			}
		super.processContent(request, response);
	}
}
