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
public class Retirar extends javax.swing.JFrame {
    public Retirar() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/Icono.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(410,340);
        this.setTitle("~ Retiros ~ Cajero RDRR ~");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        Retiro = new javax.swing.JButton();
        TituloSup = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        Retiros = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Volver.setText("Regresar");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver);
        Volver.setBounds(300, 250, 90, 40);

        Retiro.setText("Retirar");
        Retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiroActionPerformed(evt);
            }
        });
        getContentPane().add(Retiro);
        Retiro.setBounds(30, 253, 80, 30);

        TituloSup.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        TituloSup.setForeground(new java.awt.Color(51, 102, 255));
        TituloSup.setText("Retiros");
        getContentPane().add(TituloSup);
        TituloSup.setBounds(210, 70, 80, 30);

        Titulo2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(51, 0, 51));
        Titulo2.setText("¿Qué cantidad desea retirar?");
        getContentPane().add(Titulo2);
        Titulo2.setBounds(20, 100, 250, 30);

        Retiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirosActionPerformed(evt);
            }
        });
        Retiros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RetirosKeyTyped(evt);
            }
        });
        getContentPane().add(Retiros);
        Retiros.setBounds(40, 170, 160, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retirar.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirosActionPerformed
        //Se deberia de poder verificar que si no  tiene dinero, no permita retirar, de lo contrario seria super
        //extraño retirar una cantidad negativa
    }//GEN-LAST:event_RetirosActionPerformed

    private void RetirosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RetirosKeyTyped
       char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar numero!");
       }
    }//GEN-LAST:event_RetirosKeyTyped

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Bienvenido bn = new Bienvenido();
        bn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void RetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiroActionPerformed
        //BD
    }//GEN-LAST:event_RetiroActionPerformed

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
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Retiro;
    private javax.swing.JTextField Retiros;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel TituloSup;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables
}
