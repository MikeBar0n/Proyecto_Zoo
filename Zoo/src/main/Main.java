package main;

import view.*;
import controller.*;
import model.*;
import model.dao.*;


public class Main {
    public static void main(String[] args) throws Exception {
        
       new MenuController(new MenuPrincipal());
       
    }
}

