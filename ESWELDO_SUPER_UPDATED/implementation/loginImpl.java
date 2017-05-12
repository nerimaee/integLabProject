/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.loginInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author nerimae
 */
public class loginImpl extends UnicastRemoteObject implements loginInterface{
    public loginImpl() throws RemoteException{
        
    }
    
    public boolean getLogin(String username, String password) throws RemoteException {
        boolean found = false;
        try{
            if(username.equals("admin") && password.equals("123")){
                return found = true;
            } else{
                return found;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return found;
    }
}
