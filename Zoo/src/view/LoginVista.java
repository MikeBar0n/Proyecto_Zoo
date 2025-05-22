package view;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel
 */
public class LoginVista extends JFrame{
    
    public JTextField txtUsuario = new JTextField(15);
    public JPasswordField txtContrasena = new JPasswordField(15);
    public JButton btnIngresar = new JButton("Ingresar");
    
    public LoginVista() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));
        setSize(300, 200);
        setLocationRelativeTo(null);

        add(new JLabel("Usuario:", SwingConstants.CENTER));
        add(txtUsuario);
        add(new JLabel("Contraseña:", SwingConstants.CENTER));
        add(txtContrasena);
        add(btnIngresar);

        setVisible(true);
    }
    
}
