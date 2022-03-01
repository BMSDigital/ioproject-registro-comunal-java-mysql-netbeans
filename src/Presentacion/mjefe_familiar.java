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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class mjefe_familiar extends javax.swing.JPanel {

    /**
     * Creates new form mjefe_familiar
     */
    public mjefe_familiar() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    vjefe_familiar dts = new vjefe_familiar();
    fjefe_familiar func = new fjefe_familiar();
    Validaciones val = new Validaciones();
    private String accion = "guardar";

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fjefe_familiar func = new fjefe_familiar();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            val.confColumna(tablalistado);
            lbtotalregistro.setText("Total de registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btbuscar1 = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbtotalregistro = new javax.swing.JLabel();
        cbocedula = new javax.swing.JComboBox<>();
        txtdia = new javax.swing.JTextField();
        cbomes = new javax.swing.JComboBox<>();
        cbosexo = new javax.swing.JComboBox<>();
        cboestado_civil = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbonivel_instruccion = new javax.swing.JComboBox<>();
        txtprofesion = new javax.swing.JTextField();
        txtingreso_mensual = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtaño = new javax.swing.JTextField();
        cboemail = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        cboarea_telefono = new javax.swing.JComboBox<>();
        txtidpersona = new javax.swing.JTextField();
        btguardar = new javax.swing.JButton();
        cboparentesco = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        btnuevo = new javax.swing.JButton();
        txtn_cedula = new javax.swing.JTextField();
        txtf_nacimiento = new javax.swing.JTextField();
        txta_telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbocuenta = new javax.swing.JComboBox<>();
        txtnumero = new javax.swing.JTextField();
        txtrif = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cboarea = new javax.swing.JComboBox<>();
        txtb_cuenta = new javax.swing.JTextField();
        txtn_rif = new javax.swing.JTextField();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        op5 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1135, 600));
        setMinimumSize(new java.awt.Dimension(1135, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1135, 600));

        jPanel2.setBackground(new java.awt.Color(255, 175, 17,0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Jefe Familiar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setOpaque(false);

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

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
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

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha Nac");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Edad");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Sexo");

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Estado civil");

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color( 255, 255, 255, 30 ));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6", "Título 7", "Título 8"
            }
        ));
        tablalistado.setOpaque(false);
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buscar");

        btbuscar1.setBackground(new java.awt.Color(255 , 255, 255, 125));
        btbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web (5).png"))); // NOI18N
        btbuscar1.setText("Buscar");
        btbuscar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btbuscar1.setContentAreaFilled(false);
        btbuscar1.setDoubleBuffered(true);
        btbuscar1.setMaximumSize(new java.awt.Dimension(61, 25));
        btbuscar1.setMinimumSize(new java.awt.Dimension(61, 25));
        btbuscar1.setOpaque(true);
        btbuscar1.setSelected(true);
        btbuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btbuscar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btbuscar1MouseExited(evt);
            }
        });
        btbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscar1ActionPerformed(evt);
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

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/1.png"))); // NOI18N
        jLabel14.setText("Consejo Comunal La Victoria");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/email-with-at.png"))); // NOI18N
        jLabel20.setText("Consejo_CMV@hotmail.com");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel21.setText("Inicio");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel22.setText("Vigilancia");

        lbtotalregistro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbtotalregistro.setText("Total Registros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel21)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel22))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbtotalregistro)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14)
                    .addComponent(lbtotalregistro))
                .addGap(10, 10, 10))
        );

        cbocedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbocedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", " E-" }));
        cbocedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Mujer", "Hombre", "Otro" }));
        cbosexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexoActionPerformed(evt);
            }
        });

        cboestado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Soltero/a", "Comprometido/a", "Casado/a", "Divorciado/a", "Viudo/a" }));
        cboestado_civil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestado_civilActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Grado de Instrucción");

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Profesión");

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Ing. Mensual");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Correo Eletronico");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Telefono Movil");

        cbonivel_instruccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Sin instrucciòn", "Basica", "Bachiller", "Tecnico Medio", "Tecnico Superior", "Universitario", "Post Grado" }));
        cbonivel_instruccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtprofesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprofesionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprofesionKeyTyped(evt);
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

        txtaño.setForeground(new java.awt.Color(204, 204, 204));
        txtaño.setText("   Año");
        txtaño.setSelectionEnd(7);
        txtaño.setSelectionStart(11);
        txtaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtañoMouseClicked(evt);
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

        cboemail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@hotmail.com", "@gmail.com\t", "@yahoo.com" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboemailActionPerformed(evt);
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

        cboarea_telefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0416", "0426", "0414", "0424", "0412", "0251", "0253" }));
        cboarea_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboarea_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboarea_telefonoActionPerformed(evt);
            }
        });

        btguardar.setBackground(new java.awt.Color(255,255,255,125));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/arrows.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btguardar.setContentAreaFilled(false);
        btguardar.setOpaque(true);
        btguardar.addMouseListener(new java.awt.event.MouseAdapter() {
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

        cboparentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Padre", "Madre", "Hijos", "Tio", "Nieto ", "Abuelo ", "Suegros", "Yerno", "Primos ", "Sobrino" }));
        cboparentesco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboparentescoActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Parentesco");

        btnuevo.setBackground(new java.awt.Color(255,255,255,125)
        );
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web(1).png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnuevo.setContentAreaFilled(false);
        btnuevo.setOpaque(true);
        btnuevo.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Nº de Cuenta");

        cbocuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Banco de Venezuela", "Banesco", "BBVA", "Banco Mercantil", "Bicentenario", "BOD", "Banco del Tesoro", "Banco Exterior", "Venezolano de Crédito", "Banco Nacional de Crédito", "Bancaribe", "Banco Fondo Común", "Bancrecer", "Banplus", "Banco Plaza", "Banco Caroní" }));
        cbocuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocuentaActionPerformed(evt);
            }
        });

        txtnumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });

        txtrif.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtrif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrifActionPerformed(evt);
            }
        });
        txtrif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrifKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrifKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Rif.");

        cboarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "-0", "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9" }));
        cboarea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboareaActionPerformed(evt);
            }
        });

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup1.add(op1);
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setSelected(true);
        op1.setText("SI");
        op1.setOpaque(false);
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op2);
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("NO");
        op2.setOpaque(false);
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup2.add(op3);
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("SI");
        op3.setOpaque(false);
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(op4);
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("NO");
        op4.setOpaque(false);
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        buttonGroup3.add(op6);
        op6.setForeground(new java.awt.Color(255, 255, 255));
        op6.setText("NO");
        op6.setOpaque(false);
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        op5.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup3.add(op5);
        op5.setForeground(new java.awt.Color(255, 255, 255));
        op5.setText("SI");
        op5.setOpaque(false);
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Discapacidad");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Cne");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Pensionado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtdia)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcedula))
                                        .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboestado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbonivel_instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtprofesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtingreso_mensual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(op3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(op4))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(op1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(op2)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(op5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op6))
                                    .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cbocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtnumero)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cboarea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(78, 78, 78)
                                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(btguardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnuevo)))))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(cbonivel_instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboestado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboarea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op1)
                                    .addComponent(op2)
                                    .addComponent(jLabel25))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op3)
                                    .addComponent(op4)
                                    .addComponent(jLabel26))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op5)
                                    .addComponent(op6)
                                    .addComponent(jLabel27)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btguardar)
                                    .addComponent(btnuevo))))))
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
void inhabilitar() {
        txtidpersona.setVisible(false);

        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtedad.setEnabled(false);
        txtcedula.setEnabled(false);
        cbocedula.setEnabled(false);
        txtdia.setEnabled(false);
        cbomes.setEnabled(false);
        txtaño.setEnabled(false);
        cbosexo.setEnabled(false);
        cboestado_civil.setEnabled(false);
        txtdia.setEnabled(false);
        cbomes.setEnabled(false);
        txtaño.setEnabled(false);
        cbosexo.setEnabled(false);

        op1.setEnabled(false);
        op2.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        op5.setEnabled(false);
        op6.setEnabled(false);

        cbocuenta.setEnabled(false);
        txtnumero.setEnabled(false);
        txtrif.setEnabled(false);
        cboarea.setEnabled(false);
        cbonivel_instruccion.setEnabled(false);
        txtprofesion.setEnabled(false);
        txttelefono.setEnabled(false);
        cboarea_telefono.setEnabled(false);
        txtemail.setEnabled(false);
        cboemail.setEnabled(false);
        txtingreso_mensual.setEnabled(false);
        cboparentesco.setEnabled(false);

        btguardar.setEnabled(false);

        txtidpersona.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtcedula.setText("");
        txtdia.setText("");
        txtaño.setText("");
        txtnumero.setText("");
        txtrif.setText("");
        txtprofesion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
    }

    void habilitar() {
        txtidpersona.setVisible(false);

        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtedad.setEnabled(true);
        txtcedula.setEnabled(true);
        cbocedula.setEnabled(true);
        txtdia.setEnabled(true);
        cbomes.setEnabled(true);
        txtaño.setEnabled(true);
        cbosexo.setEnabled(true);
        cboestado_civil.setEnabled(true);
        txtdia.setEnabled(true);
        cbomes.setEnabled(true);
        txtaño.setEnabled(true);
        cbosexo.setEnabled(true);

        op1.setEnabled(true);
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
        op5.setEnabled(true);
        op6.setEnabled(true);

        cbocuenta.setEnabled(true);
        txtnumero.setEnabled(true);
        txtrif.setEnabled(true);
        cboarea.setEnabled(true);
        cbonivel_instruccion.setEnabled(true);
        txtprofesion.setEnabled(true);

        txttelefono.setEnabled(true);
        cboarea_telefono.setEnabled(true);
        txtemail.setEnabled(true);
        cboemail.setEnabled(true);
        txtingreso_mensual.setEnabled(true);
        cboparentesco.setEnabled(true);

        btguardar.setEnabled(true);

        txtidpersona.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtcedula.setText("");
        txtdia.setText("");
        txtaño.setText("");
        txtnumero.setText("");
        txtrif.setText("");
        txtprofesion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
    }

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        val.teclasEspeciales(evt, txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtnombre, evt, 15);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        val.teclasEspeciales(evt, txtapellido);
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtapellido, evt, 15);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        val.teclasEspeciales(evt, txtcedula);
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtcedula, evt, 8);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
        val.teclasEspeciales(evt, txtedad);
    }//GEN-LAST:event_txtedadKeyPressed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtedad, evt, 2);
    }//GEN-LAST:event_txtedadKeyTyped

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btguardar.setText("Editar");
        habilitar();
        bteliminar.setEnabled(true);
        accion="editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
         
        txtidpersona.setText(tablalistado.getValueAt(fila, 0).toString());
        txtnombre.setText(tablalistado.getValueAt(fila, 1).toString());
        txtapellido.setText(tablalistado.getValueAt(fila, 2).toString());
        
        txtcedula.setText(tablalistado.getValueAt(fila, 3).toString());
        cbocedula.setSelectedItem(tablalistado.getValueAt(fila, 4).toString());
       // txtn_cedula.setText(tablalistado.getValueAt(fila, 5).toString());
        
        txtdia.setText(tablalistado.getValueAt(fila, 6).toString());
        cbomes.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        txtaño.setText(tablalistado.getValueAt(fila, 8).toString());
       // txtf_nacimiento.setText(tablalistado.getValueAt(fila, 9).toString());
        txtedad.setText(tablalistado.getValueAt(fila, 10).toString());
        
        cbosexo.setSelectedItem(tablalistado.getValueAt(fila, 11).toString());
        
        cboestado_civil.setSelectedItem(tablalistado.getValueAt(fila, 12).toString());
        cboparentesco.setSelectedItem(tablalistado.getValueAt(fila, 13).toString());
        //txtdiscapacidad.setText(tablalistado.getValueAt(fila, 14).toString());
        op1.setText(tablalistado.getValueAt(fila, 14).toString());
        //op3.setText(tablalistado.getValueAt(fila, 15).toString());
        //op5.setText(tablalistado.getValueAt(fila, 16).toString());
        cbonivel_instruccion.setSelectedItem(tablalistado.getValueAt(fila, 17).toString());
        txtprofesion.setText(tablalistado.getValueAt(fila, 18).toString());
        txtingreso_mensual.setText(tablalistado.getValueAt(fila, 19).toString());
        txtemail.setText(tablalistado.getValueAt(fila, 20).toString());
        cboemail.setSelectedItem(tablalistado.getValueAt(fila, 21).toString());
        
        txttelefono.setText(tablalistado.getValueAt(fila, 22).toString());
        cboarea_telefono.setSelectedItem(tablalistado.getValueAt(fila, 23).toString());
        //txta_telefono.setText(tablalistado.getValueAt(fila, 24).toString());
        
        cbocuenta.setSelectedItem(tablalistado.getValueAt(fila, 25).toString());
        txtnumero.setText(tablalistado.getValueAt(fila, 26).toString());
        //txtb_cuenta.setText(tablalistado.getValueAt(fila, 27).toString());
        txtrif.setText(tablalistado.getValueAt(fila, 28).toString());
        cboarea.setSelectedItem(tablalistado.getValueAt(fila, 29).toString());
        //txtn_rif.setText(tablalistado.getValueAt(fila, 30).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btbuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar1MouseEntered
        val.limpiar1(btbuscar1);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscar1MouseEntered

    private void btbuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar1MouseExited
        val.limpiar2(btbuscar1);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btbuscar1MouseExited

    private void btbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar1ActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btbuscar1ActionPerformed

    private void bteliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseEntered
        val.limpiar1(bteliminar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseEntered

    private void bteliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseExited
        val.limpiar2(bteliminar);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_bteliminarMouseExited

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
         if (!txtidpersona.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar el jefe familiar", "Confirmar", 2);

            if (confirmacion == 0) {
                fjefe_familiar func = new fjefe_familiar();
                vjefe_familiar dts = new vjefe_familiar();

                dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }

        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btsalirMouseClicked

    private void btsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseEntered
        val.limpiar1(btsalir);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseEntered

    private void btsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseExited
        val.limpiar2(btsalir);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsalirMouseExited

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void txtdiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiaMouseClicked
        txtdia.setText("");
    }//GEN-LAST:event_txtdiaMouseClicked

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed

    }//GEN-LAST:event_txtdiaActionPerformed

    private void txtdiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyPressed
        val.teclasEspeciales(evt, txtdia);
    }//GEN-LAST:event_txtdiaKeyPressed

    private void txtdiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdiaKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtdia, evt, 2);
    }//GEN-LAST:event_txtdiaKeyTyped

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed

    }//GEN-LAST:event_cbosexoActionPerformed

    private void cboestado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestado_civilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestado_civilActionPerformed

    private void txtprofesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyPressed
        val.teclasEspeciales(evt, txtprofesion);
    }//GEN-LAST:event_txtprofesionKeyPressed

    private void txtprofesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtprofesion, evt, 25);
    }//GEN-LAST:event_txtprofesionKeyTyped

    private void txtingreso_mensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingreso_mensualKeyPressed
        val.teclasEspeciales(evt, txtingreso_mensual);
    }//GEN-LAST:event_txtingreso_mensualKeyPressed

    private void txtingreso_mensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingreso_mensualKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtingreso_mensual, evt, 8);
    }//GEN-LAST:event_txtingreso_mensualKeyTyped

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        val.teclasEspeciales(evt, txtemail);
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        val.espacioMaximo(txtemail, evt, 35);
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtañoMouseClicked
        txtaño.setText("");
    }//GEN-LAST:event_txtañoMouseClicked

    private void txtañoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyPressed
        val.teclasEspeciales(evt, txtaño);
    }//GEN-LAST:event_txtañoKeyPressed

    private void txtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtaño, evt, 4);
    }//GEN-LAST:event_txtañoKeyTyped

    private void cboemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboemailActionPerformed

    }//GEN-LAST:event_cboemailActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed

    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        val.teclasEspeciales(evt, txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txttelefono, evt, 7);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void cboarea_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboarea_telefonoActionPerformed

    }//GEN-LAST:event_cboarea_telefonoActionPerformed

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        vjefe_familiar dts = new vjefe_familiar();
        fjefe_familiar func = new fjefe_familiar();

        dts.setNombre(txtnombre.getText());

        dts.setApellido(txtapellido.getText());

        dts.setCedula(txtcedula.getText());

        int s = cbocedula.getSelectedIndex();
        dts.setNacionalidad((String) cbocedula.getItemAt(s).toString());

        dts.setN_cedula(txtn_cedula.getText().concat((String) cbocedula.getSelectedItem().toString()).concat(txtcedula.getText()));

        dts.setDia(txtdia.getText());

        s = cbomes.getSelectedIndex();
        dts.setMes((String) cbomes.getItemAt(s).toString());

        dts.setAño(txtaño.getText());

        dts.setF_nacimiento(txtf_nacimiento.getText().concat(txtdia.getText()).concat(" " + (String) cbomes.getSelectedItem().toString().concat(" " + txtaño.getText())));

        dts.setEdad(txtedad.getText());

        s = cbosexo.getSelectedIndex();
        dts.setSexo((String) cbosexo.getItemAt(s).toString());

        s = cboestado_civil.getSelectedIndex();
        dts.setEstado_civil((String) cboestado_civil.getItemAt(s).toString());

        s = cboparentesco.getSelectedIndex();
        dts.setParentesco((String) cboparentesco.getItemAt(s).toString());
       
        dts.setDiscapacidad(gender);

        dts.setPension(gender1);

        dts.setCne(gender2);

        s = cbonivel_instruccion.getSelectedIndex();
        dts.setNivel_instruccion((String) cbonivel_instruccion.getItemAt(s).toString());

        dts.setProfesion(txtprofesion.getText());

        dts.setIngreso_mensual(txtingreso_mensual.getText());

        dts.setEmail(txtemail.getText());

        s = cboemail.getSelectedIndex();
        dts.setFor_email((String) cboemail.getItemAt(s).toString());

        s = cboarea_telefono.getSelectedIndex();
        dts.setArea_movil((String) cboarea_telefono.getItemAt(s).toString());

        dts.setTelefono(txttelefono.getText());

        dts.setA_telefono(txta_telefono.getText().concat(cboarea_telefono.getSelectedItem().toString()).concat(txta_telefono.getText()));

        s = cbocuenta.getSelectedIndex();
        dts.setCuenta((String) cbocuenta.getItemAt(s).toString());

        dts.setNumero(txtnumero.getText());
        dts.setB_cuenta(txtb_cuenta.getText().concat((String) cbocuenta.getSelectedItem().toString()).concat(txtnumero.getText()));

        dts.setRif(txtrif.getText());
        s = cboarea.getSelectedIndex();
        dts.setArea((String) cboarea.getItemAt(s).toString());
        dts.setN_rif(txtn_rif.getText().concat(txtrif.getText()).concat((String) cboarea.getSelectedItem().toString()));

        if (txttelefono.getText().equals("--")) {
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(txtedad);
            val.valEsp(txtcedula);
            val.valEsp(txtdia);
            val.valEsp(cbomes);
            val.valEsp(txtaño);
            val.valEsp(cbosexo);
            val.valEsp(cboestado_civil);
            val.valEsp(cbocuenta);
            val.valEsp(txtnumero);

            val.valEsp(txtrif);
            val.valEsp(cboarea);

            val.valEsp(cbonivel_instruccion);
            val.valEsp(txtprofesion);
            val.valEsp(txtingreso_mensual);

            val.valEsp(cboarea_telefono);
            val.valEsp(txttelefono);
            val.valEsp(cboparentesco);

            val.valEsp(txtemail);
            val.valEsp(cboemail);
            return;
        } else {
            //txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
            if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(null, "El jefe familiar fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }
          }
          else if (accion.equals("editar")){
            dts.setIdpersona(Integer.parseInt(txtidpersona.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "El jefe familiar fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }}
    }//GEN-LAST:event_btguardarActionPerformed

    private void cboparentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboparentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboparentescoActionPerformed

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void cbocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocuentaActionPerformed
        cbocuenta.requestFocus();
    }//GEN-LAST:event_cbocuentaActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        txtnumero.requestFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtnumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyPressed
        val.teclasEspeciales(evt, txtnumero);
    }//GEN-LAST:event_txtnumeroKeyPressed

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtnumero, evt, 25);
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtrifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrifActionPerformed
        txtrif.requestFocus();
    }//GEN-LAST:event_txtrifActionPerformed

    private void txtrifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyPressed
        val.teclasEspeciales(evt, txtrif);
    }//GEN-LAST:event_txtrifKeyPressed

    private void txtrifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtrif, evt, 8);
    }//GEN-LAST:event_txtrifKeyTyped

    private void cboareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboareaActionPerformed
        cboarea.requestFocus();
    }//GEN-LAST:event_cboareaActionPerformed

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

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        gender2 = "No";
        op6.requestFocus();
    }//GEN-LAST:event_op6ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        gender2 = "Si";
    }//GEN-LAST:event_op5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar1;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboarea;
    private javax.swing.JComboBox<String> cboarea_telefono;
    private javax.swing.JComboBox<String> cbocedula;
    private javax.swing.JComboBox<String> cbocuenta;
    private javax.swing.JComboBox<String> cboemail;
    private javax.swing.JComboBox<String> cboestado_civil;
    private javax.swing.JComboBox<String> cbomes;
    private javax.swing.JComboBox<String> cbonivel_instruccion;
    private javax.swing.JComboBox<String> cboparentesco;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txta_telefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtb_cuenta;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtf_nacimiento;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtingreso_mensual;
    private javax.swing.JTextField txtn_cedula;
    private javax.swing.JTextField txtn_rif;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txtrif;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String gender1;
    private String gender2;

}
