package Logica;

import Datos.vsituacion_economica;
import Datos.vusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fsituacion_economica {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Estado", "Ciudad", "Municipio", "Parroquia", "Trabajas", "Institucion","ADV","Venta de", "Ing familiar", "Ing mensual", "LPH", "Enf que padecen", "Cual", "Nesecita ayuda","Cual", "Cantidad", "Exclusion"};

        String[] registro = new String[18];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select s.trabajas,s.institucion,s.act_comercial_vivienda,s.ventas_de,s.ingreso_familiar,"
                + "s.ing_mensual,s.lph,s.familiar_padezcan_enf,s.cual_enfermedad,s.ayuda_familiar_enf,s.cual_ayuda,s.cant_exclusion,s.per_exclusion,"
                + "g.idubicacion,g.estado,g.ciudad,g.municipio,g.parroquia from ubicacion g inner join situacion_economica s "
                + "on g.idubicacion=s.idubicacion where ing_mensual like '%"
                + buscar + "%' order by idubicacion desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idubicacion");
                registro[1] = rs.getString("estado");
                registro[2] = rs.getString("ciudad");
                registro[3] = rs.getString("municipio");
                registro[4] = rs.getString("parroquia");
                registro[5] = rs.getString("trabajas");
                registro[6] = rs.getString("institucion");
                registro[7] = rs.getString("act_comercial_vivienda");
                registro[8] = rs.getString("ventas_de");
                registro[9] = rs.getString("ingreso_familiar");
                registro[10] = rs.getString("ing_mensual");
                registro[11] = rs.getString("lph");
                registro[12] = rs.getString("familiar_padezcan_enf");
                registro[13] = rs.getString("cual_enfermedad");
                registro[14] = rs.getString("ayuda_familiar_enf");
                registro[15] = rs.getString("cual_ayuda");
                registro[16] = rs.getString("cant_exclusion");
                registro[17] = rs.getString("per_exclusion");
              

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vsituacion_economica dts) {
        sSQL = "insert into  ubicacion (estado,ciudad,municipio,parroquia)"
                + "values (?,?,?,?)";

        sSQL2 = "insert into  situacion_economica (idubicacion,trabajas,institucion,act_comercial_vivienda,ventas_de,ingreso_familiar,ing_mensual,lph,familiar_padezcan_enf,cual_enfermedad,ayuda_familiar_enf,cual_ayuda,cant_exclusion,per_exclusion)"
                + "values ((select idubicacion from ubicacion order by idubicacion desc limit 1),?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getEstado());
            pst.setString(2, dts.getCiudad());
            pst.setString(3, dts.getMunicipio());
            pst.setString(4, dts.getParroquia());

            pst2.setString(1, dts.getTrabajas());
            pst2.setString(2, dts.getInstitucion());
            pst2.setString(3, dts.getAct_comercial_vivienda());
            pst2.setString(4, dts.getVentas_de());
            pst2.setString(5, dts.getIngreso_familiar());
            pst2.setString(6, dts.getIng_mensual());
            pst2.setString(7, dts.getLph());
            pst2.setString(8, dts.getFamiliar_padezcan_enf());
            pst2.setString(9, dts.getCual_enfermedad());
            pst2.setString(10, dts.getAyuda_familiar_enf());
            pst2.setString(11, dts.getCual_ayuda());
            pst2.setString(12, dts.getCant_exclusion());
            pst2.setString(13, dts.getPer_exclusion());

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

    public boolean editar(vsituacion_economica dts) {

        sSQL = "update ubicacion set estado=?,ciudad=?,municipio=?,parroquia=?"
                + "where idubicacion=?";

        sSQL2 = "update situacion_economica set trabajas=?,institucion=?,act_comercial_vivienda=?,ventas_de=?,ingreso_familiar=?,ing_mensual=?,lph=?,familiar_padezcan_enf=?,cual_enfermedad=?,ayuda_familiar_enf=?,cual_ayuda=?,cant_exclusion=?,per_exclusion=?"
                + " where idubicacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getEstado());
            pst.setString(2, dts.getCiudad());
            pst.setString(3, dts.getMunicipio());
            pst.setString(4, dts.getParroquia());
            pst.setInt(5, dts.getIdubicacion());
            
            pst2.setString(1, dts.getTrabajas());
            pst2.setString(2, dts.getInstitucion());
            pst2.setString(3, dts.getAct_comercial_vivienda());
            pst2.setString(4, dts.getVentas_de());
            pst2.setString(5, dts.getIngreso_familiar());
            pst2.setString(6, dts.getIng_mensual());
            pst2.setString(7, dts.getLph());
            pst2.setString(8, dts.getFamiliar_padezcan_enf());
            pst2.setString(9, dts.getCual_enfermedad());
            pst2.setString(10, dts.getAyuda_familiar_enf());
            pst2.setString(11, dts.getCual_ayuda());
            pst2.setString(12, dts.getCant_exclusion());
            pst2.setString(13, dts.getPer_exclusion());

            pst2.setInt(14, dts.getIdubicacion());

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

    public boolean eliminar(vsituacion_economica dts) {
        sSQL = "delete from situacion_economica where idubicacion=?";
        sSQL2 = "delete from ubicacion where idubicacion=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdubicacion());

            pst2.setInt(1, dts.getIdubicacion());

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
