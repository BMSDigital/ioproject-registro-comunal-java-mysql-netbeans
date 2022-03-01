package Datos;

public class vjefe_familiar extends vpersona {

    private String numero;
    private String cuenta;
    private String b_cuenta;
    private String rif;
    private String area;
    private String n_rif;

    public vjefe_familiar(String numero, String cuenta, String b_cuenta, String rif, String area, String n_rif) {
        this.numero = numero;
        this.cuenta = cuenta;
        this.b_cuenta = b_cuenta;
        this.rif = rif;
        this.area = area;
        this.n_rif = n_rif;
    }

    public vjefe_familiar() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getB_cuenta() {
        return b_cuenta;
    }

    public void setB_cuenta(String b_cuenta) {
        this.b_cuenta = b_cuenta;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getN_rif() {
        return n_rif;
    }

    public void setN_rif(String n_rif) {
        this.n_rif = n_rif;
    }
    
    
   
  
    
}
