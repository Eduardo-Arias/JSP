/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LugarDAO;
import dao.LugarDAOImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Lugar;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "LugarController", urlPatterns = {"/LugarController"})
public class LugarController extends HttpServlet {

    private final String LISTA_LUGARES = "/listar_lugares.jsp";
    private final String AGREGAR_CAMBIAR = "/lugar.jsp";
    private LugarDAO dao;

    public LugarController() {
        dao = new LugarDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String forward = "";

        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_LUGARES;
            int idLugar = Integer.parseInt(request.getParameter("idLugar"));
            dao.borrarLugar(idLugar);
            request.setAttribute("lugares", dao.desplegarLugar());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_CAMBIAR;
            int idLugar = Integer.parseInt(request.getParameter("idLugar"));
            Lugar lugar = dao.elegirLugar(idLugar);
            request.setAttribute("lugar", lugar);
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_CAMBIAR;
        } else {
            forward = LISTA_LUGARES;
            request.setAttribute("lugares", dao.desplegarLugar());
        }
        //permite moverme de una oagina a otra
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Lugar lugar = new Lugar();
        lugar.setNombre(request.getParameter("nombre"));
        lugar.setTipo(request.getParameter("tipo"));
        lugar.setUbicacion(request.getParameter("ubicacion"));
        lugar.setProvincia(request.getParameter("provincia"));

        String idLugar = request.getParameter("id_lugar");
        if (idLugar == null || idLugar.isEmpty()) {
            dao.agregarLugar(lugar);
        } else {
            lugar.setIdLugar(Integer.parseInt(idLugar));
            dao.cambiarLugar(lugar);
        }
        RequestDispatcher view
                = request.getRequestDispatcher(LISTA_LUGARES);
        request.setAttribute("lugares", dao.desplegarLugar());
        view.forward(request, response);
    }

}
