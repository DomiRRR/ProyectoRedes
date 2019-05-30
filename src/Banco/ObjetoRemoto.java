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

/**
 *
 * @author NaruHina
 */

//verificar ESTAS CLASES AUN NO SIRVEN
public class ObjetoRemoto extends UnicastRemoteObject implements RMI{

    //aunque mi constructor no haga nada, si tengo que lanzar una excepción
    public ObjetoRemoto() throws RemoteException{
        super();
    }

    @Override
    public void Depositar() throws RemoteException {
    
    }

    @Override
    public void Transferir() throws RemoteException {
        
    }

    @Override
    public void Retirar() throws RemoteException {
        
    }

    @Override
    public void Validar() throws RemoteException {
        
    }
}
