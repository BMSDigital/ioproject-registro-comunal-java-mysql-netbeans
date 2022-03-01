
package Datos;

public class vsituacion_comunitaria {
   private int idsituacion_comunitaria;
   private String resolver_problemas;
   private String quien_resolvera;
   private String tipo_proyecto;
   private String como_apoyaria;
   private String censo_energetico;
   private String aspecto_ventajosos;
   private String problemas_debilidades;
   private String mejoramiento;
   private String opciones;
   private String otro;

    public vsituacion_comunitaria(int idsituacion_comunitaria, String resolver_problemas, String quien_resolvera, String tipo_proyecto, String como_apoyaria, String censo_energetico, String aspecto_ventajosos, String problemas_debilidades, String mejoramiento, String opciones, String otro) {
        this.idsituacion_comunitaria = idsituacion_comunitaria;
        this.resolver_problemas = resolver_problemas;
        this.quien_resolvera = quien_resolvera;
        this.tipo_proyecto = tipo_proyecto;
        this.como_apoyaria = como_apoyaria;
        this.censo_energetico = censo_energetico;
        this.aspecto_ventajosos = aspecto_ventajosos;
        this.problemas_debilidades = problemas_debilidades;
        this.mejoramiento = mejoramiento;
        this.opciones = opciones;
        this.otro = otro;
    }

    public vsituacion_comunitaria() {
    }

    public int getIdsituacion_comunitaria() {
        return idsituacion_comunitaria;
    }

    public void setIdsituacion_comunitaria(int idsituacion_comunitaria) {
        this.idsituacion_comunitaria = idsituacion_comunitaria;
    }

    public String getResolver_problemas() {
        return resolver_problemas;
    }

    public void setResolver_problemas(String resolver_problemas) {
        this.resolver_problemas = resolver_problemas;
    }

    public String getQuien_resolvera() {
        return quien_resolvera;
    }

    public void setQuien_resolvera(String quien_resolvera) {
        this.quien_resolvera = quien_resolvera;
    }

    public String getTipo_proyecto() {
        return tipo_proyecto;
    }

    public void setTipo_proyecto(String tipo_proyecto) {
        this.tipo_proyecto = tipo_proyecto;
    }

    public String getComo_apoyaria() {
        return como_apoyaria;
    }

    public void setComo_apoyaria(String como_apoyaria) {
        this.como_apoyaria = como_apoyaria;
    }

    public String getCenso_energetico() {
        return censo_energetico;
    }

    public void setCenso_energetico(String censo_energetico) {
        this.censo_energetico = censo_energetico;
    }

    public String getAspecto_ventajosos() {
        return aspecto_ventajosos;
    }

    public void setAspecto_ventajosos(String aspecto_ventajosos) {
        this.aspecto_ventajosos = aspecto_ventajosos;
    }

    public String getProblemas_debilidades() {
        return problemas_debilidades;
    }

    public void setProblemas_debilidades(String problemas_debilidades) {
        this.problemas_debilidades = problemas_debilidades;
    }

    public String getMejoramiento() {
        return mejoramiento;
    }

    public void setMejoramiento(String mejoramiento) {
        this.mejoramiento = mejoramiento;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
   
   
}
