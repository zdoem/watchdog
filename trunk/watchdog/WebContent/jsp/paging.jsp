<%@ include file="/jsp/includes2.jsp" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

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
	<th width="20px">OID.</th>
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
