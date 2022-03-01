
package Datos;

public class vusuario extends vubicacion{
   private String nombre;
   private String apellido;
   private String login;
   private String pasword;
   private String nivel_acceso;
   private String dia;
   private String mes;
   private String año;
   private String sexo;
   private String previlegio;
   private String f_nacimiento;
   private String email;
   private String for_email;
   private String f_email;
   private String telefono;
   private String area_movil;
   private String a_telefono;

    public vusuario(String nombre, String apellido, String login, String pasword, String nivel_acceso, String dia, String mes, String año, String sexo, String previlegio, String f_nacimiento, String email, String for_email, String f_email, String telefono, String area_movil, String a_telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.pasword = pasword;
        this.nivel_acceso = nivel_acceso;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.sexo = sexo;
        this.previlegio = previlegio;
        this.f_nacimiento = f_nacimiento;
        this.email = email;
        this.for_email = for_email;
        this.f_email = f_email;
        this.telefono = telefono;
        this.area_movil = area_movil;
        this.a_telefono = a_telefono;
    }

    public vusuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(String nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPrevilegio() {
        return previlegio;
    }

    public void setPrevilegio(String previlegio) {
        this.previlegio = previlegio;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFor_email() {
        return for_email;
    }

    public void setFor_email(String for_email) {
        this.for_email = for_email;
    }

    public String getF_email() {
        return f_email;
    }

    public void setF_email(String f_email) {
        this.f_email = f_email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getArea_movil() {
        return area_movil;
    }

    public void setArea_movil(String area_movil) {
        this.area_movil = area_movil;
    }

    public String getA_telefono() {
        return a_telefono;
    }

    public void setA_telefono(String a_telefono) {
        this.a_telefono = a_telefono;
    }
   
   
}
