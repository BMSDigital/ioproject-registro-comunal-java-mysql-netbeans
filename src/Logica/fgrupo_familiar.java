package Logica;

import Datos.vgrupo_familiar;
import Datos.vjefe_familiar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class fgrupo_familiar {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";

    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apellido", "Cedula", "Fec Nac", "Edad", "Sexo", "Estado Civil", "Parentesco"};

        String[] registro = new String[20];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apellido,p.n_cedula,p.f_nacimiento,p.edad,"
                + "p.sexo,p.estado_civil,p.parentesco,p.discapacidad,p.pension,p.cne,g.embarazo_precoz,p.nivel_instruccion,p.profesion,"
                + "p.ingreso_mensual,p.email,p.a_telefono from persona p inner join grupo_familiar g "
                + "on p.idpersona=g.idpersona where cedula like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("n_cedula");
                registro[4] = rs.getString("f_nacimiento");
                registro[5] = rs.getString("edad");
                registro[6] = rs.getString("sexo");
                registro[7] = rs.getString("estado_civil");
                registro[8] = rs.getString("parentesco");
                registro[9] = rs.getString("discapacidad");
                registro[10] = rs.getString("pension");
                registro[11] = rs.getString("cne");
                registro[12] = rs.getString("embarazo_precoz");
                registro[13] = rs.getString("nivel_instruccion");
                registro[14] = rs.getString("profesion");
                registro[15] = rs.getString("ingreso_mensual");
                registro[16] = rs.getString("email");
                registro[17] = rs.getString("a_telefono");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vgrupo_familiar dts) {

        sSQL = "insert into  persona (nombre,apellido,cedula,nacionalidad,n_cedula,dia,mes,año,f_nacimiento,edad,sexo,estado_civil,parentesco,discapacidad,pension,cne,nivel_instruccion,profesion,ingreso_mensual,email,for_email,telefono,area_movil,a_telefono)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "insert into grupo_familiar(idpersona, embarazo_precoz)"
                + "values ((select idpersona from persona order by idpersona desc limit 1),?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getCedula());
            pst.setString(4, dts.getNacionalidad());
            pst.setString(5, dts.getN_cedula());
            pst.setString(6, dts.getDia());
            pst.setString(7, dts.getMes());
            pst.setString(8, dts.getAño());
            pst.setString(9, dts.getF_nacimiento());
            pst.setString(10, dts.getEdad());
            pst.setString(11, dts.getSexo());
            pst.setString(12, dts.getEstado_civil());
            pst.setString(13, dts.getParentesco());
            pst.setString(14, dts.getDiscapacidad());
            pst.setString(15, dts.getPension());
            pst.setString(16, dts.getCne());
            pst.setString(17, dts.getNivel_instruccion());
            pst.setString(18, dts.getProfesion());
            pst.setString(19, dts.getIngreso_mensual());
            pst.setString(20, dts.getEmail());
            pst.setString(21, dts.getFor_email());
            pst.setString(22, dts.getTelefono());
            pst.setString(23, dts.getArea_movil());
            pst.setString(24, dts.getA_telefono());

            pst2.setString(1, dts.getEmbarazo_precoz());

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

    public boolean editar(vgrupo_familiar dts) {

        sSQL = "update persona set nombre=?,apellido=?,cedula=?,nacionalidad=?,n_cedula=?,dia=?,mes=?,año=?,f_nacimiento=?,edad=?,sexo=?,estado_civil=?,parentesco=?,discapacidad=?,pension=?,cne=?,nivel_instruccion=?,profesion=?,ingreso_mensual=?,email=?,for_email=?,telefono=?,area_movil=?,a_telefono=?"
                + "where idpersona=?";

        sSQL2 = "update grupo_familiar set embarazo_precoz=?"
                + " where idpersona=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellido());
            pst.setString(3, dts.getCedula());
            pst.setString(4, dts.getNacionalidad());
            pst.setString(5, dts.getN_cedula());
            pst.setString(6, dts.getDia());
            pst.setString(7, dts.getMes());
            pst.setString(8, dts.getAño());
            pst.setString(9, dts.getF_nacimiento());
            pst.setString(10, dts.getEdad());
            pst.setString(11, dts.getSexo());
            pst.setString(12, dts.getEstado_civil());
            pst.setString(13, dts.getParentesco());
            pst.setString(14, dts.getDiscapacidad());
            pst.setString(15, dts.getPension());
            pst.setString(16, dts.getCne());
            pst.setString(17, dts.getNivel_instruccion());
            pst.setString(18, dts.getProfesion());
            pst.setString(19, dts.getIngreso_mensual());
            pst.setString(20, dts.getEmail());
            pst.setString(21, dts.getFor_email());
            pst.setString(22, dts.getTelefono());
            pst.setString(23, dts.getArea_movil());
            pst.setString(24, dts.getA_telefono());
            pst.setInt(25, dts.getIdpersona());

            pst2.setString(1, dts.getEmbarazo_precoz());
            pst2.setInt(2, dts.getIdpersona());

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

    public boolean eliminar(vgrupo_familiar dts) {
        sSQL = "delete from grupo_familiar where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdpersona());

            pst2.setInt(1, dts.getIdpersona());

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

    public DefaultTableModel mostrarG(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombre", "Apellido", "Cedula", "Nacionalidad","Cedula","Dia", "Mes", "Año","Fcha nac", "Edad", "Sexo", "Estado","Ptesco","Disc", "Pension", "Cne", "Emb Pcoz", "G-I", "Profesion", "Ing M", "Email", "Area", "Telefono", "Area"};

        String[] registro = new String[26];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apellido,p.cedula,p.nacionalidad,p.n_cedula,p.dia,p.mes,p.año,p.f_nacimiento,p.edad,"
                + "p.sexo,p.estado_civil,p.parentesco,p.discapacidad,p.pension,p.cne,g.embarazo_precoz,p.nivel_instruccion,p.profesion,"
                + "p.ingreso_mensual,p.email,p.for_email,p.telefono,p.area_movil,p.a_telefono from persona p inner join grupo_familiar g "
                + "on p.idpersona=g.idpersona where cedula like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("cedula");
                registro[4] = rs.getString("nacionalidad");
                registro[5] = rs.getString("n_cedula");
                registro[6] = rs.getString("dia");
                registro[7] = rs.getString("mes");
                registro[8] = rs.getString("año");
                registro[9] = rs.getString("f_nacimiento");
                registro[10] = rs.getString("edad");
                registro[11] = rs.getString("sexo");
                registro[12] = rs.getString("estado_civil");
                registro[13] = rs.getString("parentesco");
                registro[14] = rs.getString("discapacidad");
                registro[15] = rs.getString("pension");
                registro[16] = rs.getString("cne");
                registro[17] = rs.getString("embarazo_precoz");
                registro[18] = rs.getString("nivel_instruccion");
                registro[19] = rs.getString("profesion");
                registro[20] = rs.getString("ingreso_mensual");
                registro[21] = rs.getString("email");
                registro[22] = rs.getString("for_email");
                registro[23] = rs.getString("telefono");
                registro[24] = rs.getString("area_movil");
                registro[25] = rs.getString("a_telefono");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

}
