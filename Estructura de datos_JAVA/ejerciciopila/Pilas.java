//LEONEL FIGUEROA JAUREGUI                                                      //26/01/2026
//ACTIVIDAD 2                                                              //PILAS
 
package com.mycompany.ejerciciopila;
import javax.swing.*;

public class Pilas extends javax.swing.JFrame {
    String Pila[];
    int capacidad, tope=0; 
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pilas.class.getName());

 
    public Pilas() {
        try{
        capacidad=Integer.parseInt(JOptionPane.showInputDialog("Escribe la capacidad del arreglo")); //Pedir la capacidad de la pila al usuario
        Pila=new String[capacidad]; // Instanciar la pila con la capacidad definida por el usuario
        initComponents(); //Iniciar el Jframe
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error vuelve a intentarlo"); // si ocurre un error con los datos, volver a  intentarlo
            //System.out.prinln ("Error de vuelve a intentarlo")
        }
       
    }
    
// METODO POP 
public void pop() {
    if (!vacia()) {
        tope--;              // primero bajamos el tope
        Pila[tope] = "";     // borramos el elemento
        visualizarPila();
    } else {
        JOptionPane.showMessageDialog(null, "Pila vacía");
    }
}


// METODO PUSH
public void push() {
    if (tope < capacidad) {
        String dato = JOptionPane.showInputDialog("Escribe nombre");

        if (dato != null && !dato.equals("")) {
            Pila[tope] = dato;
            tope++;
            visualizarPila();
        }

    } else {
        JOptionPane.showMessageDialog(null,
                "La pila ya no tiene capacidad");
    }
}


// METODO PARA VISUALIZAR LA PILA 
public void visualizarPila() {
    JPila.setText("");
    if (!vacia()) {
        for (int i = tope - 1; i >= 0; i--) {
            JPila.append(Pila[i] + "\n");
        }
    }
}


// METODO ISEMPTY LOGICO 
public boolean vacia() {
    return tope == 0;
}


// METODO ISEMPTY PARA EL BOTON (MENSAJE)
public void isEmpty() {
    if (vacia()) {
        JOptionPane.showMessageDialog(null, "La pila está vacía");
    } else {
        JOptionPane.showMessageDialog(null, "La pila NO está vacía");
    }
}


// METODO TOP
public void top() {
    if (!vacia()) {
        JOptionPane.showMessageDialog(null,
                "Elemento en el tope: " + Pila[tope - 1]);
    } else {
        JOptionPane.showMessageDialog(null, "La pila está vacía");
    }
}


// METODO SIZE 
public void sizePila() {
    JOptionPane.showMessageDialog(null,
            "Número de elementos en la pila: " + tope);
}

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JPila = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Pop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Push");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Top");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("isEmpty");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Size");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pila");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));
        getContentPane().add(JPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 270, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       pop();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        push();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        isEmpty();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        top();        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        sizePila();
    }//GEN-LAST:event_jButton5ActionPerformed

 
    
    

    
    
    
    //MAIN
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
     

      
        java.awt.EventQueue.invokeLater(() -> new Pilas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea JPila;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
