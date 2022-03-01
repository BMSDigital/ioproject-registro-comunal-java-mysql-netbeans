
package Datos;

public class vservicios {
    private int idservicios;
    private String aguas_blanca;
    private String tanques;
    private String litros;
    private String pipotes;
    private String cuantos;
    private String agua_servida;
    private String gas;
    private String empresa_suministra;
    private String cuanto_cilindro;
    private String precio_cilindro;
    private String sistema_electrico;
    private String recolecion_basura;
    private String telefonia;
    private String transporte;

    public vservicios(int idservicios, String aguas_blanca, String tanques, String litros, String pipotes, String cuantos, String agua_servida, String gas, String empresa_suministra, String cuanto_cilindro, String precio_cilindro, String sistema_electrico, String recolecion_basura, String telefonia, String transporte) {
        this.idservicios = idservicios;
        this.aguas_blanca = aguas_blanca;
        this.tanques = tanques;
        this.litros = litros;
        this.pipotes = pipotes;
        this.cuantos = cuantos;
        this.agua_servida = agua_servida;
        this.gas = gas;
        this.empresa_suministra = empresa_suministra;
        this.cuanto_cilindro = cuanto_cilindro;
        this.precio_cilindro = precio_cilindro;
        this.sistema_electrico = sistema_electrico;
        this.recolecion_basura = recolecion_basura;
        this.telefonia = telefonia;
        this.transporte = transporte;
    }

    public vservicios() {
    }

    public int getIdservicios() {
        return idservicios;
    }

    public void setIdservicios(int idservicios) {
        this.idservicios = idservicios;
    }

    public String getAguas_blanca() {
        return aguas_blanca;
    }

    public void setAguas_blanca(String aguas_blanca) {
        this.aguas_blanca = aguas_blanca;
    }

    public String getTanques() {
        return tanques;
    }

    public void setTanques(String tanques) {
        this.tanques = tanques;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    public String getPipotes() {
        return pipotes;
    }

    public void setPipotes(String pipotes) {
        this.pipotes = pipotes;
    }

    public String getCuantos() {
        return cuantos;
    }

    public void setCuantos(String cuantos) {
        this.cuantos = cuantos;
    }

    public String getAgua_servida() {
        return agua_servida;
    }

    public void setAgua_servida(String agua_servida) {
        this.agua_servida = agua_servida;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getEmpresa_suministra() {
        return empresa_suministra;
    }

    public void setEmpresa_suministra(String empresa_suministra) {
        this.empresa_suministra = empresa_suministra;
    }

    public String getCuanto_cilindro() {
        return cuanto_cilindro;
    }

    public void setCuanto_cilindro(String cuanto_cilindro) {
        this.cuanto_cilindro = cuanto_cilindro;
    }

    public String getPrecio_cilindro() {
        return precio_cilindro;
    }

    public void setPrecio_cilindro(String precio_cilindro) {
        this.precio_cilindro = precio_cilindro;
    }

    public String getSistema_electrico() {
        return sistema_electrico;
    }

    public void setSistema_electrico(String sistema_electrico) {
        this.sistema_electrico = sistema_electrico;
    }

    public String getRecolecion_basura() {
        return recolecion_basura;
    }

    public void setRecolecion_basura(String recolecion_basura) {
        this.recolecion_basura = recolecion_basura;
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
    
}
