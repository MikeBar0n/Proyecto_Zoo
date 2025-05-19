package main;


import view.ZoologicoVista;
import controller.ZoologicoController;

public class Main {
    public static void main(String[] args) {
        ZoologicoVista vista = new ZoologicoVista();
        new ZoologicoController(vista);
    }
}

