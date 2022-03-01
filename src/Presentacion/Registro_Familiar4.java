/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vparticipacion_ciudadana;
import Logica.fparticipacion_ciudadana;
import javax.swing.JOptionPane;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Registro_Familiar4 extends javax.swing.JPanel {

    /**
     * Creates new form Registro_Familiar4
     */
    public Registro_Familiar4() {
        initComponents();
        inhabilitar();
    }
    private String accion = "guardar";
    Validaciones val = new Validaciones();

    void inhabilitar() {

        txtidparticipacion_ciudadana.setVisible(false);

        check1.setEnabled(false);
        check2.setEnabled(false);
        check3.setEnabled(false);
        check4.setEnabled(false);
        check5.setEnabled(false);
        txtcual.setEnabled(false);

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
        check17.setEnabled(false);
        txtcual2.setEnabled(false);

        op1.setEnabled(false);
        op2.setEnabled(false);
        txtcuales.setEnabled(false);

        op3.setEnabled(false);
        op4.setEnabled(false);
        op5.setEnabled(false);
        op6.setEnabled(false);

        check18.setEnabled(false);
        check19.setEnabled(false);
        check20.setEnabled(false);
        check21.setEnabled(false);
        check22.setEnabled(false);
        check23.setEnabled(false);
        check24.setEnabled(false);
        check24.setEnabled(false);
        check25.setEnabled(false);
        txtcuales2.setEnabled(false);

        op7.setEnabled(false);
        op8.setEnabled(false);
        op9.setEnabled(false);
        op10.setEnabled(false);
        op11.setEnabled(false);
        op12.setEnabled(false);
        op13.setEnabled(false);
        op14.setEnabled(false);
        op15.setEnabled(false);
        op16.setEnabled(false);
        txtradio.setEnabled(false);

        txtcual.setText("");
        txtcual2.setText("");
        txtcuales.setText("");
        txtcuales.setText("");
        txtradio.setText("");
    }

    void habilitar() {
        txtidparticipacion_ciudadana.setVisible(false);

        check1.setEnabled(true);
        check2.setEnabled(true);
        check3.setEnabled(true);
        check4.setEnabled(true);
        check5.setEnabled(true);
        txtcual.setEnabled(true);

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
        check17.setEnabled(true);
        txtcual2.setEnabled(true);

        op1.setEnabled(true);
        op2.setEnabled(true);
        txtcuales.setEnabled(true);

        op3.setEnabled(true);
        op4.setEnabled(true);
        op5.setEnabled(true);
        op6.setEnabled(true);

        check18.setEnabled(true);
        check19.setEnabled(true);
        check20.setEnabled(true);
        check21.setEnabled(true);
        check22.setEnabled(true);
        check23.setEnabled(true);
        check24.setEnabled(true);
        check24.setEnabled(true);
        check25.setEnabled(true);
        txtcuales2.setEnabled(true);

        op7.setEnabled(true);
        op8.setEnabled(true);
        op9.setEnabled(true);
        op10.setEnabled(true);
        op11.setEnabled(true);
        op12.setEnabled(true);
        op13.setEnabled(true);
        op14.setEnabled(true);
        op15.setEnabled(true);
        op16.setEnabled(true);
        txtradio.setEnabled(true);
        txtcual.setText("");
        txtcual2.setText("");
        txtcuales.setText("");
        txtcuales.setText("");
        txtradio.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        check1 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        check4 = new javax.swing.JCheckBox();
        txtcual = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        check6 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        check10 = new javax.swing.JCheckBox();
        check12 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        check7 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        check9 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        check13 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        check11 = new javax.swing.JCheckBox();
        check15 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        check14 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        check17 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        check16 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        txtcual2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        op4 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        op2 = new javax.swing.JRadioButton();
        op1 = new javax.swing.JRadioButton();
        label3 = new javax.swing.JLabel();
        txtcuales = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        check18 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        check19 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        check20 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        check21 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        check22 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        check23 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        check24 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        txtcuales2 = new javax.swing.JTextField();
        check25 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        op8 = new javax.swing.JRadioButton();
        op7 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        op10 = new javax.swing.JRadioButton();
        op9 = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        op12 = new javax.swing.JRadioButton();
        op11 = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        op14 = new javax.swing.JRadioButton();
        op13 = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        op16 = new javax.swing.JRadioButton();
        op15 = new javax.swing.JRadioButton();
        label5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtradio = new javax.swing.JTextArea();
        btsiguiente = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        txtidparticipacion_ciudadana = new javax.swing.JTextField();

        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1180, 633));
        setMinimumSize(new java.awt.Dimension(1180, 633));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1180, 633));

        jPanel1.setBackground(new java.awt.Color(255,255,255,20));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel1.setPreferredSize(new java.awt.Dimension(392, 493));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Mecanismo de Informacion ");

        jPanel8.setBackground(new java.awt.Color(255,255,255,20));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check1.setBackground(new java.awt.Color(255, 255, 255));
        check1.setBorder(null);
        check1.setBorderPaintedFlat(true);
        check1.setContentAreaFilled(false);

        check3.setBackground(new java.awt.Color(255, 255, 255));
        check3.setBorder(null);
        check3.setBorderPaintedFlat(true);
        check3.setContentAreaFilled(false);

        check5.setBackground(new java.awt.Color(255, 255, 255));
        check5.setBorder(null);
        check5.setBorderPaintedFlat(true);
        check5.setContentAreaFilled(false);
        check5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Radio");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Internet");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Otros");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("Television");

        check2.setBackground(new java.awt.Color(255, 255, 255));
        check2.setBorder(null);
        check2.setBorderPaintedFlat(true);
        check2.setContentAreaFilled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Medios Alternativos");

        check4.setBackground(new java.awt.Color(255, 255, 255));
        check4.setBorder(null);
        check4.setBorderPaintedFlat(true);
        check4.setContentAreaFilled(false);

        txtcual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcualKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualKeyTyped(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("Cual Es");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(check5)
                    .addComponent(check1)
                    .addComponent(check3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcual))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(check1)
                        .addGap(12, 12, 12)
                        .addComponent(check3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check5))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(check2)
                                    .addGap(1, 1, 1)))
                            .addComponent(jLabel43))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255,255,255,20));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check6.setBackground(new java.awt.Color(255, 255, 255));
        check6.setBorder(null);
        check6.setBorderPaintedFlat(true);
        check6.setContentAreaFilled(false);

        check8.setBackground(new java.awt.Color(255, 255, 255));
        check8.setBorder(null);
        check8.setBorderPaintedFlat(true);
        check8.setContentAreaFilled(false);

        check10.setBackground(new java.awt.Color(255, 255, 255));
        check10.setBorder(null);
        check10.setBorderPaintedFlat(true);
        check10.setContentAreaFilled(false);

        check12.setBackground(new java.awt.Color(255, 255, 255));
        check12.setBorder(null);
        check12.setBorderPaintedFlat(true);
        check12.setContentAreaFilled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Bodega");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Preescolar");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Escuelas");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Liceos");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Farmacia");

        check7.setBackground(new java.awt.Color(255, 255, 255));
        check7.setBorder(null);
        check7.setBorderPaintedFlat(true);
        check7.setContentAreaFilled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Plazas y Parques");

        check9.setBackground(new java.awt.Color(255, 255, 255));
        check9.setBorder(null);
        check9.setBorderPaintedFlat(true);
        check9.setContentAreaFilled(false);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Centro de Salud");

        check13.setBackground(new java.awt.Color(255, 255, 255));
        check13.setBorder(null);
        check13.setBorderPaintedFlat(true);
        check13.setContentAreaFilled(false);

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Canchas");

        check11.setBackground(new java.awt.Color(255, 255, 255));
        check11.setBorder(null);
        check11.setBorderPaintedFlat(true);
        check11.setContentAreaFilled(false);

        check15.setBackground(new java.awt.Color(255, 255, 255));
        check15.setBorder(null);
        check15.setBorderPaintedFlat(true);
        check15.setContentAreaFilled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Abasto");

        check14.setBackground(new java.awt.Color(255, 255, 255));
        check14.setBorder(null);
        check14.setBorderPaintedFlat(true);
        check14.setContentAreaFilled(false);

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Casa Comunal");

        check17.setBackground(new java.awt.Color(255, 255, 255));
        check17.setBorder(null);
        check17.setBorderPaintedFlat(true);
        check17.setContentAreaFilled(false);
        check17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check17ActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Otros...");

        check16.setBackground(new java.awt.Color(255, 255, 255));
        check16.setBorder(null);
        check16.setBorderPaintedFlat(true);
        check16.setContentAreaFilled(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Iglesia");

        label2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 0, 0));
        label2.setText("Cual Es");

        txtcual2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcual2.setForeground(new java.awt.Color(204, 204, 204));
        txtcual2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcual2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcual2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel27)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label2)
                                .addComponent(jLabel30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(check6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(check8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(check10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(check14)
                                    .addComponent(check16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)))
                            .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check13)
                    .addComponent(check7)
                    .addComponent(check9)
                    .addComponent(check11)
                    .addComponent(check15)
                    .addComponent(check17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(1, 1, 1))
                            .addComponent(check10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(check12)
                                    .addComponent(jLabel22))
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel27))
                                    .addComponent(check14)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel30))
                                .addComponent(check16))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(check7)
                        .addGap(13, 13, 13)
                        .addComponent(check9)
                        .addGap(12, 12, 12)
                        .addComponent(check11)
                        .addGap(13, 13, 13)
                        .addComponent(check13)
                        .addGap(16, 16, 16)
                        .addComponent(check15)
                        .addGap(16, 16, 16)
                        .addComponent(check17)))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(txtcual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Servicios Comunales");

        jPanel5.setBackground(new java.awt.Color(255,255,255,20));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("¿Participa Usted en alguna de ellas?");

        buttonGroup2.add(op4);
        op4.setText("NO");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup2.add(op3);
        op3.setText("SI");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("¿Participa algún miembro de la familia?");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(op5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op4))
                    .addComponent(jLabel26)
                    .addComponent(jLabel4))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op4)
                    .addComponent(op3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op6)
                    .addComponent(op5)))
        );

        jPanel6.setBackground(new java.awt.Color(255,255,255,20));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("¿Existen Organizaciones Comunitarias");

        buttonGroup1.add(op2);
        op2.setText("NO");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op1.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup1.add(op1);
        op1.setText("SI");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 0, 0));
        label3.setText("¿Cuáles?");

        txtcuales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcualesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcualesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(op1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op2))
                    .addComponent(jLabel31)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcuales)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op2)
                    .addComponent(op1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(txtcuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel4.setBackground(new java.awt.Color(255,255,255,20));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("¿Cuáles misiones se están implementando en la comunidad?");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ribas");

        check18.setBackground(new java.awt.Color(255, 255, 255));
        check18.setBorder(null);
        check18.setBorderPaintedFlat(true);
        check18.setContentAreaFilled(false);

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Sucre");

        check19.setBackground(new java.awt.Color(255, 255, 255));
        check19.setBorder(null);
        check19.setBorderPaintedFlat(true);
        check19.setContentAreaFilled(false);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Vuelvan Caras");

        check20.setBackground(new java.awt.Color(255, 255, 255));
        check20.setBorder(null);
        check20.setBorderPaintedFlat(true);
        check20.setContentAreaFilled(false);
        check20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check20ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Identidad");

        check21.setBackground(new java.awt.Color(255, 255, 255));
        check21.setBorder(null);
        check21.setBorderPaintedFlat(true);
        check21.setContentAreaFilled(false);

        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Barrio Adentro");

        check22.setBackground(new java.awt.Color(255, 255, 255));
        check22.setBorder(null);
        check22.setBorderPaintedFlat(true);
        check22.setContentAreaFilled(false);

        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Mercal");

        check23.setBackground(new java.awt.Color(255, 255, 255));
        check23.setBorder(null);
        check23.setBorderPaintedFlat(true);
        check23.setContentAreaFilled(false);

        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Ezequiel Zamora");

        check24.setBackground(new java.awt.Color(255, 255, 255));
        check24.setBorder(null);
        check24.setBorderPaintedFlat(true);
        check24.setContentAreaFilled(false);

        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Otras");

        label4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 0, 0));
        label4.setText("Cuales");

        txtcuales2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuales2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuales2KeyTyped(evt);
            }
        });

        check25.setBackground(new java.awt.Color(255, 255, 255));
        check25.setBorder(null);
        check25.setBorderPaintedFlat(true);
        check25.setContentAreaFilled(false);
        check25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(check18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(check19)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check24)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(check20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check21)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel23)
                                .addGap(6, 6, 6)
                                .addComponent(check22)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel24)
                                .addGap(6, 6, 6)
                                .addComponent(check23))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(check25)
                                .addGap(58, 58, 58)
                                .addComponent(label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcuales2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel35))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(check22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24)
                                .addComponent(check23))
                            .addGap(1, 1, 1))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(check21)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(check19)
                                .addComponent(jLabel9)
                                .addComponent(check20, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check18)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel32)
                        .addComponent(check24)
                        .addComponent(check25))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(txtcuales2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Participacion Comunitaria");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/home.png"))); // NOI18N
        jLabel40.setText("Inicio");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/circular-webcam.png"))); // NOI18N
        jLabel50.setText("Vigilancia");

        jPanel2.setBackground(new java.awt.Color(255,255,255,30));

        jPanel10.setBackground(new java.awt.Color(255,255,255,20));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("¿Cree Ud. que en la actualidad el pueblo");

        buttonGroup4.add(op8);
        op8.setText("NO");
        op8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op8ActionPerformed(evt);
            }
        });

        op7.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup4.add(op7);
        op7.setText("SI");
        op7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op7ActionPerformed(evt);
            }
        });

        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("está interviniendo en las decisiones sobre");

        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("cómo deben gastarse los recursos de su");

        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("comunidad?");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(op7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op8)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op8)
                        .addComponent(op7))
                    .addComponent(jLabel48))
                .addGap(76, 76, 76))
        );

        jPanel11.setBackground(new java.awt.Color(255,255,255,20));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("¿Está de acuerdo, que según la Constitución");

        buttonGroup5.add(op10);
        op10.setText("NO");
        op10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op10ActionPerformed(evt);
            }
        });

        op9.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup5.add(op9);
        op9.setText("SI");
        op9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op9ActionPerformed(evt);
            }
        });

        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("es ahora el Pueblo organizado quien debe");

        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("tener el protagonismo y el Poder para decidir ");

        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("decidir sobre como invertir el presupuesto en");

        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("comunidad?");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(op9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op10)
                        .addComponent(op9))
                    .addComponent(jLabel53))
                .addGap(76, 76, 76))
        );

        jPanel12.setBackground(new java.awt.Color(255,255,255,20));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("¿Tiene información sobre la propuesta de");

        buttonGroup6.add(op12);
        op12.setText("NO");
        op12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op12ActionPerformed(evt);
            }
        });

        op11.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup6.add(op11);
        op11.setText("SI");
        op11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op11ActionPerformed(evt);
            }
        });

        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("de creación de consejos comunales?");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel54)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(op11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op12)
                    .addComponent(op11))
                .addGap(76, 76, 76))
        );

        jPanel13.setBackground(new java.awt.Color(255,255,255,20));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("¿Estaría dispuesto(a) a apoyar y participar");

        buttonGroup7.add(op14);
        op14.setText("NO");
        op14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op14ActionPerformed(evt);
            }
        });

        op13.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup7.add(op13);
        op13.setText("SI");
        op13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op13ActionPerformed(evt);
            }
        });

        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setText("en la creación de un consejo comunal en su");

        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setText("comunidad?");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(op13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op14)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op14)
                        .addComponent(op13))
                    .addComponent(jLabel57))
                .addGap(76, 76, 76))
        );

        jPanel14.setBackground(new java.awt.Color(255,255,255,20));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setText("Participa Ud. o asiste a las asambleas de Ciudadanos (as)");

        buttonGroup8.add(op16);
        op16.setText("NO");
        op16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op16ActionPerformed(evt);
            }
        });

        op15.setBackground(new java.awt.Color(255,255,255,50)
        );
        buttonGroup8.add(op15);
        op15.setText("SI");
        op15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op15ActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 0, 0));
        label5.setText("de ser NO su respuesta explique");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtradio.setColumns(20);
        txtradio.setRows(5);
        txtradio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtradioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtradioKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtradio);

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
        btnuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnuevoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(op15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(op16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(op16)
                    .addComponent(op15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnuevo)))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidparticipacion_ciudadana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidparticipacion_ciudadana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void check20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check20ActionPerformed

    private void btsiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseEntered
        btsiguiente.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseEntered

    private void btsiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsiguienteMouseExited
        btsiguiente.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btsiguienteMouseExited

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed
        vparticipacion_ciudadana dts = new vparticipacion_ciudadana();
        fparticipacion_ciudadana func = new fparticipacion_ciudadana();
        String msj = "";
        String msj2 = "";
        String msj3 = "";

        if (check1.isSelected()) {
            msj += "Radio \n";
        }
        if (check2.isSelected()) {
            msj += "TV \n";
        }
        if (check3.isSelected()) {
            msj += "Internet \n";
        }
        if (check4.isSelected()) {
            msj += "Medios alternativo \n";
        }
        if (check5.isSelected()) {
            msj += "Otros \n";
        }
        dts.setMecanismo_informacion(msj);
        dts.setCuales(txtcual.getText());

        if (check6.isSelected()) {
            msj2 += "Bodega \n";
        }
        if (check7.isSelected()) {
            msj2 += "Farmacias \n";
        }
        if (check8.isSelected()) {
            msj2 += "Preescolar \n";
        }
        if (check9.isSelected()) {
            msj2 += "Plaza y Parques \n";
        }

        if (check10.isSelected()) {
            msj2 += "Escuela \n";
        }
        if (check11.isSelected()) {
            msj2 += "Centro de salud \n";
        }
        if (check12.isSelected()) {
            msj2 += "Liceo \n";
        }
        if (check13.isSelected()) {
            msj2 += "Canchas \n";
        }
        if (check14.isSelected()) {
            msj2 += "Abasto \n";
        }
        if (check15.isSelected()) {
            msj2 += "Casa Comunal \n";
        }

        if (check16.isSelected()) {
            msj2 += "Iglesia \n";
        }
        if (check17.isSelected()) {
            msj2 += "Otro \n";
        }

        dts.setServicios_comunitario(msj2);
        dts.setCuales2(txtcual2.getText());

        dts.setExiste_organizaciones(gender);
        dts.setParticipa_alguna(gender1);
        dts.setParticipa_algun_miembro(gender2);

        if (check18.isSelected()) {
            msj3 += "Rivas \n";
        }
        if (check19.isSelected()) {
            msj3 += "Sucre \n";
        }
        if (check20.isSelected()) {
            msj3 += "Vuelvan Caras \n";
        }
        if (check21.isSelected()) {
            msj3 += "Identidad \n";
        }
        if (check22.isSelected()) {
            msj3 += "Barrio adentro \n";
        }
        if (check23.isSelected()) {
            msj3 += "Mercal \n";
        }

        if (check24.isSelected()) {
            msj3 += "Ezequiel zamora \n";
        }
        if (check25.isSelected()) {
            msj3 += "Otro \n";
        }

        dts.setCuales_misiones(msj3);
        dts.setOtro(txtcuales2.getText());

        dts.setEstan_interviniendo(gender3);
        dts.setEstas_deacuerdo(gender4);
        dts.setTienes_info(gender5);
        dts.setEstaria_dispuesto(gender6);
        dts.setParticipa_usted(gender7);
        dts.setDeno_respuesta(txtradio.getText());

        if (txtradio.getText().length() == 0) {
            val.valEsp(txtcual);
            val.valEsp(txtcual2);
            val.valEsp(txtcuales);
            val.valEsp(txtcuales2);
            val.valEsp(txtradio);

            return;
        } else if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                //JOptionPane.showMessageDialog(null, "Los datos del jefe familiar fue registrado satisfactoriamente");
                inhabilitar();
                Ajustes.Aplicacion.callMainOption(new Registro_Familiar5());
            }

        }

    }//GEN-LAST:event_btsiguienteActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        label1.setVisible(false);
        txtcual.setVisible(false);
        label2.setVisible(false);
        txtcual2.setVisible(false);
        
        label3.setVisible(false);
        txtcuales.setVisible(false);
        
        label4.setVisible(false);
        txtcuales2.setVisible(false);
        
        label5.setVisible(false);
        txtradio.setVisible(false);
        
        
        habilitar();
        btsiguiente.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        gender = "Si";
        if(op1.isSelected()){
          label3.setVisible(true);
          txtcuales.setVisible(true);
       }
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        gender = "No";
        if(op2.isSelected()){
          label3.setVisible(false);
          txtcuales.setVisible(false);
       }
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

    private void op7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op7ActionPerformed
        gender3 = "Si";
    }//GEN-LAST:event_op7ActionPerformed

    private void op8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op8ActionPerformed
        gender3 = "No";
    }//GEN-LAST:event_op8ActionPerformed

    private void op9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op9ActionPerformed
        gender4 = "Si";
    }//GEN-LAST:event_op9ActionPerformed

    private void op10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op10ActionPerformed
        gender4 = "No";
    }//GEN-LAST:event_op10ActionPerformed

    private void op11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op11ActionPerformed
        gender5 = "Si";
    }//GEN-LAST:event_op11ActionPerformed

    private void op12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op12ActionPerformed
        gender5 = "No";
    }//GEN-LAST:event_op12ActionPerformed

    private void op13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op13ActionPerformed
        gender6 = "Si";
    }//GEN-LAST:event_op13ActionPerformed

    private void op14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op14ActionPerformed
        gender6 = "No";
    }//GEN-LAST:event_op14ActionPerformed

    private void op15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op15ActionPerformed
        gender7 = "Si";
        if(op15.isSelected()){
          label5.setVisible(false);
          txtradio.setVisible(false);
       }
    }//GEN-LAST:event_op15ActionPerformed

    private void op16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op16ActionPerformed
        gender7 = "No";
        if(op16.isSelected()){
          label5.setVisible(true);
          txtradio.setVisible(true);
       }
    }//GEN-LAST:event_op16ActionPerformed

    private void check5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check5ActionPerformed
        if (check5.isSelected()) {
            label1.setVisible(true);
            txtcual.setVisible(true);
        } else {
            label1.setVisible(false);
            txtcual.setVisible(false);
        }
    }//GEN-LAST:event_check5ActionPerformed

    private void check17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check17ActionPerformed
        if (check17.isSelected()) {
            label2.setVisible(true);
            txtcual2.setVisible(true);
        } else {
            label2.setVisible(false);
            txtcual2.setVisible(false);
        }
    }//GEN-LAST:event_check17ActionPerformed

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

    private void txtcualesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualesKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtcuales, evt, 15);
    }//GEN-LAST:event_txtcualesKeyTyped

    private void txtcualesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcualesKeyPressed
        val.teclasEspeciales(evt, txtcuales);
    }//GEN-LAST:event_txtcualesKeyPressed

    private void txtcuales2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuales2KeyTyped
        val.letras(evt);
        val.espacioMaximo(txtcuales2, evt, 15);
    }//GEN-LAST:event_txtcuales2KeyTyped

    private void txtcuales2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuales2KeyPressed
        val.teclasEspeciales(evt, txtcuales2);
    }//GEN-LAST:event_txtcuales2KeyPressed

    private void txtradioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtradioKeyTyped
        val.letras(evt);
    }//GEN-LAST:event_txtradioKeyTyped

    private void txtradioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtradioKeyPressed

    }//GEN-LAST:event_txtradioKeyPressed

    private void btnuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnuevoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnuevoKeyTyped

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered
         btnuevo.setBackground(new java.awt.Color(255, 255, 255, 175));
         Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btnuevoMouseEntered

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited
         btnuevo.setBackground(new java.awt.Color(255, 255, 255, 125));
         Ajustes.Aplicacion.getScreen();
    }//GEN-LAST:event_btnuevoMouseExited

    private void check25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check25ActionPerformed
        if (check25.isSelected()) {
            label4.setVisible(true);
            txtcuales2.setVisible(true);
        } else {
            label4.setVisible(false);
            txtcuales2.setVisible(false);
        }
    }//GEN-LAST:event_check25ActionPerformed
    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        if (Egoist.Swing.Animator.isBeingAnimated(this) == false) {
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check11;
    private javax.swing.JCheckBox check12;
    private javax.swing.JCheckBox check13;
    private javax.swing.JCheckBox check14;
    private javax.swing.JCheckBox check15;
    private javax.swing.JCheckBox check16;
    private javax.swing.JCheckBox check17;
    private javax.swing.JCheckBox check18;
    private javax.swing.JCheckBox check19;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check20;
    private javax.swing.JCheckBox check21;
    private javax.swing.JCheckBox check22;
    private javax.swing.JCheckBox check23;
    private javax.swing.JCheckBox check24;
    private javax.swing.JCheckBox check25;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op10;
    private javax.swing.JRadioButton op11;
    private javax.swing.JRadioButton op12;
    private javax.swing.JRadioButton op13;
    private javax.swing.JRadioButton op14;
    private javax.swing.JRadioButton op15;
    private javax.swing.JRadioButton op16;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JRadioButton op7;
    private javax.swing.JRadioButton op8;
    private javax.swing.JRadioButton op9;
    private javax.swing.JTextField txtcual;
    private javax.swing.JTextField txtcual2;
    private javax.swing.JTextField txtcuales;
    private javax.swing.JTextField txtcuales2;
    private javax.swing.JTextField txtidparticipacion_ciudadana;
    private javax.swing.JTextArea txtradio;
    // End of variables declaration//GEN-END:variables
    private String gender = "";
    private String gender1 = "";
    private String gender2 = "";
    private String gender3 = "";
    private String gender4 = "";
    private String gender5 = "";
    private String gender6 = "";
    private String gender7 = "";

}
