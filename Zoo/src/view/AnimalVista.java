
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */

public class AnimalVista extends JFrame{
    
    public JTextField txtId = new JTextField(10);
    public JTextField txtSexo = new JTextField(5);
    public JTextField txtAnio = new JTextField(5);
    public JTextField txtPais = new JTextField(15);
    public JTextField txtContinente = new JTextField(15);
    public JComboBox<String> comboEspecie = new JComboBox<>();
    public JComboBox<String> comboZoologico = new JComboBox<>();
    public JButton btnGuardar = new JButton("Guardar Animal");
    public JButton btnListar = new JButton("Listar Animales");
    public JTextArea areaResultado = new JTextArea(10, 40);
    
    public AnimalVista() {
        setTitle("Gestión de Animales");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.add(new JLabel("ID:")); panel.add(txtId);
        panel.add(new JLabel("Sexo:")); panel.add(txtSexo);
        panel.add(new JLabel("Año de nacimiento:")); panel.add(txtAnio);
        panel.add(new JLabel("País de origen:")); panel.add(txtPais);
        panel.add(new JLabel("Continente:")); panel.add(txtContinente);
        panel.add(new JLabel("Especie:")); panel.add(comboEspecie);
        panel.add(new JLabel("Zoológico:")); panel.add(comboZoologico);
        panel.add(btnGuardar); panel.add(btnListar);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
