
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */
public class ZoologicoVista extends JFrame{
    
    public JTextField txtNombre = new JTextField(15);
    public JTextField txtCiudad = new JTextField(15);
    public JTextField txtPais = new JTextField(15);
    public JTextField txtTamano = new JTextField(15);
    public JTextField txtPresupuesto = new JTextField(15);
    public JButton btnGuardar = new JButton("Guardar Zoológico");
    public JButton btnListar = new JButton("Listar Zoológicos");
    public JTextArea areaResultado = new JTextArea(10, 30);
    
    public ZoologicoVista() {
        setTitle("Gestión de Zoológicos");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        panelDatos.add(new JLabel("Nombre:")); panelDatos.add(txtNombre);
        panelDatos.add(new JLabel("Ciudad:")); panelDatos.add(txtCiudad);
        panelDatos.add(new JLabel("País:")); panelDatos.add(txtPais);
        panelDatos.add(new JLabel("Tamaño (m²):")); panelDatos.add(txtTamano);
        panelDatos.add(new JLabel("Presupuesto ($):")); panelDatos.add(txtPresupuesto);
        panelDatos.add(btnGuardar); panelDatos.add(btnListar);

        add(panelDatos, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
