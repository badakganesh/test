
<%-- 
  - @(#)    : customerLoggedin.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 17th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This jsp file is displayed after successful login. This jsp files displays a menu, so that the customer can choose the one.s
  --%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>


<tiles:insert page="/jsps/tiles/customerIndex.jsp" flush="true">
<tiles:put name="header"   value="/jsps/layouts/customerHeader.jsp" />
<tiles:put name="menu"   value="/jsps/layouts/customerMenu.jsp" />
<tiles:put name="body"     value="/jsps/customer/login/welcome.jsp" />
<tiles:put name="footer"   value="/jsps/layouts/customerFooter.jsp" />
</tiles:insert>



