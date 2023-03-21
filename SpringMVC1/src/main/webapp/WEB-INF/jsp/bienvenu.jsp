<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
      
        <title>Spring BOOT MVC</title>

    </head>
    <body>
		 
	
	<h1>Welcome !</h1>
	<p><c:out value="${var1}"/> </p>
	<p>
		Welcome ! The date : <c:out value="${date}" default="00:00:00"/>
		
		<% for (int j=1; j<=10; j++){ %>
    <%= j %> </br>
 <% } %>
	</p>
</body>
</html>