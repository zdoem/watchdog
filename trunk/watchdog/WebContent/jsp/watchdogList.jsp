<%@ include file="/jsp/includes.jsp" %>
<%@ include file="/jsp/header.jsp" %>

<%@ include file="/jsp/includes2.jsp" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Watchdog List: bugger,issue,tricker</title>
</head>
<body>


<%-- // use our pagedListHolder --%>
<jsp:useBean id="pagedListHolder" scope="request" type="org.springframework.beans.support.PagedListHolder"/>
<%-- // create link for pages, "~" will be replaced later on with the proper page number --%>
<c:url value="/listdog.dog" var="pagedLink">
	<c:param name="action" value="dolistWatchdog"/>
    <c:param name="p" value="~"/>
</c:url>

<%-- // load our paging tag, pass pagedListHolder and the link --%>
<tg:paging pagedListHolder="${pagedListHolder}" pagedLink="${pagedLink}"/>

<%-- // show only current page worth of data --%>
<table width="200px" border="1">
<tr>
	<th width="20px">OID</th>
	<th>issue_of_title</th>
</tr>
<c:forEach items="${pagedListHolder.pageList}" var="item">
    <tr>
    	<td>${item.oid}</td>
    	<td style="color:blue;font-weight:bold;text-align:right">${item.issue_of_title}</td>
    </tr>
</c:forEach>
</table>

<%-- // load our paging tag, pass pagedListHolder and the link --%>
<tg:paging pagedListHolder="${pagedListHolder}" pagedLink="${pagedLink}"/>


</body>
</html>
<%@ include file="/jsp/footer.jsp" %>