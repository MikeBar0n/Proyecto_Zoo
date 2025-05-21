package controller;

import model.dao.*;
import model.*;
import view.*;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Daniel
 */
public class MenuController {

    private MenuPrincipal vista;
    private HashMap<String, Zoologico> zoologicos;
    private TreeSet<Especie> especies;

    private ZoologicoVista zoologicoVista;
    private EspecieVista especieVista;
    private AnimalVista animalVista;
    private VistaAnimalesPorZoologico animalesPorZooVista;

    public MenuController(MenuPrincipal vista) {
        this.vista = vista;

        try {
            zoologicos = ZoologicoDAO.cargarZoologicos();
            especies = EspecieDAO.cargarEspecies();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error cargando datos iniciales: " + e.getMessage());
            zoologicos = new HashMap<>();
            especies = new TreeSet<>();
        }

        vista.btnZoologicos.addActionListener(e -> {
            if (zoologicoVista == null || !zoologicoVista.isDisplayable()) {
                zoologicoVista = new ZoologicoVista();
                new ZoologicoController(zoologicoVista, zoologicos);
            } else {
                zoologicoVista.toFront();
            }
        });

        vista.btnEspecies.addActionListener(e -> {
            if (especieVista == null || !especieVista.isDisplayable()) {
                especieVista = new EspecieVista();
                new EspecieController(especieVista, especies);
            } else {
                especieVista.toFront();
            }
        });

        vista.btnAnimales.addActionListener(e -> {
            if (animalVista == null || !animalVista.isDisplayable()) {
                animalVista = new AnimalVista();
                new AnimalController(animalVista, especies, zoologicos);
            } else {
                animalVista.toFront();
            }
        });

        vista.btnAnimalesPorZoo.addActionListener(e -> {
            if (animalesPorZooVista == null || !animalesPorZooVista.isDisplayable()) {
                animalesPorZooVista = new VistaAnimalesPorZoologico();
                new AnimalesPorZoologicoController(animalesPorZooVista, zoologicos);
            } else {
                animalesPorZooVista.toFront();
            }
        });
    }

}
