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
import model.Lugar;
import util.UtilDB;

/**
 *
 * @author eduardo
 */
public class LugarDAOImp implements LugarDAO{
    
    private Connection connection;
    
    public LugarDAOImp(){
        connection = UtilDB.getConnection();
    }
     
    @Override
    public void agregarLugar(Lugar lugar) {
        String sql="INSERT INTO lugar(nombre,tipo,ubicacion,provincia) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, lugar.getNombre());
            ps.setString(2,lugar.getTipo());
            ps.setString(3, lugar.getUbicacion());
            ps.setString(4, lugar.getProvincia());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarLugar(int idLugar) {
        String sql = "DELETE FROM lugar WHERE id_lugar=? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idLugar);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarLugar(Lugar lugar) {
        String sql = "UPDATE lugar SET nombre=?, tipo=?, ubicacion=?, provincia=?"
                + "WHERE id_lugar=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, lugar.getNombre());
            ps.setString(2,lugar.getTipo());
            ps.setString(3, lugar.getUbicacion());
            ps.setString(4, lugar.getProvincia());
            ps.setInt(5, lugar.getIdLugar());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Lugar> desplegarLugar() {
        List<Lugar> lugares = new ArrayList<Lugar>();
        try {
            Statement s = connection.createStatement();
                   ResultSet rs = s.executeQuery("SELECT * FROM lugar");
            while (rs.next()) {

                Lugar lugar = new Lugar(rs.getInt("id_lugar"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getString("ubicacion"),
                        rs.getString("provincia"));
                lugares.add(lugar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lugares;
    }

    @Override
    public Lugar elegirLugar(int idLugar) {
        Lugar lugar = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM lugar "
                    + "WHERE id_lugar=?");
            ps.setInt(1, idLugar);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                lugar = new Lugar(
                        rs.getInt("id_lugar"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getString("ubicacion"),
                        rs.getString("provincia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lugar;
    }  
  
}
