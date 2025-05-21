package main;

import view.*;
import controller.*;
import model.*;
import model.dao.*;


public class Main {
    public static void main(String[] args) throws Exception {
        
        var especies = EspecieDAO.cargarEspecies();
        var zoologicos = ZoologicoDAO.cargarZoologicos();
        
        new ZoologicoController(new ZoologicoVista());
        new EspecieController(new EspecieVista());
        new AnimalController(new AnimalVista(), especies, zoologicos);
        new AnimalesPorZoologicoController(new VistaAnimalesPorZoologico(), zoologicos);
    }
}

