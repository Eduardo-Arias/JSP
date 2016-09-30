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
public class CriterioEvaluacion {
    private int idCriterioEvaluacion;
    private String descripcion;
    private boolean activo;

    public CriterioEvaluacion() {
    this(0,"",true);
    }

    public CriterioEvaluacion(int idCriterioEvaluacion, String descripcion, boolean activo) {
        this.idCriterioEvaluacion = idCriterioEvaluacion;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public int getIdCriterioEvaluacion() {
        return idCriterioEvaluacion;
    }

    public void setIdCriterioEvaluacion(int idCriterioEvaluacion) {
        this.idCriterioEvaluacion = idCriterioEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
