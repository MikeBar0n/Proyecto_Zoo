package main;

import view.*;
import controller.*;


public class Main {
    public static void main(String[] args) {
        new ZoologicoController(new ZoologicoVista());
        new EspecieController(new EspecieVista());
    }
}

