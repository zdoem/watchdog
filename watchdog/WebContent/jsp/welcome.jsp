<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ include file="/jsp/includes.jsp" %>
<%@ include file="/jsp/header.jsp" %>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<img src="images/pets.png" align="right" style="position:relative;right:30px;">
<h2>Welcome "Watch-dog" SYS</h2>

<ul>
  <li><a href="<c:url value="/registerForm.dog"/>">Register Members of Watchdog</a></li>
  <li><a href="<c:url value="/addWatchdogForm.dog"/>">ADD Watchdog</a></li>
   <li><a href="<c:url value="/listdog.dog"/>">List Watchdog</a></li>
  <br></br>
  <br></br>
  <br></br>
  <!--<li><a href="<c:url value="/html/petclinic.html"/>">Tutorial</a></li>
  <li><a href="<c:url value="/docs/index.html"/>">Documentation</a></li>
--></ul>

<p>&nbsp;</p>

<%@ include file="/jsp/footer.jsp" %>
