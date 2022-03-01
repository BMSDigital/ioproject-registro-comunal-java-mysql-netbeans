/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vgrupo_familiar;
import Datos.vjefe_familiar;
import Logica.fgrupo_familiar;
import Logica.fjefe_familiar;
import Logica.fusuario;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Registro_Grupofamiliar extends javax.swing.JPanel {

    /**
     * Creates new form Registro_Grupofamiliar
     */
    public Registro_Grupofamiliar() {
        initComponents();
        mostrar("");
        inhabilitar();
        
    }
   
      vgrupo_familiar dts = new vgrupo_familiar();
      fgrupo_familiar func = new fgrupo_familiar();
      Validaciones val = new Validaciones();
      private String accion = "guardar";

    void inhabilitar() {
        txtidpersona.setVisible(false);
        bteliminar.setEnabled(false);

        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtedad.setEnabled(false);
        txtcedula.setEnabled(false);
        txtdia.setEnabled(false);
        cbomes.setEnabled(false);
        txtaño.setEnabled(false);
        txtedad.setEnabled(false);
        cbosexo.setEnabled(false);
        txtdia.setEnabled(false);
        cbomes.setEnabled(false);
        txtaño.setEnabled(false);
        cbosexo.setEnabled(false);

        txtdiscapacidad.setEnabled(false);
        op1.setEnabled(false);
        op2.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        cbonivel_instruccion.setEnabled(false);
        txtprofesion.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        cboarea_telefono.setEnabled(false);
        txtemail.setEnabled(false);
        cboemail.setEnabled(false);
        txtingreso_mensual.setEnabled(false);
        cboarea_telefono.setEnabled(false);
        txttelefono.setEnabled(false);
        cbocedula.setEnabled(false);
        op5.setEnabled(false);
        op6.setEnabled(false);

        btguardar.setEnabled(false);
        bteliminar.setEnabled(false);

        txtidpersona.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtcedula.setText("");
        txtdia.setText("");
        txtaño.setText("");
        txtdiscapacidad.setText("");
        txtprofesion.setText("");
        txtingreso_mensual.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }

    void habilitar() {
        txtidpersona.setVisible(false);
        

        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtedad.setEnabled(true);
        txtcedula.setEnabled(true);
        txtdia.setEnabled(true);
        cbomes.setEnabled(true);
        txtaño.setEnabled(true);
        txtedad.setEnabled(true);
        cbosexo.setEnabled(true);
        txtdia.setEnabled(true);
        cbomes.setEnabled(true);
        txtaño.setEnabled(true);
        cbosexo.setEnabled(true);

        txtdiscapacidad.setEnabled(true);
        op1.setEnabled(true);
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
        cbonivel_instruccion.setEnabled(true);
        txtprofesion.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
        cboarea_telefono.setEnabled(true);
        txtemail.setEnabled(true);
        cboemail.setEnabled(true);
        txtingreso_mensual.setEnabled(true);
        cboarea_telefono.setEnabled(true);
        txttelefono.setEnabled(true);
        cbocedula.setEnabled(true);
        op5.setEnabled(true);
        op6.setEnabled(true);
        
        btguardar.setEnabled(true);
        bteliminar.setEnabled(false);

        txtidpersona.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtcedula.setText("");
        txtdia.setText("");
        txtaño.setText("");
        txtdiscapacidad.setText("");
        txtprofesion.setText("");
        txtingreso_mensual.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }
    
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fgrupo_familiar func = new fgrupo_familiar();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            val.ocultarColumna(tablalistado);
            lbtotalregistro.setText("Total de registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pensionado = new javax.swing.ButtonGroup();
        cne = new javax.swing.ButtonGroup();
        embarazo = new javax.swing.ButtonGroup();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdia = new javax.swing.JTextField();
        cbomes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox<>();
        txtaño = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtidpersona = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtdiscapacidad = new javax.swing.JTextField();
        cbonivel_instruccion = new javax.swing.JComboBox<>();
        txtprofesion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        cboemail = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtingreso_mensual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboarea_telefono = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        cbocedula = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cboestadocivil = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cboparentesco = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        txtn_cedula = new javax.swing.JTextField();
        txtf_nacimiento = new javax.swing.JTextField();
        txta_telefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btbuscar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lbtotalregistro = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1220, 640));
        setMinimumSize(new java.awt.Dimension(1220, 640));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1220, 640));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel22.setText("Vigilancia");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel21.setText("Inicio");

        jLabel30.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Grupo Familiar");

        jPanel3.setBackground(new java.awt.Color(255,255,255,50)
        );
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setDoubleBuffered(false);
        jPanel3.setMaximumSize(new java.awt.Dimension(373, 495));
        jPanel3.setMinimumSize(new java.awt.Dimension(373, 495));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Apellido");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cedula");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Edad");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtdia.setForeground(new java.awt.Color(204, 204, 204));
        txtdia.setText("   Dia");
        txtdia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdiaMouseClicked(evt);
            }
        });
        txtdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiaActionPerformed(evt);
            }
        });
        txtdia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiaKeyTyped(evt);
            }
        });

        cbomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        cbomes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomesActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha de nacimiento ");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Sexo");

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Mujer", "Hombre", "Otro" }));
        cbosexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexoActionPerformed(evt);
            }
        });

        txtaño.setForeground(new java.awt.Color(204, 204, 204));
        txtaño.setText("   Año");
        txtaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtañoMouseClicked(evt);
            }
        });
        txtaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtañoActionPerformed(evt);
            }
        });
        txtaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtañoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtañoKeyTyped(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Embarazo temprano");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Grado de Instrucción");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Profesión");

        btnuevo.setBackground(new java.awt.Color(255 , 255, 255, 125)
        );
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web(1).png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnuevo.setContentAreaFilled(false);
        btnuevo.setOpaque(true);
        btnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnuevoMouseExited(evt);
            }
        });
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        btguardar.setBackground(new java.awt.Color(255 , 255, 255, 125)
        );
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/arrows.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btguardar.setContentAreaFilled(false);
        btguardar.setOpaque(true);
        btguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btguardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btguardarMouseExited(evt);
            }
        });
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Persona/Discapacidad");

        txtdiscapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdiscapacidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdiscapacidadKeyTyped(evt);
            }
        });

        cbonivel_instruccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Sin instrucciòn", "Basica", "Bachiller", "Tecnico Medio", "Tecnico Superior", "Universitario", "Post Grado" }));
        cbonivel_instruccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbonivel_instruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonivel_instruccionActionPerformed(evt);
            }
        });

        txtprofesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprofesionActionPerformed(evt);
            }
        });
        txtprofesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprofesionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprofesionKeyTyped(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Correo Eletronico");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        cboemail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@hotmail.com", "@gmail.com\t", "@yahoo.com" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboemailActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Ing. Mensual");

        txtingreso_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingreso_mensualActionPerformed(evt);
            }
        });
        txtingreso_mensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtingreso_mensualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingreso_mensualKeyTyped(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono Movil");

        cboarea_telefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0416", "0426", "0414", "0424", "0412", "0251", "0253" }));
        cboarea_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboarea_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboarea_telefonoActionPerformed(evt);
            }
        });

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        cbocedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbocedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", " E-" }));
        cbocedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocedulaActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Estado civil");

        cboestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Soltero/a", "Comprometido/a", "Casado/a", "Divorciado/a", "Viudo/a" }));
        cboestadocivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadocivilActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Cne");

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Pensionado");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Parentesco");

        cboparentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Padre", "Madre", "Hijos", "Tio", "Nieto ", "Abuelo ", "Suegros", "Yerno", "Primos ", "Sobrino" }));
        cboparentesco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboparentescoActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        pensionado.add(op1);
        op1.setText("SI");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        pensionado.add(op2);
        op2.setText("NO");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        cne.add(op3);
        op3.setText("SI");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        cne.add(op4);
        op4.setText("NO");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op5.setBackground(new java.awt.Color(255,255,255,50)
        );
        embarazo.add(op5);
        op5.setText("SI");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        embarazo.add(op6);
        op6.setText("NO");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(op1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                        .addComponent(op2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(op4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(op5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(op6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1)
                    .addComponent(op2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op4)
                    .addComponent(op3))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op6)
                    .addComponent(op5)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19)
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboemail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtdiscapacidad)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(109, 109, 109))
                                        .addComponent(cbosexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbonivel_instruccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnombre)
                                        .addComponent(txtapellido)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cboestadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboparentesco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbonivel_instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuevo)
                    .addComponent(btguardar)
                    .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255,255,255,40));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(526, 495));
        jPanel2.setMinimumSize(new java.awt.Dimension(526, 495));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255,255,255,50));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Buscar");

        btbuscar.setBackground(new java.awt.Color(255 , 255, 255, 125));
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web (5).png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btbuscar.setContentAreaFilled(false);
        btbuscar.setDoubleBuffered(true);
        btbuscar.setMaximumSize(new java.awt.Dimension(61, 25));
        btbuscar.setMinimumSize(new java.awt.Dimension(61, 25));
        btbuscar.setOpaque(true);
        btbuscar.setSelected(true);
        btbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btbuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btbuscarMouseExited(evt);
            }
        });
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        bteliminar.setBackground(new java.awt.Color(255,255,255,125));
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/delete (3).png"))); // NOI18N
        bteliminar.setText("Eliminar");
        bteliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bteliminar.setContentAreaFilled(false);
        bteliminar.setOpaque(true);
        bteliminar.setSelected(true);
        bteliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bteliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bteliminarMouseExited(evt);
            }
        });
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(255,255,255,125));
        btsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/arrow (5).png"))); // NOI18N
        btsalir.setText("Salir");
        btsalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btsalir.setContentAreaFilled(false);
        btsalir.setOpaque(true);
        btsalir.setSelected(true);
        btsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btsalirMouseExited(evt);
            }
        });
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255 , 255, 255, 40));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10"
            }
        ));
        tablalistado.setGridColor(new java.awt.Color(204, 204, 204));
        tablalistado.setOpaque(false);
        tablalistado.setSurrendersFocusOnKeystroke(true);
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        lbtotalregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtotalregistro.setText("Registros");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbtotalregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbtotalregistro)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(8, 8, 8)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel22)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
       txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
       val.teclasEspeciales(evt, txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased

    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtnombre, evt, 15);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiaMouseClicked
      txtaño.setText("");    
    }//GEN-LAST:event_txtdiaMouseClicked

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
      txtdia.transferFocus();
    }//GEN-LAST:event_txtdiaActionPerformed

    private void txtdiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyPressed
       val.teclasEspeciales(evt, txtdia);
    }//GEN-LAST:event_txtdiaKeyPressed

    private void txtdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtdia, evt, 2);
    }//GEN-LAST:event_txtdiaKeyTyped

    private void cbomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomesActionPerformed
       cbomes.transferFocus();
    }//GEN-LAST:event_cbomesActionPerformed

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed
       cbosexo.transferFocus();
    }//GEN-LAST:event_cbosexoActionPerformed

    private void txtañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtañoActionPerformed
       txtaño.transferFocus();
    }//GEN-LAST:event_txtañoActionPerformed

    private void txtañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyPressed
       val.teclasEspeciales(evt, txtaño);
    }//GEN-LAST:event_txtañoKeyPressed

    private void txtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtaño, evt, 4);
    }//GEN-LAST:event_txtañoKeyTyped

    private void btnuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseClicked
       val.limpiar1(btnuevo);

    }//GEN-LAST:event_btnuevoMouseClicked

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
       val.limpiar2(btnuevo);
    }//GEN-LAST:event_btnuevoMouseExited

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseClicked

    }//GEN-LAST:event_btguardarMouseClicked

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
       val.limpiar1(btnuevo);
       Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
       val.limpiar2(btnuevo);
       Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        
           /*val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(txtcedula);
            val.valEsp(txtdia);
            val.valEsp(txtaño);
            val.valEsp(txtedad);
            val.valEsp(txtdiscapacidad);
            val.valEsp(txtprofesion);
            val.valEsp(txtingreso_mensual);
            val.valEsp(txtemail);
            val.valEsp(txttelefono);
            
            val.valEsp(cbocedula);
            val.valEsp(cbomes);
            val.valEsp(cbosexo);
            val.valEsp(cboestadocivil);
            val.valEsp(cboparentesco);
            val.valEsp(cbonivel_instruccion);
            val.valEsp(cboemail);
            val.valEsp(cboarea_telefono);*/
        
        vgrupo_familiar dts = new vgrupo_familiar();
        fgrupo_familiar func = new fgrupo_familiar();
        
        dts.setNombre(txtnombre.getText());
        
        dts.setApellido(txtapellido.getText());
        
        
           dts.setCedula(txtcedula.getText());
           
           int s = cbocedula.getSelectedIndex();
           dts.setNacionalidad((String)cbocedula.getItemAt(s).toString());
           
           dts.setN_cedula(txtn_cedula.getText().concat((String)cbocedula.getSelectedItem().toString()).concat(txtcedula.getText()));
           
           dts.setDia(txtdia.getText());
           
            s = cbomes.getSelectedIndex();
           dts.setMes((String)cbomes.getItemAt(s).toString());
           
           dts.setAño(txtaño.getText());
           
           dts.setF_nacimiento(txtf_nacimiento.getText().concat(txtdia.getText()).concat((String)cbomes.getSelectedItem().toString().concat(txtaño.getText())));
           
           dts.setEdad(txtedad.getText());
           
            s = cbosexo.getSelectedIndex();
           dts.setSexo((String)cbosexo.getItemAt(s).toString());
           
           s = cboestadocivil.getSelectedIndex();
           dts.setEstado_civil((String) cboestadocivil.getItemAt(s).toString());
           
            s = cboparentesco.getSelectedIndex();
           dts.setParentesco((String) cboparentesco.getItemAt(s).toString());
           
           dts.setDiscapacidad(txtdiscapacidad.getText());
           
           dts.setPension(gender);
           
           dts.setCne(gender1);
           
           dts.setEmbarazo_precoz(gender2);
           
            s = cbonivel_instruccion.getSelectedIndex();
             dts.setNivel_instruccion((String)cbonivel_instruccion.getItemAt(s).toString());
             
           dts.setProfesion(txtprofesion.getText());

           dts.setIngreso_mensual(txtingreso_mensual.getText());

           dts.setEmail(txtemail.getText());
        
            s = cboemail.getSelectedIndex();
            dts.setFor_email((String)cboemail.getItemAt(s).toString());
            
            s = cboarea_telefono.getSelectedIndex();
            dts.setArea_movil((String)cboarea_telefono.getItemAt(s).toString());
             
            dts.setTelefono(txttelefono.getText());
            
            dts.setA_telefono(txta_telefono.getText().concat(cboarea_telefono.getSelectedItem().toString()).concat(txttelefono.getText()));
                   
           

           
        
          if (txttelefono.getText().length() == 0) {
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(txtcedula);
            val.valEsp(txtdia);
            val.valEsp(txtaño);
            val.valEsp(txtedad);
            val.valEsp(txtdiscapacidad);
            val.valEsp(txtprofesion);
            val.valEsp(txtingreso_mensual);
            val.valEsp(txtemail);
            val.valEsp(txttelefono);
            
            val.valEsp(cbocedula);
            val.valEsp(cbomes);
            val.valEsp(cbosexo);
            val.valEsp(cboestadocivil);
            val.valEsp(cboparentesco);
            val.valEsp(cbonivel_instruccion);
            val.valEsp(cboemail);
            val.valEsp(cboarea_telefono);
            return;
        } else {
            //txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
            if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(null, "El grupo familiar fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }
          }
          /*else if (accion.equals("editar")){
            dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "El grupo familiar fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }*/}
          
          
        
        
          
          
   
    }//GEN-LAST:event_btguardarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
       mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btbuscarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        /*if (!txtidpersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar el Trabajador?","Confirmar",2);

            if (confirmacion==0) {
                fgrupo_familiar func = new fgrupo_familiar();
                vgrupo_familiar dts= new vgrupo_familiar();

                dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }*/
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        /*btguardar.setText("Editar");
        habilitar();
        bteliminar.setEnabled(true);
        accion="editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
         
        txtidpersona.setText(tablalistado.getValueAt(fila, 0).toString());
        txtnombre.setText(tablalistado.getValueAt(fila, 1).toString());
        txtapellido.setText(tablalistado.getValueAt(fila, 2).toString());
        txtcedula.setText(tablalistado.getValueAt(fila, 3).toString());
        cbocedula.setSelectedItem(tablalistado.getValueAt(fila, 4).toString());
        //txtn_cedula.setText(tablalistado.getValueAt(fila, 5).toString());
        txtdia.setText(tablalistado.getValueAt(fila, 6).toString());
        cbomes.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        txtaño.setText(tablalistado.getValueAt(fila, 8).toString());
        //txtf_nacimiento.setText(tablalistado.getValueAt(fila, 9).toString());
        txtedad.setText(tablalistado.getValueAt(fila, 10).toString());
        cbosexo.setSelectedItem(tablalistado.getValueAt(fila, 11).toString());
        cboestadocivil.setSelectedItem(tablalistado.getValueAt(fila, 12).toString());
        cboparentesco.setSelectedItem(tablalistado.getValueAt(fila, 13).toString());
        txtdiscapacidad.setText(tablalistado.getValueAt(fila, 14).toString());
        op1.setText(tablalistado.getValueAt(fila, 15).toString());
        op3.setText(tablalistado.getValueAt(fila, 16).toString());
        op5.setText(tablalistado.getValueAt(fila, 17).toString());
        cbonivel_instruccion.setSelectedItem(tablalistado.getValueAt(fila, 18).toString());
        txtprofesion.setText(tablalistado.getValueAt(fila, 19).toString());
        txtingreso_mensual.setText(tablalistado.getValueAt(fila, 20).toString());
        txtemail.setText(tablalistado.getValueAt(fila, 21).toString());
        cboemail.setSelectedItem(tablalistado.getValueAt(fila, 22).toString());
        txttelefono.setText(tablalistado.getValueAt(fila, 23).toString());
        cboarea_telefono.setSelectedItem(tablalistado.getValueAt(fila, 24).toString());
        //txta_telefono.setText(tablalistado.getValueAt(fila, 25).toString());*/
       
       
        
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        txtapellido.transferFocus();
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
       val.teclasEspeciales(evt, txtapellido);
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtapellido, evt, 15);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        txtemail.transferFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
       val.teclasEspeciales(evt, txtemail);
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
       val.espacioMaximo(txtemail, evt, 30);
    }//GEN-LAST:event_txtemailKeyTyped

    private void cboemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboemailActionPerformed
       cboemail.transferFocus();
    }//GEN-LAST:event_cboemailActionPerformed

    private void cboarea_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboarea_telefonoActionPerformed
       cboarea_telefono.transferFocus();
    }//GEN-LAST:event_cboarea_telefonoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
       txttelefono.transferFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
       val.teclasEspeciales(evt, txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txttelefono, evt, 7);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void cbocedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocedulaActionPerformed
        cbocedula.transferFocus();
    }//GEN-LAST:event_cbocedulaActionPerformed

    private void cboestadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadocivilActionPerformed
        cboestadocivil.transferFocus();
    }//GEN-LAST:event_cboestadocivilActionPerformed

    private void cboparentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboparentescoActionPerformed
        cboparentesco.transferFocus();
    }//GEN-LAST:event_cboparentescoActionPerformed

    private void btsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseClicked
       System.exit(0);
    }//GEN-LAST:event_btsalirMouseClicked

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        gender = "Si";
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        gender = "No";
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        gender1 = "Si";
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        gender1 = "No";
    }//GEN-LAST:event_op4ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        gender2 = "Si";
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        gender2 = "No";
    }//GEN-LAST:event_op6ActionPerformed

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseEntered

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseExited

    private void bteliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseEntered

    private void bteliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseExited

    private void btsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseEntered

    private void btsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseExited

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
         val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtcedula, evt, 9);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
       val.teclasEspeciales(evt, txtcedula);
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtañoMouseClicked
        txtaño.setText("");
    }//GEN-LAST:event_txtañoMouseClicked

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtedad, evt, 2);
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
       val.teclasEspeciales(evt, txtedad);
    }//GEN-LAST:event_txtedadKeyPressed

    private void txtdiscapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiscapacidadKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtdiscapacidad, evt, 15);
    }//GEN-LAST:event_txtdiscapacidadKeyTyped

    private void txtdiscapacidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiscapacidadKeyPressed
       val.teclasEspeciales(evt, txtdiscapacidad);
    }//GEN-LAST:event_txtdiscapacidadKeyPressed

    private void txtprofesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtprofesion, evt, 25);
    }//GEN-LAST:event_txtprofesionKeyTyped

    private void txtprofesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyPressed
       val.teclasEspeciales(evt, txtprofesion);
    }//GEN-LAST:event_txtprofesionKeyPressed

    private void txtingreso_mensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingreso_mensualKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtingreso_mensual, evt, 8);
    }//GEN-LAST:event_txtingreso_mensualKeyTyped

    private void txtingreso_mensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingreso_mensualKeyPressed
       val.teclasEspeciales(evt, txtingreso_mensual);
    }//GEN-LAST:event_txtingreso_mensualKeyPressed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        txtcedula.transferFocus();
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
       txtedad.transferFocus();
    }//GEN-LAST:event_txtedadActionPerformed

    private void cbonivel_instruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonivel_instruccionActionPerformed
       cbonivel_instruccion.transferFocus();
    }//GEN-LAST:event_cbonivel_instruccionActionPerformed

    private void txtprofesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprofesionActionPerformed
       txtprofesion.transferFocus();
    }//GEN-LAST:event_txtprofesionActionPerformed

    private void txtingreso_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingreso_mensualActionPerformed
        txtingreso_mensual.transferFocus();
    }//GEN-LAST:event_txtingreso_mensualActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
       txtbuscar.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    @Override
    public void paintComponent( java.awt.Graphics g )
    {
        super.paintComponent(g);
        
        if( Egoist.Swing.Animator.isBeingAnimated(this) == false )
            repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox<String> cboarea_telefono;
    private javax.swing.JComboBox<String> cbocedula;
    private javax.swing.JComboBox<String> cboemail;
    private javax.swing.JComboBox<String> cboestadocivil;
    private javax.swing.JComboBox<String> cbomes;
    private javax.swing.JComboBox<String> cbonivel_instruccion;
    private javax.swing.JComboBox<String> cboparentesco;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.ButtonGroup cne;
    private javax.swing.ButtonGroup embarazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.ButtonGroup pensionado;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txta_telefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtdiscapacidad;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtf_nacimiento;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtingreso_mensual;
    private javax.swing.JTextField txtn_cedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String gender1;
    private String gender2;
}

