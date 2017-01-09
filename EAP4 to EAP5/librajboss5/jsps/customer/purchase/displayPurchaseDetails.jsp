
<%-- 
  - @(#)    : displayPurchseDetails.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 20th May 2006
  - Licence : General Public License (GPL)
  - Desc    : This page displays the book details chosen by the customer.
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<jsp:include page="/jsps/layouts/customerHeader.jsp"/>
<jsp:include page="/jsps/layouts/customerMenu.jsp"/>
<br>
<br>
<b>The book details chosen by you:</b>
<br>
<br>
<form method="post" action="/librajboss4/placeOrder.do">
ISBN <input type="text" width="80" name="isbn" value="<%=request.getParameter("isbn")%>" >
<br>
Book Name <input type="text" width="80" name="bookName" value="<%=request.getParameter("bookName")%>" >
<br>
Author(s) <input type="text" width="80" name="authors" value="<%=request.getParameter("authors")%>" >
<br>
Price <input type="text" width="80" name="price" value="<%=request.getParameter("price")%>" >
<br>
<br>

<b>Fll the remaining details:</b>
<br>
<html:errors/>
<br>
Receiver's Name<input type="text" name="customerName" >
<br>
Phone: <input type="text" name="phone" >
<br>
Email: <input type="text" name="email" >
<br>
Credit Card No: <input type="text" name="credit"> (Just enter a number, we are not going to use at all!)
<br>
Shipping Address: <textarea name="address"></textarea>
<br>
<input type="submit">  <input type="reset">
</form>
<br>

<br>
<jsp:include page="/jsps/layouts/customerFooter.jsp"/>
