/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProfesorDAO;
import dao.ProfesorDAOImp;
import model.Profesor;

public class ProfesorController extends HttpServlet {

    private final String LISTA_PROFESORES = "/lista_profesores.jsp";
    private final String AGREGAR_CAMBIAR = "/profesor.jsp";
    private ProfesorDAO dao;

    public ProfesorController() {
        dao = new ProfesorDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        String forward = "";

        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_PROFESORES;
            int idProfesor = Integer.parseInt(request.getParameter("id_profesor"));
            dao.borrarProfesor(idProfesor);
            request.setAttribute("Profesor", dao.desplegarProfesores());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_CAMBIAR;
            int idProfesor = Integer.parseInt(request.getParameter("id_profesor"));
            Profesor profesor = dao.elegirProfesor(idProfesor);
            request.setAttribute("Profesor", profesor);
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_CAMBIAR;
        } else {
            forward = LISTA_PROFESORES;
            request.setAttribute("Profesor", dao.desplegarProfesores());
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);

        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Profesor profesor = new Profesor();
        profesor.setNombre(request.getParameter("nombre"));
        profesor.setExperiencia(Integer.parseInt(request.getParameter("experiencia")));
        profesor.setCarrera(request.getParameter("carrera"));

        String idProfesor = request.getParameter("id_profesor");

        if (idProfesor == null || idProfesor.isEmpty()) {
            dao.agregarProfesor(profesor);
        } else {
            profesor.setIdProfesor(Integer.parseInt(idProfesor));
            dao.cambiarProfesor(profesor);
        }

        RequestDispatcher view = request.getRequestDispatcher(LISTA_PROFESORES);
        request.setAttribute("Profesor", dao.desplegarProfesores());
        view.forward(request, response);

    }
}
