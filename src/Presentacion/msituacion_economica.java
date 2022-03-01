/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vsituacion_economica;
import Logica.fsituacion_economica;
import Logica.fusuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class msituacion_economica extends javax.swing.JPanel {

    /**
     * Creates new form msituacion_economica
     */
    public msituacion_economica() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    vsituacion_economica dts = new vsituacion_economica();
    fsituacion_economica func = new fsituacion_economica();
    Validaciones val = new Validaciones();
    private String accion = "guardar";
    
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fsituacion_economica func = new fsituacion_economica();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtingresomensual = new javax.swing.JTextField();
        txtidubicacion = new javax.swing.JTextField();
        btguardar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        txtn_cedula = new javax.swing.JTextField();
        txtf_nacimiento = new javax.swing.JTextField();
        txta_telefono = new javax.swing.JTextField();
        txtb_cuenta = new javax.swing.JTextField();
        txtn_rif = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        cbociudad = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        cbomunicipio = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        cboparroquia = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        cboopciontrabajas = new javax.swing.JComboBox<>();
        cbotrabajas = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cboopciontrabajas1 = new javax.swing.JComboBox<>();
        cboventas_de = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboingresofamiliar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        check7 = new javax.swing.JCheckBox();
        jLabel55 = new javax.swing.JLabel();
        check10 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        check11 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        check6 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        label1 = new javax.swing.JLabel();
        txtcual = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        cbocantidad = new javax.swing.JComboBox<>();
        cbosituacion_exclusion = new javax.swing.JComboBox<>();
        txtcual2 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1135, 600));
        setMinimumSize(new java.awt.Dimension(1135, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1135, 600));

        jPanel2.setBackground(new java.awt.Color(255, 175, 17,0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Situacion Economica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color( 255, 255, 255, 30 ));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14)
                    .addComponent(lbtotalregistro))
                .addGap(10, 10, 10))
        );

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Ing. Mensual");

        txtingresomensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtingresomensualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtingresomensualKeyTyped(evt);
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

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Estado");

        cboestado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Amazonas", "Anzoategui", "Apure", "Aragua", "Barinas", "Bolivar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guarico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);
        cboestado.setPreferredSize(new java.awt.Dimension(36, 21));

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

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Municipio");

        cbomunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbomunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Blanco", "Crespo", "Iribarren", "Jiménez", "Morán", "Palavecino", "Planas", "Torres", "Urdaneta" }));
        cbomunicipio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomunicipio.setOpaque(false);
        cbomunicipio.setPreferredSize(new java.awt.Dimension(36, 21));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Parroquia");

        cboparroquia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboparroquia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Quebrada Honda de Guache", "Pio Tamayo", "Yacambú", "---", "Freitez", "Jose Maria Blanco", "---", "Anzoátegui", "Bolívar", "Guárico", "Hilario Luna y Luna", "Humocaro Bajo", "Humocaro Alto", "La Candelaria", "Morán", "---", "Cabudare", "Jose Gregorio", "Agua Viva", "---", "Buría", "Gustavo Vega", "Sarare", "---", "Altagracia", "Antonio Díaz", "Camacaro", "Castañeda", "Cecilio Zubillaga", "Chiquinquira", "El Blanco", "Espinoza de los MonterosHeriberto Arrollo", "Lara", "Las Mercedes", "Manuel Morillo", "Montaña Verde", "Montes de Oca", "Reyes de Vargas", "Torres", "Trinidad Samuel", "---", "Xaguas", "Siquisique", "San Miguel", "Moroturo", "---", "Aguedo Felipe Alvarado", "Buena Vista", "Catedral", "Concepción", "El Cují", "Juárez", "Juan de Villegas", "Santa Rosa", "Tamaca", "Unión" }));
        cboparroquia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparroquia.setOpaque(false);
        cboparroquia.setPreferredSize(new java.awt.Dimension(36, 21));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Trabajas");

        cboopciontrabajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "SI", "NO" }));
        cboopciontrabajas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbotrabajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Institución Pública", "Institución Privada", "Comercial", "Por cuenta Propia", "Buhonería", "Otro", " " }));
        cbotrabajas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Realiza algún tipo de actividad comercial dentro ");

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("de la Vivienda");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Clase de Ingreso Familiar");

        cboingresofamiliar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Diario", "Semanal", "Quincenal", "Mensual", "Por Trabajo Realizado", " " }));
        cboingresofamiliar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboingresofamiliar.setDoubleBuffered(true);

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿Existen en su núcleo familiar personas que padezcan de:");

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

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Hepatitis");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Leucemia");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Epilepsia");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Tuberculosi");

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

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Hipertensión");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Asma");

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Otro");

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
                        .addComponent(jLabel8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(check2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(check3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(check8)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel12))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(check5)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(check11, javax.swing.GroupLayout.Alignment.LEADING))
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
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
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
                                        .addComponent(jLabel8)
                                        .addComponent(check10))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(check11)
                                        .addGap(7, 7, 7))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(check2)
                                        .addComponent(jLabel9))
                                    .addGap(12, 12, 12)
                                    .addComponent(check5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel10)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(check3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(check6)
                            .addGap(18, 18, 18)
                            .addComponent(check9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 51, 51));
        label1.setText("Cual:");

        txtcual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualKeyTyped(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("¿Necesita usted de alguna ");

        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("ayuda especial para familiares");

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText(" enfermos en su hogar?");

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

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Situación de Exclusión");

        cbocantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CANTIDAD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        cbocantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbosituacion_exclusion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Niños de la Calle", "Indigentes", "Enfermos terminales", "Discapacitados", "Tercera Edad" }));
        cbosituacion_exclusion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboopciontrabajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboventas_de, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(21, 21, 21)
                                    .addComponent(cboopciontrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(cbotrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel36)))
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbociudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbomunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboparroquia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(op1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel15))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtingresomensual, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(cboingresofamiliar, 0, 1, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(op3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbocantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbosituacion_exclusion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btguardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(3, 3, 3)
                        .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboingresofamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1)
                            .addComponent(txtn_rif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtingresomensual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(op1)
                                    .addComponent(op2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(op3)
                                    .addComponent(op4)
                                    .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbocantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbosituacion_exclusion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnuevo)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btguardar)
                                        .addComponent(txtidubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txta_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtf_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtn_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboopciontrabajas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboventas_de, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbomunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cboopciontrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotrabajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
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
        txtidubicacion.setVisible(false);
  
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

        btguardar.setEnabled(false);
        bteliminar.setEnabled(false);

        txtidubicacion.setText("");
        txtingresomensual.setText("");
        txtcual.setText("");
        txtcual.setText("");
    }

    void habilitar() {
        txtidubicacion.setVisible(false);

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

        btguardar.setEnabled(true);
        bteliminar.setEnabled(true);

        txtidubicacion.setText("");
        txtingresomensual.setText("");
        txtcual.setText("");
        txtcual.setText("");
    }
    
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
        
        
        cboopciontrabajas.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
        
        cbotrabajas.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
        
        cboopciontrabajas1.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        
        cboventas_de.setSelectedItem(tablalistado.getValueAt(fila, 8).toString());
        
        
        cboingresofamiliar.setSelectedItem(tablalistado.getValueAt(fila, 9).toString());
        
        txtingresomensual.setText(tablalistado.getValueAt(fila, 10).toString());
        
        //op1.setText(tablalistado.getValueAt(fila, 11).toString());
        //op2.setText(tablalistado.getValueAt(fila, 12).toString());
        
        txtcual.setText(tablalistado.getValueAt(fila, 13).toString());
        
        //op3.setText(tablalistado.getValueAt(fila, 14).toString());
        //op4.setText(tablalistado.getValueAt(fila, 15).toString());
        
        txtcual2.setText(tablalistado.getValueAt(fila, 15).toString());
        
        cbocantidad.setSelectedItem(tablalistado.getValueAt(fila, 16).toString());
        
        cbosituacion_exclusion.setSelectedItem(tablalistado.getValueAt(fila, 17).toString());
        

        
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
        if (!txtidubicacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar la situacion familiar", "Confirmar", 2);

            if (confirmacion == 0) {
                fsituacion_economica func = new fsituacion_economica();
                vsituacion_economica dts = new vsituacion_economica();

                dts.setIdubicacion(Integer.parseInt(txtidubicacion.getText()));
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

    private void txtingresomensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresomensualKeyPressed
        val.teclasEspeciales(evt, txtingresomensual);
    }//GEN-LAST:event_txtingresomensualKeyPressed

    private void txtingresomensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtingresomensualKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtingresomensual, evt, 8);
    }//GEN-LAST:event_txtingresomensualKeyTyped

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
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
           msj += "Cancer \n";
        }
        if(check2.isSelected()){
           msj += "Hepatitis \n";
        }
        if(check3.isSelected()){
           msj += "Hipertensión \n";
        }
        if(check4.isSelected()){
           msj += "Diabetes \n";
        }
        if(check5.isSelected()){
           msj += "Leucemia \n";
        }
        if(check6.isSelected()){
           msj += "Asma \n";
        }
        if(check7.isSelected()){
           msj += "SIDA \n";
        }
        if(check8.isSelected()){
           msj += "Epilepsia \n";
        }
        if(check10.isSelected()){
           msj += "Corazón \n";
        }
        if(check11.isSelected()){
           msj += "Tuberculosis \n";
        }
        
        dts.setFamiliar_padezcan_enf(msj);

        dts.setCual_enfermedad(txtcual2.getText());

        dts.setAyuda_familiar_enf(gender1);

        dts.setCual_ayuda(txtcual.getText());

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
            val.valEsp(txtcual2);
            val.valEsp(txtcual);
            val.valEsp3(cbocantidad);
            val.valEsp2(cbosituacion_exclusion);

            return;
        } else {
            //txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
            if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(null, "La situacion familiar fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }
          }
          else if (accion.equals("editar")){
            dts.setIdubicacion(Integer.parseInt(txtidubicacion.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "La situacion familiar fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }}
    }//GEN-LAST:event_btguardarActionPerformed

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
        val.limpiar1(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
        val.limpiar2(btnuevo);
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        label1.setVisible(false);
        txtcual.setVisible(false);
        label2.setVisible(false);
        txtcual2.setVisible(false);
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void cbociudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbociudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbociudadActionPerformed

    private void cboventas_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboventas_deActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboventas_deActionPerformed

    private void check9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check9ActionPerformed
        if(check9.isSelected()){
          label1.setVisible(true);
          txtcual.setVisible(true);
       }else{
          label1.setVisible(false);
          txtcual.setVisible(false);
       }
    }//GEN-LAST:event_check9ActionPerformed

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

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        gender = "Si";
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        gender1 = "No";
    }//GEN-LAST:event_op2ActionPerformed

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

    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (Egoist.Swing.Animator.isBeingAnimated(this) == false) {
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar1;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txta_telefono;
    private javax.swing.JTextField txtb_cuenta;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcual;
    private javax.swing.JTextField txtcual2;
    private javax.swing.JTextField txtf_nacimiento;
    private javax.swing.JTextField txtidubicacion;
    private javax.swing.JTextField txtingresomensual;
    private javax.swing.JTextField txtn_cedula;
    private javax.swing.JTextField txtn_rif;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String gender1;
}
