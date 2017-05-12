/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.RemoteException;
import java.rmi.*;

/**
 *
 * @author nerimae
 */
public interface loginInterface extends Remote {
    public boolean getLogin(String username, String password) throws RemoteException;
}

