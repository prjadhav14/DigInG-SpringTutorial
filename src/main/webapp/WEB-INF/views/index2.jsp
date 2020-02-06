
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
I am feeling: ${mood.feeling }
<form method="POST" id="getReason" action=${mood.feeling }>
    <input type="submit" value="Reason" id="btnSubmit"/>
</form>
</body>
</html>
