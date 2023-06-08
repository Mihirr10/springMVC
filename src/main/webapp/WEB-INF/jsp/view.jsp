
<%@ page import = "java.time.LocalDate"%>

<html>

<body>

<form action="/users" method="post" >
    <div><input name="firstName" placeholder="First name"></div>
    <div><input name="lastName" placeholder="Last name"></div>
    <div><input name="email" placeholder="Email"></div>
    <div><input name="password" placeholder="Password" type="password"></div>
    <div><input name="repeatPassword" placeholder="Repeat password" type="password"></div>
    <div><input type="Submit"></div>
</form>

  <h5>hello this is help page</h5>

  <% String name=(String) request.getAttribute("name");
     String hobby=(String) request.getAttribute("hobby");
     LocalDate date=(LocalDate) request.getAttribute("time");

  %>

  <h4> Name : <%= name %></h4>
  <h4> hobby : <%= hobby %></h4>
  <h4> Date and Time: <%= date.toString() %></h4>
</body>
</html>