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
public class Pagar extends javax.swing.JFrame {
    
    public Pagar() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/PagarServicio.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(430,360);
        this.setTitle("~ Pago Servicios ~ Cajero RDRR ~ ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        Pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Servicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
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
        Volver.setBounds(300, 270, 90, 30);

        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });
        getContentPane().add(Pagar);
        Pagar.setBounds(10, 270, 80, 30);

        jLabel1.setText("Servicio a Pagar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 90, 120, 40);

        Servicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ServicioKeyTyped(evt);
            }
        });
        getContentPane().add(Servicio);
        Servicio.setBounds(150, 120, 100, 30);

        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 190, 60, 30);

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad);
        Cantidad.setBounds(200, 190, 90, 30);

        Titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 0, 51));
        Titulo.setText("¡ Paga tus Servicios !");
        getContentPane().add(Titulo);
        Titulo.setBounds(110, 50, 190, 40);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(-310, 0, 1010, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        //Volver
        Bienvenido bn = new Bienvenido();
        bn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        //BD
    }//GEN-LAST:event_PagarActionPerformed

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
       char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar la cantidad en números");
       }
    }//GEN-LAST:event_CantidadKeyTyped

    private void ServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ServicioKeyTyped
        char validar = evt.getKeyChar();
       if(Character.isDigit(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar texto !");
       }
    }//GEN-LAST:event_ServicioKeyTyped

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
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Pagar;
    private javax.swing.JTextField Servicio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
