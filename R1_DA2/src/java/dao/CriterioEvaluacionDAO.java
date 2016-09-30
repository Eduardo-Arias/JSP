/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.CriterioEvaluacion;

/**
 *
 * @author eduardo
 */
public interface CriterioEvaluacionDAO {
    void agregarCriterioEvaluacion(CriterioEvaluacion criterio);
    void borrarCriterioEvaluacion(int criterio);
    void cambiarCriterioEvaluacion(CriterioEvaluacion criterio);
    
    List<CriterioEvaluacion> desplegarCriterios();
    CriterioEvaluacion elegirCriterio (int criterio);
}
