
<%-- 
  - @(#)    : registrationFailed.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 20th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This page displayed if the registration fails due to duplicate login name.
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<%-- Header --%>
<jsp:include page="/jsps/layouts/customerHeader.jsp"/>

<br>
<br>
<b>Registration Failed. The user name has already been taken by some one.
<br><html:link page="/jsps/customer/registration/registrationIndex.jsp">Try with different user name.</html:link></b>
<br>
<br>

<%-- Footer. Ok, we finished with this page--%>
<jsp:include page="/jsps/layouts/customerFooter.jsp"/>




