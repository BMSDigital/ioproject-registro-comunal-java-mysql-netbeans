
package Logica;

import Datos.vsituacion_vivienda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fsituacion_vivienda {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Aguas Blanca", "Tiene Tanque", "Litros", "Tiene Pipotes","Agua Servida","Gas","Empresa que lo suministra","Cuantos Cilindro", "Precio del cilindro", "Sistema Electrico", "Recolecion de Basura","Telefonia","Transporte", "Condiciones del Terreno","Forma de Tendencia","Tipo Vivienda","Habiatacion de Vivienda","Enseres de Vivienda","Tipos de Paredes","Tipo de Techo","Cantidad de Habitaciones","Condiciones de Salubridades Vivienda","Acepto1","Presencia de Insecto ","Acepto2","Tiene Animales Domestico"};

        String[] registro = new String[28];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select c.condiciones_terreno,c.situacion_viviendacol,c.tipo_vivienda,c.habitacion_vivienda,c.enseres_vivienda,"
                + "c.tipo_paredes,c.tipo_techo,c.cantidad_habitaciones,c.condiciones_vivienda,c.presencia_roedores,c.acepto1,c.animales_domestico,c.acepto2,"
                + "g.idservicios,g.aguas_blanca,g.tanques,g.litros,g.pipotes,g.cuantos,g.agua_servida,g.gas,g.empresa_suministra,g.cuanto_cilindro,g.precio_cilindro,g.sistema_electrico,g.recolecion_basura,g.telefonia,g.transporte from servicios g inner join situacion_vivienda c "
                + "on g.idservicios=c.idservicios where condiciones_terreno like '%"
                + buscar + "%' order by idservicios desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idservicios");
                registro[1] = rs.getString("aguas_blanca");
                registro[2] = rs.getString("tanques");
                registro[3] = rs.getString("litros");
                registro[4] = rs.getString("pipotes");
                registro[5] = rs.getString("cuantos");
                registro[6] = rs.getString("agua_servida");
                registro[7] = rs.getString("gas");
                registro[8] = rs.getString("empresa_suministra");
                registro[9] = rs.getString("cuanto_cilindro");
                registro[10] = rs.getString("precio_cilindro");
                registro[11] = rs.getString("sistema_electrico");
                registro[12] = rs.getString("recolecion_basura");
                registro[13] = rs.getString("telefonia");
                registro[14] = rs.getString("transporte");
                
                registro[15] = rs.getString("condiciones_terreno");
                registro[16] = rs.getString("situacion_viviendacol");
                registro[17] = rs.getString("tipo_vivienda");
                registro[18] = rs.getString("habitacion_vivienda");
                registro[19] = rs.getString("enseres_vivienda");
                registro[20] = rs.getString("tipo_paredes");
                registro[21] = rs.getString("tipo_techo");
                registro[22] = rs.getString("cantidad_habitaciones");
                registro[23] = rs.getString("condiciones_vivienda");
                registro[24] = rs.getString("presencia_roedores");
                registro[25] = rs.getString("acepto1");
                registro[26] = rs.getString("animales_domestico");
                registro[27] = rs.getString("acepto2");
              

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vsituacion_vivienda dts) {
        sSQL = "insert into  servicios (aguas_blanca,tanques,litros,pipotes,cuantos,agua_servida,gas,empresa_suministra,cuanto_cilindro,precio_cilindro,sistema_electrico,recolecion_basura,telefonia,transporte)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into  situacion_vivienda (idservicios,condiciones_terreno,situacion_viviendacol,tipo_vivienda,habitacion_vivienda,enseres_vivienda,tipo_paredes,tipo_techo,cantidad_habitaciones,condiciones_vivienda,presencia_roedores,acepto1,animales_domestico,acepto2)"
                + "values ((select idservicios from servicios order by  idservicios desc limit 1),?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getAguas_blanca());
            pst.setString(2, dts.getTanques());
            pst.setString(3, dts.getLitros());
            pst.setString(4, dts.getPipotes());
            pst.setString(5, dts.getCuantos());
            pst.setString(6, dts.getAgua_servida());
            pst.setString(7, dts.getGas());
            pst.setString(8, dts.getEmpresa_suministra());
            pst.setString(9, dts.getCuanto_cilindro());
            pst.setString(10, dts.getPrecio_cilindro());
            pst.setString(11, dts.getSistema_electrico());
            pst.setString(12, dts.getRecolecion_basura());
            pst.setString(13, dts.getTelefonia());
            pst.setString(14, dts.getTransporte());
           
  
            pst2.setString(1, dts.getCondiciones_terreno());
            pst2.setString(2, dts.getSituacion_viviendacol());
            pst2.setString(3, dts.getTipo_vivienda());
            pst2.setString(4, dts.getHabitacion_vivienda());
            pst2.setString(5, dts.getEnseres_vivienda());
            pst2.setString(6, dts.getTipo_paredes());
            pst2.setString(7, dts.getTipo_techo());
            pst2.setString(8, dts.getCantidad_habitaciones());
            pst2.setString(9, dts.getCondiciones_vivienda());
            pst2.setString(10, dts.getPresencia_roedores());
            pst2.setString(11, dts.getAcepto1());
            pst2.setString(12, dts.getAnimales_domestico());
            pst2.setString(13, dts.getAcepto2());
            

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean editar(vsituacion_vivienda dts) {

        sSQL = "update servicios set aguas_blanca=?,tanques=?,litros=?,pipotes=?,cuantos=?,agua_servida=?,gas=?,empresa_suministra=?,cuanto_cilindro=?,precio_cilindro=?,sistema_electrico=?,recolecion_basura=?,telefonia=?,transporte=?"
                + "where idservicios=?";

        sSQL2 = "update situacion_vivienda set condiciones_terreno=?,situacion_viviendacol=?,tipo_vivienda=?,habitacion_vivienda=?,enseres_vivienda=?,tipo_paredes=?,tipo_techo=?,cantidad_habitaciones=?,condiciones_vivienda=?,presencia_roedores=?,acepto1=?,animales_domestico=?,acepto2=?"
                + " where idservicios=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getAguas_blanca());
            pst.setString(2, dts.getTanques());
            pst.setString(3, dts.getLitros());
            pst.setString(4, dts.getPipotes());
            pst.setString(5, dts.getCuantos());
            pst.setString(6, dts.getAgua_servida());
            pst.setString(7, dts.getGas());
            pst.setString(8, dts.getEmpresa_suministra());
            pst.setString(9, dts.getCuanto_cilindro());
            pst.setString(10, dts.getPrecio_cilindro());
            pst.setString(11, dts.getSistema_electrico());
            pst.setString(12, dts.getRecolecion_basura());
            pst.setString(13, dts.getTelefonia());
            pst.setString(14, dts.getTransporte());
            pst.setInt(15, dts.getIdservicios());
  
            pst2.setString(1, dts.getCondiciones_terreno());
            pst2.setString(2, dts.getSituacion_viviendacol());
            pst2.setString(3, dts.getTipo_vivienda());
            pst2.setString(4, dts.getHabitacion_vivienda());
            pst2.setString(5, dts.getEnseres_vivienda());
            pst2.setString(6, dts.getTipo_paredes());
            pst2.setString(7, dts.getTipo_techo());
            pst2.setString(8, dts.getCantidad_habitaciones());
            pst2.setString(9, dts.getCondiciones_vivienda());
            pst2.setString(10, dts.getPresencia_roedores());
            pst2.setString(11, dts.getAcepto1());
            pst2.setString(12, dts.getAnimales_domestico());
            pst2.setString(13, dts.getAcepto2());
            pst2.setInt(14, dts.getIdservicios());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vsituacion_vivienda dts) {
        sSQL = "delete from situacion_vivienda where idservicios=?";
        sSQL2 = "delete from servicios where idservicios=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdservicios());

            pst2.setInt(1, dts.getIdservicios());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
