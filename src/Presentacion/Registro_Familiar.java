package Presentacion;

import Ajustes.Validaciones;
import Datos.vjefe_familiar;
import Datos.vusuario;
import Logica.fjefe_familiar;
import Logica.fusuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Familiar extends javax.swing.JPanel {

    private int seleccionado;

    public Registro_Familiar() {
        initComponents();
        inhabilitar();
    }
    vusuario dts = new vusuario();
    fusuario func = new fusuario();
    Validaciones val = new Validaciones();
    private String accion = "guardar";

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

        btsiguiente.setEnabled(false);

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

        btsiguiente.setEnabled(true);

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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupodiscapacidad = new javax.swing.ButtonGroup();
        grupocne = new javax.swing.ButtonGroup();
        grupopensionado = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtidpersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        Cèdula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbocedula = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox<>();
        cboestado_civil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdia = new javax.swing.JTextField();
        cbomes = new javax.swing.JComboBox<>();
        txtaño = new javax.swing.JTextField();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        txtedad = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtn_cedula = new javax.swing.JTextField();
        txta_telefono = new javax.swing.JTextField();
        txtf_nacimiento = new javax.swing.JTextField();
        txtb_cuenta = new javax.swing.JTextField();
        txtn_rif = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtrif = new javax.swing.JTextField();
        cbocuenta = new javax.swing.JComboBox<>();
        cboarea = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbonivel_instruccion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtingreso_mensual = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        cboemail = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cboarea_telefono = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cboparentesco = new javax.swing.JComboBox<>();
        btnuevo = new javax.swing.JButton();
        btsiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 580));
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1100, 580));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("REGISTRO-JEFE DEL GRUPO FAMILIAR");

        jPanel2.setBackground(new java.awt.Color(255,255,255,50));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMaximumSize(new java.awt.Dimension(431, 463));
        jPanel2.setMinimumSize(new java.awt.Dimension(431, 463));

        txtidpersona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombres");

        txtnombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtnombreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtapellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Apellidos");

        txtcedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
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

        Cèdula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cèdula.setForeground(new java.awt.Color(204, 204, 204));
        Cèdula.setText("Cèdula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("F. Nacimiento");

        cbocedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbocedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", " E-" }));
        cbocedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocedulaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Sexo");

        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Masculino", "Femenino", "Sin Especificar" }));
        cbosexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexoActionPerformed(evt);
            }
        });

        cboestado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Soltero ( a )", "Casado ( a )", "Divorciado( a )", "Viudo( a )", "Cuncubino( a )" }));
        cboestado_civil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestado_civilActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Estado Civil");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Discapacidad");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Cne");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Pensionado");

        txtdia.setForeground(new java.awt.Color(204, 204, 204));
        txtdia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdia.setText("Dia");
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

        cbomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbomes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomesActionPerformed(evt);
            }
        });

        txtaño.setForeground(new java.awt.Color(204, 204, 204));
        txtaño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaño.setText("Año");
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

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        grupodiscapacidad.add(op1);
        op1.setText("SI");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        grupodiscapacidad.add(op2);
        op2.setText("NO");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        grupocne.add(op3);
        op3.setText("SI");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        grupocne.add(op4);
        op4.setText("NO");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op5.setBackground(new java.awt.Color(255,255,255,50)
        );
        grupopensionado.add(op5);
        op5.setText("SI");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        grupopensionado.add(op6);
        op6.setText("NO");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        txtedad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
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

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Edad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboestado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(op3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(op4))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(op1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(op2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(op5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(Cèdula)
                                    .addComponent(jLabel21))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcedula))
                                    .addComponent(txtapellido)
                                    .addComponent(txtnombre)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbomes, 0, 73, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtedad)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cèdula)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboestado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op1)
                            .addComponent(op2))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(op3)
                    .addComponent(op4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(op5)
                    .addComponent(op6))
                .addGap(20, 20, 20))
        );

        jPanel6.setBackground(new java.awt.Color(255,255,255,50));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos no obligatorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setMaximumSize(new java.awt.Dimension(306, 113));
        jPanel6.setMinimumSize(new java.awt.Dimension(306, 113));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nº de Cuenta");

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Rif.");

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

        cbocuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Banco de Venezuela", "Banesco", "BBVA", "Banco Mercantil", "Bicentenario", "BOD", "Banco del Tesoro", "Banco Exterior", "Venezolano de Crédito", "Banco Nacional de Crédito", "Bancaribe", "Banco Fondo Común", "Bancrecer", "Banplus", "Banco Plaza", "Banco Caroní" }));
        cbocuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocuentaActionPerformed(evt);
            }
        });

        cboarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "-0", "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9" }));
        cboarea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboarea, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnumero))
                .addGap(53, 53, 53))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboarea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255,255,255,50));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Profesion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(348, 122));
        jPanel3.setMinimumSize(new java.awt.Dimension(348, 122));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nivel Instrucciòn");

        cbonivel_instruccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Sin instrucciòn", "Basica", "Bachiller", "Tecnico Medio", "Tecnico Superior", "Universitario", "Post Grado" }));
        cbonivel_instruccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbonivel_instruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonivel_instruccionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Profesiòn");

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

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Ingreso Mensual");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbonivel_instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbonivel_instruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtingreso_mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255,255,255,50));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(431, 165));
        jPanel4.setMinimumSize(new java.awt.Dimension(431, 165));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Telefono Movil");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
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
        });

        cboemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboemail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "@HOTMAIL.COM", "@GMAIL.COM", "@YAHOO.COM", "@OUTLOOK.COM" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("E-mail");

        cboarea_telefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0416", "0426", "0414", "0424", "0412", "0251", "0253", " ", " " }));
        cboarea_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboarea_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboarea_telefonoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Parentesco");

        cboparentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Sin instrucciòn", "Basica", "Bachiller", "Tecnico Medio", "Tecnico Superior", "Universitario", "Post Grado" }));
        cboparentesco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboparentescoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboparentesco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboarea_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnuevo.setBackground(new java.awt.Color(255,255,255,125)
        );
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web(1).png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnuevo.setContentAreaFilled(false);
        btnuevo.setDoubleBuffered(true);
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

        btsiguiente.setBackground(new java.awt.Color(255,255,255,125)
        );
        btsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/login.png"))); // NOI18N
        btsiguiente.setText("Siguente");
        btsiguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btsiguiente.setContentAreaFilled(false);
        btsiguiente.setDoubleBuffered(true);
        btsiguiente.setOpaque(true);
        btsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btsiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btsiguienteMouseExited(evt);
            }
        });
        btsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiguienteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/1.png"))); // NOI18N
        jLabel1.setText("Consejo Comunal La Victoria");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel18.setText("Inicio");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel19.setText("Vigilancia");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/email-with-at.png"))); // NOI18N
        jLabel20.setText("Consejo_CMV@hotmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed
         vjefe_familiar dts = new vjefe_familiar();
         fjefe_familiar func = new fjefe_familiar();

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
           
           dts.setF_nacimiento(txtf_nacimiento.getText().concat(txtdia.getText()).concat(" "+(String)cbomes.getSelectedItem().toString().concat(" "+txtaño.getText())));
           
           dts.setEdad(txtedad.getText());
           
            s = cbosexo.getSelectedIndex();
           dts.setSexo((String)cbosexo.getItemAt(s).toString());
           
           s = cboestado_civil.getSelectedIndex();
           dts.setEstado_civil((String) cboestado_civil.getItemAt(s).toString());
           
            s = cboparentesco.getSelectedIndex();
           dts.setParentesco((String) cboparentesco.getItemAt(s).toString());
           
           dts.setDiscapacidad(gender);
           
           dts.setPension(gender1);
           
           dts.setCne(gender2); 
           
            s = cbonivel_instruccion.getSelectedIndex();
             dts.setNivel_instruccion((String)cbonivel_instruccion.getItemAt(s).toString());
             
           dts.setProfesion(txtprofesion.getText());

           dts.setIngreso_mensual(txtingreso_mensual.getText());

           dts.setEmail(txtemail.getText());
        
            s = cboemail.getSelectedIndex();
            dts.setFor_email((String)cboemail.getItemAt(s).toString());
            
            s = cboarea_telefono.getSelectedIndex();
            dts.setArea_movil((String)cboarea_telefono.getItemAt(s).toString());
             
            dts.setTelefono(txta_telefono.getText());
                    
            dts.setA_telefono(txta_telefono.getText().concat(cboarea_telefono.getSelectedItem().toString()).concat(txta_telefono.getText()));
            
            s = cbocuenta.getSelectedIndex();
            dts.setCuenta((String)cbocuenta.getItemAt(s).toString());
            
            dts.setNumero(txtnumero.getText());
            dts.setB_cuenta(txtb_cuenta.getText().concat((String)cbocuenta.getSelectedItem().toString()).concat(txtnumero.getText()));
            
            dts.setRif(txtrif.getText());
            s=cboarea.getSelectedIndex();
            dts.setArea((String)cboarea.getItemAt(s).toString());
            dts.setN_rif(txtn_rif.getText().concat(txtrif.getText()).concat((String)cboarea.getSelectedItem().toString()));
            
            
        
        if(cboemail.getSelectedItem().equals("--")){
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
        }else{
            if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                //JOptionPane.showMessageDialog(null, "el cliente fue registrado satisfactoriamente");
                inhabilitar();
                Ajustes.Aplicacion.callMainOption(new Registro_Familiar2());
            }

        }
        
        }
    }//GEN-LAST:event_btsiguienteActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtnombre.requestFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        txtapellido.requestFocus();
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        txtedad.requestFocus();
    }//GEN-LAST:event_txtedadActionPerformed

    private void cbocedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocedulaActionPerformed
        cbocedula.requestFocus();
    }//GEN-LAST:event_cbocedulaActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        txtcedula.requestFocus();
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
        txtdia.requestFocus();
    }//GEN-LAST:event_txtdiaActionPerformed

    private void cbomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomesActionPerformed
        cbomes.requestFocus();
    }//GEN-LAST:event_cbomesActionPerformed

    private void txtañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtañoActionPerformed
        txtaño.requestFocus();
    }//GEN-LAST:event_txtañoActionPerformed

    private void cbosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexoActionPerformed
        cbosexo.requestFocus();
    }//GEN-LAST:event_cbosexoActionPerformed

    private void cboestado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestado_civilActionPerformed
        cboestado_civil.requestFocus();
    }//GEN-LAST:event_cboestado_civilActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        gender2 = "No";
        op6.requestFocus();
    }//GEN-LAST:event_op6ActionPerformed

    private void cbocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocuentaActionPerformed
        cbocuenta.requestFocus();
    }//GEN-LAST:event_cbocuentaActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        txtnumero.requestFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtrifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrifActionPerformed
        txtrif.requestFocus();
    }//GEN-LAST:event_txtrifActionPerformed

    private void cboareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboareaActionPerformed
        cboarea.requestFocus();
    }//GEN-LAST:event_cboareaActionPerformed

    private void cbonivel_instruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonivel_instruccionActionPerformed
        cbonivel_instruccion.requestFocus();
    }//GEN-LAST:event_cbonivel_instruccionActionPerformed

    private void txtprofesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprofesionActionPerformed
        txtprofesion.requestFocus();
    }//GEN-LAST:event_txtprofesionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        txttelefono.requestFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        txtemail.requestFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void cboarea_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboarea_telefonoActionPerformed
        cboarea_telefono.requestFocus();

    }//GEN-LAST:event_cboarea_telefonoActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btsiguiente.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void txtingreso_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingreso_mensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingreso_mensualActionPerformed

    private void cboparentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboparentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboparentescoActionPerformed

    private void txtnombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseEntered

    }//GEN-LAST:event_txtnombreMouseEntered

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void btsiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseEntered
        val.limpiar1(btsiguiente);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsiguienteMouseEntered

    private void btsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseExited
        val.limpiar2(btsiguiente);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btsiguienteMouseExited

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtnombre, evt, 15);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed

    }//GEN-LAST:event_txtnombreMousePressed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtapellido, evt, 15);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyPressed
        val.teclasEspeciales(evt, txtapellido);
    }//GEN-LAST:event_txtapellidoKeyPressed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
        val.teclasEspeciales(evt, txtnombre);
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtedad, evt, 2);
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyPressed
        val.teclasEspeciales(evt, txtedad);
    }//GEN-LAST:event_txtedadKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtcedula, evt, 8);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        val.teclasEspeciales(evt, txtcedula);
    }//GEN-LAST:event_txtcedulaKeyPressed

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

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        val.espacioMaximo(txtemail, evt, 25);
    }//GEN-LAST:event_txtemailKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txttelefono, evt, 7);
    }//GEN-LAST:event_txttelefonoKeyTyped

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

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtnumero, evt, 25);
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtnumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyPressed
        val.teclasEspeciales(evt, txtnumero);
    }//GEN-LAST:event_txtnumeroKeyPressed

    private void txtrifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtrif, evt, 8);
    }//GEN-LAST:event_txtrifKeyTyped

    private void txtrifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyPressed
        val.teclasEspeciales(evt, txtrif);
    }//GEN-LAST:event_txtrifKeyPressed

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

    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (Egoist.Swing.Animator.isBeingAnimated(this) == false) {
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cèdula;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsiguiente;
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
    private javax.swing.ButtonGroup grupocne;
    private javax.swing.ButtonGroup grupodiscapacidad;
    private javax.swing.ButtonGroup grupopensionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JTextField txta_telefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtb_cuenta;
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

