/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CriterioEvaluacionDAO;
import dao.CriterioEvaluacionDAOImp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CriterioEvaluacion;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "CriterioEvaluacionController", urlPatterns = {"/CriterioEvaluacionController"})
public class CriterioEvaluacionController extends HttpServlet{
    private final String LISTA_CRITERIOS = "/listar_criterios.jsp";
    private final String AGREGAR_CAMBIAR = "/criterio.jsp";
    private CriterioEvaluacionDAO dao;

    public CriterioEvaluacionController() {
        dao = new CriterioEvaluacionDAOImp();
    }
    
    
   //se va hacia los formularios 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String forward = "";
        
       if(action.equalsIgnoreCase("borrar")){
           forward = LISTA_CRITERIOS;
           int idCriterio = Integer.parseInt(
           request.getParameter("idCriterio"));
           dao.borrarCriterioEvaluacion(idCriterio);
           request.setAttribute("criterios", dao.desplegarCriterios());
        }else if(action.equalsIgnoreCase("cambiar")){
            forward = AGREGAR_CAMBIAR;
            int idCriterio = Integer.parseInt(
           request.getParameter("idCriterio"));
            CriterioEvaluacion criterio = dao.elegirCriterio(idCriterio);
            request.setAttribute("criterio", criterio);
        }else if(action.equalsIgnoreCase("agregar")){
            forward = AGREGAR_CAMBIAR;
        } else{
            forward = LISTA_CRITERIOS;
            request.setAttribute("criterios", dao.desplegarCriterios());
        }
       //permite moverme de una oagina a otra
       RequestDispatcher view = request.getRequestDispatcher(forward);
       view.forward(request, response);
    
    }

    //realiza las acciones

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CriterioEvaluacion criterio= new CriterioEvaluacion();
        criterio.setDescripcion(request.getParameter("descripcion"));
        criterio.setActivo(Boolean.parseBoolean(request.getParameter("activo")));
        
        String idCriterio = request.getParameter("idCriterio");
        if(idCriterio==null || idCriterio.isEmpty()){
            dao.agregarCriterioEvaluacion(criterio);
        }else{
            criterio.setIdCriterioEvaluacion(Integer.parseInt(idCriterio));
            dao.cambiarCriterioEvaluacion(criterio);
        }
        RequestDispatcher view =
                request.getRequestDispatcher(LISTA_CRITERIOS);
        request.setAttribute("criterios",dao.desplegarCriterios());
        view.forward(request, response);
    }
    
}
