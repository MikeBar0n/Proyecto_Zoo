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
public class DescripcionVista extends JFrame {

    public JButton btnSiguiente = new JButton("Siguiente");

    public DescripcionVista() {
        setTitle("Descripción del Caso");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea descripcion = new JTextArea(
                "Se quiere construir una aplicación software que permita almacenar información\n"
                + "relativa a los zoos existentes en Colombia, así como las especies animales\n"
                + "que éstos albergan.\n\n"
                + "De cada zoo se conoce el nombre, ciudad y país donde se encuentra,\n"
                + "tamaño (en m2) y presupuesto anual.\n"
                + "De cada especie animal se almacena el nombre vulgar y nombre científico\n"
                + "y familia a la que pertenece. Además se debe guardar información sobre\n"
                + "cada animal que los zoos poseen, como su número de identificación, especie,\n"
                + "sexo, año de nacimiento, país de origen y continente.\n"
                + "La aplicación deberá generar un listado con la información de los animales pertenecientes al zoológico."
        );
        descripcion.setEditable(false);
        descripcion.setWrapStyleWord(true);
        descripcion.setLineWrap(true);

        add(new JScrollPane(descripcion), BorderLayout.CENTER);
        add(btnSiguiente, BorderLayout.SOUTH);

        setVisible(true);
    }

}
