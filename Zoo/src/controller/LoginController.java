
package controller;

import view.*;

import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class LoginController {
    
    private final LoginVista vista;
    
    public LoginController(LoginVista vista) {
        this.vista = vista;

        vista.btnIngresar.addActionListener(e -> validar());
    }
    
    private void validar() {
        String usuario = vista.txtUsuario.getText().trim();
        String pass = new String(vista.txtContrasena.getPassword()).trim();

        if (usuario.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        } else if (usuario.equals("admin") && pass.equals("1234")) {
            vista.dispose();
            mostrarDescripcion();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
        }
    }
    
    private void mostrarDescripcion() {
        DescripcionVista desc = new DescripcionVista();
        desc.btnSiguiente.addActionListener(e -> {
            desc.dispose();
            mostrarEquipo();
        });
    }
    
    private void mostrarEquipo() {
        EquipoVista equipo = new EquipoVista();
        equipo.btnContinuar.addActionListener(e -> {
            equipo.dispose();
            mostrarInicio();
        });
    }
    
    private void mostrarInicio() {
        InicioVista inicio = new InicioVista();
        inicio.btnIniciarApp.addActionListener(e -> {
            inicio.dispose();
            new MenuController(new MenuPrincipal());
        });
    }
    
}
