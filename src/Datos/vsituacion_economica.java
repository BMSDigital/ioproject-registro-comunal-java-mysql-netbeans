
package Datos;

public class vsituacion_economica extends vubicacion {
   private String trabajas;
   private String institucion;
   private String ingreso_familiar;
   private String act_comercial_vivienda;
   private String ventas_de;
   private String ing_mensual;
   private String lph;
   private String familiar_padezcan_enf;
   private String cual_enfermedad;
   private String ayuda_familiar_enf;
   private String cual_ayuda;
   private String cant_exclusion;
   private String per_exclusion;

    public vsituacion_economica(String trabajas, String institucion, String ingreso_familiar, String act_comercial_vivienda, String ventas_de, String ing_mensual, String lph, String familiar_padezcan_enf, String cual_enfermedad, String ayuda_familiar_enf, String cual_ayuda, String cant_exclusion, String per_exclusion) {
        this.trabajas = trabajas;
        this.institucion = institucion;
        this.ingreso_familiar = ingreso_familiar;
        this.act_comercial_vivienda = act_comercial_vivienda;
        this.ventas_de = ventas_de;
        this.ing_mensual = ing_mensual;
        this.lph = lph;
        this.familiar_padezcan_enf = familiar_padezcan_enf;
        this.cual_enfermedad = cual_enfermedad;
        this.ayuda_familiar_enf = ayuda_familiar_enf;
        this.cual_ayuda = cual_ayuda;
        this.cant_exclusion = cant_exclusion;
        this.per_exclusion = per_exclusion;
    }

    public vsituacion_economica() {
    }

    public String getTrabajas() {
        return trabajas;
    }

    public void setTrabajas(String trabajas) {
        this.trabajas = trabajas;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getIngreso_familiar() {
        return ingreso_familiar;
    }

    public void setIngreso_familiar(String ingreso_familiar) {
        this.ingreso_familiar = ingreso_familiar;
    }

    public String getAct_comercial_vivienda() {
        return act_comercial_vivienda;
    }

    public void setAct_comercial_vivienda(String act_comercial_vivienda) {
        this.act_comercial_vivienda = act_comercial_vivienda;
    }

    public String getVentas_de() {
        return ventas_de;
    }

    public void setVentas_de(String ventas_de) {
        this.ventas_de = ventas_de;
    }

    public String getIng_mensual() {
        return ing_mensual;
    }

    public void setIng_mensual(String ing_mensual) {
        this.ing_mensual = ing_mensual;
    }

    public String getLph() {
        return lph;
    }

    public void setLph(String lph) {
        this.lph = lph;
    }

    public String getFamiliar_padezcan_enf() {
        return familiar_padezcan_enf;
    }

    public void setFamiliar_padezcan_enf(String familiar_padezcan_enf) {
        this.familiar_padezcan_enf = familiar_padezcan_enf;
    }

    public String getCual_enfermedad() {
        return cual_enfermedad;
    }

    public void setCual_enfermedad(String cual_enfermedad) {
        this.cual_enfermedad = cual_enfermedad;
    }

    public String getAyuda_familiar_enf() {
        return ayuda_familiar_enf;
    }

    public void setAyuda_familiar_enf(String ayuda_familiar_enf) {
        this.ayuda_familiar_enf = ayuda_familiar_enf;
    }

    public String getCual_ayuda() {
        return cual_ayuda;
    }

    public void setCual_ayuda(String cual_ayuda) {
        this.cual_ayuda = cual_ayuda;
    }

    public String getCant_exclusion() {
        return cant_exclusion;
    }

    public void setCant_exclusion(String cant_exclusion) {
        this.cant_exclusion = cant_exclusion;
    }

    public String getPer_exclusion() {
        return per_exclusion;
    }

    public void setPer_exclusion(String per_exclusion) {
        this.per_exclusion = per_exclusion;
    }
   
}
