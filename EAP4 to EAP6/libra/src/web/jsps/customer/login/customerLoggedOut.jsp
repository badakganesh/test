

<%-- 
  - @(#)    : customerLoggedOut.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 20th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This file is displayed after successful logout. Customer holds no more access to session.
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>


<tiles:insert page="/jsps/tiles/customerIndex.jsp" flush="true">
<tiles:put name="header"   value="/jsps/layouts/customerHeader.jsp" />
<tiles:put name="menu"   value="/jsps/layouts/NoMenu.jsp" />
<tiles:put name="body"     value="/jsps/customer/login/logout.jsp" />
<tiles:put name="footer"   value="/jsps/layouts/customerFooter.jsp" />
</tiles:insert>




