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
import model.Doctor;

/**
 *
 * @author eduardo
 */
public class DoctorTramiteTitulacionDAOImp implements DoctorTramiteTitulacionDAO{
    
    private Connection connection;
    @Override
    public void agregarDoctor(Doctor doctor) {
        String sql = "INSERT INTO Doctor (notas,tramitetitulacion,activo,nombre)"
                + " VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, doctor.getNotas());
            ps.setInt(2, doctor.getTramiteTitulacion());
            ps.setString(3,Boolean.toString(doctor.isActivo()));
            ps.setString(4, doctor.getNombre());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarDoctor(int idDoctor) {
        String sql = "DELETE FROM Doctor WHERE iddoctor=? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idDoctor);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarDoctor(Doctor doctor) {
        String sql = "UPDATE Doctor SET notas=?,tramitetitulacion=?,activo=?,nombre=?"
                + "WHERE iddoctor?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, doctor.getNotas());
            ps.setInt(2, doctor.getTramiteTitulacion());
            ps.setString(3,Boolean.toString(doctor.isActivo()));
            ps.setString(4, doctor.getNombre());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }

    @Override
    public List<Doctor> desplegarDoctores() {
        List<Doctor> doctores = new ArrayList<Doctor>();
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Doctor");
            while (rs.next()) {

                Doctor doctor = new Doctor(rs.getInt("iddoctor"),
                        rs.getString("nombre"),
                        rs.getString("notas"),
                        rs.getInt("tramitetitulacion"),
                        rs.getBoolean("activo"));
                doctores.add(doctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctores;
    }

    @Override
    public Doctor elegirDoctor(int idDoctor) {
        Doctor doctor = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Doctor "
                    + "WHERE iddoctor=?");
            ps.setInt(1, idDoctor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                doctor = new Doctor(
                        rs.getInt("iddoctor"),
                        rs.getString("nombre"),
                        rs.getString("notas"),
                        rs.getInt("tramitetitulacion"),
                        rs.getBoolean("activo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctor;
    }
}