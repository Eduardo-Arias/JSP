/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sea.DAO;

import java.util.List;
import sea.model.Grupo;
/**
 *
 * @author eduardo
 */
public interface GrupoDAO {
    void agregarGrupo(Grupo grupo);
    void borrarGrupo(String idGrupo);
    void modificarGrupo(Grupo grupo);
    
    List<Grupo>mostarGrupos();
    Grupo elegirGrupo(String idGrupo);
}
