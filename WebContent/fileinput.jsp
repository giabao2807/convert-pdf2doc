<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <form class="form" action="<%=request.getContextPath()%>/UploadFileServlet" method="POST" enctype="multipart/form-data">
        <h1 class="title">✨Convert here✨</h1>
        <br />
          <div class="file-input">
            <label class="label for="fileUpload"
              >Upload file <i class="fas fa-arrow-alt-circle-right"></i
            ></label>
            <input class="input" type="file" id="fileUpload" />
          </div>
          <br />
          <input class="button" type="submit" value="Convert" />
          <input class="button" type="reset" />
        </form>
</body>
<style>
body {
	background-color: #FFF3F6;
	color: #F05E7F;
	height: 100vh;
	font-family: Arial, Helvetica, sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 0;
}
form {
	background-color: #FCE1E4;
	width: 30
	0px;
	text-align: center;
	border: 1px solid #F05E7F;
	border-radius: 4px;
	box-shadow: #FCE1E4 0px 1px 2px 0px, #FCE1E4 0px 1px 3px 1px;
	padding: 20px;
}
.title {
	font-weight: bold;
}
.select {
	background-color: #F05E7F;
	color: #FFF3F6;
	width: 100%;
	font-size: small;
	border: none;
	border-radius: 4px;
	outline: none;
	cursor: pointer;
	padding: 5px;
	margin: 10px auto 20px;
}
.label {
	text-align: left;
}
.input {
	background-color: transparent;
	color: #6F595B;
	width: 100%;
	outline: none;
	border: none;
	border-bottom: 1px solid #F05E7F;
	padding: 5px;
	margin-bottom: 20px;
}
.button {
	background-color: #F05E7F;
	color: #FFF3F6;
	font-size: small;
	text-decoration: none;
	border: none;
	border-radius: 4px;
	box-shadow: #FCE1E4 0px 1px 2px 0px, #FCE1E4 0px 1px 3px 1px;
	cursor: pointer;
	margin: auto 2px;
	padding: 5px;
}
</style>
</html>