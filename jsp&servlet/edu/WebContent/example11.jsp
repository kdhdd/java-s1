<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
</head>
<body>
	<%
		int total = out.getBufferSize();
		out.print("첫번째 텍스트입니다.");
		out.clearBuffer();
		out.print("출력 버퍼의 크기 : " + total);
		out.print("<br>사용되지 않은 버퍼의 크기 : " + out.getRemaining());
		out.flush();
		out.print("<br>flush 후 버퍼의 크기 : " + out.getRemaining());
		%>
</body>
</html>