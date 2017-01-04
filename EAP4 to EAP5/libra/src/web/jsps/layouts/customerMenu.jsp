
<%-- 
  - @(#)    : customerMenu.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 17th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This jsp file provides the menu on the top. Customer can choose set of services listed by this menu.
  --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<br>
<html:link page="/home.do"> Home </html:link> | <html:link page="/search-index.do">Search Books</html:link> | <html:link page="/logout.do">Logout</html:link>
<hr>
<br>