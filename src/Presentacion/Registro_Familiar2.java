/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vsituacion_economica;
import Logica.fsituacion_economica;
import javax.swing.JOptionPane;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Registro_Familiar2 extends javax.swing.JPanel {

    /**
     * Creates new form Registro_Familiar2
     */
    public Registro_Familiar2() {
        initComponents();
        inhabilitar();
    }
    vsituacion_economica dts = new vsituacion_economica();
    fsituacion_economica func = new fsituacion_economica();
    Validaciones val = new Validaciones();
    private String accion = "guardar";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cboparroquia = new javax.swing.JComboBox();
        cboestado = new javax.swing.JComboBox();
        cbomunicipio = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cbociudad = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cbotrabajas = new javax.swing.JComboBox<>();
        cboopciontrabajas = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cboopciontrabajas1 = new javax.swing.JComboBox<>();
        cboventas_de = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cboingresofamiliar = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtingresomensual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        check7 = new javax.swing.JCheckBox();
        jLabel55 = new javax.swing.JLabel();
        check10 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        check11 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        check6 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        txtcual = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        txtidpersona = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        cbosituacion_exclusion = new javax.swing.JComboBox<>();
        cbocantidad = new javax.swing.JComboBox<>();
        txtcual2 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        btsiguiente = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnuevo1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 590));
        setMinimumSize(new java.awt.Dimension(1200, 590));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 590));

        jPanel1.setBackground(new java.awt.Color(255,255,255,50));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        cboparroquia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboparroquia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Quebrada Honda de Guache", "Pio Tamayo", "Yacambú", "---", "Freitez", "Jose Maria Blanco", "---", "Anzoátegui", "Bolívar", "Guárico", "Hilario Luna y Luna", "Humocaro Bajo", "Humocaro Alto", "La Candelaria", "Morán", "---", "Cabudare", "Jose Gregorio", "Agua Viva", "---", "Buría", "Gustavo Vega", "Sarare", "---", "Altagracia", "Antonio Díaz", "Camacaro", "Castañeda", "Cecilio Zubillaga", "Chiquinquira", "El Blanco", "Espinoza de los MonterosHeriberto Arrollo", "Lara", "Las Mercedes", "Manuel Morillo", "Montaña Verde", "Montes de Oca", "Reyes de Vargas", "Torres", "Trinidad Samuel", "---", "Xaguas", "Siquisique", "San Miguel", "Moroturo", "---", "Aguedo Felipe Alvarado", "Buena Vista", "Catedral", "Concepción", "El Cují", "Juárez", "Juan de Villegas", "Santa Rosa", "Tamaca", "Unión" }));
        cboparroquia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparroquia.setOpaque(false);
        cboparroquia.setPreferredSize(new java.awt.Dimension(36, 21));

        cboestado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Amazonas", "Anzoategui", "Apure", "Aragua", "Barinas", "Bolivar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guarico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);
        cboestado.setPreferredSize(new java.awt.Dimension(36, 21));
        cboestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboestadoKeyTyped(evt);
            }
        });

        cbomunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbomunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Blanco", "Crespo", "Iribarren", "Jiménez", "Morán", "Palavecino", "Planas", "Torres", "Urdaneta" }));
        cbomunicipio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomunicipio.setOpaque(false);
        cbomunicipio.setPreferredSize(new java.awt.Dimension(36, 21));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Parroquia");

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Municipio");

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Ciudad");

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

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Estado");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Trabajas");

        cbotrabajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Institución Pública", "Institución Privada", "Comercial", "Por cuenta Propia", "Buhonería", "Otro", " " }));
        cbotrabajas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboopciontrabajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "SI", "NO" }));
        cboopciontrabajas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Realiza algún tipo de actividad comercial dentro de la Vivienda");

        cboopciontrabajas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "SI", "NO" }));
        cboopciontrabajas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboventas_de.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Ventas de", "Dulce", "Helados", "Empandas", "Refrescos", "Cervezas", "Malta", "Hielo", "Ninguna", "Otro" }));
        cboventas_de.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboventas_de.setDoubleBuffered(true);
        cboventas_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboventas_deActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Clase de Ingreso Familiar");

        cboingresofamiliar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Diario", "Semanal", "Quincenal", "Mensual", "Por Trabajo Realizado", " " }));
        cboingresofamiliar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboingresofamiliar.setDoubleBuffered(true);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Ingreso Mensual Bsf");

        txtingresomensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtingresomensualActionPerformed(evt);
            }
        });
        txtingresomensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtingresomensualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresomensualKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Cotiza ley de Política Habitacional:");

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup1.add(op1);
        op1.setText("SI");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(op2);
        op2.setText("NO");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Existen en su núcleo familiar personas que padezcan de:");

        jPanel8.setBackground(new java.awt.Color(255,255,255,20));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Cancer");

        check1.setBackground(new java.awt.Color(255, 255, 255));
        check1.setBorder(null);
        check1.setBorderPaintedFlat(true);
        check1.setContentAreaFilled(false);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("Diabetes");

        check4.setBackground(new java.awt.Color(255, 255, 255));
        check4.setBorder(null);
        check4.setBorderPaintedFlat(true);
        check4.setContentAreaFilled(false);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("SIDA");

        check7.setBackground(new java.awt.Color(255, 255, 255));
        check7.setBorder(null);
        check7.setBorderPaintedFlat(true);
        check7.setContentAreaFilled(false);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("Corazón");

        check10.setBackground(new java.awt.Color(255, 255, 255));
        check10.setBorder(null);
        check10.setBorderPaintedFlat(true);
        check10.setContentAreaFilled(false);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Hepatitis");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Leucemia");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Epilepsia");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Tuberculosi");

        check2.setBackground(new java.awt.Color(255, 255, 255));
        check2.setBorder(null);
        check2.setBorderPaintedFlat(true);
        check2.setContentAreaFilled(false);

        check11.setBackground(new java.awt.Color(255, 255, 255));
        check11.setBorder(null);
        check11.setBorderPaintedFlat(true);
        check11.setContentAreaFilled(false);

        check5.setBackground(new java.awt.Color(255, 255, 255));
        check5.setBorder(null);
        check5.setBorderPaintedFlat(true);
        check5.setContentAreaFilled(false);

        check8.setBackground(new java.awt.Color(255, 255, 255));
        check8.setBorder(null);
        check8.setBorderPaintedFlat(true);
        check8.setContentAreaFilled(false);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Hipertensión");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Asma");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Otro");

        check6.setBackground(new java.awt.Color(255, 255, 255));
        check6.setBorder(null);
        check6.setBorderPaintedFlat(true);
        check6.setContentAreaFilled(false);

        check3.setBackground(new java.awt.Color(255, 255, 255));
        check3.setBorder(null);
        check3.setBorderPaintedFlat(true);
        check3.setContentAreaFilled(false);

        check9.setBackground(new java.awt.Color(255, 255, 255));
        check9.setBorder(null);
        check9.setBorderPaintedFlat(true);
        check9.setContentAreaFilled(false);
        check9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check11)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(check2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(check3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(check8)
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(check5)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel8)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(check6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(check9, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(check1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53)
                                    .addComponent(check4)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel54))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(check7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(check8)
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(check10))
                                    .addComponent(check11)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(check2)
                                        .addComponent(jLabel7))
                                    .addGap(12, 12, 12)
                                    .addComponent(check5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel8)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(check3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(check6)
                            .addGap(18, 18, 18)
                            .addComponent(check9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtcual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualKeyTyped(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 51, 51));
        label1.setText("Cual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel39)
                                                .addComponent(jLabel38)
                                                .addComponent(jLabel37))
                                            .addGap(15, 15, 15))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbociudad, 0, 200, Short.MAX_VALUE)
                                        .addComponent(cbomunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboparroquia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(22, 22, 22)
                                    .addComponent(cboopciontrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbotrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel29))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cboopciontrabajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboventas_de, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboingresofamiliar, 0, 133, Short.MAX_VALUE)
                                    .addComponent(txtingresomensual))))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(op1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbomunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cboopciontrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboopciontrabajas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboventas_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboingresofamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(op1)
                    .addComponent(op2))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1)
                    .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jLabel30.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Datos Jefe Familiar");

        jPanel2.setBackground(new java.awt.Color(255,255,255,30)
        );
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("¿Necesita usted de alguna ayuda especial para familiares enfermos en su hogar?");

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup2.add(op3);
        op3.setText("SI");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(op4);
        op4.setText("NO");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Situación de Exclusión");

        cbosituacion_exclusion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Niños de la Calle", "Indigentes", "Enfermos terminales", "Discapacitados", "Tercera Edad" }));
        cbosituacion_exclusion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbocantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CANTIDAD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        cbocantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtcual2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcual2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcual2KeyTyped(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 51, 51));
        label2.setText("Cual:");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/email-with-at.png"))); // NOI18N
        jLabel23.setText("Consejo_CMV@hotmail.com");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Cargar Fotografia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(237, 240));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255,255,255,125)
        );
        jButton1.setText("Examinar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Registro Jefe Familiar");

        btnuevo1.setBackground(new java.awt.Color(255,255,255,125)
        );
        btnuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/web(1).png"))); // NOI18N
        btnuevo1.setText("Nuevo");
        btnuevo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnuevo1.setContentAreaFilled(false);
        btnuevo1.setDoubleBuffered(true);
        btnuevo1.setOpaque(true);
        btnuevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnuevo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnuevo1MouseExited(evt);
            }
        });
        btnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel23)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(op3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label2)
                                .addGap(12, 12, 12)
                                .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(212, 212, 212)
                                    .addComponent(cbosituacion_exclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cbocantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op3)
                    .addComponent(op4)
                    .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbocantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbosituacion_exclusion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel21.setText("Inicio");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel22.setText("Vigilancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel22)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     
    void inhabilitar() {
        txtidpersona.setVisible(false);
  
        cboestado.setEnabled(false);
        cbociudad.setEnabled(false);
        cbomunicipio.setEnabled(false);
        cboparroquia.setEnabled(false);
        cboopciontrabajas.setEnabled(false);
        cbotrabajas.setEnabled(false);
        cboopciontrabajas1.setEnabled(false);
        cboventas_de.setEnabled(false);
        cboingresofamiliar.setEnabled(false);
        txtingresomensual.setEnabled(false);
        op1.setEnabled(false);
        op2.setEnabled(false);
        check1.setEnabled(false);
        check2.setEnabled(false);

        check3.setEnabled(false);
        check4.setEnabled(false);
        check5.setEnabled(false);
        check6.setEnabled(false);
        check7.setEnabled(false);
        check8.setEnabled(false);

        check9.setEnabled(false);
        check10.setEnabled(false);
        check11.setEnabled(false);
        txtcual.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        cbocantidad.setEnabled(false);
        cbosituacion_exclusion.setEnabled(false);

        btsiguiente.setEnabled(false);

        txtidpersona.setText("");
        txtingresomensual.setText("");
        txtcual.setText("");
        txtcual2.setText("");
    }

    void habilitar() {
        txtidpersona.setVisible(false);

        cboestado.setEnabled(true);
        cbociudad.setEnabled(true);
        cbomunicipio.setEnabled(true);
        cboparroquia.setEnabled(true);
        cboopciontrabajas.setEnabled(true);
        cbotrabajas.setEnabled(true);
        cboopciontrabajas1.setEnabled(true);
        cboventas_de.setEnabled(true);
        cboingresofamiliar.setEnabled(true);
        txtingresomensual.setEnabled(true);
        op1.setEnabled(true);
        op2.setEnabled(true);
        check1.setEnabled(true);
        check2.setEnabled(true);

        check3.setEnabled(true);
        check4.setEnabled(true);
        check5.setEnabled(true);
        check6.setEnabled(true);
        check7.setEnabled(true);
        check8.setEnabled(true);

        check9.setEnabled(true);
        check10.setEnabled(true);
        check11.setEnabled(true);
        txtcual.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
        cbocantidad.setEnabled(true);
        cbosituacion_exclusion.setEnabled(true);

        btsiguiente.setEnabled(true);

        txtidpersona.setText("");
        txtingresomensual.setText("");
        txtcual.setText("");
        txtcual2.setText("");
    }


    private void cboventas_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboventas_deActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboventas_deActionPerformed

    private void txtingresomensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtingresomensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtingresomensualActionPerformed

    private void cbociudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbociudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbociudadActionPerformed

    private void btsiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseEntered
        btsiguiente.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseEntered

    private void btsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseExited
        btsiguiente.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseExited

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed
        String msj = "";
        
        vsituacion_economica dts = new vsituacion_economica();
        fsituacion_economica func = new fsituacion_economica();

        int s = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(s).toString());

        s = cbociudad.getSelectedIndex();
        dts.setCiudad((String) cbociudad.getItemAt(s).toString());

        s = cbomunicipio.getSelectedIndex();
        dts.setMunicipio((String) cbomunicipio.getItemAt(s).toString());

        s = cboparroquia.getSelectedIndex();
        dts.setParroquia((String) cboparroquia.getItemAt(s).toString());

        s = cboopciontrabajas.getSelectedIndex();
        dts.setTrabajas((String) cboopciontrabajas.getItemAt(s).toString());

        s = cbotrabajas.getSelectedIndex();
        dts.setInstitucion((String) cbotrabajas.getItemAt(s).toString());

        s = cboopciontrabajas1.getSelectedIndex();
        dts.setAct_comercial_vivienda((String) cboopciontrabajas1.getItemAt(s).toString());

        s = cboventas_de.getSelectedIndex();
        dts.setVentas_de((String) cboventas_de.getItemAt(s).toString());

        s = cboingresofamiliar.getSelectedIndex();
        dts.setIngreso_familiar((String) cboingresofamiliar.getItemAt(s).toString());

        dts.setIng_mensual(txtingresomensual.getText());

        dts.setLph(gender);

        if (check1.isSelected()) {
           msj += "Cancer\n";
        }
        if(check2.isSelected()){
           msj += "Hepatitis\n";
        }
        if(check3.isSelected()){
           msj += "Hipertensión\n";
        }
        if(check4.isSelected()){
           msj += "Diabetes\n";
        }
        if(check5.isSelected()){
           msj += "Leucemia\n";
        }
        if(check6.isSelected()){
           msj += "Asma\n";
        }
        if(check7.isSelected()){
           msj += "SIDA\n";
        }
        if(check8.isSelected()){
           msj += "Epilepsia\n";
        }
        
        if(check10.isSelected()){
           msj += "Corazón\n";
        }
        if(check11.isSelected()){
           msj += "Tuberculosis\n";
        }
        
        dts.setFamiliar_padezcan_enf(msj);

        dts.setCual_enfermedad(txtcual.getText());

        dts.setAyuda_familiar_enf(gender1);

        dts.setCual_ayuda(txtcual2.getText());

        s = cbocantidad.getSelectedIndex();
        dts.setCant_exclusion((String) cbocantidad.getItemAt(s).toString());

        s = cbosituacion_exclusion.getSelectedIndex();
        dts.setPer_exclusion((String) cbosituacion_exclusion.getItemAt(s).toString());

        if (cbosituacion_exclusion.getSelectedItem().equals("SELECIONAR")) {
            val.valEsp(cboestado);
            val.valEsp(cbociudad);
            val.valEsp(cbomunicipio);
            val.valEsp(cboparroquia);
            val.valEsp(cboopciontrabajas);
            val.valEsp(cbotrabajas);
            val.valEsp(cboopciontrabajas1);
            val.valEsp(cboventas_de);
            val.valEsp2(cboingresofamiliar);
            val.valEsp(txtingresomensual);
            val.valEsp(txtcual);
            val.valEsp(txtcual2);
            val.valEsp3(cbocantidad);
            val.valEsp2(cbosituacion_exclusion);

            return;
        } else if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                //JOptionPane.showMessageDialog(null, "el cliente fue registrado satisfactoriamente");
                inhabilitar();
                Ajustes.Aplicacion.callMainOption(new Registro_Familiar3());
            }

        }
    }//GEN-LAST:event_btsiguienteActionPerformed

    private void btnuevo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevo1MouseEntered
       val.limpiar1(btnuevo1);
       Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevo1MouseEntered

    private void btnuevo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevo1MouseExited
       val.limpiar2(btnuevo1);
       Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevo1MouseExited

    private void btnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevo1ActionPerformed
        label1.setVisible(false);
        txtcual.setVisible(false);
        label2.setVisible(false);
        txtcual2.setVisible(false);
        habilitar();
        btsiguiente.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevo1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        gender = "Si";
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        gender = "No";
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        gender1 = "Si";
        if(op3.isSelected()){
          label2.setVisible(true);
          txtcual2.setVisible(true);
       }
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        gender1 = "No";
        if(op4.isSelected()){
          label2.setVisible(false);
          txtcual2.setVisible(false);
       }
    }//GEN-LAST:event_op4ActionPerformed

    private void cboestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboestadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoKeyTyped

    private void txtingresomensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresomensualKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtingresomensual, evt, 8);
    }//GEN-LAST:event_txtingresomensualKeyTyped

    private void txtingresomensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresomensualKeyPressed
       val.teclasEspeciales(evt, txtingresomensual);
    }//GEN-LAST:event_txtingresomensualKeyPressed

    private void txtcualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtcual, evt, 15);
    }//GEN-LAST:event_txtcualKeyTyped

    private void txtcualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualKeyPressed
        val.teclasEspeciales(evt, txtcual);
    }//GEN-LAST:event_txtcualKeyPressed

    private void txtcual2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcual2KeyTyped
        val.letras(evt);
        val.espacioMaximo(txtcual2, evt, 15);
    }//GEN-LAST:event_txtcual2KeyTyped

    private void txtcual2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcual2KeyPressed
        val.teclasEspeciales(evt, txtcual2);
    }//GEN-LAST:event_txtcual2KeyPressed

    private void check9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check9ActionPerformed
       if(check9.isSelected()){
          label1.setVisible(true);
          txtcual.setVisible(true);
       }else{
          label1.setVisible(false);
          txtcual.setVisible(false);
       }
    }//GEN-LAST:event_check9ActionPerformed
    
    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (Egoist.Swing.Animator.isBeingAnimated(this) == false) {
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuevo1;
    private javax.swing.JButton btsiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbocantidad;
    private javax.swing.JComboBox cbociudad;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox<String> cboingresofamiliar;
    private javax.swing.JComboBox cbomunicipio;
    private javax.swing.JComboBox<String> cboopciontrabajas;
    private javax.swing.JComboBox<String> cboopciontrabajas1;
    private javax.swing.JComboBox cboparroquia;
    private javax.swing.JComboBox<String> cbosituacion_exclusion;
    private javax.swing.JComboBox<String> cbotrabajas;
    private javax.swing.JComboBox<String> cboventas_de;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check11;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
    private javax.swing.JCheckBox check9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JTextField txtcual;
    private javax.swing.JTextField txtcual2;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtingresomensual;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String gender1;
}
