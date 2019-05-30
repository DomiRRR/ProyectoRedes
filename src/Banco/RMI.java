/*
 * Nombre: Regina Dominique Ríos Ramírez
 * Tema del programa: ~ Cajero de Banco ATM ~
 * Descripción: Cajero hecho en NetBeans junto con una base de datos que guarda los datos de los clientes y accede a ellos
 * para realizar acciones como: depositar a cuenta, retirar fondos de cuenta, transferir de cuenta a cuenta
 * pagar / comprar servicios y consultar respectivamente el saldo, se pretende que el proyecto use SOCKETS o RMI
 * Fecha: ~ 29 de Mayo 2019 ~ 
 */

package Banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Clases 100% no ciertas :c AUN NO SIRVEN 
/**
 *
 * @author NaruHina
 */
public interface RMI extends Remote{
    public void Depositar()throws RemoteException;
    public void Transferir()throws RemoteException;
    public void Retirar()throws RemoteException;
    public void Validar()throws RemoteException;
}



