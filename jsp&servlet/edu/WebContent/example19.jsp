<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>EL</title>
</head>
<body>
	${param.id }	/ ${param.pwd }		<br>
	${param["id"]}  / ${param["pwd"]}
</body>
</html>