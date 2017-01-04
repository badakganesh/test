
<%-- 
  - @(#)    : registrationIndex.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 19th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This file displays the registration form for new account registration.
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<%-- Header --%>
<jsp:include page="/jsps/layouts/customerHeader.jsp"/>

<%-- I know, this is not the good way to display errors! I will correct this later --%>
<html:errors/>

<br>
<br>
<b>Fill the details:</b>
<br>
<br>

<%-- Form for the customer--%>

<html:form method="post" action="/register.do">
	Name : <html:text property="name"/>
	<br>
	Password : <html:password property="password"/>
	<br>
	Email : <html:text property="email"/>
	<br>
	Phone : <html:text property="phone"/>
	<br>
	Address : <html:textarea property="address"/>
	<br>
	<html:submit/> <html:reset/>
</html:form>

<%-- Footer. Ok, we finished with this page--%>
<jsp:include page="/jsps/layouts/customerFooter.jsp"/>


