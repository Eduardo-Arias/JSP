package sea.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sea.DAO.GrupoDAO;
import sea.DAO.GrupoDAOImp;
import sea.model.Grupo;

/**
 *
 * @author eduardo
 */
@WebServlet(name="GrupoController",urlPatterns = {"/GrupoController"})
public class GrupoController extends HttpServlet{
    private final String LISTA_GRUPOS="/listar_grupos.jsp";
    private final String AGREGAR="/grupo_agregar.jsp";
    private final String ELIMINAR="/grupo_eliminar.jsp";
    private final String INDEX="/index.jsp";
    private GrupoDAO dao;

    public GrupoController() {
        dao = new GrupoDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String forward = "";

        
        if (action.equalsIgnoreCase("borrar")) {
            forward = ELIMINAR;
            String cveGrupo = req.getParameter("cveGrupo");
            dao.borrarGrupo(cveGrupo);
            req.setAttribute("grupos", dao.mostarGrupos());
        } else if (action.equalsIgnoreCase("cambiar")) {
            forward = AGREGAR;
            String cveGrupo = req.getParameter("cveGrupo");
            req.setAttribute("grupos", dao.mostarGrupos());
            Grupo grupo = dao.elegirGrupo(cveGrupo);
            req.setAttribute("grupo", grupo);
        } else if (action.equalsIgnoreCase("agregar")) {
            forward = AGREGAR;
        } else {
            forward = LISTA_GRUPOS;
            req.setAttribute("grupos", dao.mostarGrupos());
        }
        //permite moverme de una oagina a otra
        RequestDispatcher view = req.getRequestDispatcher(forward);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Grupo grupo = new Grupo();
        grupo.setCveGrupo(req.getParameter("cveGrupo"));
        
        if(req.getParameter("estado").equals("Activo")){
            grupo.setEstado(true);
        }else{
            grupo.setEstado(false);
        }

        String cveGrupo = req.getParameter("cve_grupo");
        if (cveGrupo == null || cveGrupo.isEmpty()) {
            dao.agregarGrupo(grupo);
        } else{
            grupo.setCveGrupo(cveGrupo);
            dao.modificarGrupo(grupo);
        }
        
        RequestDispatcher view
                = req.getRequestDispatcher(INDEX);
        view.forward(req, resp);
    }
    
    
}
