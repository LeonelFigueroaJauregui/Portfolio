package com.mycompany.ventana;

//Librerias 
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField campotexto;
    private JButton BotonMostrar;
    private JLabel etiquetaResultado;
    
    
    //Creacion de la ventana / Constructor
    Ventana(){
        super("Ventana");
        //setLocation(50,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setSize(500,450);
     
        
        //Creacion de componentes
        campotexto = new JTextField(20);
        BotonMostrar = new JButton("Mostrar");
        etiquetaResultado = new JLabel("Resultado del texto");
        
        //Creacion de un panel para organizar los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        //Agregar los componentes dentro del panel
        panel.add(new JLabel ("Escribir algo:"));
        panel.add(campotexto);
        panel.add(etiquetaResultado);
        panel.add(BotonMostrar);
        
        //Evento del boton
        BotonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)   {
             String texto = campotexto.getText();
             etiquetaResultado.setText(texto);
             
        }
        
        
});
        //Agregar el panel a la ventana
        add(panel);
           setVisible(true);
        
    }
    
    //Main que llama a nuestra ventana
public static void main(String[] args){
    new Ventana();

}

}