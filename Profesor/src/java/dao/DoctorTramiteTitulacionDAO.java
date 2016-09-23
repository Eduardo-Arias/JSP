/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Doctor;

/**
 *
 * @author eduardo
 */
public interface DoctorTramiteTitulacionDAO {
    void agregarDoctor(Doctor doctor);
    void borrarDoctor(int idDoctor);
    void cambiarDoctor(Doctor doctor);
    
    List<Doctor>desplegarDoctores();
    Doctor elegirDoctor (int idDoctor);
}
