/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vsituacion_vivienda;
import Logica.fsituacion_vivienda;
import Logica.fusuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class msituacion_vivienda extends javax.swing.JPanel {

    /**
     * Creates new form msituacion_economica
     */
    public msituacion_vivienda() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    vsituacion_vivienda dts = new vsituacion_vivienda();
    fsituacion_vivienda func = new fsituacion_vivienda();
    Validaciones val = new Validaciones();
    private String accion = "guardar";
    
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fsituacion_vivienda func = new fsituacion_vivienda();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            val.ocultarColumna(tablalistado);
            lbtotalregistro.setText("Total de registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

    void inhabilitar() {
        txtidservicios.setVisible(false);

        cbocondiciones_terreno.setEnabled(false);
        cboforma_tendencia.setEnabled(false);
        cbotipo_vivienda.setEnabled(false);
        cbotipo_paredes.setEnabled(false);
        cbotipo_techo.setEnabled(false);
        txtcantidad_habi.setEnabled(false);
        cbocodiciones_vivienda.setEnabled(false);
        cbopresenciia_roedores.setEnabled(false);
        cboanimales_domestico.setEnabled(false);
        cboaguablanca.setEnabled(false);
        txtlitros.setEnabled(false);
        txtpipotes.setEnabled(false);
        cboagua_servida.setEnabled(false);
        cbogas.setEnabled(false);

        cboempresa_gas.setEnabled(false);
        cbocilindros.setEnabled(false);
        txtprecio_cilindro.setEnabled(false);
        txtcuantos.setEnabled(false);
        cborecolecion_basura.setEnabled(false);
        cbotelefonia.setEnabled(false);

        cbotransporte.setEnabled(false);
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
        check12.setEnabled(false);
        check13.setEnabled(false);
        check14.setEnabled(false);
        check15.setEnabled(false);
        check16.setEnabled(false);

        op1.setEnabled(false);
        op2.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        op5.setEnabled(false);
        op6.setEnabled(false);
        op7.setEnabled(false);
        op8.setEnabled(false);

        btguardar.setEnabled(false);

        txtcantidad_habi.setText("");
        txtlitros.setText("");
        txtpipotes.setText("");
        txtprecio_cilindro.setText("");
        txtcuantos.setText("");
    }

    void habilitar() {
        txtidservicios.setVisible(false);

        cbocondiciones_terreno.setEnabled(true);
        cboforma_tendencia.setEnabled(true);
        cbotipo_vivienda.setEnabled(true);
        cbotipo_paredes.setEnabled(true);
        cbotipo_techo.setEnabled(true);
        txtcantidad_habi.setEnabled(true);
        cbocodiciones_vivienda.setEnabled(true);
        cbopresenciia_roedores.setEnabled(true);
        cboanimales_domestico.setEnabled(true);
        cboaguablanca.setEnabled(true);
        txtlitros.setEnabled(true);
        txtpipotes.setEnabled(true);
        cboagua_servida.setEnabled(true);
        cbogas.setEnabled(true);

        cboempresa_gas.setEnabled(true);
        cbocilindros.setEnabled(true);
        txtprecio_cilindro.setEnabled(true);
        txtcuantos.setEnabled(true);
        cborecolecion_basura.setEnabled(true);
        cbotelefonia.setEnabled(true);

        cbotransporte.setEnabled(true);
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
        check12.setEnabled(true);
        check13.setEnabled(true);
        check14.setEnabled(true);
        check15.setEnabled(true);
        check16.setEnabled(true);

        op1.setEnabled(true);
        op2.setEnabled(true);
        op3.setEnabled(true);
        op4.setEnabled(true);
        op5.setEnabled(true);
        op6.setEnabled(true);
        op7.setEnabled(true);
        op8.setEnabled(true);

        btguardar.setEnabled(true);

        txtcantidad_habi.setText("");
        txtlitros.setText("");
        txtpipotes.setText("");
        txtprecio_cilindro.setText("");
        txtcuantos.setText("");
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
        btbuscar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbtotalregistro = new javax.swing.JLabel();
        txtidservicios = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtb_cuenta = new javax.swing.JTextField();
        cbocondiciones_terreno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboforma_tendencia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbotipo_vivienda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        jLabel47 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        check3 = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        check5 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        check11 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        check6 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        check8 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        check12 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        check10 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cbotipo_paredes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbotipo_techo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad_habi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbocodiciones_vivienda = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        cbopresenciia_roedores = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cboanimales_domestico = new javax.swing.JComboBox<>();
        op4 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cboaguablanca = new javax.swing.JComboBox<>();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        txtlitros = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        op7 = new javax.swing.JRadioButton();
        op8 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        txtpipotes = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cboagua_servida = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        cbogas = new javax.swing.JComboBox<>();
        cboempresa_gas = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        cbocilindros = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtprecio_cilindro = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        check13 = new javax.swing.JCheckBox();
        check15 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        check14 = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        check16 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        cborecolecion_basura = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        cbotelefonia = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        cbotransporte = new javax.swing.JComboBox<>();
        txtcuantos = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtidservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbtotalregistro)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel21)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btguardar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnuevo)
                        .addComponent(btguardar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14)
                    .addComponent(lbtotalregistro)
                    .addComponent(txtidservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        cbocondiciones_terreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Estable", "Inestable", "Alto Riesgo", "Vulnerable", "Otro" }));
        cbocondiciones_terreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocondiciones_terrenoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Condiciones del Terreno");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Forma de Tendencia");

        cboforma_tendencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Propia", "Alquilada", "Compartida", "Invadida", "Traspasada", "Prestada" }));
        cboforma_tendencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboforma_tendenciaActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo Vivienda");

        cbotipo_vivienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Quinta", "Casa", "Apartamento", "Racho", "Barraca", " " }));
        cbotipo_vivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_viviendaActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Habiatacion de Vivienda");

        jPanel6.setBackground(new java.awt.Color(255,255,255,20));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Sala");

        check1.setBackground(new java.awt.Color(255, 255, 255));
        check1.setBorder(null);
        check1.setBorderPaintedFlat(true);
        check1.setContentAreaFilled(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Baño");

        check2.setBackground(new java.awt.Color(255, 255, 255));
        check2.setBorder(null);
        check2.setBorderPaintedFlat(true);
        check2.setContentAreaFilled(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Comedor");

        check3.setBackground(new java.awt.Color(255, 255, 255));
        check3.setBorder(null);
        check3.setBorderPaintedFlat(true);
        check3.setContentAreaFilled(false);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Cosina");

        check4.setBackground(new java.awt.Color(255, 255, 255));
        check4.setBorder(null);
        check4.setBorderPaintedFlat(true);
        check4.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel47))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check1)
                    .addComponent(check2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(check4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check3)))
                .addGap(1, 1, 1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(check1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel47)
                                .addComponent(check2))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46)
                                    .addComponent(check4)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(check3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Enseres de Vivienda");

        jPanel8.setBackground(new java.awt.Color(255,255,255,20));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check5.setBackground(new java.awt.Color(255, 255, 255));
        check5.setBorder(null);
        check5.setBorderPaintedFlat(true);
        check5.setContentAreaFilled(false);

        check7.setBackground(new java.awt.Color(255, 255, 255));
        check7.setBorder(null);
        check7.setBorderPaintedFlat(true);
        check7.setContentAreaFilled(false);

        check9.setBackground(new java.awt.Color(255, 255, 255));
        check9.setBorder(null);
        check9.setBorderPaintedFlat(true);
        check9.setContentAreaFilled(false);

        check11.setBackground(new java.awt.Color(255, 255, 255));
        check11.setBorder(null);
        check11.setBorderPaintedFlat(true);
        check11.setContentAreaFilled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Nevera");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Cocina");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Cama");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Gabinete");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("TV");

        check6.setBackground(new java.awt.Color(255, 255, 255));
        check6.setBorder(null);
        check6.setBorderPaintedFlat(true);
        check6.setContentAreaFilled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Ventilador");

        check8.setBackground(new java.awt.Color(255, 255, 255));
        check8.setBorder(null);
        check8.setBorderPaintedFlat(true);
        check8.setContentAreaFilled(false);

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Muebles");

        check12.setBackground(new java.awt.Color(255, 255, 255));
        check12.setBorder(null);
        check12.setBorderPaintedFlat(true);
        check12.setContentAreaFilled(false);

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Utensilios");

        check10.setBackground(new java.awt.Color(255, 255, 255));
        check10.setBorder(null);
        check10.setBorderPaintedFlat(true);
        check10.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(23, 23, 23)
                        .addComponent(check9))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(check11)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(check5)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(check6))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(check7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel17))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel18)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(check8)
                                        .addComponent(check10)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check5)
                            .addComponent(jLabel12))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(check6)
                            .addGap(1, 1, 1)))
                    .addComponent(jLabel43))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check8)
                    .addComponent(check7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check9)
                        .addComponent(jLabel15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check10)
                            .addComponent(jLabel18))
                        .addGap(1, 1, 1)))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check11)
                        .addComponent(jLabel16))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(check12))
                        .addGap(1, 1, 1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Tipos de Paredes");

        cbotipo_paredes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Frisadas", "Sin Frisar", "Tablas", "Bahareque o adobe", "Zinc", "Cartón Piedra", "Otro" }));
        cbotipo_paredes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotipo_paredes.setDoubleBuffered(true);
        cbotipo_paredes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_paredesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Tipo de Techo");

        cbotipo_techo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Platabanda", "Asbesto", "Teja", "Zinc", "Machihembrado", "Techo Raso", "Asbesto", "Otro" }));
        cbotipo_techo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cantidad de Habitaciones");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Condiciones de Salubridades");

        cbocodiciones_vivienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Limpia", "Sucia", "Med Limpia", "Sucia", "Otros" }));
        cbocodiciones_vivienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocodiciones_vivienda.setDoubleBuffered(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Insecto y Roedores ");

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        op1.setText("SI");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setText("NO");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        cbopresenciia_roedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Moscas", "Hormigas", "Ratones", "Cucarachas", "Ciempiés", "OTRO" }));
        cbopresenciia_roedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Animales Domestico");

        cboanimales_domestico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Perro", "Gato", "Pájaros", "Gallinas", "Patos", "Cochinos", "OTRO" }));
        cboanimales_domestico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        op4.setText("NO");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        op3.setText("SI");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Aguas Blanca");

        cboaguablanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Acueducto", "Camión", "Pila pública", "Del Río", "OTRO" }));
        cboaguablanca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        op5.setBackground(new java.awt.Color(255,255,255,50)
        );
        op5.setText("SI");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        op6.setText("NO");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Litros");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Tanque");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Pipotes");

        op7.setBackground(new java.awt.Color(255,255,255,50)
        );
        op7.setText("SI");
        op7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op7ActionPerformed(evt);
            }
        });

        op8.setText("NO");
        op8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op8ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Cuant");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Agua Servida");

        cboagua_servida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Cloacas", "Pozo", "séptico", "Letrinas", "Al aire libre", "Depositada en bolsas", "Otros" }));
        cboagua_servida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Gas");

        cbogas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Bombona", "Tubería", "No posee" }));
        cbogas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboempresa_gas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Pdval", "AutoGas", "SeviGas", "Otro" }));
        cboempresa_gas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Cuantos Cilindro");

        cbocilindros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "10kg", "18kg", "43kg" }));
        cbocilindros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Emp  suministra");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Precio del cilindro");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Sistema Electrico");

        jPanel9.setBackground(new java.awt.Color(255,255,255,20));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check13.setBackground(new java.awt.Color(255, 255, 255));
        check13.setBorder(null);
        check13.setBorderPaintedFlat(true);
        check13.setContentAreaFilled(false);

        check15.setBackground(new java.awt.Color(255, 255, 255));
        check15.setBorder(null);
        check15.setBorderPaintedFlat(true);
        check15.setContentAreaFilled(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Público");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Medidor");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Planta Eléctrica");

        check14.setBackground(new java.awt.Color(255, 255, 255));
        check14.setBorder(null);
        check14.setBorderPaintedFlat(true);
        check14.setContentAreaFilled(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("bombillos ahorradores");

        check16.setBackground(new java.awt.Color(255, 255, 255));
        check16.setBorder(null);
        check16.setBorderPaintedFlat(true);
        check16.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(check13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addGap(28, 28, 28)
                        .addComponent(check14))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(check15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check13)
                            .addComponent(jLabel35))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(check14)
                            .addGap(1, 1, 1)))
                    .addComponent(jLabel48))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check16)
                    .addComponent(check15)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Recolecion Basra");

        cborecolecion_basura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Aseo Urbano", "Conteiner", "Bajante", "Camión", "Al aire libre", "Quemada", "Otros", " " }));
        cborecolecion_basura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Telefonia ");

        cbotelefonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Domiciliaria", "Celular", "Prepago", "Centro de conexión", "No posee", "Otros", " " }));
        cbotelefonia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Transporte");

        cbotransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Propio", "Público", "Bestias", "Privado", "Taxi", "Otros", " " }));
        cbotransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("cuantos necesita");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cboforma_tendencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbotipo_vivienda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cbocondiciones_terreno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbotipo_paredes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(2, 2, 2)
                                        .addComponent(op3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(126, 126, 126)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboanimales_domestico, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboaguablanca, 0, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(op1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(op2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbopresenciia_roedores, 0, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6))
                                    .addGap(41, 41, 41)
                                    .addComponent(cbocodiciones_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboagua_servida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbogas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(35, 35, 35)
                                .addComponent(op5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addGap(11, 11, 11)
                                .addComponent(txtlitros, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(35, 35, 35)
                                .addComponent(op7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpipotes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcantidad_habi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel9)
                            .addGap(21, 21, 21)
                            .addComponent(cbotipo_techo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(cboempresa_gas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtprecio_cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel40))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbotelefonia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cborecolecion_basura, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbocilindros, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel34))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(txtcuantos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbotransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(959, 959, 959)
                        .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(596, 596, 596))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(txtb_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbotipo_paredes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbocondiciones_terreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbotipo_techo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(cboempresa_gas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cboforma_tendencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtcantidad_habi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbotipo_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(cbocodiciones_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23)
                                            .addComponent(op1)
                                            .addComponent(op2)
                                            .addComponent(cbopresenciia_roedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24)
                                            .addComponent(op3)
                                            .addComponent(op4)
                                            .addComponent(cboanimales_domestico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cboaguablanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(op5)
                                            .addComponent(op6)
                                            .addComponent(jLabel26)
                                            .addComponent(txtlitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25))
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel29)
                                            .addComponent(cboagua_servida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbogas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel27)
                                            .addComponent(op7)
                                            .addComponent(op8)
                                            .addComponent(jLabel28)
                                            .addComponent(txtpipotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(cbocilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(txtprecio_cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(cborecolecion_basura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(cbotelefonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(cbotransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(txtcuantos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseExited
       val.limpiar2(bteliminar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsalirMouseExited

    private void btsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseEntered
       val.limpiar1(bteliminar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsalirMouseEntered

    private void btsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseClicked
       
    }//GEN-LAST:event_btsalirMouseClicked

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
       if (!txtidservicios.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar la situacion familiar", "Confirmar", 2);

            if (confirmacion == 0) {
                fsituacion_vivienda func = new fsituacion_vivienda();
                vsituacion_vivienda dts = new vsituacion_vivienda();

                dts.setIdservicios(Integer.parseInt(txtidservicios.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }

        }

    }//GEN-LAST:event_bteliminarActionPerformed

    private void bteliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseExited
       val.limpiar2(bteliminar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_bteliminarMouseExited

    private void bteliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseEntered
       val.limpiar1(bteliminar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_bteliminarMouseEntered

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed

    }//GEN-LAST:event_btbuscarActionPerformed

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
       val.limpiar2(btguardar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btbuscarMouseExited

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered
       val.limpiar1(btbuscar);
       Ajustes.Aplicacion.getScreen(); 
    }//GEN-LAST:event_btbuscarMouseEntered

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btguardar.setText("Editar");
        habilitar();
        bteliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
        txtidservicios.setText(tablalistado.getValueAt(fila, 0).toString());
        
        cbocondiciones_terreno.setSelectedItem(tablalistado.getValueAt(fila, 1).toString());
        
        cboforma_tendencia.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
        
        cbotipo_vivienda.setSelectedItem(tablalistado.getValueAt(fila, 3).toString());
        
        cbotipo_paredes.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
        
        
        cbotipo_techo.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        
        txtcantidad_habi.setText(tablalistado.getValueAt(fila, 8).toString());
        
        cbocodiciones_vivienda.setSelectedItem(tablalistado.getValueAt(fila, 9).toString());
        
        cbopresenciia_roedores.setSelectedItem(tablalistado.getValueAt(fila, 11).toString());
        
        
        cboanimales_domestico.setSelectedItem(tablalistado.getValueAt(fila, 13).toString());
        
        cboaguablanca.setSelectedItem(tablalistado.getValueAt(fila, 14).toString());
        
        //op1.setText(tablalistado.getValueAt(fila, 11).toString());
        //op2.setText(tablalistado.getValueAt(fila, 12).toString());
        
        txtlitros.setText(tablalistado.getValueAt(fila, 16).toString());
        
        //op3.setText(tablalistado.getValueAt(fila, 14).toString());
        //op4.setText(tablalistado.getValueAt(fila, 15).toString());
        
        txtpipotes.setText(tablalistado.getValueAt(fila, 18).toString());
        
        cboagua_servida.setSelectedItem(tablalistado.getValueAt(fila, 19).toString());
        
        cbogas.setSelectedItem(tablalistado.getValueAt(fila, 20).toString());
        
        cboempresa_gas.setSelectedItem(tablalistado.getValueAt(fila, 21).toString());
        
        cbocilindros.setSelectedItem(tablalistado.getValueAt(fila, 22).toString());
        
        txtprecio_cilindro.setText(tablalistado.getValueAt(fila, 23).toString());
        
        cborecolecion_basura.setSelectedItem(tablalistado.getValueAt(fila, 25).toString());
        
        cbotelefonia.setSelectedItem(tablalistado.getValueAt(fila, 26).toString());
        
        cbotransporte.setSelectedItem(tablalistado.getValueAt(fila, 27).toString());
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void cboforma_tendenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboforma_tendenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboforma_tendenciaActionPerformed

    private void cbocondiciones_terrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocondiciones_terrenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocondiciones_terrenoActionPerformed

    private void cbotipo_paredesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_paredesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipo_paredesActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
       gender = "Si";
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
       gender = "No";
    }//GEN-LAST:event_op2ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
       gender2 = "No";
    }//GEN-LAST:event_op4ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
       gender2 = "Si";
    }//GEN-LAST:event_op3ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
       gender3 = "Si";
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
       gender3 = "No";
    }//GEN-LAST:event_op6ActionPerformed

    private void op7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op7ActionPerformed
       gender4 = "Si";
    }//GEN-LAST:event_op7ActionPerformed

    private void op8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op8ActionPerformed
       gender4 = "No";
    }//GEN-LAST:event_op8ActionPerformed

    private void cbotipo_viviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_viviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipo_viviendaActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
         String msj = "";
        
        vsituacion_vivienda dts = new vsituacion_vivienda();
        fsituacion_vivienda func = new fsituacion_vivienda();

        int s = cbocondiciones_terreno.getSelectedIndex();
        dts.setCondiciones_terreno((String) cbocondiciones_terreno.getItemAt(s).toString());

        s = cboforma_tendencia.getSelectedIndex();
        dts.setSituacion_viviendacol((String) cboforma_tendencia.getItemAt(s).toString());

        s = cbotipo_vivienda.getSelectedIndex();
        dts.setTipo_vivienda((String) cbotipo_vivienda.getItemAt(s).toString());
        
        if (check1.isSelected()) {
           msj += "Sala \n";
        }
        if(check2.isSelected()){
           msj += "Baño \n";
        }
        if(check3.isSelected()){
           msj += "Comedor \n";
        }
        if(check4.isSelected()){
           msj += "Cosina \n";
        }
        
        dts.setHabitacion_vivienda(msj);
        
        if(check5.isSelected()){
           msj += "Nevera \n";
        }
        if(check6.isSelected()){
           msj += "Tv \n";
        }
        if(check7.isSelected()){
           msj += "Cosina \n";
        }
        if(check8.isSelected()){
           msj += "Ventilador \n";
        }
        
        if(check9.isSelected()){
           msj += "Cama \n";
        }
        if(check10.isSelected()){
           msj += "Muebles \n";
        }
        if(check11.isSelected()){
           msj += "Gabinetes \n";
        }
        if(check12.isSelected()){
           msj += "Utensilios \n";
        }
        
        dts.setEnseres_vivienda(msj);

        s = cbotipo_paredes.getSelectedIndex();
        dts.setTipo_paredes((String) cbotipo_paredes.getItemAt(s).toString());

        s = cbotipo_techo.getSelectedIndex();
        dts.setTipo_techo((String) cbotipo_techo.getItemAt(s).toString());
        
        dts.setCantidad_habitaciones(txtcantidad_habi.getText());

        s = cbocodiciones_vivienda.getSelectedIndex();
        dts.setCondiciones_vivienda((String) cbocodiciones_vivienda.getItemAt(s).toString());

        dts.setAcepto1(gender);

        s = cbopresenciia_roedores.getSelectedIndex();
        dts.setPresencia_roedores((String) cbopresenciia_roedores.getItemAt(s).toString());

        dts.setAcepto2(gender2);
        
        s = cboanimales_domestico.getSelectedIndex();
        dts.setAnimales_domestico((String) cboanimales_domestico.getItemAt(s).toString());

       
        s = cboaguablanca.getSelectedIndex();
        dts.setAguas_blanca((String) cboaguablanca.getItemAt(s).toString());

        dts.setTanques(gender3);
        dts.setLitros(txtlitros.getText());
        
        dts.setPipotes(gender4);
        dts.setCuantos(txtpipotes.getText());
        
         s = cboagua_servida.getSelectedIndex();
        dts.setAgua_servida((String) cboagua_servida.getItemAt(s).toString());

        s = cbogas.getSelectedIndex();
        dts.setGas((String) cbogas.getItemAt(s).toString());
        
         s = cboempresa_gas.getSelectedIndex();
        dts.setEmpresa_suministra((String) cboempresa_gas.getItemAt(s).toString());

        s = cbocilindros.getSelectedIndex();
        dts.setCuanto_cilindro((String) cbocilindros.getItemAt(s).toString());

        dts.setPrecio_cilindro(txtprecio_cilindro.getText());
        
        if(check13.isSelected()){
           msj += "publico \n";
        }
        if(check14.isSelected()){
           msj += "Planta Electrica \n";
        }
        if(check15.isSelected()){
           msj += "Medidor \n";
        }
        if(check16.isSelected()){
           msj += "Bombillos Ahorradores \n";
        }
        
        dts.setSistema_electrico(msj);

        s = cborecolecion_basura.getSelectedIndex();
        dts.setRecolecion_basura((String) cborecolecion_basura.getItemAt(s).toString());

        s = cbotelefonia.getSelectedIndex();
        dts.setTelefonia((String) cbotelefonia.getItemAt(s).toString());
        
        s = cbotransporte.getSelectedIndex();
        dts.setTransporte((String) cbotransporte.getItemAt(s).toString());
       

        if (cbotransporte.getSelectedItem().equals("SELECIONAR")) {
            val.valEsp(cbocondiciones_terreno);
            val.valEsp(cboforma_tendencia);
            val.valEsp(cbotipo_vivienda);
            val.valEsp(cbotipo_paredes);
            
            val.valEsp(cbotipo_techo);
            val.valEsp(txtcantidad_habi);
            
            val.valEsp(cbocodiciones_vivienda);
            
            val.valEsp(cbopresenciia_roedores);
            val.valEsp(cboanimales_domestico);
            
            val.valEsp2(cboaguablanca);
            val.valEsp(txtlitros);
            val.valEsp(txtpipotes);
            
            val.valEsp2(cboagua_servida);
            val.valEsp2(cbogas);
            val.valEsp2(cboempresa_gas);
           
            val.valEsp2(cbocilindros);
            val.valEsp(txtprecio_cilindro);
            
            val.valEsp(txtcuantos);
            
            val.valEsp2(cborecolecion_basura);
            val.valEsp2(cbotelefonia);
            val.valEsp2(cbotransporte);

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
            dts.setIdservicios(Integer.parseInt(txtidservicios.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "La situacion familiar fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }}
     
    }//GEN-LAST:event_btguardarActionPerformed

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
       val.limpiar2(btguardar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
       val.limpiar1(btguardar);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
       val.limpiar2(btnuevo);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
       val.limpiar1(btnuevo);
       Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (Egoist.Swing.Animator.isBeingAnimated(this) == false) {
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboagua_servida;
    private javax.swing.JComboBox<String> cboaguablanca;
    private javax.swing.JComboBox<String> cboanimales_domestico;
    private javax.swing.JComboBox<String> cbocilindros;
    private javax.swing.JComboBox<String> cbocodiciones_vivienda;
    private javax.swing.JComboBox<String> cbocondiciones_terreno;
    private javax.swing.JComboBox<String> cboempresa_gas;
    private javax.swing.JComboBox<String> cboforma_tendencia;
    private javax.swing.JComboBox<String> cbogas;
    private javax.swing.JComboBox<String> cbopresenciia_roedores;
    private javax.swing.JComboBox<String> cborecolecion_basura;
    private javax.swing.JComboBox<String> cbotelefonia;
    private javax.swing.JComboBox<String> cbotipo_paredes;
    private javax.swing.JComboBox<String> cbotipo_techo;
    private javax.swing.JComboBox<String> cbotipo_vivienda;
    private javax.swing.JComboBox<String> cbotransporte;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check11;
    private javax.swing.JCheckBox check12;
    private javax.swing.JCheckBox check13;
    private javax.swing.JCheckBox check14;
    private javax.swing.JCheckBox check15;
    private javax.swing.JCheckBox check16;
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
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JRadioButton op7;
    private javax.swing.JRadioButton op8;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtb_cuenta;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad_habi;
    private javax.swing.JTextField txtcuantos;
    private javax.swing.JTextField txtidservicios;
    private javax.swing.JTextField txtlitros;
    private javax.swing.JTextField txtpipotes;
    private javax.swing.JTextField txtprecio_cilindro;
    // End of variables declaration//GEN-END:variables
    private String gender;
    private String gender2;
    private String gender3;
    private String gender4;
}
