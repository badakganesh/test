
<%-- 
  - @(#)    : searchResult.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 20th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This page displays the search results for the given key.
  --%>

<%@ page contentType="text/html;charset=UTF-8" import="java.net.*,business.ejb.general.Book" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>


<jsp:include page="/jsps/layouts/customerHeader.jsp"/>
<jsp:include page="/jsps/layouts/customerMenu.jsp"/>

<br>
<br>
<b>Search Results: </b>
<br>
<br>

<table border="2" >
<tr>
<th>ISBN </th>
<th>Book Name</th>
<th>Author(s)</th>
<th>Price</th>
<th>Order</th>
</tr>

<logic:present name="books"> 
<logic:iterate id="singlebook" name="books">

<tr>

<td><bean:write name="singlebook" property="isbn"/></td>
<td><bean:write name="singlebook" property="bookName"/></td>
<td><bean:write name="singlebook" property="authors"/></td>
<td><bean:write name="singlebook" property="price"/></td>

<%
// Dont panic. I am just doing some ugly url encoding!

Book b = (Book)pageContext.getAttribute("singlebook");
String url = "placeOrder.do?";
String isbn = b.getIsbn(); 
String bookName = b.getBookName();
String authors = b.getAuthors();
String price = b.getPrice() ;
String param = "isbn=" + URLEncoder.encode(isbn,"UTF-8") + "&bookName=" + URLEncoder.encode(bookName,"UTF-8") + "&authors=" + URLEncoder.encode(authors,"UTF-8") + "&price=" + URLEncoder.encode(price,"UTF-8") ;

url = url + param;
%>

<td>  <a href="<%=url%>">Buy</a></td>

</tr>
</logic:iterate>
</logic:present> 
</table>

<jsp:include page="/jsps/layouts/customerFooter.jsp"/>



