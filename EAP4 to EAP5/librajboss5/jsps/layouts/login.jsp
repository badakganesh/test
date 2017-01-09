

<%-- 
  - @(#)    : login.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 17th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This login.jsp is the body fragment of the layout 'index.jsp' 
  -           and displays the login and password boxes
  --%>
 

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>


<html:form action="/login.do" focus="name">

Name: <html:text property="name"/> <br>
Password: <html:password property="password"/> <br>

<html:submit/> &nbsp; <html:reset/>

</html:form>
