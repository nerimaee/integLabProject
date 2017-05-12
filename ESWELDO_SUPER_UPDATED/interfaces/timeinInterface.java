/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.rmi.*;
import java.util.Calendar;
/**
 *
 * @author nerimae
 */
public interface timeinInterface {
    public boolean getTimeIn(String empID, String empName, String designation, 
            String department, Calendar indate, Calendar inTime) throws RemoteException;
}
