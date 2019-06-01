/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 17 de Mayo 2019 ~ Modificado varias veces
 */

package Banco;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author NaruHina
 */
public class Registrarse extends javax.swing.JFrame {
  public Registrarse() {
        initComponents();
        URL iconURL = getClass().getResource("/Imagenes/Credenciales.png");
        // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setSize(560,690);
        this.setTitle("~ Aplicaciones P/Comunicaciones Red ~ Proyecto Final ~");
        try { //Esto es necesario para conectar con la BD
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        CampoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        GenerarNum = new javax.swing.JButton();
        Tarjeta = new javax.swing.JTextField();
        TextoVenc = new javax.swing.JLabel();
        Diagonal = new javax.swing.JLabel();
        NumAleatorio1 = new javax.swing.JTextField();
        NumAleatorio2 = new javax.swing.JTextField();
        CampoContrasena = new javax.swing.JPasswordField();
        ElNip = new javax.swing.JTextField();
        NIP = new javax.swing.JLabel();
        GuardarDatos = new javax.swing.JButton();
        Correo = new javax.swing.JLabel();
        CorreoEl = new javax.swing.JTextField();
        FechaNac = new javax.swing.JLabel();
        CVV = new javax.swing.JLabel();
        elcv = new javax.swing.JTextField();
        CLABE = new javax.swing.JLabel();
        laclabe = new javax.swing.JTextField();
        Ap = new javax.swing.JLabel();
        ApePaterno = new javax.swing.JTextField();
        AM = new javax.swing.JLabel();
        ApeMaterno = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        telefonito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        direcci = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Nombre.setText("Nombre");
        getContentPane().add(Nombre);
        Nombre.setBounds(20, 50, 50, 30);

        Regresar.setText("Regresar a Menú");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(380, 580, 140, 40);

        CampoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNombreKeyTyped(evt);
            }
        });
        getContentPane().add(CampoNombre);
        CampoNombre.setBounds(70, 50, 170, 30);

        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 110, 70, 30);

        GenerarNum.setText("Generar Tarjeta");
        GenerarNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarNumActionPerformed(evt);
            }
        });
        getContentPane().add(GenerarNum);
        GenerarNum.setBounds(20, 420, 120, 30);

        Tarjeta.setEditable(false);
        getContentPane().add(Tarjeta);
        Tarjeta.setBounds(10, 460, 130, 30);

        TextoVenc.setText("Vence:");
        getContentPane().add(TextoVenc);
        TextoVenc.setBounds(10, 510, 40, 20);

        Diagonal.setText("/");
        getContentPane().add(Diagonal);
        Diagonal.setBounds(90, 500, 10, 30);

        NumAleatorio1.setEditable(false);
        getContentPane().add(NumAleatorio1);
        NumAleatorio1.setBounds(110, 500, 30, 30);

        NumAleatorio2.setEditable(false);
        getContentPane().add(NumAleatorio2);
        NumAleatorio2.setBounds(50, 500, 30, 30);

        CampoContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoContrasenaKeyTyped(evt);
            }
        });
        getContentPane().add(CampoContrasena);
        CampoContrasena.setBounds(330, 110, 70, 30);

        ElNip.setEditable(false);
        getContentPane().add(ElNip);
        ElNip.setBounds(90, 540, 40, 30);

        NIP.setText("NIP");
        getContentPane().add(NIP);
        NIP.setBounds(60, 540, 40, 30);

        GuardarDatos.setText("Guardar");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarDatos);
        GuardarDatos.setBounds(10, 590, 90, 40);

        Correo.setText("Correo Electrónico");
        getContentPane().add(Correo);
        Correo.setBounds(20, 270, 120, 20);

        CorreoEl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoElKeyTyped(evt);
            }
        });
        getContentPane().add(CorreoEl);
        CorreoEl.setBounds(120, 260, 170, 30);

        FechaNac.setText("Fecha Nacimiento");
        getContentPane().add(FechaNac);
        FechaNac.setBounds(70, 310, 120, 30);

        CVV.setText("CVV");
        getContentPane().add(CVV);
        CVV.setBounds(420, 470, 30, 20);

        elcv.setEditable(false);
        getContentPane().add(elcv);
        elcv.setBounds(450, 460, 40, 30);

        CLABE.setText("CLABE");
        getContentPane().add(CLABE);
        CLABE.setBounds(330, 510, 40, 30);

        laclabe.setEditable(false);
        getContentPane().add(laclabe);
        laclabe.setBounds(370, 510, 140, 30);

        Ap.setText("Apellido Paterno");
        getContentPane().add(Ap);
        Ap.setBounds(10, 100, 90, 14);

        ApePaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApePaternoKeyTyped(evt);
            }
        });
        getContentPane().add(ApePaterno);
        ApePaterno.setBounds(100, 90, 120, 30);

        AM.setText("Apellido Materno");
        getContentPane().add(AM);
        AM.setBounds(10, 140, 110, 14);

        ApeMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApeMaternoKeyTyped(evt);
            }
        });
        getContentPane().add(ApeMaterno);
        ApeMaterno.setBounds(100, 130, 120, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(180, 310, 170, 30);

        jLabel3.setText("Teléfono");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 60, 60, 30);

        telefonito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonitoKeyTyped(evt);
            }
        });
        getContentPane().add(telefonito);
        telefonito.setBounds(370, 60, 160, 30);

        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 180, 60, 20);

        Titulo.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 51, 51));
        Titulo.setText("¡ Registrate !");
        getContentPane().add(Titulo);
        Titulo.setBounds(140, 0, 220, 50);

        direcci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direcciKeyTyped(evt);
            }
        });
        getContentPane().add(direcci);
        direcci.setBounds(90, 170, 350, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BancoRegistro.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-70, 30, 610, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        //Volver a mi GUIPrincipal
        GUIPrincipal gui = new GUIPrincipal();
        gui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void CampoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNombreKeyTyped
       //Que el vato no ponga numeros 
       char validar = evt.getKeyChar();
       if(Character.isDigit(validar)){
           evt.consume();
           
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar texto, no números !");
       }
       
       //No pase el limite porqué si no en la BD no me guardaría todos esos carácteres
      int limite  = 25;
     if (CampoNombre.getText().length() == limite){
         evt.consume();   
         JOptionPane.showMessageDialog(rootPane, "El nombre no almacena más de 25 carácteres");
     }   
    }//GEN-LAST:event_CampoNombreKeyTyped

    private void CampoContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContrasenaKeyTyped
     //Esta parte es para la contraseña para que no pase los 8 carácteres que se asignaron en la BD
     int limite  = 8;
     if (CampoContrasena.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "La contraseña no puede pasar de los 8 carácteres");
     }
    }//GEN-LAST:event_CampoContrasenaKeyTyped

    private void GenerarNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarNumActionPerformed
       //Generando las credenciales para la TARJETA y su CLABE
       int numero = (int)(Math.random()*10+2);
       int numer2 = (int)(Math.random()*10+2);
       int nip = (int)(Math.random()*900+1000); //Siempre 4 digitos, para el NIP
       int cvv = (int)(Math.random()*900+100); //Siempre 3 digitos, para el cvv
       long tarjeta1 = (long)(Math.random()*9000000000000L+1000000000000000L); //Tarjeta de 16 digitos
       long clabe = (long)(Math.random()*9000000000000L+300000000000000000L); //Clabe de 18 digitos
       NumAleatorio1.setText(Integer.toString(numero));
       NumAleatorio2.setText(Integer.toString(numer2));
       ElNip.setText(Integer.toString(nip));
       Tarjeta.setText(Long.toString(tarjeta1));
       elcv.setText(Integer.toString(cvv));
       laclabe.setText(Long.toString(clabe));
    }//GEN-LAST:event_GenerarNumActionPerformed

    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
        //Acción que guardará lo escrito en las cajas de texto a la base de datos
        if (GuardarDatos.getText().equals("Guardar")) { //Verificando si el botón elegido es Guardar
           if (CampoNombre.getText().equals("") && ApePaterno.getText().equals("") && ApeMaterno.getText().equals("") && telefonito.getText().equals("") && direcci.getText().equals("") && CampoContrasena.getText().equals("") && CorreoEl.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Algunos campos o todos están vacíos");
                JOptionPane.showMessageDialog(null,"Rellene los campos faltantes por favor"); //Si faltan datos pos no hace nada
            }else{
               try { 
                int año = jDateChooser1.getCalendar().get(Calendar.YEAR);
                int mes = jDateChooser1.getCalendar().get(Calendar.MONTH);
                int dia = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
                String fechaNacimiento = ""+año+"-"+mes+"-"+dia; //Guardar el dia, mes, año del JDATECHOOSER
                
                String CN = CampoNombre.getText();
                String Ap = ApePaterno.getText();
                String Am = ApeMaterno.getText();
                String tel = telefonito.getText();
                String dir = direcci.getText();
                String CC = CampoContrasena.getText();
                String corre = CorreoEl.getText();
                String t = Tarjeta.getText();
                String ni = ElNip.getText();
                String cv = elcv.getText();
                String uno = NumAleatorio1.getText();
                String dos = NumAleatorio2.getText();
                String cb = laclabe.getText();
                
                //Cree nuevas variables pa mandarlas como parametros en el RMI
                RMI rmii;
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
                rmii = (RMI) reg.lookup("Objeto remoto");
                rmii.Registrar(CN,Ap,Am,tel,dir,CC,corre,fechaNacimiento,t,ni,cv,uno,dos,cb);
                //Mensaje de confirmación
            JOptionPane.showMessageDialog(null,"Te has registrado en el sistema");
               }
            catch(RemoteException e) {
                e.printStackTrace();
            }
             catch (NotBoundException ex) {
           ex.printStackTrace();
        }
               //"Limpiando" las cajas de texto
           CampoNombre.setText("");
           ApePaterno.setText("");
           ApeMaterno.setText("");
           telefonito.setText("");
           direcci.setText("");    
           CampoContrasena.setText("");
           CorreoEl.setText("");
           jDateChooser1.setCalendar(null);
           Tarjeta.setText("");
           NumAleatorio2.setText("");
           NumAleatorio1.setText("");
           ElNip.setText("");
           elcv.setText("");
           laclabe.setText("");
            JOptionPane.showMessageDialog(null,"Sistema listo para otro registro");
           }
    }
    }//GEN-LAST:event_GuardarDatosActionPerformed

    private void ApePaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApePaternoKeyTyped
       //Validaciones de que no ponga texto... y así 
       char validar = evt.getKeyChar();
       if(Character.isDigit(validar)){
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar texto, no números !");
       }
       
     int limite  = 15;
     if (ApePaterno.getText().length() == limite){
         evt.consume();  
         JOptionPane.showMessageDialog(rootPane, "El Apellido Paterno no almacena más de 15 carácteres");
     } 
    }//GEN-LAST:event_ApePaternoKeyTyped

    private void ApeMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApeMaternoKeyTyped
       //Validaciones de que no ponga texto... y así 
       char validar = evt.getKeyChar();
       if(Character.isDigit(validar)){
           evt.consume();
           
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar texto, no números !");
       }
       
     int limite  = 15;
     if (ApeMaterno.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "El Apellido Materno no almacena más de 15 carácteres");
     }
    }//GEN-LAST:event_ApeMaternoKeyTyped

    private void telefonitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonitoKeyTyped
     int limite  = 11;
     if (telefonito.getText().length() == limite){
         evt.consume();
         
         JOptionPane.showMessageDialog(rootPane, "El número de telefono no puede pasar de los 11 carácteres");
     }
     
     char validar = evt.getKeyChar();
     if(Character.isLetter(validar)){
           evt.consume();  
           JOptionPane.showMessageDialog(rootPane, "¡ Favor de ingresar numeros, no texto !");
       }
    }//GEN-LAST:event_telefonitoKeyTyped

    private void direcciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcciKeyTyped
     int limite  = 45;
     if (ApePaterno.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "La dirección no almacena más de 45 carácteres");
     }
    }//GEN-LAST:event_direcciKeyTyped

    private void CorreoElKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoElKeyTyped
     int limite  = 30;
     if (CorreoEl.getText().length() == limite){
         evt.consume();
         JOptionPane.showMessageDialog(rootPane, "El correo no guarda más de 30 carácteres");
     }
    }//GEN-LAST:event_CorreoElKeyTyped

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AM;
    private javax.swing.JLabel Ap;
    private javax.swing.JTextField ApeMaterno;
    private javax.swing.JTextField ApePaterno;
    private javax.swing.JLabel CLABE;
    private javax.swing.JLabel CVV;
    private javax.swing.JPasswordField CampoContrasena;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel Correo;
    private javax.swing.JTextField CorreoEl;
    private javax.swing.JLabel Diagonal;
    private javax.swing.JTextField ElNip;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JButton GenerarNum;
    private javax.swing.JButton GuardarDatos;
    private javax.swing.JLabel NIP;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NumAleatorio1;
    private javax.swing.JTextField NumAleatorio2;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Tarjeta;
    private javax.swing.JLabel TextoVenc;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField direcci;
    private javax.swing.JTextField elcv;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField laclabe;
    private javax.swing.JTextField telefonito;
    // End of variables declaration//GEN-END:variables
}
