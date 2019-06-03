/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 29 de Mayo 2019 ~ 
 */
package Banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author NaruHina
 */

//verificar ESTAS CLASES AUN NO SIRVEN
public class ObjetoRemoto extends UnicastRemoteObject implements RMI{
     Connection con; //Para que se comunique con la DB, se declara de manera global

    //aunque mi constructor no haga nada, si tengo que lanzar una excepción
    public ObjetoRemoto() throws RemoteException{
        super();
    }
    
    @Override
    public void Depositar(String canti,String id) throws RemoteException {
                try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                String Consulta = "SELECT * FROM `cuentabancaria` WHERE clabe='300006530157868032' and saldo = '0.00'"; 
                PreparedStatement ps1 = con.prepareStatement(Consulta);
                ResultSet rs1 = ps1.executeQuery();
                
                if(rs1.next()){ //Solo depositará una sola vez :'v
                     String saldo = rs1.getString("saldo");
                     if(saldo.contains("0.00")){
                         String deposito = "UPDATE cuentabancaria SET idClabe=?,CLABE=?,saldo = ? WHERE idClabe=?";  
                         PreparedStatement pst2 = con.prepareStatement(deposito);
                         String clabe="300006530157868032";
                         pst2.setString(1,id);
                         pst2.setString(2,clabe);
                         pst2.setString(3,canti);
                         pst2.setString(4,id);
                         int rs3 = pst2.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Tu depósito fue hecho con éxito.");
                        JOptionPane.showMessageDialog(null,"Se depósito"+"\n"+canti);

                     }
                } 
                
//                if(rs1.next()){
//                         JOptionPane.showMessageDialog(null,"Ya deja de meter dinero");
//                         String deposito = "UPDATE cuentabancaria SET idClabe=?,CLABE=?,saldo = ? WHERE idClabe=?";  
//                         PreparedStatement pst2 = con.prepareStatement(deposito);
//                         String clabe="300007477990652992";
//                         pst2.setString(1,id);
//                         pst2.setString(2,clabe);
//                         pst2.setString(3,canti);
//                         pst2.setString(4,id);
//                        int rs3 = pst2.executeUpdate();
//                        JOptionPane.showMessageDialog(null,"Tu depósito fue hecho con éxito.");
//                        JOptionPane.showMessageDialog(null,"Se te depósito"+"\n"+canti);
//                     }
                }catch(SQLException ex) {
                    ex.printStackTrace();
                // Si no se logra conectar
                JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
             }
    }

    @Override
    public void Transferir(String a,String b, String c,String d) throws RemoteException {
        try {
            //No se si funcione al 100%, funciona con una cuenta a otra jajaja pero no verifica si la otra tiene dinero
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                
                String Consulta = "SELECT * FROM cuentabancaria WHERE clabe=? and saldo = '0.00'"; 
                PreparedStatement ps1 = con.prepareStatement(Consulta);
                ps1.setString(1,a);
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                     String saldo = rs1.getString("saldo");
                     if(saldo.contains("0.00")){
                         JOptionPane.showMessageDialog(null, "No cuentas con fondos para transferir, procede a depositar como recomendación"); 
                }
                }else{
                     
                String SQL = "SELECT * FROM cuentabancaria WHERE CLABE=?";
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1,a);
                ResultSet rs = pst.executeQuery();
                
                String SQL1 = "SELECT * FROM cuentabancaria WHERE CLABE=?"; 
                //SELECT * FROM `cuentabancaria` WHERE CLABE = '300007477990652992'
                PreparedStatement pst1 = con.prepareStatement(SQL1);
                pst1.setString(1,b);
                ResultSet rs2 = pst1.executeQuery();
                //(Trp,TrO,c1,id);  
                //"UPDATE cuentabancaria SET CLABE=?, saldo = ? WHERE 1";
                String Update = "UPDATE cuentabancaria SET idClabe=?,CLABE=?,saldo = ? WHERE idClabe=?";
                PreparedStatement pst2 = con.prepareStatement(Update);
                pst2.setString(1,d);
                pst2.setString(2,b);
                pst2.setString(3,c);
                pst2.setString(4,d);
                int rs3 = pst2.executeUpdate();
                
//                String Update1 = "UPDATE cuentabancaria SET idClabe=?,CLABE=?,saldo = saldo - ?  WHERE idClabe=?";
//                PreparedStatement pst21 = con.prepareStatement(Update1);
//                pst21.setString(1,d);
//                pst21.setString(2,b);
//                pst21.setString(3,c);
//                pst21.setString(4,d);
//                int rs4 = pst21.executeUpdate();
                
                 if(rs.next()){
                     JOptionPane.showMessageDialog(null,"Transferencia exitosa");
                     JOptionPane.showMessageDialog(null,"Se abonaron"+"\n"+c);
                }
                }
                //Statement st = buscar.createStatement(); //Crear el statement
                //st.executeQuery("SELECT COUNT(idClientes) AS i FROM clientes WHERE correo = '"+user+"'"+"AND contraseña='"+contra+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Si no se logra conectar
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
    
    }

   //Verificar si funciona owo IMPORTANTE 
    @Override
    public void Retirar(String Quantitty,String id) throws RemoteException {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                String Consulta = "SELECT * FROM `cuentabancaria` WHERE clabe='300006530157868032' and saldo = '0.00'"; 
                PreparedStatement ps1 = con.prepareStatement(Consulta);
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                     String saldo = rs1.getString("saldo");
                     if(saldo.contains("0.00")){
                         JOptionPane.showMessageDialog(null, "No cuentas con fondos para retirar, procede a depositar en el mejor de los casos"); 
                     }
                }else{
                        String retiro = "UPDATE cuentabancaria SET idClabe=?,CLABE= ? ,saldo = saldo - ? WHERE idClabe=?";  
                        PreparedStatement pst2 = con.prepareStatement(retiro);
                        String clabe="300006530157868032";
                        pst2.setString(1,id);
                        pst2.setString(2,clabe);
                        pst2.setString(3,Quantitty);
                        pst2.setString(4,id);
                        int rs3 = pst2.executeUpdate();
                     JOptionPane.showMessageDialog(null,"Pago exitoso / Retiro exitoso");
                     JOptionPane.showMessageDialog(null,"Cantidad: "+"\n"+Quantitty);
                
                }
            }catch(SQLException ex) {
            ex.printStackTrace();
           // Si no se logra conectar
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
                 }
    }

    @Override
    public void Registrar(String N,String AP, String AM, String t,String d, String C,String Co,String fc, String T,String Ni,String CV,String num1, String num2,String cl) throws RemoteException {
                try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                Statement st = con.createStatement(); //Insertar los datos a la tabla cliente
                Statement st1 = con.createStatement(); //Insertar los datos de la tarjeta generada
                Statement st2 = con.createStatement(); //Insertar la CLABE Interbancaria
                
                //RECUERDA PONERLE EL  acento a "dirección" cuando cambies a la BASE DE DATOS RDRR
                st.executeUpdate("INSERT INTO `clientes`(`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `telefono`, `direccion`, `contraseña`, `correo`, `fechaNac`) VALUES ('"+N+"','"+AP+"','"+AM+"',"
                        + "'"+t+"','"+d+"','"+C+"','"+Co+"','"+fc+"')");
                                                          //cambiarle aqui a NumeroTarjeta Cuando use la BD, rdrr
                st1.executeUpdate("INSERT INTO `tarjeta`(`NúmeroCuenta`, `NIP`, `CVV`, `MesVencimiento`, `AnioVencimiento`) VALUES ('"+T+"','"+Ni+"','"+CV+"','"+num1+"','"+num2+"')");
                st2.executeUpdate("INSERT INTO `cuentabancaria`(`CLABE`, `saldo`) VALUES ('"+cl+"','"+00000.000+"')");

            /*
            Asi no era AJJAJAJAJA, habia puesto un contador :'v
            "INSERT INTO clientes VALUES('"+CampoNombre.getText()+"','"+ApePaterno.getText()+"','"+ApeMaterno.getText()+"',"
                    + "'"+telefonito.getText()+"','"+direcci.getText()+"','"+CampoContrasena.getText()+"','"+CorreoEl.getText()+"','"+fechaNacimiento+"')");
            */

        } catch (SQLException ex) {
            ex.printStackTrace();

            //Si no se logra conectar
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
    }

    @Override
    public void IniciarS(String Cor, String Cont) {
       try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                String SQL = "SELECT * FROM clientes WHERE correo=? and contraseña=?";
               // String Concat = "Select CONCAT(Nombre, ApellidoPaterno, ApellidoMaterno) As Nombre From clientes WHERE idClientes = ?";
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1,Cor);
                pst.setString(2,Cont);
                ResultSet rs = pst.executeQuery();
                
                //Me tarde un buen rato para lograr que saliera el nombre personalizado TuT 
                String SQL1= "Select CONCAT(Nombre, ' ', ApellidoPaterno) As Nombre From Clientes where correo=? and contraseña=?;";
                PreparedStatement ps1 = con.prepareStatement(SQL1);
                ps1.setString(1,Cor);
                ps1.setString(2,Cont);
                ResultSet rs1 = ps1.executeQuery();
                 if(rs.next() && rs1.next()){
                     String is = rs1.getString("Nombre");
                     JOptionPane.showMessageDialog(null,"¡ Bienvenido nuevamente !"+"\n"+is);
                        Bienvenido Bd = new Bienvenido();
                        Bd.setVisible(true);
                        //Solo tiene el detalle de que la ventana de "iniciar ya no se cierra :c
                }
            
                //Statement st = buscar.createStatement(); //Crear el statement
                //st.executeQuery("SELECT COUNT(idClientes) AS i FROM clientes WHERE correo = '"+user+"'"+"AND contraseña='"+contra+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Si no se logra conectar
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
    }

    @Override
    public void Consultar(String id) throws RemoteException {
         try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/cursi","root","");
                String SQL = "SELECT * FROM `cuentabancaria` WHERE idClabe=? and saldo";
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1,id);
                ResultSet rs = pst.executeQuery();
                 if(rs.next()){
                     String is = rs.getString("Saldo"); //Aqui me trae el dato del campo "Saldo";
                     JOptionPane.showMessageDialog(null,"Tu saldo es de "+is);
                       }else{
                     //No hacer nada 
                 }
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Si no se logra conectar
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos");
        }
    }
}
