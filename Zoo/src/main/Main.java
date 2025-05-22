package main;

import controller.LoginController;
import view.LoginVista;


public class Main {
    public static void main(String[] args) throws Exception {
        
       new LoginController(new LoginVista());
       
    }
}

