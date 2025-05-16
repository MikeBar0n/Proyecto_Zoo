
package controller;

import model.Zoologico;
import model.dao.ZoologicoDAO;
import view.ZoologicoVista;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Daniel
 */
public class ZoologicoController {
    
    private ZoologicoVista vista;
    private HashMap<String, Zoologico> mapaZoologicos;
    
    public ZoologicoController(ZoologicoVista vista) {
        this.vista = vista;
        try {
            mapaZoologicos = ZoologicoDAO.cargarZoologicos();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
            mapaZoologicos = new HashMap<>();
        }

        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnListar.addActionListener(e -> listar());
    }
    
    private void guardar() {
        try {
            String nombre = vista.txtNombre.getText();
            Zoologico zoo = new Zoologico(
                nombre,
                vista.txtCiudad.getText(),
                vista.txtPais.getText(),
                Double.parseDouble(vista.txtTamano.getText()),
                Double.parseDouble(vista.txtPresupuesto.getText())
            );
            mapaZoologicos.put(nombre, zoo);
            ZoologicoDAO.guardarZoologicos(mapaZoologicos.values());
            JOptionPane.showMessageDialog(null, "Zoológico guardado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
     private void listar() {
        StringBuilder sb = new StringBuilder();
        for (Zoologico zoo : mapaZoologicos.values()) {
            sb.append(zoo).append("\n");
        }
        vista.areaResultado.setText(sb.toString());
    }
}
