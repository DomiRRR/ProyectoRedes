/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NaruHina
 */

//Verificar Clase
public class Servidor {
        public static void main(String args[]){
        try{
        ObjetoRemoto or= new ObjetoRemoto(); //Creamos una instancia de Objeto Remoto 
        Registry reg = LocateRegistry.createRegistry(1099); //puerto por default es el 1099
        //bind es para ligar con bind si ya existe nos manda una excepción y con rebind, nos revincula el objeto
        reg.rebind("Objetoremoto", or);
        System.out.println("Servidor activo en:"+InetAddress.getLocalHost().getHostAddress());
        }catch(RemoteException e){
            e.printStackTrace();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}