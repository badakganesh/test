
<%-- 
  - @(#)    : index.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 19th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This is the index file (or welcome file). Also, this is the /libra/index.jsp
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<jsp:include page="/jsps/layouts/customerHeader.jsp"/>

<!-- this link takes to the login page -->
<html:link page="/jsps/customer/login/loginIndex.jsp">Login</html:link> | 


<!-- this link takes to registration page -->
<html:link page="/jsps/customer/registration/registrationIndex.jsp">Register</html:link>
<br>

<jsp:include page="/jsps/layouts/customerFooter.jsp"/>

