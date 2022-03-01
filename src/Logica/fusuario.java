package Logica;

import Datos.vgrupo_familiar;
import Datos.vusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fusuario {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID","Estado","Ciudad","Municipio","Parroquia","Nombre", "Apellido", "Login", "Pasword", "Acceso","Dia","Mes","Año","Fech nac", "Sexo", "Area","Form","Email","Area ","telefono","Telefono","Previlegio"};

        String[] registro = new String[22];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select c.nombre,c.apellido,c.login,c.pasword,c.nivel_acceso,"
                + "c.dia,c.mes,c.año,c.f_nacimiento,c.sexo,c.for_email,c.email,c.f_email,c.area_movil,"
                + "c.telefono,c.a_telefono,c.previlegio,g.idubicacion,g.estado,g.ciudad,g.municipio,g.parroquia from ubicacion g inner join usuarios c "
                + "on g.idubicacion=c.idubicacion where nivel_acceso like '%"
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
                registro[5] = rs.getString("nombre");
                registro[6] = rs.getString("apellido");
                registro[7] = rs.getString("login");
                registro[8] = rs.getString("pasword");
                registro[9] = rs.getString("nivel_acceso");
                registro[10] = rs.getString("dia");
                registro[11] = rs.getString("mes");
                registro[12] = rs.getString("año");
                registro[13] = rs.getString("f_nacimiento");
                registro[14] = rs.getString("sexo");
                registro[15] = rs.getString("email");
                registro[16] = rs.getString("for_email");
                registro[17] = rs.getString("f_email");
                registro[18] = rs.getString("area_movil");
                registro[19] = rs.getString("telefono");
                registro[20] = rs.getString("a_telefono");
                registro[21] = rs.getString("previlegio");
               
                  
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    


    public boolean insertar(vusuario dts) {
        sSQL = "insert into  ubicacion (estado,ciudad,municipio,parroquia)"
                + "values (?,?,?,?)";
        
        sSQL2 = "insert into  usuarios (idubicacion,nombre,apellido,login,pasword,nivel_acceso,dia,mes,año,f_nacimiento,sexo,email,for_email,f_email,area_movil,telefono,a_telefono,previlegio)"
                + "values ((select idubicacion from ubicacion order by idubicacion desc limit 1),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setString(1, dts.getEstado());
            pst.setString(2, dts.getCiudad());
            pst.setString(3, dts.getMunicipio());
            pst.setString(4, dts.getParroquia());
            
            pst2.setString(1, dts.getNombre());
            pst2.setString(2, dts.getApellido());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPasword());
            pst2.setString(5, dts.getNivel_acceso());
            pst2.setString(6, dts.getDia());
            pst2.setString(7, dts.getMes());
            pst2.setString(8, dts.getAño());
            pst2.setString(9, dts.getF_nacimiento());
            pst2.setString(10, dts.getSexo());
            pst2.setString(11, dts.getEmail());
            pst2.setString(12, dts.getFor_email());
            pst2.setString(13, dts.getF_email());
            pst2.setString(14, dts.getArea_movil());
            pst2.setString(15, dts.getTelefono());
            pst2.setString(16, dts.getA_telefono());
            pst2.setString(17, dts.getPrevilegio());


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

    public boolean editar(vusuario dts) {

        sSQL = "update ubicacion set estado=?,ciudad=?,municipio=?,parroquia=?"
                + "where idubicacion=?";

        sSQL2 = "update usuarios set nombre=?,apellido=?,login=?,pasword=?,nivel_acceso=?,dia=?,mes=?,año=?,f_nacimiento=?,sexo=?,email=?,for_email=?,f_email=?,area_movil=?,telefono=?,a_telefono=?,previlegio=?"
                + " where idubicacion=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getEstado());
            pst.setString(2, dts.getCiudad());
            pst.setString(3, dts.getMunicipio());
            pst.setString(4, dts.getParroquia());
            pst.setInt(5, dts.getIdubicacion());
            
            pst2.setString(1, dts.getNombre());
            pst2.setString(2, dts.getApellido());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPasword());
            pst2.setString(5, dts.getNivel_acceso());
            pst2.setString(6, dts.getDia());
            pst2.setString(7, dts.getMes());
            pst2.setString(8, dts.getAño());
            pst2.setString(9, dts.getF_nacimiento());
            pst2.setString(10, dts.getSexo());
            pst2.setString(11, dts.getEmail());
            pst2.setString(12, dts.getFor_email());
            pst2.setString(13, dts.getF_email());
            pst2.setString(14, dts.getArea_movil());
            pst2.setString(15, dts.getTelefono());
            pst2.setString(16, dts.getA_telefono());
            pst2.setString(17, dts.getPrevilegio());
            pst2.setInt(18, dts.getIdubicacion());

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
    
     public boolean eliminar(vusuario dts) {
        sSQL = "delete from usuarios where idubicacion=?";
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

    public DefaultTableModel login(String login, String pasword) {
        DefaultTableModel modelo;

        String[] titulos = {"ID","Nombre","Apellido","Acceso","Previlegio","Login","Pasword","Ubicacion"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

         sSQL = "select c.nombre,c.apellido,c.login,c.pasword,c.nivel_acceso,"
                + "c.previlegio,g.idubicacion,g.parroquia from ubicacion g inner join usuarios c "
                + "on g.idubicacion=c.idubicacion where c.login='"
                + login + "' and c.pasword='" + pasword + "' and c.previlegio='Activado'";

        try {
            Statement st = cn.createStatement();
            ResultSet rt = st.executeQuery(sSQL);

            while (rt.next()) {
                registro[0] = rt.getString("idubicacion");
                registro[1] = rt.getString("nombre");
                registro[2] = rt.getString("apellido");
                registro[3] = rt.getString("nivel_acceso");
                registro[4] = rt.getString("previlegio");
                registro[5] = rt.getString("login");
                registro[6] = rt.getString("pasword");
                registro[7] = rt.getString("parroquia");
                

                ++totalregistros;
                modelo.addRow(registro);
            }

            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
}
