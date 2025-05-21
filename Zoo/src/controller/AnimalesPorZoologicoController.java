
package controller;

import model.Animal;
import model.Zoologico;
import view.VistaAnimalesPorZoologico;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Daniel
 */

public class AnimalesPorZoologicoController {
    
    private VistaAnimalesPorZoologico vista;
    private HashMap<String, Zoologico> zoologicos;
    
    public AnimalesPorZoologicoController(VistaAnimalesPorZoologico vista, HashMap<String, Zoologico> zoologicos) {
        this.vista = vista;
        this.zoologicos = zoologicos;

        for (String nombre : zoologicos.keySet()) {
            vista.comboZoologico.addItem(nombre);
        }

        vista.btnMostrar.addActionListener(e -> mostrarAnimales());
    }
    
    private void mostrarAnimales() {
        String nombreSeleccionado = (String) vista.comboZoologico.getSelectedItem();
        Zoologico zoo = zoologicos.get(nombreSeleccionado);
        if (zoo == null) {
            JOptionPane.showMessageDialog(null, "Zoológico no encontrado.");
            return;
        }

        List<Animal> lista = zoo.getAnimales();
        if (lista.isEmpty()) {
            vista.areaResultado.setText("No hay animales registrados en este zoológico.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Animal a : lista) {
            sb.append(a).append("\n");
        }

        vista.areaResultado.setText(sb.toString());
    }
    
}
