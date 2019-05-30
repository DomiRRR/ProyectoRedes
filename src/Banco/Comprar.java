/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 29 de Mayo 2019 ~ 
 */

package Banco;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NaruHina
 */
public class Comprar extends javax.swing.JFrame {
    public Comprar() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/Comprar.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(300,340);
        this.setTitle("~ Compra Servicios ~");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        Titulito = new javax.swing.JLabel();
        Servic = new javax.swing.JLabel();
        Servicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(190, 240, 80, 30);

        Comprar.setText("Comprar");
        getContentPane().add(Comprar);
        Comprar.setBounds(10, 240, 80, 30);

        Titulito.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulito.setForeground(new java.awt.Color(51, 0, 51));
        Titulito.setText("¡ Compra tus Servicios !");
        getContentPane().add(Titulito);
        Titulito.setBounds(30, 10, 210, 40);

        Servic.setText("Servicio a Comprar");
        getContentPane().add(Servic);
        Servic.setBounds(20, 80, 110, 30);

        Servicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ServicioKeyTyped(evt);
            }
        });
        getContentPane().add(Servicio);
        Servicio.setBounds(70, 110, 110, 30);

        jLabel1.setText("Cantidad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 170, 60, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 180, 110, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carrito.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        //Volver
        Bienvenido bn = new Bienvenido();
        bn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void ServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ServicioKeyTyped
      char validar = evt.getKeyChar();
       if(Character.isDigit(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar texto !");
       }
    }//GEN-LAST:event_ServicioKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar la cantidad en números");
       }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Servic;
    private javax.swing.JTextField Servicio;
    private javax.swing.JLabel Titulito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
