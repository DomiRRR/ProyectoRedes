/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 29 de Mayo 2019 ~ 
 */

package Banco;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author NaruHina
 */

//Aun falta esto del RMI....
public class Servidor {
    public static void main(String args[]) {
        try {
            ObjetoRemoto or = new ObjetoRemoto(); //nuev
            // Lo habitual es trabajar en el puerto 1099
            Registry reg = LocateRegistry.createRegistry(1099);
            // Publicar el objeto remoto
            reg.bind("Objeto remoto", or);
            System.out.println("Servidor activo..."); //Ocupo esta parte pa hacer jalar lo demás
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
