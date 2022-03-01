
package Datos;

public class vubicacion {
   private int idubicacion;
   private String estado;
   private String ciudad;
   private String municipio;
   private String parroquia;

    public vubicacion(int idubicacion, String estado, String ciudad, String municipio, String parroquia) {
        this.idubicacion = idubicacion;
        this.estado = estado;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.parroquia = parroquia;
    }

    public vubicacion() {
    }

    public int getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }
   
   
    
}
