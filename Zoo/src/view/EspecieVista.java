
package view;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */

public class EspecieVista extends JFrame{
    
    public JTextField txtVulgar = new JTextField(15);
    public JTextField txtCientifico = new JTextField(15);
    public JTextField txtFamilia = new JTextField(15);
    public JButton btnGuardar = new JButton("Guardar Especie");
    public JButton btnListar = new JButton("Listar Especies");
    public JTextArea areaResultado = new JTextArea(10, 30);

    public EspecieVista() {
        setTitle("Gestión de Especies");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelDatos = new JPanel(new GridLayout(4, 2));
        panelDatos.add(new JLabel("Nombre vulgar:")); panelDatos.add(txtVulgar);
        panelDatos.add(new JLabel("Nombre científico:")); panelDatos.add(txtCientifico);
        panelDatos.add(new JLabel("Familia:")); panelDatos.add(txtFamilia);
        panelDatos.add(btnGuardar); panelDatos.add(btnListar);

        add(panelDatos, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
