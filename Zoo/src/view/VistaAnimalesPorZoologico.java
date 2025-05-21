
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */
public class VistaAnimalesPorZoologico extends JFrame {
    
    public JComboBox<String> comboZoologico = new JComboBox<>();
    public JButton btnMostrar = new JButton("Mostrar Animales");
    public JTextArea areaResultado = new JTextArea(10, 40);
    
    public VistaAnimalesPorZoologico() {
        setTitle("Animales por Zoológico");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Zoológico:"));
        panel.add(comboZoologico);
        panel.add(btnMostrar);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
