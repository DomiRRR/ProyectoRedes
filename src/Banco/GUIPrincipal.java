/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 17 de Mayo 2019 ~
 */
package Banco;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author NaruHina
 */
public class GUIPrincipal extends javax.swing.JFrame {
    
    public GUIPrincipal() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/ATM.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        //Define 40 como Radio.
        IniSesi.setBorder(new RoundedBorder(20));
        Registrarse.setBorder(new RoundedBorder(10));
        this.setSize(415,375);
        //Esto le pone nombre a la parte de arriba de la consola 
        //this.setIconImage(dibu.imagen.usarImagen("ATM.png"));
        this.setTitle("~ ACR ~ Proyecto Final ~");
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registrarse = new javax.swing.JButton();
        IniSesi = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(Registrarse);
        Registrarse.setBounds(20, 260, 90, 40);

        IniSesi.setText("Iniciar Sesión");
        IniSesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniSesiActionPerformed(evt);
            }
        });
        getContentPane().add(IniSesi);
        IniSesi.setBounds(230, 190, 120, 30);

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cajero.png"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(0, 0, 400, 310);

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir);
        BotonSalir.setBounds(320, 260, 80, 50);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Letra1.png"))); // NOI18N
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo);
        Fondo.setBounds(-430, -20, 830, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniSesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniSesiActionPerformed
        //Iniciar Sesión, llama al JFRAME
        Iniciar in = new Iniciar();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IniSesiActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
       //Abre la nueva ventana para rellenar las credenciales
       //Se hace una nueva instancia de el nuevo JFRAME que en este caso será registrarse
       Registrarse RG=new Registrarse();
       RG.setVisible(true);
       this.dispose(); //se cierra el JFRAME de GUIPRINCIPAL
      
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        //Salirse del programa
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton IniSesi;
    private javax.swing.JButton Registrarse;
    // End of variables declaration//GEN-END:variables
}
