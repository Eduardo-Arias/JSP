
package sea.model;

/**
 *
 * @author eduardo
 */
public class Grupo {
    private String cveGrupo;
    private boolean estado;
    private String carrera;

    public Grupo(String cveGrupo, boolean estado, String carrera) {
        this.cveGrupo = cveGrupo;
        this.estado = estado;
        this.carrera = carrera;
        
    }

    public Grupo() {
        this("",true,"");
    }

    public String getCveGrupo() {
        return cveGrupo;
    }

    public void setCveGrupo(String cveGrupo) {
        this.cveGrupo = cveGrupo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Grupo{" + "cveGrupo=" + cveGrupo + ", estado=" + estado + ", carrera=" + carrera + '}';
    }

    
    
}
