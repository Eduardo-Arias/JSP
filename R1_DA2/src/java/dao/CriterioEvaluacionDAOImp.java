/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.CriterioEvaluacion;
import util.UtilDB;

/**
 *
 * @author eduardo
 */
public class CriterioEvaluacionDAOImp implements CriterioEvaluacionDAO{

    private Connection connection;

    public CriterioEvaluacionDAOImp() {
        connection = UtilDB.getConnection();
    }
    
    
    @Override
    public void agregarCriterioEvaluacion(CriterioEvaluacion criterio) {
        String sql="INSERT INTO criterioeval(descripcion,activo) VALUES(?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, criterio.getDescripcion());
            ps.setBoolean(2, criterio.isActivo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarCriterioEvaluacion(int id_criterio) {
       String sql = "DELETE FROM criterioeval WHERE id_criterio=? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id_criterio);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarCriterioEvaluacion(CriterioEvaluacion criterio) {
    String sql = "UPDATE criterioeval SET descripcion=?, activo=?"
                + "WHERE id_criterio=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, criterio.getDescripcion());
            ps.setBoolean(2, criterio.isActivo());
            ps.setInt(3, criterio.getIdCriterioEvaluacion());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<CriterioEvaluacion> desplegarCriterios() {
    List<CriterioEvaluacion> criterios = new ArrayList<CriterioEvaluacion>();
        try {
            Statement s = connection.createStatement();
                   ResultSet rs = s.executeQuery("SELECT * FROM criterioeval");
            while (rs.next()) {

                CriterioEvaluacion criterio = new CriterioEvaluacion(rs.getInt("id_criterio"),
                        rs.getString("descripcion"),
                        rs.getBoolean("activo"));
                criterios.add(criterio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return criterios;
    }

    @Override
    public CriterioEvaluacion elegirCriterio(int id_criterio) {
        CriterioEvaluacion criterio = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM CriterioEval "
                    + "WHERE id_criterio=?");
            ps.setInt(1, id_criterio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                criterio = new CriterioEvaluacion(
                        rs.getInt("id_criterio"),
                        rs.getString("descripcion"),
                        rs.getBoolean("activo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return criterio;
    }    
}
