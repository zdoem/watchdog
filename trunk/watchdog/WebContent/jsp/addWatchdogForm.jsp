<%@ include file="/jsp/includes.jsp" %>
<%@ include file="/jsp/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<title>ADD Watchdog...</title>
 <meta http-equiv="content-type" content="text/html; charset=utf-8" />
<h2>ADD Watchdog</h2>

<form:form commandName="addDogForm" method="POST" action="addWatchdogForm.dog">
  <table width="700px">
    <tr> 
      <th>
        &nbsp;หัวข้อ/ชื่อเรื่อง: <form:errors path="issue_of_title" cssClass="errors"/>
        <br/>
        <form:textarea path="issue_of_title" cols="50" rows="5"/><font color="#FF0000">*</font> <font color="#4AA02C">Ex.ปัญหา/เรื่อง/หัวข้อ</font>
      </th>
    </tr>
    <tr>
      <th>
        &nbsp;ประเภทของ Bug: <form:errors path="type_of_bug" cssClass="errors"/>
        <br/>
        <form:textarea path="type_of_bug" cols="50" rows="3"/><font color="#FF0000">*</font> <font color="#4AA02C"> Ex.System ,Compile ,User Errors</font>
      </th>
    </tr>
    <tr>
      <th>
        &nbsp;เทคนิค/แนวทางแก้ปัญหา : <form:errors path="solution_of_trick" cssClass="errors"/>
        <br/>
        <form:textarea path="solution_of_trick" cols="80" rows="6"/><font color="#4AA02C"><font color="#FF0000">*</font> Ex.บอกแนวทางและวิธีการแก้ไขหรือเทคนิคต่างๆ</font>
      </th>
    </tr>
    <tr>
      <th>
       &nbsp;เอกสารอ้างอิง หรือ source code: <form:errors path="doc_ref" cssClass="errors"/>
        <br/>
        <form:textarea path="doc_ref" cols="30" rows="3"/><font color="#4AA02C"></font>
      </th>
    </tr>
    <tr>
      <th>
       &nbsp;Project อ้างอิง: <form:errors path="project_ref" cssClass="errors"/>
        <br/>
       <form:textarea path="project_ref" cols="30" rows="3"/><font color="#4AA02C"></font>
      </th>
    </tr>
    
    <tr>
        <th>
        &nbsp;comment: <form:errors path="comment1" cssClass="errors"/>
        <br/>
        <form:textarea path="comment1" cols="50" rows="5"/><font color="#4AA02C"></font>
      </th>
    </tr>

    <tr>
      <td>     
         <p class="submit"><input type="submit" value="ADD DOG"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="RESET DOG"/></p>
      </td>
    </tr>
  </table>
</form:form>

<%@ include file="/jsp/footer.jsp" %>
