/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;
import interfaces.timeinInterface;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

/**
 *
 * @author nerimae
 */
public class timeInImpl extends UnicastRemoteObject implements timeinInterface {
     public timeInImpl() throws RemoteException{
        
     }
    @Override
    public boolean getTimeIn(String empID, String empName, String designation, String department, Calendar indate, Calendar inTime) throws RemoteException {
         
        boolean found = false;
        try{
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return found;
    }
    
    
}
