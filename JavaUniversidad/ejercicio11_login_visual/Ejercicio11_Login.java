package com.mycompany.ejercicio11_login;

// Librerías
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio11_Login extends JFrame implements ActionListener {

    // Atributos
    private JLabel JL_id = new JLabel("ID: ");
    private JLabel JL_contraseña = new JLabel("Contraseña: ");
    private JTextField id = new JTextField(20);
    private JPasswordField contraseña = new JPasswordField(20);
    private JButton registro = new JButton("Registro");
    private JButton login = new JButton("Entrar");
    private JPanel panel = new JPanel();
    private JLabel imagenLabel = new JLabel();

    // Arreglo de usuarios
    public Usuario usuarios[] = new Usuario[10];
    int numeroRegistros = 0;

    // Constructor
    public Ejercicio11_Login() {
        // Frame o Ventana
        setTitle("Login");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Fuente personalizada
        Font fuente = new Font("Arial", Font.BOLD, 14);
        JL_id.setFont(fuente);
        JL_contraseña.setFont(fuente);
        id.setFont(fuente);
        contraseña.setFont(fuente);

        // Imagen 
        java.net.URL url = getClass().getResource("/icon-256x256.png");
        if (url != null) {
            ImageIcon icono = new ImageIcon(url);
            imagenLabel.setHorizontalAlignment(JLabel.CENTER);

            // Ajuste de la imagen automatico
            imagenLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
                @Override
                public void componentResized(java.awt.event.ComponentEvent e) {
                    int anchoLabel = imagenLabel.getWidth();
                        int altoLabel = imagenLabel.getHeight();

                        if (anchoLabel > 0 && altoLabel > 0) {
                            int anchoOriginal = icono.getIconWidth();
                            int altoOriginal = icono.getIconHeight();

                            // Calculamos la escala proporcional
                            double ratioAncho = (double) anchoLabel / anchoOriginal;
                            double ratioAlto = (double) altoLabel / altoOriginal;
                            double ratio = Math.min(ratioAncho, ratioAlto);

                            int nuevoAncho = (int) (anchoOriginal * ratio);
                            int nuevoAlto = (int) (altoOriginal * ratio);

                            Image imgEscalada = icono.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
                            imagenLabel.setIcon(new ImageIcon(imgEscalada));
                        }
                }
            });
        } else {
            System.out.println("⚠ No se encontró la imagen en resources");
        }

        // Panel
        panel.setLayout(new GridLayout(7, 1, 10, 10));
        panel.add(imagenLabel);
        panel.add(JL_id);
        panel.add(id);
        panel.add(JL_contraseña);
        panel.add(contraseña);
        panel.add(registro);
        panel.add(login);

        add(panel, BorderLayout.CENTER);
        setVisible(true);

        // Eventos
        registro.addActionListener(this);
        login.addActionListener(this);
    }

    // Método de registro
    void registrarUsuario(String i, String c) {
        if (i.isEmpty() || c.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }

        if (numeroRegistros < usuarios.length) {
            usuarios[numeroRegistros] = new Usuario(i, c);
            numeroRegistros++;
            JOptionPane.showMessageDialog(this, "Usuario registrado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Error: límite de usuarios alcanzado");
        }
    }

    // Método de login
    void iniciarSesion(String i, String c) {
        if (i.isEmpty() || c.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            return;
        }

        for (int j = 0; j < numeroRegistros; j++) {
            if (usuarios[j].getId().equals(i) && usuarios[j].getContraseña().equals(c)) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + i);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registro) {
            registrarUsuario(id.getText(), new String(contraseña.getPassword()));
        } else if (e.getSource() == login) {
            iniciarSesion(id.getText(), new String(contraseña.getPassword()));
        }
    }

    // Main
    public static void main(String[] args) {
        new Ejercicio11_Login();
    }
}
