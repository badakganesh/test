
<%-- 
  - @(#)    : searchIndex.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 17th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This file displays a text book to receice the search key from the customer.
  --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<jsp:include page="/jsps/layouts/customerHeader.jsp"/>
<jsp:include page="/jsps/layouts/customerMenu.jsp"/>

<html:form method="post" action="/search.do">
Key (book/author name) : <html:text property="key"/>
<html:submit/>
</html:form>

<jsp:include page="/jsps/layouts/customerFooter.jsp"/>




