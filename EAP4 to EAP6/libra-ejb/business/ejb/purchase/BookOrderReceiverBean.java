package business.ejb.purchase;

import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.jms.MessageListener;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TemporaryQueue;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import business.database.purchase.*;


@MessageDriven(name = "MessageMDBSample", activationConfig = {
		 @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		 @ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/testQueue"),
		 @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") }) 
public class BookOrderReceiverBean implements MessageDrivenBean, MessageListener {

	private MessageDrivenContext ctx = null;

	public void setMessageDrivenContext(MessageDrivenContext ctx)
		throws EJBException {
		this.ctx = ctx;
	}

	public void ejbCreate() {} 

	public void ejbRemove() {
		ctx = null;
	}

	public void onMessage(Message message) {
		
		try{
		
		System.out.println("Bean got message: " + message);
		TextMessage msg = (TextMessage)message;
	
		//	Retrieving properties
		String user_name = msg.getStringProperty("user_name");
		String book_isbn = msg.getStringProperty("book_isbn");
		String receiver_name = msg.getStringProperty("receiver_name");
		String phone = msg.getStringProperty("phone");
		String email = msg.getStringProperty("email");
		String credit_no = msg.getStringProperty("credit_no");
		String shipping_address = msg.getStringProperty("shipping_address");
		String amount_paid = msg.getStringProperty("amount_paid");
		String status = msg.getStringProperty("status");
		String date_of_order = msg.getStringProperty("date_of_order");

		System.out.println(user_name + " "+ book_isbn+ " "+receiver_name+ " "+phone+ " "+email+ " "+credit_no+ " "+shipping_address+ " "+ amount_paid+ " "+ status+ " "+date_of_order);
		
		// Placing the order in the database;
		
		PlaceOrder order = new PlaceOrder();
		order.placeOrder(user_name,book_isbn,receiver_name,phone,email,credit_no,shipping_address,amount_paid,status,date_of_order);

		}
		catch(Exception e)
		{
		System.out.println("In BookOrderReceiverBean" + e.toString()) ;
		}
	}

}