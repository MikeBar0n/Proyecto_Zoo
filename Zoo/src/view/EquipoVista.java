/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */
public class EquipoVista extends JFrame{
    
    public JButton btnContinuar = new JButton("Continuar");

    public EquipoVista() {
        setTitle("Equipo de Desarrollo");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea info = new JTextArea(
            "Integrantes:\n" +
            "- Michael Daniel Barón Castro\n\n" +
            "Asignatura: Técnicas de Programación II\n" +
            "Institución: Fundación Universitaria Konrad Lorenz\n" +
            "Período: 2025-I"
        );
        info.setEditable(false);
        info.setFont(new Font("Arial", Font.PLAIN, 12));

        add(new JScrollPane(info), BorderLayout.CENTER);
        add(btnContinuar, BorderLayout.SOUTH);

        setVisible(true);
    }
    
}
