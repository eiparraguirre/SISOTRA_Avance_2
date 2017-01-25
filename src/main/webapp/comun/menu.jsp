<%@taglib prefix="s" uri="/struts-tags"%>

           <ul>
                <li>
                      <s:url action="logout" id="salir"/>
                      <s:a href="%{salir}"><s:text name="enlace.logout"/> </s:a>
                </li>
                <li>
                      <s:url action="inicioRegistroOT" id="newOT"/>
                      <s:a href="%{newOT}"><s:text name="enlace.OTnuevo"/></s:a>
                </li>
                <li>
                    <s:url action="listadoOT" id="newLista_ot"/>
                      <s:a href="%{newLista_ot}"><s:text name="enlace.OT.listado"/></s:a>
                </li>
                <li>
                    <s:url action="asignarOT" id="newAsigna_ot"/>
                      <s:a href="%{newAsigna_ot}"><s:text name="enlace.OT.asignarOT"/></s:a>
                </li>
                <li>
                    <s:url action="ListaAsignaciones" id="newLista_Asignacion"/>
                      <s:a href="%{newLista_Asignacion}"><s:text name="enlace.OT.ListaAsignaciones"/></s:a>
                </li>
            </ul>   
        