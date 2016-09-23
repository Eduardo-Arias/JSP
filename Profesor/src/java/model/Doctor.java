/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduardo
 */
public class Doctor {
    private int idDoctor;
    private String nombre;
    private String notas;
    private int tramiteTitulacion;
    private boolean activo;

    public Doctor(int idDoctor, String nombre, String notas, int tramiteTitulacion, boolean activo) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.notas = notas;
        this.tramiteTitulacion = tramiteTitulacion;
        this.activo = activo;
    }

    public Doctor() {
        this(0,"","",0,true);
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getTramiteTitulacion() {
        return tramiteTitulacion;
    }

    public void setTramiteTitulacion(int tramiteTitulacion) {
        this.tramiteTitulacion = tramiteTitulacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }    
}
