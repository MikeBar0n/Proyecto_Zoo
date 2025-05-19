
package controller;

import model.Especie;
import model.dao.EspecieDAO;
import view.EspecieVista;

import javax.swing.*;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Daniel
 */

public class EspecieController {
    
    private EspecieVista vista;
    private TreeSet<Especie> especies;
    
    public EspecieController(EspecieVista vista) {
        this.vista = vista;

        try {
            especies = EspecieDAO.cargarEspecies();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar especies: " + e.getMessage());
            especies = new TreeSet<>();
        }

        vista.btnGuardar.addActionListener(e -> guardar());
        vista.btnListar.addActionListener(e -> listar());
    }
    
    private void guardar() {
        try {
            Especie e = new Especie(
                vista.txtVulgar.getText(),
                vista.txtCientifico.getText(),
                vista.txtFamilia.getText()
            );
            especies.add(e);
            EspecieDAO.guardarEspecies(especies);
            JOptionPane.showMessageDialog(null, "Especie guardada.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
    private void listar() {
        StringBuilder sb = new StringBuilder();
        for (Especie e : especies) {
            sb.append(e).append("\n");
        }
        vista.areaResultado.setText(sb.toString());
    }
    
}
