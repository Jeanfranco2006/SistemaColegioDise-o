package SistemaColegio.Controlador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import SistemaColegio.Controlador.PanelPrincipalFrame;
import SistemaColegio.Controlador.UsuarioDAO;
import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnIngresar;
    private UsuarioDAO loginDAO;

    public LoginFrame() {
        setTitle("Login - Sistema Colegio");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 30, 130, 25);
        add(txtUsuario);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(30, 70, 80, 25);
        add(lblContraseña);

        txtContraseña = new JPasswordField();
        txtContraseña.setBounds(120, 70, 130, 25);
        add(txtContraseña);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(90, 110, 100, 30);
        add(btnIngresar);

        loginDAO = new UsuarioDAO();

        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contraseña = new String(txtContraseña.getPassword());

                if (loginDAO.validar(usuario, contraseña)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido, " + usuario);
                    dispose(); // Cierra el login
                    new PanelPrincipalFrame(); // Abre el nuevo JFrame
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}


