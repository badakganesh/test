
/**
  * @(#)PurchaseAction.java
  * @author   Manivannan Palanichamy
  * @version  1.0, 21st May 2006
  * Description PurchaseAction Places a purchase order in the queue and returns ack.
  */

package com.libra.purchase;

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


import business.ejb.purchase.*;

import javax.naming.*;
import java.util.Date;
import javax.jms.*;
import javax.rmi.PortableRemoteObject;

public class PurchaseAction extends Action {


    public ActionForward execute(ActionMapping mapping,
				 ActionForm form,
				 HttpServletRequest request,
				 HttpServletResponse response)
    throws Exception {

	 MessageResources messages = getResources(request);


	ActionErrors errors = new ActionErrors();
	
	String isbn = (String) PropertyUtils.getSimpleProperty(form, "isbn");
	String bookName = (String) PropertyUtils.getSimpleProperty(form, "bookName");
	String authors = (String) PropertyUtils.getSimpleProperty(form, "authors");
	String price = (String) PropertyUtils.getSimpleProperty(form, "price");
	String customerName = (String) PropertyUtils.getSimpleProperty(form, "customerName");
	String phone = (String) PropertyUtils.getSimpleProperty(form, "phone");
	String email = (String) PropertyUtils.getSimpleProperty(form, "email");
	String credit = (String) PropertyUtils.getSimpleProperty(form, "credit");
	String address = (String) PropertyUtils.getSimpleProperty(form, "address");

	// Update this purchase in a SFSB.
	// place an order using MD Bean

String tmpOrder = isbn + " " + bookName + " " + authors + " " + price + " " + customerName + " " + phone + " " + email + " " + credit + " "+ address  ;
System.out.println("Form details " + tmpOrder);

// Sending the order to an MD Bean of Queue Type

QueueConnection queueConnection;

 QueueSender queueSender;


		try {

		
			InitialContext jndiContext = new InitialContext(); 

			QueueConnectionFactory ref =(QueueConnectionFactory)jndiContext.lookup("ConnectionFactory");

			Queue queue = (Queue)jndiContext.lookup("queue/testQueue");

			queueConnection = ref.createQueueConnection();

			QueueSession queueSession =	queueConnection.createQueueSession(	false,Session.AUTO_ACKNOWLEDGE);

			TemporaryQueue tq = queueSession.createTemporaryQueue();
			queueSender = queueSession.createSender(queue);
			QueueReceiver qr = queueSession.createReceiver(tq);
			TextMessage msg = queueSession.createTextMessage();
			msg.setJMSReplyTo(tq);
			msg.setText(tmpOrder); // This is just for info


			// Constructing the textmessage 
			// This is same as the fields of user_purchase_history table			
			msg.setStringProperty("user_name",(String)request.getSession().getAttribute("user"));
			msg.setStringProperty("book_isbn",isbn);
			msg.setStringProperty("receiver_name",customerName); 
			msg.setStringProperty("phone",phone);
			msg.setStringProperty("email",email);
			msg.setStringProperty("credit_no",credit);
			msg.setStringProperty("shipping_address",address);
			msg.setStringProperty("amount_paid",price);  // assuming his credit a/c has balance and we deducted from it!
			msg.setStringProperty("status","ORDER PENDING");
			msg.setStringProperty("date_of_order",new Date().toString());

			//Sending the msg to the destionation queue	
			queueConnection.start();
			queueSender.send(msg);

			System.out.println("An order has sent to the bean");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}




		return (mapping.findForward("orderOk"));

    }


}

