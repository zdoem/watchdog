<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/jsp/includes.jsp" %>
<%@ include file="/jsp/header.jsp" %>
<title>Message from Watchdog</title>
 <meta http-equiv="content-type" content="text/html; charset=utf-8" />
 
 <%
	String context = request.getContextPath();
%>
 
<h2>Message Result</h2>
<br><table width="400" border="1" align="center" celpadding="0" celspacing="0" bordercolor="#009933">
<tr> 
     <td bgcolor="#7db223"><div style="color:#FFFFFF;font-size:14px; font-family:Arial; font-weight:bold;"><b>&nbsp;..:: Errors Message..!!</b></div></td>
</tr>
<tr> 
     <td bgcolor="#ece9d8" style="color:#006600; font-size:12px; font-family:Arial; font-weight:bold;">
     <br>
      <center>
       <img src="<%=context %>/images/sad.png" width="100" height="100" border="0">
	  </center>
	  <br>
	  <li> ${msg}
      <br><center>
      <div style="color:#0000cc; font-size:12px; font-family:Arial; font-weight:bold;">
       <a href="<c:url value="/welcome.dog"/>">Home</a>
      </div>
      </center>
      <br>
      </td>
</tr>
</table><br>
<%@ include file="/jsp/footer.jsp" %>