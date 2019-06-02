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
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NaruHina
 */
public class Depositar extends javax.swing.JFrame {
    public Depositar() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/Icono.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(430,390);
        this.setTitle("~ Depósitos ~ Cajero RDRR ~ ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        Título = new javax.swing.JLabel();
        Deposi = new javax.swing.JButton();
        Cantidad = new javax.swing.JLabel();
        Dinero = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(310, 293, 80, 40);

        Título.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Título.setForeground(new java.awt.Color(204, 0, 51));
        Título.setText("Depósitos");
        getContentPane().add(Título);
        Título.setBounds(150, 100, 100, 40);

        Deposi.setText("Depositar");
        Deposi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeposiActionPerformed(evt);
            }
        });
        getContentPane().add(Deposi);
        Deposi.setBounds(20, 290, 90, 40);

        Cantidad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(51, 0, 51));
        Cantidad.setText("¿Qué cantidad desea depositar?");
        getContentPane().add(Cantidad);
        Cantidad.setBounds(80, 140, 260, 40);

        Dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DineroKeyTyped(evt);
            }
        });
        getContentPane().add(Dinero);
        Dinero.setBounds(140, 190, 110, 30);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deposito.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(-80, 0, 480, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        //Botón de regresar
        Bienvenido bn = new Bienvenido();
        bn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void DineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DineroKeyTyped
          char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar numero!");
       }
    }//GEN-LAST:event_DineroKeyTyped

    private void DeposiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeposiActionPerformed
          String Cantidad = Dinero.getText();
        if(Dinero.getText().equals("")){ //Si no tienen nada pos no dejar que se mande 
              JOptionPane.showMessageDialog(null,"No puede dejar este campo vacio");
       }else{
             try { 
                String id= "4";
                RMI rmii;
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
                rmii = (RMI) reg.lookup("Objeto remoto");
                rmii.Depositar(Cantidad,id);
               }
            catch(RemoteException e) {
                e.printStackTrace();
            }
             catch (NotBoundException ex) {
             ex.printStackTrace();
        }  
                 }
    }//GEN-LAST:event_DeposiActionPerformed

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
    private javax.swing.JLabel Cantidad;
    private javax.swing.JButton Deposi;
    private javax.swing.JTextField Dinero;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Título;
    // End of variables declaration//GEN-END:variables
}
