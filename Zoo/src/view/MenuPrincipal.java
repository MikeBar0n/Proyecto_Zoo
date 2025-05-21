
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */

public class MenuPrincipal extends JFrame {
    
    public JButton btnZoologicos = new JButton("Gestionar Zoológicos");
    public JButton btnEspecies = new JButton("Gestionar Especies");
    public JButton btnAnimales = new JButton("Gestionar Animales");
    public JButton btnAnimalesPorZoo = new JButton("Ver Animales por Zoológico");

    public MenuPrincipal() {
        setTitle("Sistema de Gestión de Zoológicos en Colombia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel titulo = new JLabel("Bienvenido al sistema de gestión de Zoológicos");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        add(titulo, BorderLayout.NORTH);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        
        Dimension buttonSize = new Dimension(250, 35);
        btnZoologicos.setMaximumSize(buttonSize);
        btnEspecies.setMaximumSize(buttonSize);
        btnAnimales.setMaximumSize(buttonSize);
        btnAnimalesPorZoo.setMaximumSize(buttonSize);
        
        panelBotones.add(btnZoologicos);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnEspecies);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnAnimales);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnAnimalesPorZoo);

        add(panelBotones, BorderLayout.CENTER);
        
        setVisible(true);
    }
}
