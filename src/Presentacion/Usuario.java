/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vgrupo_familiar;
import Datos.vusuario;
import Logica.fgrupo_familiar;
import Logica.fusuario;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Usuario extends javax.swing.JPanel {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        mostrar("");
        inhabilitar();

    }
    
    
    
    vusuario dts = new vusuario();
    fusuario func = new fusuario();
    Validaciones val = new Validaciones();
    private String accion = "guardar";
    
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fusuario func = new fusuario();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            val.confColumna2(tablalistado);
            lbtotalregistro.setText("Total de registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    void inhabilitar() {
        txtidubicacion.setVisible(false);

        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtnombre_usuario.setEnabled(false);
        txtcontraceña.setEnabled(false);
        txtconfimar_contraceña.setEnabled(false);
        cbonivel_acceso.setEnabled(false);
        txtdia.setEnabled(false);
        cbomes.setEnabled(false);
        txtaño.setEnabled(false);
        cbosexo.setEnabled(false);
        txtmail.setEnabled(false);
        cbocorreo.setEnabled(false);
        cboarea_telefono.setEnabled(false);
        txttelefono.setEnabled(false);
        cboestado.setEnabled(false);
        cbociudad.setEnabled(false);
        cbomunicipio.setEnabled(false);
        cboparroquia.setEnabled(false);

        btguardar.setEnabled(false);
        btguardar.setEnabled(false);
        bteliminar.setEnabled(false);

        txtnombre.setText("");
        txtapellido.setText("");
        txtnombre_usuario.setText("");
        txtcontraceña.setText("");
        txtconfimar_contraceña.setText("");
        txtmail.setText("");
        txttelefono.setText("");

    }

    void habilitar() {
        txtidubicacion.setVisible(false);

        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtnombre_usuario.setEnabled(true);
        txtcontraceña.setEnabled(true);
        txtconfimar_contraceña.setEnabled(true);
        cbonivel_acceso.setEnabled(true);
        txtdia.setEnabled(true);
        cbomes.setEnabled(true);
        txtaño.setEnabled(true);
        cbosexo.setEnabled(true);
        txtmail.setEnabled(true);
        cbocorreo.setEnabled(true);
        cboarea_telefono.setEnabled(true);
        txttelefono.setEnabled(true);
        cboestado.setEnabled(true);
        cbociudad.setEnabled(true);
        cbomunicipio.setEnabled(true);
        cboparroquia.setEnabled(true);

        btguardar.setEnabled(true);
        btguardar.setEnabled(true);
        bteliminar.setEnabled(true);

        txtnombre.setText("");
        txtapellido.setText("");
        txtnombre_usuario.setText("");
        txtcontraceña.setText("");
        txtconfimar_contraceña.setText("");
        txtmail.setText("");
        txttelefono.setText("");

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbonivel_acceso = new javax.swing.JComboBox<>();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcontraceña = new javax.swing.JPasswordField();
        txtconfimar_contraceña = new javax.swing.JPasswordField();
        txtdia = new javax.swing.JTextField();
        cbomes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbocorreo = new javax.swing.JComboBox<>();
        txtmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboarea_telefono = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox();
        txtaño = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbociudad = new javax.swing.JComboBox();
        cbomunicipio = new javax.swing.JComboBox();
        cboparroquia = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtidubicacion = new javax.swing.JTextField();
        txtf_nacimiento = new javax.swing.JTextField();
        txta_telefono = new javax.swing.JTextField();
        txtf_email = new javax.swing.JTextField();
        cboprevilegio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btbuscar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lbtotalregistro = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(1200, 580));
        setMinimumSize(new java.awt.Dimension(1200, 580));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 580));

        jPanel1.setBackground(new java.awt.Color(255,255,255,50)
        );
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(373, 495));
        jPanel1.setMinimumSize(new java.awt.Dimension(373, 495));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre de usuario");

        txtnombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_usuarioActionPerformed(evt);
            }
        });
        txtnombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombre_usuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombre_usuarioKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nueva contraceña");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Nivel de Acesso");

        cbonivel_acceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Visitante", "Administrador", "Super Admin" }));
        cbonivel_acceso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbonivel_acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonivel_accesoActionPerformed(evt);
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

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Confirmar Contraceña");

        txtcontraceña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraceñaActionPerformed(evt);
            }
        });
        txtcontraceña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraceñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraceñaKeyTyped(evt);
            }
        });

        txtconfimar_contraceña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfimar_contraceñaActionPerformed(evt);
            }
        });
        txtconfimar_contraceña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconfimar_contraceñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconfimar_contraceñaKeyTyped(evt);
            }
        });

        txtdia.setForeground(new java.awt.Color(204, 204, 204));
        txtdia.setText("   Dia");
        txtdia.setSelectionEnd(7);
        txtdia.setSelectionStart(11);
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

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Correo Eletronico");

        cbocorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@hotmail.com", "@gmail.com\t", "@yahoo.com" }));
        cbocorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocorreoActionPerformed(evt);
            }
        });

        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });
        txtmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmailKeyTyped(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono Movil");

        cboarea_telefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0416", "0426", "0414", "0424", "0412", "0251", "0253", " ", " " }));
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

        cboestado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Amazonas", "Anzoategui", "Apure", "Aragua", "Barinas", "Bolivar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guarico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);
        cboestado.setPreferredSize(new java.awt.Dimension(36, 21));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        txtaño.setForeground(new java.awt.Color(204, 204, 204));
        txtaño.setText("   Año");
        txtaño.setSelectionEnd(7);
        txtaño.setSelectionStart(11);
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
        jLabel11.setText("Estado");

        cbociudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbociudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Atarigua", "Barquisimeto", "Bobare", "Cabudare", "Carora", "Cubiro", "Duaca", "Guárico", "Humocaro Alto", "Humocaro Bajo", "Quíbor", "Río Claro", "Sanare", "Santa Inés", "Sarare", "Siquisique", "Tocuyo" }));
        cbociudad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbociudad.setOpaque(false);
        cbociudad.setPreferredSize(new java.awt.Dimension(36, 21));
        cbociudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbociudadActionPerformed(evt);
            }
        });

        cbomunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbomunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Blanco", "Crespo", "Iribarren", "Jiménez", "Morán", "Palavecino", "Planas", "Torres", "Urdaneta" }));
        cbomunicipio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomunicipio.setOpaque(false);
        cbomunicipio.setPreferredSize(new java.awt.Dimension(36, 21));
        cbomunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomunicipioActionPerformed(evt);
            }
        });

        cboparroquia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboparroquia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Quebrada Honda de Guache", "Pio Tamayo", "Yacambú", "Freitez", "Jose Maria Blanco", "Anzoátegui", "Bolívar", "Guárico", "Hilario Luna y Luna", "Humocaro Bajo", "Humocaro Alto", "La Candelaria", "Morán", "Cabudare", "Jose Gregorio", "Agua Viva", "Buría", "Gustavo Vega", "Sarare", "Altagracia", "Antonio Díaz", "Camacaro", "Castañeda", "Cecilio Zubillaga", "Chiquinquira", "El Blanco", "Espinoza de los MonterosHeriberto Arrollo", "Lara", "Las Mercedes", "Manuel Morillo", "Montaña Verde", "Montes de Oca", "Reyes de Vargas", "Torres", "Trinidad Samuel", "Xaguas", "Siquisique", "San Miguel", "Moroturo", "Aguedo Felipe Alvarado", "Buena Vista", "Catedral", "Concepción", "El Cují", "Juárez", "Juan de Villegas", "Santa Rosa", "Tamaca", "Unión" }));
        cboparroquia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparroquia.setOpaque(false);
        cboparroquia.setPreferredSize(new java.awt.Dimension(36, 21));
        cboparroquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboparroquiaActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Ciudad");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Municipio");

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Parroquia");

        btnuevo.setBackground(new java.awt.Color(255,255,255,125)
        );
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web(1).png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnuevo.setContentAreaFilled(false);
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

        btguardar.setBackground(new java.awt.Color(255,255,255,125));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/arrows.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btguardar.setContentAreaFilled(false);
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

        cboprevilegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activado", "Desactivado", " " }));
        cboprevilegio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboprevilegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboprevilegioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(10, 10, 10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2)))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre_usuario)
                    .addComponent(txtcontraceña)
                    .addComponent(txtconfimar_contraceña)
                    .addComponent(cbociudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbomunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbosexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboparroquia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(cbocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbonivel_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboprevilegio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcontraceña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtconfimar_contraceña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbonivel_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboprevilegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbomunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Datos de usuario");

        jPanel2.setBackground(new java.awt.Color(255,255,255,40));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(526, 495));
        jPanel2.setMinimumSize(new java.awt.Dimension(526, 495));

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

        jPanel3.setBackground(new java.awt.Color(255 , 255, 255, 40));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.setGridColor(new java.awt.Color(204, 204, 204));
        tablalistado.setOpaque(false);
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        lbtotalregistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtotalregistro.setText("Registros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbtotalregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtotalregistro)
                .addContainerGap())
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbociudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbociudadActionPerformed
        cbociudad.transferFocus();
    }//GEN-LAST:event_cbociudadActionPerformed

    private void btnuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseClicked
        btnuevo.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.repaintScreen();

    }//GEN-LAST:event_btnuevoMouseClicked

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
        btnuevo.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseClicked

    }//GEN-LAST:event_btguardarMouseClicked

    private void txtdiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiaMouseClicked
        txtdia.setText("");
    }//GEN-LAST:event_txtdiaMouseClicked

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        txtapellido.transferFocus();
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtnombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_usuarioActionPerformed
        txtnombre_usuario.transferFocus();
    }//GEN-LAST:event_txtnombre_usuarioActionPerformed

    private void txtcontraceñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraceñaActionPerformed
        txtcontraceña.transferFocus();
    }//GEN-LAST:event_txtcontraceñaActionPerformed

    private void txtconfimar_contraceñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfimar_contraceñaActionPerformed
        txtconfimar_contraceña.transferFocus();
    }//GEN-LAST:event_txtconfimar_contraceñaActionPerformed

    private void cbonivel_accesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonivel_accesoActionPerformed
        cbonivel_acceso.transferFocus();
    }//GEN-LAST:event_cbonivel_accesoActionPerformed

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
        txtdia.transferFocus();
    }//GEN-LAST:event_txtdiaActionPerformed

    private void cbomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomesActionPerformed
        cbomes.transferFocus();
    }//GEN-LAST:event_cbomesActionPerformed

    private void txtañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtañoActionPerformed
        txtaño.transferFocus();
    }//GEN-LAST:event_txtañoActionPerformed

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed
        cbosexo.transferFocus();
    }//GEN-LAST:event_cbosexoActionPerformed

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        txtmail.transferFocus();
    }//GEN-LAST:event_txtmailActionPerformed

    private void cbocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocorreoActionPerformed
        cbocorreo.transferFocus();
    }//GEN-LAST:event_cbocorreoActionPerformed

    private void cboarea_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboarea_telefonoActionPerformed
        cboarea_telefono.transferFocus();
    }//GEN-LAST:event_cboarea_telefonoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        txttelefono.transferFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        cboestado.transferFocus();
    }//GEN-LAST:event_cboestadoActionPerformed

    private void cbomunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomunicipioActionPerformed
        cbomunicipio.transferFocus();
    }//GEN-LAST:event_cbomunicipioActionPerformed

    private void cboparroquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboparroquiaActionPerformed
        cboparroquia.transferFocus();
    }//GEN-LAST:event_cboparroquiaActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed

        

        dts.setNombre(txtnombre.getText());
        
        dts.setApellido(txtapellido.getText());
        
        dts.setLogin(txtnombre_usuario.getText());
        
        dts.setPasword(txtcontraceña.getText());

        int selecionado = cbonivel_acceso.getSelectedIndex();
        dts.setNivel_acceso((String) cbonivel_acceso.getItemAt(selecionado));
        
        dts.setDia(txtdia.getText());
        
        selecionado = cbomes.getSelectedIndex();
        dts.setMes((String) cbomes.getItemAt(selecionado).toString());
        
        dts.setAño(txtaño.getText());
        
          dts.setF_nacimiento(txtf_nacimiento.getText().concat(txtdia.getText()).concat(" "+(String)cbomes.getSelectedItem().toString().concat(" "+txtaño.getText())));
        
        
        selecionado = cbosexo.getSelectedIndex();
        dts.setSexo((String) cbosexo.getItemAt(selecionado).toString());
        
        selecionado = cbocorreo.getSelectedIndex();
        
        dts.setEmail(txtmail.getText());
        
        dts.setFor_email((String)cbocorreo.getItemAt(selecionado).toString());
        dts.setF_email(txtf_email.getText().concat(txtmail.getText()).concat((String)cbocorreo.getSelectedItem().toString()));
       
        dts.setTelefono(txttelefono.getText());
        
        selecionado = cboarea_telefono.getSelectedIndex();
        dts.setArea_movil((String)cboarea_telefono.getItemAt(selecionado).toString());
        
          dts.setA_telefono(txta_telefono.getText().concat(cboarea_telefono.getSelectedItem().toString()).concat(txttelefono.getText()));
    
        selecionado = cboprevilegio.getSelectedIndex();
        dts.setPrevilegio((String)cboprevilegio.getItemAt(selecionado).toString());
        
        selecionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(selecionado));
        
        selecionado = cbociudad.getSelectedIndex();
        dts.setCiudad((String) cbociudad.getItemAt(selecionado));
        
        selecionado = cbomunicipio.getSelectedIndex();
        dts.setMunicipio((String) cbomunicipio.getItemAt(selecionado));
        
        selecionado = cboparroquia.getSelectedIndex();
        dts.setParroquia((String) cboparroquia.getItemAt(selecionado));

        if (cboparroquia.getSelectedItem().equals("--")) {
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(txtnombre_usuario);
            val.valEsp(txtcontraceña);
            val.valEsp(txtconfimar_contraceña);
            val.valEsp(txtdia);
            val.valEsp(cbomes);
            val.valEsp(txtaño);
            val.valEsp(txtmail);
            val.valEsp(txttelefono);
            val.valEsp(cbonivel_acceso);
            val.valEsp(cbosexo);
            val.valEsp(cboprevilegio);
            val.valEsp(cboestado);
            val.valEsp(cbociudad);
            val.valEsp(cbomunicipio);
            val.valEsp(cboparroquia);
            return;
        }else{
       if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(null, "El usuario fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }
          }
          else if (accion.equals("editar")){
            dts.setIdubicacion(Integer.parseInt(txtidubicacion.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "El usuario fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
          }}

    }//GEN-LAST:event_btguardarActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        val.teclasEspeciales(evt, txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtapellido, evt, 11);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased

    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased

    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        val.teclasEspeciales(evt, txtapellido);
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtnombre, evt, 11);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtnombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_usuarioKeyTyped
        val.espacioMaximo(txtnombre_usuario, evt, 15);
    }//GEN-LAST:event_txtnombre_usuarioKeyTyped

    private void txtnombre_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombre_usuarioKeyPressed
        val.teclasEspeciales(evt, txtnombre_usuario);

    }//GEN-LAST:event_txtnombre_usuarioKeyPressed

    private void txtcontraceñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraceñaKeyTyped
        val.espacioMaximo(txtcontraceña, evt, 20);
    }//GEN-LAST:event_txtcontraceñaKeyTyped

    private void txtcontraceñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraceñaKeyPressed
        val.teclasEspeciales(evt, txtcontraceña);

    }//GEN-LAST:event_txtcontraceñaKeyPressed

    private void txtconfimar_contraceñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfimar_contraceñaKeyPressed
        val.teclasEspeciales(evt, txtconfimar_contraceña);

    }//GEN-LAST:event_txtconfimar_contraceñaKeyPressed

    private void txtdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtdia, evt, 2);
    }//GEN-LAST:event_txtdiaKeyTyped

    private void txtdiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyPressed
        val.teclasEspeciales(evt, txtdia);
    }//GEN-LAST:event_txtdiaKeyPressed

    private void txtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtaño, evt, 4);
    }//GEN-LAST:event_txtañoKeyTyped

    private void txtañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyPressed
        val.teclasEspeciales(evt, txtaño);
    }//GEN-LAST:event_txtañoKeyPressed

    private void txtmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailKeyPressed
        val.teclasEspeciales(evt, txtmail);
    }//GEN-LAST:event_txtmailKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txttelefono, evt, 7);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        val.teclasEspeciales(evt, txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtconfimar_contraceñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfimar_contraceñaKeyTyped
        val.espacioMaximo(txtconfimar_contraceña, evt, 20);
    }//GEN-LAST:event_txtconfimar_contraceñaKeyTyped

    private void txtmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailKeyTyped
        val.espacioMaximo(txtmail, evt, 25);
    }//GEN-LAST:event_txtmailKeyTyped

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
      if (!txtidubicacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar el Usuario?", "Confirmar", 2);

            if (confirmacion == 0) {
                fusuario func = new fusuario();
                vusuario dts = new  vusuario();

                dts.setIdubicacion(Integer.parseInt(txtidubicacion.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }

        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btbuscarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btguardar.setText("Editar");
        habilitar();
        bteliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtidubicacion.setText(tablalistado.getValueAt(fila, 0).toString());
        
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 1).toString());
        
        cbociudad.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
        
        cbomunicipio.setSelectedItem(tablalistado.getValueAt(fila, 3).toString());
        
        cboparroquia.setSelectedItem(tablalistado.getValueAt(fila, 4).toString());
        
        
        txtnombre.setText(tablalistado.getValueAt(fila, 5).toString());
        
        txtapellido.setText(tablalistado.getValueAt(fila, 6).toString());
        
        txtnombre_usuario.setText(tablalistado.getValueAt(fila, 7).toString());
        
        txtcontraceña.setText(tablalistado.getValueAt(fila, 8).toString());
        
        cbonivel_acceso.setSelectedItem(tablalistado.getValueAt(fila, 9).toString());
        
        txtdia.setText(tablalistado.getValueAt(fila, 10).toString());
        
        cbomes.setSelectedItem(tablalistado.getValueAt(fila, 11).toString());
        
        txtaño.setText(tablalistado.getValueAt(fila, 12).toString());
        
        //txtf_nacimiento.setText(tablalistado.getValueAt(fila, 13).toString());
        
        cbosexo.setSelectedItem(tablalistado.getValueAt(fila, 14).toString());
        
        txtmail.setText(tablalistado.getValueAt(fila, 15).toString());
        
        cbocorreo.setSelectedItem(tablalistado.getValueAt(fila, 16).toString());
        
        //txtf_email.setText(tablalistado.getValueAt(fila, 17).toString());
        
        cboarea_telefono.setSelectedItem(tablalistado.getValueAt(fila, 18).toString());
        
        txttelefono.setText(tablalistado.getValueAt(fila, 19).toString());
        
        //txta_telefono.setText(tablalistado.getValueAt(fila, 20).toString());
        
        cboprevilegio.setSelectedItem(tablalistado.getValueAt(fila, 21).toString());
        
        
        

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void cboprevilegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboprevilegioActionPerformed
        cboprevilegio.transferFocus();
    }//GEN-LAST:event_cboprevilegioActionPerformed

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered
        val.limpiar1(btbuscar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseEntered

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
        val.limpiar2(btbuscar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscarMouseExited

    private void bteliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseEntered
        val.limpiar1(bteliminar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseEntered

    private void bteliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseExited
        val.limpiar2(bteliminar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseExited

    private void btsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseEntered
        val.limpiar1(btsalir);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseEntered

    private void btsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseExited
         val.limpiar2(btsalir);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseExited

    private void txtañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtañoMouseClicked
        txtaño.setText("");
    }//GEN-LAST:event_txtañoMouseClicked
    
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
    private javax.swing.JComboBox cbociudad;
    private javax.swing.JComboBox<String> cbocorreo;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox<String> cbomes;
    private javax.swing.JComboBox cbomunicipio;
    private javax.swing.JComboBox<String> cbonivel_acceso;
    private javax.swing.JComboBox cboparroquia;
    private javax.swing.JComboBox<String> cboprevilegio;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txta_telefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JPasswordField txtconfimar_contraceña;
    private javax.swing.JPasswordField txtcontraceña;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtf_email;
    private javax.swing.JTextField txtf_nacimiento;
    private javax.swing.JTextField txtidubicacion;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre_usuario;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
