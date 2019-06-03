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
        CLABET = new javax.swing.JTextField();
        Canti = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Clabe1 = new javax.swing.JLabel();
        ClabeP = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NumCuent.setText("CLABE a Transferir");
        getContentPane().add(NumCuent);
        NumCuent.setBounds(130, 50, 120, 30);

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

        CLABET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CLABETKeyTyped(evt);
            }
        });
        getContentPane().add(CLABET);
        CLABET.setBounds(120, 80, 150, 30);

        Canti.setText("Cantidad");
        getContentPane().add(Canti);
        Canti.setBounds(160, 110, 60, 30);

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        getContentPane().add(Cantidad);
        Cantidad.setBounds(140, 140, 90, 30);

        Clabe1.setText("CLABE Personal");
        getContentPane().add(Clabe1);
        Clabe1.setBounds(140, 0, 100, 20);

        ClabeP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClabePKeyTyped(evt);
            }
        });
        getContentPane().add(ClabeP);
        ClabeP.setBounds(110, 20, 160, 30);

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
        //BD CHECAR AUNQUE SOLO FUNCIONARIA LA PRIMERA VEZ QUE SE REALIZA
         if (Deposit.getText().equals("Transferir")) {
          String Trp = ClabeP.getText();
          String TrO = CLABET.getText();
        if(ClabeP.getText().equals("") && CLABET.getText().equals("") && Cantidad.getText().equals("")){  
              JOptionPane.showMessageDialog(null,"No puedes dejar estos campos vacios");
       }else{
             try { 
                String c1 = Cantidad.getText();
                String id = "2";
                RMI rmii;
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
                rmii = (RMI) reg.lookup("Objeto remoto");
                rmii.Transferir(Trp,TrO,c1,id);   
               }
            catch(RemoteException e) {
                e.printStackTrace();
            }
             catch (NotBoundException ex) {
             ex.printStackTrace();
        }  
                 }
    }
    }//GEN-LAST:event_DepositActionPerformed

    private void CLABETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLABETKeyTyped
       char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar los 18 digitos de la CLABE a la cual va a transferir !");
       }
       
     int limite  = 18;
     if (CLABET.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "No pasa de 18 dígitos");
     }
    }//GEN-LAST:event_CLABETKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
      char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar numeros !");
       }
    }//GEN-LAST:event_CantidadKeyTyped

    private void ClabePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClabePKeyTyped
        char validar = evt.getKeyChar();
       if(Character.isLetter(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar los 18 digitos de la CLABE a la cual va a transferir !");
       }
       
     int limite  = 18;
     if (CLABET.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "No pasa de 18 dígitos");
     }
    }//GEN-LAST:event_ClabePKeyTyped

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
    private javax.swing.JTextField CLABET;
    private javax.swing.JLabel Canti;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel Clabe1;
    private javax.swing.JTextField ClabeP;
    private javax.swing.JButton Deposit;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NumCuent;
    private javax.swing.JButton Regres;
    // End of variables declaration//GEN-END:variables
}
