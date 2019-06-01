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
    public double Depositar(double a)throws RemoteException;
    public double Transferir(double a)throws RemoteException;
    public double Retirar(String a)throws RemoteException;
    public void Registrar(String N,String AP, String AM, String t,String d, String C,String Co,String fc, String T,String Ni,String CV,String num1, String num2,String cl)throws RemoteException;
    public void IniciarS(String Cor,String Cont) throws RemoteException;
// public void Validar(String Clabe,String Tarjeta)throws RemoteException;
}



