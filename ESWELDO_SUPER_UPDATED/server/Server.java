/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import implementation.loginImpl;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nerimae
 */
public class Server {
    public static void main(String[] args){
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            loginImpl li = new loginImpl();
            reg.rebind("login", (Remote) li);
            System.out.println("Server ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}