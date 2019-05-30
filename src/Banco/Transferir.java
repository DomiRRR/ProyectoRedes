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
public class Transferir extends javax.swing.JFrame {
    public Transferir() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/envio.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(290,300);
        this.setTitle("~ Transferencias ~");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumCuent = new javax.swing.JLabel();
        Deposit = new javax.swing.JButton();
        Regres = new javax.swing.JButton();
        Cuenta = new javax.swing.JTextField();
        Canti = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NumCuent.setText("Número de Cuenta ");
        getContentPane().add(NumCuent);
        NumCuent.setBounds(120, 10, 120, 30);

        Deposit.setText("Transferir");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        getContentPane().add(Deposit);
        Deposit.setBounds(170, 190, 90, 40);

        Regres.setText("Regresar");
        Regres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresActionPerformed(evt);
            }
        });
        getContentPane().add(Regres);
        Regres.setBounds(0, 190, 90, 40);

        Cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CuentaKeyTyped(evt);
            }
        });
        getContentPane().add(Cuenta);
        Cuenta.setBounds(120, 40, 130, 30);

        Canti.setText("Cantidad");
        getContentPane().add(Canti);
        Canti.setBounds(150, 70, 60, 30);

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad);
        Cantidad.setBounds(140, 100, 90, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Transferencia.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 140, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresActionPerformed
        //Botón para regresar a "Bienvenido GUI"
        Bienvenido bv = new Bienvenido();
        bv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        //Aqui deberia de usar el RMI para efectuar las consultas en lugar de consultar directamente
    }//GEN-LAST:event_DepositActionPerformed

    private void CuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuentaKeyTyped
       char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar los 18 digitos de la CLABE a la cual va a transferir !");
       }
       
     int limite  = 18;
     if (Cuenta.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "No pasa de 18 dígitos");
     }
    }//GEN-LAST:event_CuentaKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
      char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar numeros !");
       }
    }//GEN-LAST:event_CantidadKeyTyped

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
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Canti;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Cuenta;
    private javax.swing.JButton Deposit;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NumCuent;
    private javax.swing.JButton Regres;
    // End of variables declaration//GEN-END:variables
}
