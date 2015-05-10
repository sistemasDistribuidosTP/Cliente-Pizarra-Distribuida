/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/*Este objeto remoto se comunica con el programa que levanta la interfaz grafica
por medio de la referencia p a la misma*/
public class ClienteImpl extends UnicastRemoteObject implements InterfazCliente{
    PizarraCliente p;
    public ClienteImpl(PizarraCliente p) throws RemoteException {
        super();
        
        this.p=p;
    }

    @Override
    public void pintar(int x, int y, int aSetear) throws RemoteException {
        p.pintar(x, y, aSetear);
    }

    @Override
    public void procesarPizarra(int[][] mat) throws RemoteException {
        p.procesarPizarra(mat);
    }
    public void desconectar(Object o){
        
    }

    
}
