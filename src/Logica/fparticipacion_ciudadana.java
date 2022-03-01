
package Logica;

import Datos.vparticipacion_ciudadana;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fparticipacion_ciudadana {
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Mec de Inf","Cuales","Serv Comun","Cuales","Existe Org","Participa","Participa alg mimb","Cuales Misiones","Otro","Estan Interv","Estas deac","Tienes inf","Estaria disp","Participa usted","De no Resp"};
       
       String [] registro =new String [11];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from participacion_ciudadana where estaria_dispuesto like '%"+ buscar + "%' order by idparticipacion_ciudadana desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idparticipacion_ciudadana");
               registro [1]=rs.getString("mecanismo_informacion");
               registro [2]=rs.getString("cuales");
               registro [3]=rs.getString("servicios_comunitario");
               registro [4]=rs.getString("cuales2");
               registro [5]=rs.getString("existe_organizaciones");
               registro [6]=rs.getString("participa_alguna");
               registro [7]=rs.getString("participa_algun_miembro");
               registro [8]=rs.getString("cuales_misiones");
               registro [9]=rs.getString("otro");
               registro [10]=rs.getString("estan_interviniendo");
               registro [11]=rs.getString("estas_deacuerdo");
               registro [12]=rs.getString("tienes_info");
               registro [13]=rs.getString("estaria_dispuesto");
               registro [14]=rs.getString("participa_usted");
               registro [15]=rs.getString("deno_respuesta");

               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (vparticipacion_ciudadana dts){
       sSQL="insert into participacion_ciudadana (mecanismo_informacion,cuales,servicios_comunitario,cuales2,existe_organizaciones,participa_alguna,participa_algun_miembro,cuales_misiones,otro,estan_interviniendo,estas_deacuerdo,tienes_info,estaria_dispuesto,participa_usted,deno_respuesta)" +
               "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getMecanismo_informacion());
           pst.setString(2, dts.getCuales());
           pst.setString(3, dts.getServicios_comunitario());
           pst.setString(4, dts.getCuales2());
           pst.setString(5, dts.getExiste_organizaciones());
           pst.setString(6, dts.getParticipa_alguna());
           pst.setString(7, dts.getParticipa_algun_miembro());
           pst.setString(8, dts.getCuales_misiones());
           pst.setString(9, dts.getOtro());
           pst.setString(10, dts.getEstan_interviniendo());
           
           pst.setString(11, dts.getEstas_deacuerdo());
           pst.setString(12, dts.getTienes_info());
           pst.setString(13, dts.getEstaria_dispuesto());
           pst.setString(14, dts.getParticipa_usted());
           pst.setString(15, dts.getDeno_respuesta());
           
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
           
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (vparticipacion_ciudadana dts){
       sSQL="update participacion_ciudadana set mecanismo_informacion=?,cuales=?,servicios_comunitario=?,cuales2=?,existe_organizaciones=?,participa_alguna=?,participa_algun_miembro=?,cuales_misiones=?,otro=?,estan_interviniendo=?,estas_deacuerdo=?,tienes_info=?,estaria_dispuesto=?,participa_usted=?,deno_respuesta=?"+
               " where idparticipacion_ciudadana=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getMecanismo_informacion());
           pst.setString(2, dts.getCuales());
           pst.setString(3, dts.getServicios_comunitario());
           pst.setString(4, dts.getCuales2());
           pst.setString(5, dts.getExiste_organizaciones());
           pst.setString(6, dts.getParticipa_alguna());
           pst.setString(7, dts.getParticipa_algun_miembro());
           pst.setString(8, dts.getCuales_misiones());
           pst.setString(9, dts.getOtro());
           pst.setString(10, dts.getEstan_interviniendo());
           
           pst.setString(11, dts.getEstas_deacuerdo());
           pst.setString(12, dts.getTienes_info());
           pst.setString(13, dts.getEstaria_dispuesto());
           pst.setString(14, dts.getParticipa_usted());
           pst.setString(15, dts.getDeno_respuesta());
           pst.setInt(16, dts.getIdparticipacion_ciudadana());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
  
   public boolean eliminar (vparticipacion_ciudadana dts){
       sSQL="delete from  participacion_ciudadana where idparticipacion_ciudadana=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdparticipacion_ciudadana());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else {
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
}
