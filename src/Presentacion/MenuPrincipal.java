/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Egoist.Swing.Animator;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 *
 * @author DJ-FRAIBERTH
 */
public class MenuPrincipal extends javax.swing.JFrame {
   
    private java.awt.Image backImage;
    
    private JPanel content;
    
    private Dimension dim;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        // Pintar Background
        javax.swing.JPanel contentPane = new javax.swing.JPanel()
        {
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g); 
                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
            }
        };
        setContentPane(contentPane);
        
        initComponents();
        //Ventana();
        this.setSize(new Dimension(1366,768));
        
    }

    
    
        public void Ventana(){

        //con esto obtienes en tamano en en x y y de tu monitor

        dim=super.getToolkit().getScreenSize();

        super.setSize(dim);

        super.setUndecorated(true);

        super.setVisible(true);

    }
    
    // escribe o reemplaza el contenido de un articulo con contenido nuevo
    public void setContent(JPanel n_content){
        int n_contentWidth = n_content.getMaximumSize().width; //devueve el ancho de dimension en doble presicion
        int n_contentHeight = n_content.getMaximumSize().height; //devueve la altura de dimension en doble presicion
        int n_contentX = (int)(getWidth() *1.5); //devuelve la parte horizontal
        int n_contentY = (int)(getHeight() * 0.5f-n_contentHeight * 0.5 - 29);
        int disA = -(int) (getWidth())-8;
        int disB = -(int) (n_contentWidth*0.5f);
        
        // animaciones
        if( this.content != null){
           class postMethod extends Egoist.Swing.Animator
           {
              //se utiliza para indicar que el valor de una variable sera modificada
               volatile JPanel o_content = content;

                @Override
                public Egoist.Swing.Animator init(Object o, int i, long l, Animator.BEHAVIOUR bhvr, Object o1) {return(null);}

                @Override
                public void load() {
                   //devuelve los datos predefinido
                   MenuPrincipal menuPrincipal = Ajustes.Aplicacion.getScreen();
                   
                   if( menuPrincipal != null){
                      //el nuevo panel es diferente de null
                      if(o_content != null){
                         //elimina todos los elementos de una lista que se contienen en la coleccion especifica
                         o_content.removeAll();
                         //elimina el componente especificado desde el recipiente
                         menuPrincipal.getContentPane().remove(o_content);
                      }
                      //el formulario se ajusta al tamaño
                      menuPrincipal.pack();
                      //vuelve a pintar el rectangulo en tiempo milisegundo
                      menuPrincipal.repaint();
                   }
                       
                }

                @Override
                public void render() {}
                @Override
                public void finish() {}
                @Override
                public boolean isBroken() {
                   return (false);
                }
           }
           
           Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition ).
                    init( new java.awt.Point( disA, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelUp, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                            init( new java.awt.Point( disB, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                                enqueue( new postMethod() ) ).
                                    start();
        }
        
        if( n_content != null ){
           this.content = n_content;
           this.content.setSize( n_contentWidth, n_contentHeight );
           this.content.setLocation( n_contentX, n_contentY);
           this.getContentPane().add(this.content, 0);
           
           Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition).
                    init( new java.awt.Point( disA, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                                init( new java.awt.Point( disB, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelDown, this.content ) ).
                                    start();
        }
        //se ajusta al tamaño
        pack();
        //vuelve a pintar el rectangulo
        repaint();
    
    }
    
    //reversion de la animacion
    public void setReverseContent( JPanel n_content )
    {
        
    }
    public void setImmediatelyContent( JPanel n_content )
    {
        if(n_content!=null)
        {
            
        }
        else
        {
            this.content.removeAll();
            remove(this.content);
            
            this.pack();
            this.repaint();
        }
    }
    public void setMenuVisible( boolean menuVisible )
    {
        if( menuVisible )
        {
            menu.setVisible(true);
        }
        else
        {
            menu.setVisible(false);
        }
    }
    @Override
    public void setSize( int width, int height )
    {
        setPreferredSize( new java.awt.Dimension(width, height) );
        super.setSize(width, height);
    }
    public java.awt.Image getBackImage()
    {
        return(backImage);
    }
    public void setBackImage( java.awt.Image backImage )
    {
        this.backImage = backImage;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        archivo = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        cerrarsesion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        configuraciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        jMenu13.setText("File");
        jMenuBar5.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar5.add(jMenu14);

        jMenu16.setText("File");
        jMenuBar6.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar6.add(jMenu17);

        setIconImage(getIconImage());
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Inicio.png"))); // NOI18N
        inicio.setText("Inicio");
        menu.add(inicio);

        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Archivo.png"))); // NOI18N
        archivo.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/businessman.png"))); // NOI18N
        jMenuItem2.setText("Registro Jefe Familiar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        archivo.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/father-with-children-raising-arms.png"))); // NOI18N
        jMenuItem3.setText("Registro Grupo Familiar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        archivo.add(jMenuItem3);

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pdf-documentation.png"))); // NOI18N
        jMenu18.setText("Exportar...");
        archivo.add(jMenu18);

        cerrarsesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/double-down-arrows.png"))); // NOI18N
        cerrarsesion.setText("Cerrar Sesión");
        cerrarsesion.setName("Horario"); // NOI18N
        archivo.add(cerrarsesion);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/login.png"))); // NOI18N
        salir.setText("Salir");
        salir.setName("Horario"); // NOI18N
        archivo.add(salir);

        menu.add(archivo);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Consultas.png"))); // NOI18N
        jMenu3.setText("Consultas");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/businessman.png"))); // NOI18N
        jMenuItem7.setText("Jefe Familiar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/father-with-children-raising-arms.png"))); // NOI18N
        jMenuItem4.setText("Grupo Familiar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/piggy-bank.png"))); // NOI18N
        jMenuItem8.setText("Situacion Economica");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/house.png"))); // NOI18N
        jMenuItem9.setText("Situacion Vivienda");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/protest.png"))); // NOI18N
        jMenuItem11.setText("Situacion de la Comunidad");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        menu.add(jMenu3);

        configuraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Configuraciones.png"))); // NOI18N
        configuraciones.setText("Configuraciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/usuario.png"))); // NOI18N
        jMenuItem1.setText("Registrar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        configuraciones.add(jMenuItem1);

        menu.add(configuraciones);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Herramientas.png"))); // NOI18N
        jMenu4.setText("Herramientas");
        menu.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Ayuda.png"))); // NOI18N
        jMenu5.setText("Ayuda");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Acerca de...");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Ayuda");
        jMenu5.add(jMenuItem6);

        menu.add(jMenu5);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Salir.png"))); // NOI18N
        jMenu15.setText("Salir");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        menu.add(jMenu15);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //Se invoca cuando cambia el tamaño del componente
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        backImage = Ajustes.Aplicacion.getThemeItem( "35", evt.getComponent().getWidth(), evt.getComponent().getHeight() );
    }//GEN-LAST:event_formComponentResized

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Ajustes.Aplicacion.callMainOption(new Usuario());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Ajustes.Aplicacion.callMainOption(new Registro_Familiar());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Ajustes.Aplicacion.callMainOption(new Registro_Grupofamiliar());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Ajustes.Aplicacion.callMainOption(new mgrupo_familiar());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Ajustes.Aplicacion.callMainOption(new mjefe_familiar());
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Ajustes.Aplicacion.callMainOption(new msituacion_economica());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Ajustes.Aplicacion.callMainOption(new msituacion_vivienda());
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Ajustes.Aplicacion.callMainOption(new msituacion_comunidad());
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Files/logo.png"));


        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu archivo;
    private javax.swing.JMenuItem cerrarsesion;
    public static javax.swing.JMenu configuraciones;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables

   
}
