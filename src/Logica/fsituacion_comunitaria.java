
package Logica;

import Datos.vsituacion_comunitaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fsituacion_comunitaria {
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
    public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Como cree Ud RP","Quien cree","tipo proyectos","Como apoyaría Ud","Censo energético","Aspecto Ventajosos","Problemas y Dev","Cuales Prob","Participacion","Otros"};
       
       String [] registro =new String [11];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from situacion_comunitaria where como_apoyaria like '%"+ buscar + "%' order by idsituacion_comunitaria desc";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idsituacion_comunitaria");
               registro [1]=rs.getString("resolver_problemas");
               registro [2]=rs.getString("quien_resolvera");
               registro [3]=rs.getString("tipo_proyecto");
               registro [4]=rs.getString("como_apoyaria");
               registro [5]=rs.getString("censo_energetico");
               registro [6]=rs.getString("aspecto_ventajosos");
               registro [7]=rs.getString("problemas_debilidades");
               registro [8]=rs.getString("mejoramiento");
               registro [9]=rs.getString("opciones");
               registro [10]=rs.getString("otro");
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
       
       
       
   } 
   
   public boolean insertar (vsituacion_comunitaria dts){
       sSQL="insert into situacion_comunitaria (resolver_problemas,quien_resolvera,tipo_proyecto,como_apoyaria,censo_energetico,aspecto_ventajosos,problemas_debilidades,mejoramiento,opciones,otro)" +
               "values (?,?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getResolver_problemas());
           pst.setString(2, dts.getQuien_resolvera());
           pst.setString(3, dts.getTipo_proyecto());
           pst.setString(4, dts.getComo_apoyaria());
           pst.setString(5, dts.getCenso_energetico());
           pst.setString(6, dts.getAspecto_ventajosos());
           pst.setString(7, dts.getProblemas_debilidades());
           pst.setString(8, dts.getMejoramiento());
           pst.setString(9, dts.getOpciones());
           pst.setString(10, dts.getOtro());
           
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
   
   public boolean editar (vsituacion_comunitaria dts){
       sSQL="update situacion_comunitaria set resolver_problemas=?,quien_resolvera=?,tipo_proyecto=?,como_apoyaria=?,censo_energetico=?,aspecto_ventajosos=?,problemas_debilidades=?,mejoramiento=?,opciones=?,otro=?"+
               " where idsituacion_comunitaria=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1, dts.getResolver_problemas());
           pst.setString(2, dts.getQuien_resolvera());
           pst.setString(3, dts.getTipo_proyecto());
           pst.setString(4, dts.getComo_apoyaria());
           pst.setString(5, dts.getCenso_energetico());
           pst.setString(6, dts.getAspecto_ventajosos());
           pst.setString(7, dts.getProblemas_debilidades());
           pst.setString(8, dts.getMejoramiento());
           pst.setString(9, dts.getOpciones());
           pst.setString(10, dts.getOtro());
           pst.setInt(11, dts.getIdsituacion_comunitaria());
           
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
  
   public boolean eliminar (vsituacion_comunitaria dts){
       sSQL="delete from  situacion_comunitaria where idsituacion_comunitaria=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdsituacion_comunitaria());
           
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
