/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Daniel
 */

public class DescripcionVista extends JFrame{
    
    public JButton btnSiguiente = new JButton("Siguiente");
    
    public DescripcionVista() {
        setTitle("Descripción del Caso");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea descripcion = new JTextArea(
            "Esta aplicación permite gestionar la información de zoológicos en Colombia,\n"
          + "registrar especies y animales, y asociarlos entre sí.\n\n"
          + "Se utiliza Java, el patrón MVC, archivos de texto como almacenamiento,\n"
          + "y una interfaz gráfica construida con Swing."
        );
        descripcion.setEditable(false);
        descripcion.setWrapStyleWord(true);
        descripcion.setLineWrap(true);

        add(new JScrollPane(descripcion), BorderLayout.CENTER);
        add(btnSiguiente, BorderLayout.SOUTH);

        setVisible(true);
    }
    
}
