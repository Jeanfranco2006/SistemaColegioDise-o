/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaColegio.Controlador;

import javax.swing.*;

public class PanelPrincipalFrame extends JFrame {
    public PanelPrincipalFrame() {
        setTitle("Panel Principal - Sistema Colegio");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblMensaje = new JLabel("Bienvenido al panel principal");
        lblMensaje.setBounds(100, 100, 250, 30);
        add(lblMensaje);

        setVisible(true);
    }
}

