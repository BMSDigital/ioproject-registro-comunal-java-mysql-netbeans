
package Datos;

import java.sql.Date;

public class vregistros {
   private int idregistros;
   private int idjefe_familiar;
   private int idgrupo_familiar;
   private int idsituacion_vivienda;
   private int idusuarios;
   private int idsituacion_economica;
   private int idsituacion_comunitaria;
   private int idparticipacion_ciudadana;
   private Date fecha_ingreso;
   private Date fecha_salida;	
   private String estado;

    public vregistros() {
    }

    public vregistros(int idregistros, int idjefe_familiar, int idgrupo_familiar, int idsituacion_vivienda, int idusuarios, int idsituacion_economica, int idsituacion_comunitaria, int idparticipacion_ciudadana, Date fecha_ingreso, Date fecha_salida, String estado) {
        this.idregistros = idregistros;
        this.idjefe_familiar = idjefe_familiar;
        this.idgrupo_familiar = idgrupo_familiar;
        this.idsituacion_vivienda = idsituacion_vivienda;
        this.idusuarios = idusuarios;
        this.idsituacion_economica = idsituacion_economica;
        this.idsituacion_comunitaria = idsituacion_comunitaria;
        this.idparticipacion_ciudadana = idparticipacion_ciudadana;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.estado = estado;
    }

    public int getIdregistros() {
        return idregistros;
    }

    public void setIdregistros(int idregistros) {
        this.idregistros = idregistros;
    }

    public int getIdjefe_familiar() {
        return idjefe_familiar;
    }

    public void setIdjefe_familiar(int idjefe_familiar) {
        this.idjefe_familiar = idjefe_familiar;
    }

    public int getIdgrupo_familiar() {
        return idgrupo_familiar;
    }

    public void setIdgrupo_familiar(int idgrupo_familiar) {
        this.idgrupo_familiar = idgrupo_familiar;
    }

    public int getIdsituacion_vivienda() {
        return idsituacion_vivienda;
    }

    public void setIdsituacion_vivienda(int idsituacion_vivienda) {
        this.idsituacion_vivienda = idsituacion_vivienda;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public int getIdsituacion_economica() {
        return idsituacion_economica;
    }

    public void setIdsituacion_economica(int idsituacion_economica) {
        this.idsituacion_economica = idsituacion_economica;
    }

    public int getIdsituacion_comunitaria() {
        return idsituacion_comunitaria;
    }

    public void setIdsituacion_comunitaria(int idsituacion_comunitaria) {
        this.idsituacion_comunitaria = idsituacion_comunitaria;
    }

    public int getIdparticipacion_ciudadana() {
        return idparticipacion_ciudadana;
    }

    public void setIdparticipacion_ciudadana(int idparticipacion_ciudadana) {
        this.idparticipacion_ciudadana = idparticipacion_ciudadana;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   
}
