/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes;

import Presentacion.Acceso_Sistema;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class Aplicacion {
    
    
    
    static private Presentacion.MenuPrincipal screen;
    static private Presentacion.Acceso_Sistema usuario;
    /* Init */
    public static void start()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                
                loadScreen();
                
                
                
            }
        });
    }
    
    
    
    private static void loadScreen()
    {
        screen = new Presentacion.MenuPrincipal();
        screen.setMenuVisible(false);
        screen.setVisible(true);
        
        callMainOption( new Presentacion.Acceso_Sistema());
    }
  
    /* Manejo de la pantalla */
    public static void callMainOption( javax.swing.JPanel n_content )
    {
        javax.swing.JPanel content = new javax.swing.JPanel()
        {
            private java.awt.Image backImage;
            
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g);

                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
                else
                    backImage = Egoist.Swing.Image.setAlpha(Ajustes.Aplicacion.getThemeItem("background2", getPreferredSize().width, getPreferredSize().height ), 200 );
            }
        };
        
        if(n_content != null)
        {
            content.setSize(n_content.getSize());
            content.setMaximumSize(n_content.getMaximumSize());
            content.setOpaque(false);
            content.setPreferredSize(n_content.getPreferredSize());
            content.add(n_content);
            screen.setContent(content);
        }
        else
            screen.setContent(null);
    }
    
    public static void callInicio()
    {
        callMainOption( new Presentacion.Bienvenida() );
    }
    
    public static void cierreSeccion()
    {
        callMainOption( new Presentacion.Acceso_Sistema());
    }
    
    public static void repaintScreen()
    {
        if(screen!=null)
            screen.repaint();
    }
    
    
     public static Presentacion.MenuPrincipal getScreen()
    {
        return((Presentacion.MenuPrincipal)screen);
    }
    public static  java.awt.Image getImage( String imagepath, int width, int height )
    {
        java.awt.Image image = new javax.swing.ImageIcon(Aplicacion.class.getResource( "/Background/" + imagepath + ".jpg" )).getImage();
        return( Egoist.Swing.Image.resize( image, width, height ) );
    }
    public static String getTheme()
    {
        return("Ligth");
    }
    public static java.awt.Image getThemeItem( String item, int width, int height )
    {
        return(Ajustes.Aplicacion.getImage("Temas/" + Ajustes.Aplicacion.getTheme() + "/" + item, width, height));
    }
    
public static void onLoginEvent( Presentacion.Acceso_Sistema  m_usuario )
    {
        usuario = m_usuario;
        screen.setMenuVisible(true);
        
    }
    
}
