<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>

<%
	//1. JNDI 서버 객체 생성
	InitialContext ic = new InitialContext();
	//2. lookup()
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	//3. getConnection()
	Connection conn = ds.getConnection();
	
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from test");
	
	while (rs.next()) {
		out.print("<br>" + rs.getString("id") + ":" + rs.getString(2));
	}
	
	rs.close();
	stmt.close();
	conn.close(); // 반납
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>