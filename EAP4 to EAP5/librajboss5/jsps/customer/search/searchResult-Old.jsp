
<%-- 
  - @(#)    : searchResult.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 20th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This page displays the search results for the given key.
  --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<jsp:include page="/jsps/layouts/customerHeader.jsp"/>
<br>
<br>
<br> This page is under construction. 
<br>
<br>
<br>
<form method="post" action="/libra/purchase.do">
ISBN <input type="text" name="isbn" >
<br>
Book Name <input type="text" name="bookName">
<br>
Author(s) <input type="text" name="authors">
<br>
Price <input type="text" name="price">
<br>
<input type="submit">
</form>
<br>
<br>
<jsp:include page="/jsps/layouts/customerFooter.jsp"/>


