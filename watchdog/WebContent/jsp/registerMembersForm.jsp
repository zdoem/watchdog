<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ include file="/jsp/includes.jsp" %>
<%@ include file="/jsp/header.jsp" %>
<title>Register Members of Watchdog</title>
 <meta http-equiv="content-type" content="text/html; charset=utf-8" />
<h2>Register of Dog members</h2>

<form:form commandName="regForm" method="POST" action="registerForm.dog">
  <table width="600px">
    <tr>
      <th>
        User Name/Email: <form:errors path="username" cssClass="errors"/>
        <br/>
        <font color="#FFFF00">*</font> <form:input path="username" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Password: <form:errors path="password" cssClass="errors"/>
        <br/>
        <font color="#FFFF00">*</font> <form:password path="password" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Nickname: <form:errors path="nickname" cssClass="errors"/>
        <br/>
         &nbsp; <form:input path="nickname" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
       E-mail: <form:errors path="email" cssClass="errors"/>
        <br/>
        <font color="#FFFF00">*</font> <form:input path="email" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Position: <form:errors path="position" cssClass="errors"/>
        <br/>
        <form:textarea path="position" cols="25" rows="2"/> 
      </th>
    </tr>
    
    <tr>
        <th>
        Tools online: <form:errors path="online" cssClass="errors"/>
        <br/>
        <form:textarea path="online" cols="25" rows="2"/><font color="#4AA02C"> Ex. msn,google talk,skype,facebook etc..</font>
      </th>
    </tr>
        <tr>
        <th>
        about Me: <form:errors path="about_me" cssClass="errors"/>
        <br/>
        <form:textarea path="about_me" cols="25" rows="4"/>
      </th>
    </tr>

    <tr>
      <td>     
         <p class="submit"><input type="submit" value="Register"/></p>
      </td>
    </tr>
  </table>
</form:form>

<%@ include file="/jsp/footer.jsp" %>
