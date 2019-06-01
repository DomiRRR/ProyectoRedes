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
    public double Depositar(double a) throws RemoteException {
        return 0;
    }

    @Override
    public double Transferir(double a) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Retirar(String a) throws RemoteException {
       con = DriverManager.getConnection("jdbc:mysql://localhost/rdrr","root","");
                String SQL = "SELECT * FROM clientes WHERE correo=? and contraseña=?";
               // String Concat = "Select CONCAT(Nombre, ApellidoPaterno, ApellidoMaterno) As Nombre From clientes WHERE idClientes = ?";
                PreparedStatement pst = con.prepareStatement(SQL);
    }

    @Override
    public void Registrar(String N,String AP, String AM, String t,String d, String C,String Co,String fc, String T,String Ni,String CV,String num1, String num2,String cl) throws RemoteException {
                try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/rdrr","root","");
                Statement st = con.createStatement(); //Insertar los datos a la tabla cliente
                Statement st1 = con.createStatement(); //Insertar los datos de la tarjeta generada
                Statement st2 = con.createStatement(); //Insertar la CLABE Interbancaria
                st.executeUpdate("INSERT INTO `clientes`(`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `telefono`, `dirección`, `contraseña`, `correo`, `fechaNac`) VALUES ('"+N+"','"+AP+"','"+AM+"',"
                        + "'"+t+"','"+d+"','"+C+"','"+Co+"','"+fc+"')");
                st1.executeUpdate("INSERT INTO `tarjeta`(`NumeroTarjeta`, `NIP`, `CVV`, `MesVencimiento`, `AnioVencimiento`) VALUES ('"+T+"','"+Ni+"','"+CV+"','"+num1+"','"+num2+"')");
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
                con = DriverManager.getConnection("jdbc:mysql://localhost/rdrr","root","");
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
}
