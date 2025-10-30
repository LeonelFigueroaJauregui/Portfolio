
package com.mycompany.ejerciciocalculadora;

//Librerias
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjercicioCalculadora extends 
        JFrame implements ActionListener  {
    
    //Atributos//
    private JTextField entradaValores;
    private JButton [] botones;
    private String [] operaciones = {"+", "-", "*", "/"};
    private double primerNumero = 0;
    private String operador = " ";
    JPanel panel=new JPanel();
    
    //Creacion de la ventana / Constructor
    EjercicioCalculadora(){
    setTitle("Calculadora Magica");
    setSize(300,400);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    

    //campoTexto
    entradaValores = new JTextField();
    entradaValores.setEditable(false);
    entradaValores.setHorizontalAlignment(JTextField.RIGHT);
   add(entradaValores,BorderLayout.NORTH);


    //Panel para los botones
    panel.setLayout(new GridLayout(4,4,5,5));


    //Crear botones y operaciones
    String [] textoBoton = {
    "7","8","9","/",
    "4","5","6","*",
    "1","2","3","-",
    "0","C","=","+"
    };
    
    botones=new  JButton[textoBoton.length];
    for(int i=0; i<textoBoton.length; i++){
            botones[i]=new JButton(textoBoton[i]);
            botones[i].addActionListener(this);
            panel.add(botones[i]);         
    }
        add(panel,BorderLayout.CENTER);
        setVisible(true);
    
    }
 
    //Implementacion del metodo abstracto de los eventos//
    @Override
    public void actionPerformed(ActionEvent e){
        String comando=e.getActionCommand();
        if(comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            entradaValores.setText(entradaValores.getText() + comando);
           
        }
        else if(comando.equals("C")) {
            entradaValores.setText(" ");
            operador =" ";
            primerNumero = 0;
            
        }
        else if (comando.equals("=")){
            double SegundoNumero = Double.parseDouble(entradaValores.getText());
                double resultado = 0;
            
            //Operadores de la calculadora
            switch(operador) {
                case"+" : {resultado = primerNumero + SegundoNumero; 
                break;
                }

                case "-" : {   
                resultado = primerNumero - SegundoNumero; 
                break;
}
                case "*" : {
                resultado = primerNumero * SegundoNumero;
                break;
}

                case"/":
                            if (SegundoNumero!= 0) {
                                resultado = primerNumero/SegundoNumero;
                                
                                
                            }else{
                                JOptionPane.showMessageDialog(this, "Error: No se puede dividir entre 0");
                                return;
                            }
                            break;
            } //Fin del Switch
            entradaValores.setText(String.valueOf(resultado));
            operador=" ";
        } 
        
        else{
            operador=comando;
            primerNumero=Double.parseDouble(entradaValores.getText());
            entradaValores.setText(" ");
        }

           
    }

    //Main
    public static void main(String[] args) {
        new EjercicioCalculadora();
        
    }
    
    
    
    
    }

