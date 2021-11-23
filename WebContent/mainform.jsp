<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.bean.Source"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>

<body>
  <table>
    <caption>Document list</caption>
    <tr>
      <th>Filename </th>
      <th>Download</th>
    </tr>
    <%
		List<Source> sources = (List<Source>)request.getAttribute("sources");
		for(Source source : sources){
		%>
		<tr>
			<td class='center'><%=source.getFilename()%></td>
			<td><a href="<%=request.getContextPath()%>/DownloadServlet" target ="_self">xxx</a></td>
		</tr>
		<%	} %>
  </table>
  <a href="javascript:history.back();" class="button">Return</a>
</body>
<style>
  body {
    color: #F05E7F;
    font-family: Arial, Helvetica, sans-serif;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 20px;
  }

  table {
    width: 100%;
  }

  caption {
    font-size: large;
    font-weight: bold;
    margin-bottom: 20px;
  }

  th,
  td {
    border-bottom: 1px solid #F05E7F;
  }

  th {
    background-color: #FCE1E4;
    padding: 5px;
  }

  td.center {
    text-align: center;
    padding: 5px;
  }

  tr:hover {
    background-color: #FFF3F6;
  }

  a {
    color: #F05E7F;
    text-decoration: none;
  }

  .button {
    width: 300px;
    color: #F05E7F;
    text-align: center;
    text-decoration: none;
    border: 1px solid #F05E7F;
    border-radius: 4px;
    margin-top: 20px;
    margin-bottom: 5px;
    padding: 5px;
  }

  .button:hover {
    background-color: #FFF3F6;
    box-shadow: #FCE1E4 0px 1px 2px 0px, #FCE1E4 0px 1px 3px 1px;
  }
</style>

</html>