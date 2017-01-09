
<%-- 
  - @(#)    : customerIndex.jsp
  - Version : 1.0
  - Author  : Manivannan Palanichamy (manivannan.p <at> gmail.com)
  - Date    : 17th May 2005
  - Licence : General Public License (GPL)
  - Desc    : This customerIndex.jsp is rendered from the definition 'customerIndex' and provides the layout for other pages.
  --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tlds/struts-tiles.tld" prefix="tiles" %>

<tiles:insert attribute="header"/>
<tiles:insert attribute="menu"/>

<tiles:insert attribute="body"/>

<tiles:insert attribute="footer"/>


