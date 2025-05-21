
package controller;

import model.*;
import model.dao.AnimalDAO;
import view.AnimalVista;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Daniel
 */

public class AnimalController {
    
    private AnimalVista vista;
    private HashMap<String, Animal> mapaAnimales;
    private TreeSet<Especie> especies;
    private HashMap<String, Zoologico> zoologicos;
    
    public AnimalController(AnimalVista vista, TreeSet<Especie> especies, HashMap<String, Zoologico> zoologicos) {
        this.vista = vista;
        this.especies = especies;
        this.zoologicos = zoologicos;

        try {
            mapaAnimales = AnimalDAO.cargarAnimales();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar animales: " + e.getMessage());
            mapaAnimales = new HashMap<>();
        }

        for (Especie e : especies) {
            vista.comboEspecie.addItem(e.getNombreCientifico());
        }

        for (String nombreZoo : zoologicos.keySet()) {
            vista.comboZoologico.addItem(nombreZoo);
        }

        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnListar.addActionListener(e -> listar());
    }

    private void guardar() {
        try {
            String id = vista.txtId.getText();
            String nombreEspecie = (String) vista.comboEspecie.getSelectedItem();
            String nombreZoo = (String) vista.comboZoologico.getSelectedItem();
            Especie especie = especies.stream().filter(e -> e.getNombreCientifico().equals(nombreEspecie)).findFirst().orElse(null);
            if (especie == null) throw new Exception("Especie no encontrada");
            Zoologico zoo = zoologicos.get(nombreZoo);
            if (zoo == null) throw new Exception("Zoológico no encontrado");

            Animal animal = new Animal(id, especie, vista.txtSexo.getText(),
                    Integer.parseInt(vista.txtAnio.getText()),
                    vista.txtPais.getText(), vista.txtContinente.getText(), nombreZoo);

            mapaAnimales.put(id, animal);
            zoo.agregarAnimal(animal);
            AnimalDAO.guardarAnimales(mapaAnimales.values());

            JOptionPane.showMessageDialog(null, "Animal guardado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    private void listar() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : mapaAnimales.values()) {
            sb.append(a).append(" - Zoológico: ").append(a.getNombreZoologico()).append("\n");
        }
        vista.areaResultado.setText(sb.toString());
    }
}
