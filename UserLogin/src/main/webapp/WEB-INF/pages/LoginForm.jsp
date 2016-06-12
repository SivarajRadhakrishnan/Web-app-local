<%--
  Created by IntelliJ IDEA.
  User: sivaraj
  Date: 12/6/16
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>Registration Page</title>
</head>
<body>

<form:form method="POST" commandName="user" action="/">
  <table>
    <tr>
      <td>User Name :</td>
      <td><form:input path="loginName" autocomplete="false" /></td>
    </tr>
    <tr>
      <td>Password :</td>
      <td><form:password path="password" autocomplete="false"/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="Login"></td>
    </tr>
  </table>
</form:form>

</body>
</html>
