<!DOCTYPE html>
<html>
    <body>
        <h1>Usuario Recibido</h1><br><br>
        Nombre: <%= request.getParameter("nombre")%>
        &nbsp;
        Apellido: <%= request.getParameter("apellido")%>     
        <br><br>
        <jsp:include page="fecha.jsp"></jsp:include><br><br>
    </body>
</html>
