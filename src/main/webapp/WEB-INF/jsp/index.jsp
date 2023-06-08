<%@ page import="java.util.List" %>
<html>
<head>
<link rel="stylesheet" href="/webapp/css/style.css">

</head>
<body>

<table>
  <tr>
    <th>Person 1</th>
    <th>Person 2</th>
    <th>Person 3</th>
  </tr>
  <tr>
    <td>Emil</td>
    <td>Tobias</td>
    <td>Linus</td>
  </tr>
  <tr>
    <td>16</td>
    <td>14</td>
    <td>10</td>
  </tr>
</table>


<h2>Hello hope you are doing well.</h2>
<% String name=(String) request.getAttribute("name");

   Integer number=(Integer) request.getAttribute("number");

   List<String> friends = (List<String>) request.getAttribute("f");
%>



<h2>My name is <%= name %> </h2>

<h2>Number : <%= number %> </h2>


<% for(String s: friends) {
%>
<h1>
 <%= s %> </h1>

 <%
 }
 %>






</body>
</html>
