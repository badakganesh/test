
<%-- 
  - @(#)    : placeOrder.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 21st May 2006
  - Licence : General Public License (GPL)
  - Desc    : This page is displayed as an acknowledgement after the order been placed.
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
Your order has been placed in the queue. With in two weeks the oder is expected to be delivered.
<br>
<br>
<jsp:include page="/jsps/layouts/customerFooter.jsp"/>
