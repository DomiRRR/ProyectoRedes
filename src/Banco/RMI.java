/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Clases 100% no ciertas :c
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



