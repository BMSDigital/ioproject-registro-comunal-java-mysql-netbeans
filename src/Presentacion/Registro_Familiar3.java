/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vsituacion_vivienda;
import Logica.fsituacion_vivienda;
import javax.swing.JOptionPane;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Registro_Familiar3 extends javax.swing.JPanel {

    /**
     * Creates new form Registro_Familiar3
     */
    public Registro_Familiar3() {
        initComponents();
        inhabilitar();
    }
    vsituacion_vivienda dts = new vsituacion_vivienda();
    fsituacion_vivienda func = new fsituacion_vivienda();
    Validaciones val = new Validaciones();
    private String accion = "guardar";

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

        

        btsiguiente.setEnabled(false);

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

        

        btsiguiente.setEnabled(true);

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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbocondiciones_terreno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboforma_tendencia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbotipo_vivienda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad_habi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbotipo_paredes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbotipo_techo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        jLabel47 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        check3 = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        check5 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        check11 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        check6 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        check8 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        check12 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        check10 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cbocodiciones_vivienda = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        cbopresenciia_roedores = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        cboanimales_domestico = new javax.swing.JComboBox<>();
        txtidservicios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboaguablanca = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        label2 = new javax.swing.JLabel();
        txtlitros = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        op7 = new javax.swing.JRadioButton();
        op8 = new javax.swing.JRadioButton();
        label3 = new javax.swing.JLabel();
        txtpipotes = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cboagua_servida = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cbogas = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cboempresa_gas = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbocilindros = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtprecio_cilindro = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        check13 = new javax.swing.JCheckBox();
        check15 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        check14 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        check16 = new javax.swing.JCheckBox();
        label1 = new javax.swing.JLabel();
        txtcuantos = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cborecolecion_basura = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        cbotelefonia = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        cbotransporte = new javax.swing.JComboBox<>();
        btsiguiente = new javax.swing.JButton();
        btnuevo1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 650));
        setMinimumSize(new java.awt.Dimension(1200, 650));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 650));

        jPanel2.setBackground(new java.awt.Color(255,255,255,50));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CONDICIONES DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(373, 495));
        jPanel2.setMinimumSize(new java.awt.Dimension(373, 495));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Condiciones del Terreno");

        cbocondiciones_terreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Estable", "Inestable", "Alto Riesgo", "Vulnerable", "Otro" }));

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

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Habiatacion de Vivienda");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Cantidad de Habitaciones");

        txtcantidad_habi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcantidad_habiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidad_habiKeyTyped(evt);
            }
        });

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Enseres de Vivienda");

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
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel47))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check1)
                            .addComponent(check2)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(check4)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(check1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47)
                    .addComponent(check2))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(check3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(check4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Gabinete");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("TV");

        check6.setBackground(new java.awt.Color(255, 255, 255));
        check6.setBorder(null);
        check6.setBorderPaintedFlat(true);
        check6.setContentAreaFilled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Ventilador");

        check8.setBackground(new java.awt.Color(255, 255, 255));
        check8.setBorder(null);
        check8.setBorderPaintedFlat(true);
        check8.setContentAreaFilled(false);

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Muebles");

        check12.setBackground(new java.awt.Color(255, 255, 255));
        check12.setBorder(null);
        check12.setBorderPaintedFlat(true);
        check12.setContentAreaFilled(false);

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Utensilios");

        check10.setBackground(new java.awt.Color(255, 255, 255));
        check10.setBorder(null);
        check10.setBorderPaintedFlat(true);
        check10.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(23, 23, 23)
                        .addComponent(check9))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(check11)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18)
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
                                            .addComponent(jLabel16))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel17)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(check8)
                                        .addComponent(check10)))))))
                .addContainerGap(16, Short.MAX_VALUE))
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
                    .addComponent(jLabel16))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check9)
                        .addComponent(jLabel15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check10)
                            .addComponent(jLabel17))
                        .addGap(1, 1, 1)))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(check11)
                        .addComponent(jLabel14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(check12))
                        .addGap(1, 1, 1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Condiciones de Salubridades Vivienda");

        cbocodiciones_vivienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Limpia", "Sucia", "Med Limpia", "Sucia", "Otros" }));
        cbocodiciones_vivienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocodiciones_vivienda.setDoubleBuffered(true);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Presencia de Insecto y Roedores ");

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

        cbopresenciia_roedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Moscas", "Hormigas", "Ratones", "Cucarachas", "Ciempiés", "OTRO" }));
        cbopresenciia_roedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Tiene Animales Domestico");

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

        cboanimales_domestico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Perro", "Gato", "Pájaros", "Gallinas", "Patos", "Cochinos", "OTRO" }));
        cboanimales_domestico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboanimales_domestico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(op1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(op2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbopresenciia_roedores, 0, 1, Short.MAX_VALUE))
                            .addComponent(cbocodiciones_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtidservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocondiciones_terreno, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboforma_tendencia, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipo_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipo_paredes, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipo_techo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtcantidad_habi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbocondiciones_terreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboforma_tendencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotipo_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbotipo_paredes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtidservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbotipo_techo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcantidad_habi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbocodiciones_vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(op1)
                    .addComponent(op2)
                    .addComponent(cbopresenciia_roedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(op3)
                    .addComponent(op4)
                    .addComponent(cboanimales_domestico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Situacion del la Vivienda");

        jPanel1.setBackground(new java.awt.Color(255,255,255,30));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SERVICIOS DE LA VIVIENDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Aguas Blanca");

        cboaguablanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Acueducto", "Camión", "Pila pública", "Del Río", "OTRO" }));
        cboaguablanca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Tiene Tanque");

        op5.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup3.add(op5);
        op5.setText("SI");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        buttonGroup3.add(op6);
        op6.setText("NO");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 51, 51));
        label2.setText("Litros");

        txtlitros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlitrosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlitrosKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Tiene Pipotes");

        op7.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup4.add(op7);
        op7.setText("SI");
        op7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op7ActionPerformed(evt);
            }
        });

        buttonGroup4.add(op8);
        op8.setText("NO");
        op8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op8ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 0, 0));
        label3.setText("Cuantos");

        txtpipotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpipotesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpipotesKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Agua Servida");

        cboagua_servida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Cloacas", "Pozo", "séptico", "Letrinas", "Al aire libre", "Depositada en bolsas", "Otros" }));
        cboagua_servida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Gas");

        cbogas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Bombona", "Tubería", "No posee" }));
        cbogas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Empresa que lo suministra");

        cboempresa_gas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Pdval", "AutoGas", "SeviGas", "Otro" }));
        cboempresa_gas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Cuantos Cilindro");

        cbocilindros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "10kg", "18kg", "43kg" }));
        cbocilindros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Precio del cilindro");

        txtprecio_cilindro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecio_cilindroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecio_cilindroKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Sistema Electrico");

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

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Público");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Medidor");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Planta Eléctrica");

        check14.setBackground(new java.awt.Color(255, 255, 255));
        check14.setBorder(null);
        check14.setBorderPaintedFlat(true);
        check14.setContentAreaFilled(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("bombillos ahorradores");

        check16.setBackground(new java.awt.Color(255, 255, 255));
        check16.setBorder(null);
        check16.setBorderPaintedFlat(true);
        check16.setContentAreaFilled(false);
        check16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check16ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 51, 51));
        label1.setText("Cuantos necesita");

        txtcuantos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuantosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuantosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
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
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check16))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcuantos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jLabel31))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(check14)
                            .addGap(1, 1, 1)))
                    .addComponent(jLabel48))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check16)
                    .addComponent(check15)
                    .addComponent(jLabel32)
                    .addComponent(jLabel35))
                .addGap(13, 13, 13)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(txtcuantos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Recolecion de Basura");

        cborecolecion_basura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Aseo Urbano", "Conteiner", "Bajante", "Camión", "Al aire libre", "Quemada", "Otros", " " }));
        cborecolecion_basura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Telefonia ");

        cbotelefonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Domiciliaria", "Celular", "Prepago", "Centro de conexión", "No posee", "Otros", " " }));
        cbotelefonia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Transporte");

        cbotransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "Propio", "Público", "Bestias", "Privado", "Taxi", "Otros", " " }));
        cbotransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboaguablanca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboagua_servida, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 55, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(op7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(op8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(op5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(op6)
                                                .addGap(8, 8, 8)
                                                .addComponent(label2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtlitros)
                                            .addComponent(txtpipotes)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbogas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel29))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboempresa_gas, 0, 173, Short.MAX_VALUE)
                                                .addComponent(cbocilindros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtprecio_cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel37))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cborecolecion_basura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbotelefonia, 0, 171, Short.MAX_VALUE)
                                                .addComponent(cbotransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboaguablanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(op5)
                    .addComponent(op6)
                    .addComponent(label2)
                    .addComponent(txtlitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(op7)
                    .addComponent(op8)
                    .addComponent(label3)
                    .addComponent(txtpipotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(cboagua_servida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cbogas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(cboempresa_gas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cbocilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtprecio_cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel30)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cborecolecion_basura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbotelefonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(cbotransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel40.setText("Inicio");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel50.setText("Vigilancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboforma_tendenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboforma_tendenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboforma_tendenciaActionPerformed

    private void cbotipo_paredesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_paredesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipo_paredesActionPerformed

    private void btsiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseEntered
        btsiguiente.setBackground(new java.awt.Color(255,255,255,175));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseEntered

    private void btsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseExited
        btsiguiente.setBackground(new java.awt.Color(255,255,255,125));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseExited

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed
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
        } else if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                //JOptionPane.showMessageDialog(null, "el cliente fue registrado satisfactoriamente");
                inhabilitar();
                Ajustes.Aplicacion.callMainOption(new Registro_Familiar4());
            }

        }

    }//GEN-LAST:event_btsiguienteActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        gender = "Si";
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
         gender = "No";
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
         gender2 = "Si";
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
         gender2 = "No";
    }//GEN-LAST:event_op4ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        gender3 = "Si";
        if(op5.isSelected()){
          label2.setVisible(true);
          txtlitros.setVisible(true);
       }
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
         gender3 = "No";
         if(op6.isSelected()){
          label2.setVisible(false);
          txtlitros.setVisible(false);
       }
        
    }//GEN-LAST:event_op6ActionPerformed

    private void op7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op7ActionPerformed
         gender4 = "Si";
          if(op7.isSelected()){
          label3.setVisible(true);
          txtpipotes.setVisible(true);
       }
    }//GEN-LAST:event_op7ActionPerformed

    private void op8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op8ActionPerformed
         gender4 = "No";
         if(op8.isSelected()){
          label3.setVisible(false);
          txtpipotes.setVisible(false);
       }
    }//GEN-LAST:event_op8ActionPerformed

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
        txtcuantos.setVisible(false);
        label2.setVisible(false);
        txtlitros.setVisible(false);
        label3.setVisible(false);
        txtpipotes.setVisible(false);
        habilitar();
        btsiguiente.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevo1ActionPerformed

    private void txtcantidad_habiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidad_habiKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtcantidad_habi, evt, 1);
    }//GEN-LAST:event_txtcantidad_habiKeyTyped

    private void txtcantidad_habiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidad_habiKeyPressed
        val.teclasEspeciales(evt, txtcantidad_habi);
    }//GEN-LAST:event_txtcantidad_habiKeyPressed

    private void txtlitrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlitrosKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtlitros, evt, 5);
    }//GEN-LAST:event_txtlitrosKeyTyped

    private void txtlitrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlitrosKeyPressed
        val.teclasEspeciales(evt, txtlitros);
    }//GEN-LAST:event_txtlitrosKeyPressed

    private void txtpipotesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpipotesKeyTyped
        val.digitos(evt);
        val.espacioMaximo(txtpipotes, evt, 2);
    }//GEN-LAST:event_txtpipotesKeyTyped

    private void txtpipotesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpipotesKeyPressed
        val.teclasEspeciales(evt, txtpipotes);
    }//GEN-LAST:event_txtpipotesKeyPressed

    private void txtcuantosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuantosKeyTyped
       val.letras(evt);
       val.espacioMaximo(txtcuantos, evt, 2);
    }//GEN-LAST:event_txtcuantosKeyTyped

    private void txtprecio_cilindroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecio_cilindroKeyTyped
       val.digitos(evt);
       val.espacioMaximo(txtprecio_cilindro, evt, 8);
    }//GEN-LAST:event_txtprecio_cilindroKeyTyped

    private void txtprecio_cilindroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecio_cilindroKeyPressed
        val.teclasEspeciales(evt, txtprecio_cilindro);
    }//GEN-LAST:event_txtprecio_cilindroKeyPressed

    private void txtcuantosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuantosKeyPressed
        val.digitos(evt);
        val.espacioMaximo(txtcuantos, evt, 2);
    }//GEN-LAST:event_txtcuantosKeyPressed

    private void check16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check16ActionPerformed
       if(check16.isSelected()){
          label1.setVisible(true);
          txtcuantos.setVisible(true);
       }else{
          label1.setVisible(false);
          txtcuantos.setVisible(false);
       }
    }//GEN-LAST:event_check16ActionPerformed
    
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
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JRadioButton op7;
    private javax.swing.JRadioButton op8;
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
