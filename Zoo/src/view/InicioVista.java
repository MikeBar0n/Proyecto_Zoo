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
public class InicioVista extends JFrame{
    
    public JButton btnIniciarApp = new JButton("Iniciar Aplicación");

    public InicioVista() {
        setTitle("Inicio");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel mensaje = new JLabel("Todo listo para iniciar la aplicación", SwingConstants.CENTER);
        add(mensaje, BorderLayout.CENTER);
        add(btnIniciarApp, BorderLayout.SOUTH);

        setVisible(true);
    }
    
}
