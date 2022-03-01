
package Datos;

public class vsituacion_vivienda extends vservicios {
   private String condiciones_terreno;
   private String situacion_viviendacol;
   private String tipo_vivienda;
   private String habitacion_vivienda;
   private String enseres_vivienda;
   private String tipo_paredes;
   private String tipo_techo;
   private String cantidad_habitaciones;
   private String condiciones_vivienda;
   private String presencia_roedores;
   private String acepto1;
   private String animales_domestico;
   private String acepto2;

    public vsituacion_vivienda(String condiciones_terreno, String situacion_viviendacol, String tipo_vivienda, String habitacion_vivienda, String enseres_vivienda, String tipo_paredes, String tipo_techo, String cantidad_habitaciones, String condiciones_vivienda, String presencia_roedores, String acepto1, String animales_domestico, String acepto2) {
        this.condiciones_terreno = condiciones_terreno;
        this.situacion_viviendacol = situacion_viviendacol;
        this.tipo_vivienda = tipo_vivienda;
        this.habitacion_vivienda = habitacion_vivienda;
        this.enseres_vivienda = enseres_vivienda;
        this.tipo_paredes = tipo_paredes;
        this.tipo_techo = tipo_techo;
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.condiciones_vivienda = condiciones_vivienda;
        this.presencia_roedores = presencia_roedores;
        this.acepto1 = acepto1;
        this.animales_domestico = animales_domestico;
        this.acepto2 = acepto2;
    }

    public vsituacion_vivienda() {
    }

    public String getCondiciones_terreno() {
        return condiciones_terreno;
    }

    public void setCondiciones_terreno(String condiciones_terreno) {
        this.condiciones_terreno = condiciones_terreno;
    }

    public String getSituacion_viviendacol() {
        return situacion_viviendacol;
    }

    public void setSituacion_viviendacol(String situacion_viviendacol) {
        this.situacion_viviendacol = situacion_viviendacol;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    public String getHabitacion_vivienda() {
        return habitacion_vivienda;
    }

    public void setHabitacion_vivienda(String habitacion_vivienda) {
        this.habitacion_vivienda = habitacion_vivienda;
    }

    public String getEnseres_vivienda() {
        return enseres_vivienda;
    }

    public void setEnseres_vivienda(String enseres_vivienda) {
        this.enseres_vivienda = enseres_vivienda;
    }

    public String getTipo_paredes() {
        return tipo_paredes;
    }

    public void setTipo_paredes(String tipo_paredes) {
        this.tipo_paredes = tipo_paredes;
    }

    public String getTipo_techo() {
        return tipo_techo;
    }

    public void setTipo_techo(String tipo_techo) {
        this.tipo_techo = tipo_techo;
    }

    public String getCantidad_habitaciones() {
        return cantidad_habitaciones;
    }

    public void setCantidad_habitaciones(String cantidad_habitaciones) {
        this.cantidad_habitaciones = cantidad_habitaciones;
    }

    public String getCondiciones_vivienda() {
        return condiciones_vivienda;
    }

    public void setCondiciones_vivienda(String condiciones_vivienda) {
        this.condiciones_vivienda = condiciones_vivienda;
    }

    public String getPresencia_roedores() {
        return presencia_roedores;
    }

    public void setPresencia_roedores(String presencia_roedores) {
        this.presencia_roedores = presencia_roedores;
    }

    public String getAcepto1() {
        return acepto1;
    }

    public void setAcepto1(String acepto1) {
        this.acepto1 = acepto1;
    }

    public String getAnimales_domestico() {
        return animales_domestico;
    }

    public void setAnimales_domestico(String animales_domestico) {
        this.animales_domestico = animales_domestico;
    }

    public String getAcepto2() {
        return acepto2;
    }

    public void setAcepto2(String acepto2) {
        this.acepto2 = acepto2;
    }
   
   
}
