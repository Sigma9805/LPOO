<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    
        <form:form name = "form" action="/Practica4/addIndex" method="POST">
		<h2>Ingrese</h2>
		<form:label path = "correo">Name</form:label><form:input path = "correo" />
                <form:label path = "password">Name</form:label><form:input path = "password" />
                <form:label path = "date">Name</form:label><form:input path = "date" />
		<form:label path = "telefono">Name</form:label><form:input path = "date" />
		<input type="submit" name="Enviar">
	</form:form>
    
</html>
