package sea.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sea.model.Grupo;
import util.UtilDB;

/**
 *
 * @author eduardo
 */
public class GrupoDAOImp implements GrupoDAO{
    
    private Connection connection;
    
    public GrupoDAOImp(){
        connection = UtilDB.getConnection();
    }

    @Override
    public void agregarGrupo(Grupo grupo) {
        String sql="INSERT INTO grupo(cve_grupo,estado,carrera) VALUES(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, grupo.getCveGrupo());
            ps.setBoolean(2, grupo.isEstado());
            ps.setString(3, grupo.getCarrera());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarGrupo(String idGrupo) {
        String sql="DELETE FROM grupo WHERE cve_grupo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, idGrupo);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modificarGrupo(Grupo grupo) {
        String sql = "UPDATE grupo SET estado = ? and carrera = ? WHERE cve_grupo = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setBoolean(1, grupo.isEstado());
            ps.setString(2, grupo.getCarrera());
            ps.setString(2, grupo.getCveGrupo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }

    @Override
    public List<Grupo> mostarGrupos() {
        List<Grupo> grupos = new ArrayList<Grupo>();
        try {
            Statement sql = connection.createStatement();
            ResultSet rs = sql.executeQuery("SELECT * FROM grupo");
            while(rs.next()){
                Grupo grupo = new Grupo(rs.getString("cve_grupo"),
                    rs.getBoolean("estado"),
                    rs.getString("carrera"));
                
                grupos.add(grupo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return grupos;
    }

    @Override
    public Grupo elegirGrupo(String cveGrupo) {
        Grupo grupo = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM grupo"
                    + "WHERE cve_grupo = ?");
            ps.setString(1, cveGrupo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                grupo = new Grupo(
                rs.getString("cve_grupo"),
                rs.getBoolean("estado"),
                rs.getString("carrera"));
            }
        } catch (Exception e) {
        }
        return grupo;
    }
    
}
