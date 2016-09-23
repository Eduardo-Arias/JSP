/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DoctorTramiteTitulacionDAO;
import dao.DoctorTramiteTitulacionDAOImp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Doctor;

/**
 *
 * @author eduardo
 */
public class DoctorTramiteTitulacionController extends HttpServlet {
    private final String LISTA_DOCTOR="/listar_doctores.jsp";
    private final String AGREGAR_CAMBIAR="/doctor.jsp";
    private DoctorTramiteTitulacionDAO dao;

    public DoctorTramiteTitulacionController() {
        dao = new DoctorTramiteTitulacionDAOImp(); 
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String action = req.getParameter("action");
        String forward = "";

        if (action.equalsIgnoreCase("borrar")) {
            forward = LISTA_DOCTOR;
            int idDoctor = Integer.parseInt(req.getParameter("iddoctor"));
            dao.borrarDoctor(idDoctor);
            req.setAttribute("Doctor", dao.desplegarDoctores());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR_CAMBIAR;
            int idDoctor = Integer.parseInt(req.getParameter("iddoctor"));
            Doctor doctor = dao.elegirDoctor(idDoctor);
            req.setAttribute("Doctor", doctor);
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR_CAMBIAR;
        } else {
            forward = LISTA_DOCTOR;
            req.setAttribute("Doctor", dao.desplegarDoctores());
        }

        RequestDispatcher view = req.getRequestDispatcher(forward);

        view.forward(req, resp);}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        Doctor doctor = new Doctor();
        doctor.setNombre(req.getParameter("nombre"));
        doctor.setNotas(req.getParameter("notas"));
        doctor.setTramiteTitulacion(Integer.parseInt(req.getParameter("tramitetitulacion")));
        doctor.setActivo(Boolean.parseBoolean(req.getParameter("activo")));

        String idDoctor = req.getParameter("iddoctor");

        if (idDoctor == null || idDoctor.isEmpty()) {
            dao.agregarDoctor(doctor);
        } else {
            doctor.setIdDoctor(Integer.parseInt(idDoctor));
            dao.cambiarDoctor(doctor);
        }

        RequestDispatcher view = req.getRequestDispatcher(LISTA_DOCTOR);
        req.setAttribute("doctores", dao.desplegarDoctores());
        view.forward(req, resp);
    }
    
    
}
