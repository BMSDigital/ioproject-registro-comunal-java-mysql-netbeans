/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Ajustes.Validaciones;
import Datos.vsituacion_comunitaria;
import Logica.fsituacion_comunitaria;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class msituacion_comunidad extends javax.swing.JPanel {
    private String accion = "guardar";
    Validaciones val = new Validaciones();
    /**
     * Creates new form msituacion_comunidad
     */
    public msituacion_comunidad() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
void inhabilitar() {
        txtidsituacion_comunitaria.setVisible(false);

        areaquesevan.setEnabled(false);
        txtquiencree.setEnabled(false);
        areatipo_proyecto.setEnabled(false);
        areacomoapoyaria.setEnabled(false);
        areaqueopinacensoenergetico.setEnabled(false);
        areaaspectosventajosos.setEnabled(false);
        areadebilidades.setEnabled(false);
        areamejoramiento.setEnabled(false);
        txtcual.setEnabled(false);

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

        btguardar.setEnabled(false);
        areaquesevan.setText("");
        txtquiencree.setText("");
        areatipo_proyecto.setText("");
        areacomoapoyaria.setText("");

        areaqueopinacensoenergetico.setText("");
        areaaspectosventajosos.setText("");
        areadebilidades.setText("");
        areamejoramiento.setText("");
        txtcual.setText("");

    }

    void habilitar() {
        txtidsituacion_comunitaria.setVisible(false);

        areaquesevan.setEnabled(true);
        txtquiencree.setEnabled(true);
        areatipo_proyecto.setEnabled(true);
        areacomoapoyaria.setEnabled(true);
        areaqueopinacensoenergetico.setEnabled(true);
        areaaspectosventajosos.setEnabled(true);
        areadebilidades.setEnabled(true);
        areamejoramiento.setEnabled(true);
        txtcual.setEnabled(true);

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

        btguardar.setEnabled(true);
        areaquesevan.setText("");
        txtquiencree.setText("");
        areatipo_proyecto.setText("");
        areacomoapoyaria.setText("");

        areaqueopinacensoenergetico.setText("");
        areaaspectosventajosos.setText("");
        areadebilidades.setText("");
        areamejoramiento.setText("");
        txtcual.setText("");
    }
    
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fsituacion_comunitaria func = new fsituacion_comunitaria();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            val.ocultarColumna(tablalistado);
            lbtotalregistro.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel235 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        areaquesevan = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        txtquiencree = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        areatipo_proyecto = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        areacomoapoyaria = new javax.swing.JTextArea();
        jLabel239 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        areaqueopinacensoenergetico = new javax.swing.JTextArea();
        jLabel240 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaaspectosventajosos = new javax.swing.JTextArea();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        check5 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        check7 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        check9 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        check10 = new javax.swing.JCheckBox();
        jLabel241 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadebilidades = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areamejoramiento = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtcual = new javax.swing.JTextField();
        txtidsituacion_comunitaria = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1180, 633));
        setMinimumSize(new java.awt.Dimension(1180, 633));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1180, 633));

        jPanel2.setBackground(new java.awt.Color(255, 175, 17,0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Situacion de la comunidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
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
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(btnuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btguardar))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnuevo)
                        .addComponent(btguardar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14)
                    .addComponent(lbtotalregistro))
                .addGap(10, 10, 10))
        );

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel235.setForeground(new java.awt.Color(204, 204, 204));
        jLabel235.setText("Como cree Ud. Que se van a resolver");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText(" los problemas del sector");

        areaquesevan.setColumns(20);
        areaquesevan.setRows(5);
        areaquesevan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        areaquesevan.setDoubleBuffered(true);
        areaquesevan.setOpaque(false);
        jScrollPane24.setViewportView(areaquesevan);

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(" los problemas del sector");

        jLabel236.setForeground(new java.awt.Color(204, 204, 204));
        jLabel236.setText("Quien cree que va a a resolver");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(" que se ejecutaran en su comunidad");

        jLabel237.setForeground(new java.awt.Color(204, 204, 204));
        jLabel237.setText("Que tipo de proyectos le gustaría");

        areatipo_proyecto.setColumns(20);
        areatipo_proyecto.setRows(5);
        areatipo_proyecto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areatipo_proyecto.setDoubleBuffered(true);
        areatipo_proyecto.setOpaque(false);
        jScrollPane25.setViewportView(areatipo_proyecto);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText(" y ejecuten los proyectos");

        jLabel238.setForeground(new java.awt.Color(204, 204, 204));
        jLabel238.setText("Como apoyaría Ud. A que se realicen");

        areacomoapoyaria.setColumns(20);
        areacomoapoyaria.setRows(5);
        areacomoapoyaria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacomoapoyaria.setDoubleBuffered(true);
        areacomoapoyaria.setOpaque(false);
        jScrollPane26.setViewportView(areacomoapoyaria);

        jLabel239.setForeground(new java.awt.Color(204, 204, 204));
        jLabel239.setText("Que opina Ud. del censo energético:");

        areaqueopinacensoenergetico.setColumns(20);
        areaqueopinacensoenergetico.setRows(5);
        areaqueopinacensoenergetico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        areaqueopinacensoenergetico.setDoubleBuffered(true);
        areaqueopinacensoenergetico.setOpaque(false);
        jScrollPane27.setViewportView(areaqueopinacensoenergetico);

        jLabel240.setForeground(new java.awt.Color(204, 204, 204));
        jLabel240.setText("¿Cuáles cree Ud. que son los aspectos");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ventajosos que tiene comunidad");

        areaaspectosventajosos.setColumns(20);
        areaaspectosventajosos.setRows(5);
        areaaspectosventajosos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        areaaspectosventajosos.setOpaque(false);
        jScrollPane2.setViewportView(areaaspectosventajosos);

        jLabel248.setForeground(new java.awt.Color(204, 204, 204));
        jLabel248.setText("¿De crearse un consejo comunal en su comunidad,en cual área de trabajo");

        jLabel249.setForeground(new java.awt.Color(204, 204, 204));
        jLabel249.setText("le gustaría participar? (Marque 3 opciones)");

        jPanel9.setBackground(new java.awt.Color(255,255,255,20));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check1.setBackground(new java.awt.Color(255, 255, 255));
        check1.setBorder(null);
        check1.setBorderPaintedFlat(true);
        check1.setContentAreaFilled(false);

        check2.setBackground(new java.awt.Color(255, 255, 255));
        check2.setBorder(null);
        check2.setBorderPaintedFlat(true);
        check2.setContentAreaFilled(false);

        check3.setBackground(new java.awt.Color(255, 255, 255));
        check3.setBorder(null);
        check3.setBorderPaintedFlat(true);
        check3.setContentAreaFilled(false);

        check4.setBackground(new java.awt.Color(255, 255, 255));
        check4.setBorder(null);
        check4.setBorderPaintedFlat(true);
        check4.setContentAreaFilled(false);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Contraloría y Seguimiento");

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Relaciones Públicas y Medios");

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Seguridad Ciudadana");

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Infraestructura, Vivienda y Servicios Públicos");

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Formación y Conciencia Ideológica");

        check5.setBackground(new java.awt.Color(255, 255, 255));
        check5.setBorder(null);
        check5.setBorderPaintedFlat(true);
        check5.setContentAreaFilled(false);

        check6.setBackground(new java.awt.Color(255, 255, 255));
        check6.setBorder(null);
        check6.setBorderPaintedFlat(true);
        check6.setContentAreaFilled(false);

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Alimentación y Nutrición");

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Educación Cultura y Tecnología");

        check7.setBackground(new java.awt.Color(255, 255, 255));
        check7.setBorder(null);
        check7.setBorderPaintedFlat(true);
        check7.setContentAreaFilled(false);

        check8.setBackground(new java.awt.Color(255, 255, 255));
        check8.setBorder(null);
        check8.setBorderPaintedFlat(true);
        check8.setContentAreaFilled(false);

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Salud, Deporte y Saneamiento Ambiental");

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Ejecución de Programas Sociales y las Misiones");

        check9.setBackground(new java.awt.Color(255, 255, 255));
        check9.setBorder(null);
        check9.setBorderPaintedFlat(true);
        check9.setContentAreaFilled(false);

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Otro");

        check10.setBackground(new java.awt.Color(255, 255, 255));
        check10.setBorder(null);
        check10.setBorderPaintedFlat(true);
        check10.setContentAreaFilled(false);

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
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check1)
                            .addComponent(check2)
                            .addComponent(check3)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(check4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(check5)
                                .addComponent(check6)
                                .addComponent(check7)
                                .addComponent(check8)
                                .addComponent(check9)
                                .addComponent(check10)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check1)
                    .addComponent(jLabel15))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check2)
                    .addComponent(jLabel17))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel18))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(check3)))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(check4)
                        .addGap(1, 1, 1)))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel27))
                    .addComponent(check5))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel30))
                    .addComponent(check6))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel31))
                    .addComponent(check7))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel32))
                    .addComponent(check8))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel33))
                    .addComponent(check9))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel34))
                    .addComponent(check10))
                .addGap(1, 1, 1))
        );

        jLabel241.setForeground(new java.awt.Color(204, 204, 204));
        jLabel241.setText("¿Cuáles cree Ud. que son los problemas");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("y debilidades de su comunidad?");

        areadebilidades.setColumns(20);
        areadebilidades.setRows(5);
        areadebilidades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        areadebilidades.setOpaque(false);
        jScrollPane3.setViewportView(areadebilidades);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("con su sector para su mejoramiento");

        jLabel242.setForeground(new java.awt.Color(204, 204, 204));
        jLabel242.setText("¿Cuáles cree Ud. que son los problemas");

        areamejoramiento.setColumns(20);
        areamejoramiento.setRows(5);
        areamejoramiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        areamejoramiento.setOpaque(false);
        jScrollPane4.setViewportView(areamejoramiento);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Cual:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel235, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel236, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtquiencree)
                        .addComponent(jLabel238, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane26))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane25)
                        .addComponent(jLabel237, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel240, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtidsituacion_comunitaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel248, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel239)
                            .addComponent(jLabel248))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel240)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel241)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel242)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel249)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtidsituacion_comunitaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel235)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel236)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(txtquiencree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel237)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel238)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btnuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseExited

    }//GEN-LAST:event_btnuevoMouseExited

    private void btnuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuevoMouseEntered

    }//GEN-LAST:event_btnuevoMouseEntered

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        vsituacion_comunitaria dts = new vsituacion_comunitaria();
        fsituacion_comunitaria func = new fsituacion_comunitaria();
        
        String msj = "";

        dts.setResolver_problemas(areaquesevan.getText());
        dts.setQuien_resolvera(txtquiencree.getText());
        dts.setTipo_proyecto(areatipo_proyecto.getText());
        dts.setComo_apoyaria(areacomoapoyaria.getText());

        dts.setCenso_energetico(areaqueopinacensoenergetico.getText());
        dts.setAspecto_ventajosos(areaaspectosventajosos.getText());
        dts.setProblemas_debilidades(areadebilidades.getText());

        dts.setMejoramiento(areamejoramiento.getText());

        if (check1.isSelected()) {
            msj += "Sala \n";
        }
        if (check2.isSelected()) {
            msj += "Baño \n";
        }
        if (check3.isSelected()) {
            msj += "Comedor \n";
        }
        if (check4.isSelected()) {
            msj += "Cosina \n";
        }
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
        
        dts.setOpciones(msj);
        dts.setOtro(txtcual.getText());

        if (txtcual.getText().length() == 0) {
            val.valEsp(areaquesevan);
            val.valEsp(txtquiencree);
            val.valEsp(areatipo_proyecto);
            val.valEsp(areacomoapoyaria);
            val.valEsp(areamejoramiento);
            val.valEsp(areaqueopinacensoenergetico);
            val.valEsp(areaaspectosventajosos);
            val.valEsp(areadebilidades);
            val.valEsp(txtcual);
            
            return;
        } else {
            //txtnombre.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
            if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(null, "La situacion comunitaria fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();

            }
          }
          else if (accion.equals("editar")){
            dts.setIdsituacion_comunitaria(Integer.parseInt(txtidsituacion_comunitaria.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(null, "La situacion comunitaria fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }}
    }//GEN-LAST:event_btguardarActionPerformed

    private void btguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseExited
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseExited

    private void btguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btguardarMouseEntered
        btguardar.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Aplicacion.repaintScreen();
    }//GEN-LAST:event_btguardarMouseEntered

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void btsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseExited

    }//GEN-LAST:event_btsalirMouseExited

    private void btsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseEntered

    }//GEN-LAST:event_btsalirMouseEntered

    private void btsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btsalirMouseClicked

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
          if (!txtidsituacion_comunitaria.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de Eliminar ","Confirmar",2);

            if (confirmacion==0) {
                fsituacion_comunitaria func = new fsituacion_comunitaria();
                vsituacion_comunitaria dts= new vsituacion_comunitaria();

                dts.setIdsituacion_comunitaria(Integer.parseInt(txtidsituacion_comunitaria.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }    
    }//GEN-LAST:event_bteliminarActionPerformed

    private void bteliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseExited

    }//GEN-LAST:event_bteliminarMouseExited

    private void bteliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bteliminarMouseEntered

    }//GEN-LAST:event_bteliminarMouseEntered

    private void btbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscar1ActionPerformed
       mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btbuscar1ActionPerformed

    private void btbuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar1MouseExited

    }//GEN-LAST:event_btbuscar1MouseExited

    private void btbuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscar1MouseEntered

    }//GEN-LAST:event_btbuscar1MouseEntered

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btguardar.setText("Editar");
        habilitar();
        bteliminar.setEnabled(true);
        accion="editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtidsituacion_comunitaria.setText(tablalistado.getValueAt(fila, 0).toString());
        
        areaquesevan.setText(tablalistado.getValueAt(fila, 1).toString());
        
        txtquiencree.setText(tablalistado.getValueAt(fila, 2).toString());
        
        areatipo_proyecto.setText(tablalistado.getValueAt(fila, 3).toString());
        
        areacomoapoyaria.setText(tablalistado.getValueAt(fila, 4).toString());
        
        areaqueopinacensoenergetico.setText(tablalistado.getValueAt(fila, 5).toString());
        
        areaaspectosventajosos.setText(tablalistado.getValueAt(fila, 6).toString());
        
        areadebilidades.setText(tablalistado.getValueAt(fila, 7).toString());
        
        areamejoramiento.setText(tablalistado.getValueAt(fila, 8).toString());
        
        txtcual.setText(tablalistado.getValueAt(fila, 10).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaaspectosventajosos;
    private javax.swing.JTextArea areacomoapoyaria;
    private javax.swing.JTextArea areadebilidades;
    private javax.swing.JTextArea areamejoramiento;
    private javax.swing.JTextArea areaqueopinacensoenergetico;
    private javax.swing.JTextArea areaquesevan;
    private javax.swing.JTextArea areatipo_proyecto;
    private javax.swing.JButton btbuscar1;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
    private javax.swing.JCheckBox check9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbtotalregistro;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcual;
    private javax.swing.JTextField txtidsituacion_comunitaria;
    private javax.swing.JTextField txtquiencree;
    // End of variables declaration//GEN-END:variables
}
