package main;

import view.ZoologicoVista;
import controller.ZoologicoController;

import view.EspecieVista;
import controller.EspecieController;

public class Main {
    public static void main(String[] args) {
        ZoologicoVista vista = new ZoologicoVista();
        new ZoologicoController(vista);
        new EspecieController(new EspecieVista());
    }
}

