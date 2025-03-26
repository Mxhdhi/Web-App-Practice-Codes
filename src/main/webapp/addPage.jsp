<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>Calculation Result</h2>


<%

    Integer num1 = (Integer) request.getAttribute("num1");
    Integer num2 = (Integer) request.getAttribute("num2");
    Integer result = (Integer) request.getAttribute("result");

%>


<p>

    hey my name is Mahdhi! <br>
    num1 + num2 = result <br>
    <br>
    ${num1} + ${num2} = ${result}



</p>

<a href="calculatePage.jsp">Calculate Again</a>


</body>
</html>