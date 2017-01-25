<%-- 
    Document   : registrarOT
    Created on : 20/01/2017, 12:08:31 AM
    Author     : DENIS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body><center>
        <h2><s:text name="formulario.titulo.nuevo"/></h2>
        
        <s:form action="registrarasignacion" method="post">           
            <s:textfield key="formulario.OT" name="ordenTrabajo.IdOrdenT"/>
            <s:combobox label="Especialidad" headerKey="-1" 
                        headerValue="Select Especialidad" 
                        list="{'Especialidad Mecánica','Especialidad Electricidad','Especialidad Pintura'}"
                        name="selectedSubject"/>            
            <s:textfield key="formulario.descripcionOT" name="ordenTrabajo.Area_emple"/>
            <s:submit key="formulario.registro"/>
            <s:reset key="Limpiar"/>
        </s:form>
    </center>
        <p><s:actionmessage/></p>
    </body>
</html>
