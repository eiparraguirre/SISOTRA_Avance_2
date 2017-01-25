package com.llamagas.sisotra.action;

import com.llamagas.sisotra.dao.OrdenTrabajoDao;
import com.llamagas.sisotra.dao.OrdenTrabajoDaoImpl;
import com.llamagas.sisotra.modelo.OrdenTrabajo;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DENIS
 */
public class OrdenTrabajoAction extends ActionSupport {

    public OrdenTrabajo ordenTrabajo = new OrdenTrabajo();
    public String mensaje;
    public List<OrdenTrabajo> listaOT = new ArrayList<>();
    public String cod;

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String ListarOT() throws Exception {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        listaOT = dao.listarTodo();
        return SUCCESS;
    }

    public String nuevoOrdenTrabajo() throws Exception {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.registrar(ordenTrabajo);
        mensaje = "Se agrego con EXito";
        ordenTrabajo = new OrdenTrabajo();
        return SUCCESS;
    }

    public String getOT() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        ordenTrabajo = dao.ObtenerOT(cod);
        return SUCCESS;
    }

    public String modificarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.actualizar(ordenTrabajo);
        listaOT = dao.listarTodo();
        return SUCCESS;
    }

    public String eliminarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.eliminarSegun(cod);
        listaOT = dao.listarTodo();
        return SUCCESS;
    }

    public void asignarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.Asignar(ordenTrabajo);
    }

    public String registroOT() throws Exception {
        return SUCCESS;
    }

    public String listaasignarOT() throws Exception {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        listaOT = dao.listarTodo();
        return SUCCESS;
    }

    public String asignarunaOT() throws Exception {
        return SUCCESS;
    }

    public String registrarasignacion() throws Exception {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.actualizar(ordenTrabajo);
        listaOT = dao.listarTodo();
        return SUCCESS;

    }

}
