
package practica5;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;




public class ListaCircular extends javax.swing.JFrame {

    Nodo frente = null, cabeza = null, aux = null, actual = null;
    Nodo nuevo;
    String temporalimagen;

    public ListaCircular() {
        initComponents();
        Color colorFondo = new Color(26, 33, 43);
        this.getContentPane().setBackground(colorFondo);
        this.setLocationRelativeTo(null);
    }

    // ================= INSERTAR =================
    public void insertar(String cancion, String imagen) {
        nuevo = new Nodo(cancion, imagen, null);

        if (frente == null) {
            frente = nuevo;
            cabeza = nuevo;
            nuevo.setSiguiente(nuevo);
            actual = nuevo;
        } else {
            nuevo.setSiguiente(frente);
            cabeza.setSiguiente(nuevo);
            cabeza = nuevo;
        }

        habilitarBotones();
        mostrarNodo(actual);
    }

    // ================= MOSTRAR NODO =================
    void mostrarNodo(Nodo n) {
        if (n == null) {
            jLabel2.setText("NULL");
            LabelImagen.setIcon(null);
            return;
        }

        jLabel2.setText(n.getCancion());
        if (n.getImagen() != null) {
            setImageLabel(LabelImagen, n.getImagen());
        }
    }

    // ================= MOSTRAR TODA LA LISTA =================
    void MostrarTodaLista() {
        if (frente == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return;
        }

        aux = frente;
        int cont = 1;
        System.out.println("________________________");

        do {
            System.out.println(cont + " -> " + aux.getCancion());
            aux = aux.getSiguiente();
            cont++;
        } while (aux != frente);
    }

    // ================= ELIMINAR FRENTE =================
    void eliminarFrente() {
        if (frente == null) return;

        if (frente == cabeza) {
            frente = null;
            cabeza = null;
            actual = null;
        } else {
            frente = frente.getSiguiente();
            cabeza.setSiguiente(frente);
            actual = frente;
        }
        mostrarNodo(actual);
    }

    // ================= ELIMINAR FINAL =================
    void eliminarCabeza() {
        if (frente == null) return;

        if (frente == cabeza) {
            frente = null;
            cabeza = null;
            actual = null;
            return;
        }

        Nodo temp = frente;
        while (temp.getSiguiente() != cabeza) {
            temp = temp.getSiguiente();
        }

        temp.setSiguiente(frente);
        cabeza = temp;
        actual = cabeza;
        mostrarNodo(actual);
    }

    // ================= ELIMINAR POR VALOR =================
    public void eliminarPorValor(String cancion) {
        if (frente == null) return;

        if (frente.getCancion().equals(cancion)) {
            eliminarFrente();
            return;
        }

        Nodo temp = frente;
        do {
            if (temp.getSiguiente().getCancion().equals(cancion)) {
                if (temp.getSiguiente() == cabeza) {
                    cabeza = temp;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                actual = frente;
                mostrarNodo(actual);
                return;
            }
            temp = temp.getSiguiente();
        } while (temp != frente);

        JOptionPane.showMessageDialog(null, "Elemento no encontrado");
    }

    // ================= IMAGEN =================
    void cargarImagen() {
        try {
            JFileChooser explorador = new JFileChooser();
            explorador.addChoosableFileFilter(
                    new FileNameExtensionFilter("Imagen", "jpg", "png"));
            explorador.showOpenDialog(null);
            File auxFile = explorador.getSelectedFile();
            temporalimagen = auxFile.getAbsolutePath();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar imagen");
        }
    }

    void setImageLabel(JLabel label, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image img = imageIcon.getImage();
        Image imgEscalada = img.getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(imgEscalada));
    }

    void habilitarBotones() {
        BInicio.setEnabled(true);
        BAnterior.setEnabled(true);
        BSiguiente.setEnabled(true);
        BFinal.setEnabled(true);
    }


      
      
      //CODIGO GENERADO DE NEATBEANS FORM
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBMostrar = new javax.swing.JButton();
        jBInsertar = new javax.swing.JButton();
        jBEliminar_frente = new javax.swing.JButton();
        BAnterior = new javax.swing.JButton();
        BInicio = new javax.swing.JButton();
        JbEliminarFinal_cabeza = new javax.swing.JButton();
        JBBORRAR_X_Elemento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LabelImagen = new javax.swing.JLabel();
        BSiguiente = new javax.swing.JButton();
        BFinal = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista enlazadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 36));

        jPanel1.setBackground(new java.awt.Color(53, 56, 73));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NULL");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NULL");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 68, -1, -1));

        jBMostrar.setBackground(new java.awt.Color(255, 255, 255));
        jBMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBMostrar.setForeground(new java.awt.Color(0, 0, 0));
        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, 40));

        jBInsertar.setBackground(new java.awt.Color(255, 255, 255));
        jBInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBInsertar.setForeground(new java.awt.Color(0, 0, 0));
        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jBInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 40));

        jBEliminar_frente.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar_frente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBEliminar_frente.setForeground(new java.awt.Color(0, 0, 0));
        jBEliminar_frente.setText("Eliminar(frente)");
        jBEliminar_frente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminar_frenteActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar_frente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 125, 40));

        BAnterior.setBackground(new java.awt.Color(255, 255, 255));
        BAnterior.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BAnterior.setForeground(new java.awt.Color(0, 0, 0));
        BAnterior.setText("<");
        BAnterior.setEnabled(false);
        BAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 390, 50, 40));

        BInicio.setBackground(new java.awt.Color(255, 255, 255));
        BInicio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BInicio.setForeground(new java.awt.Color(0, 0, 0));
        BInicio.setText("<|");
        BInicio.setEnabled(false);
        BInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInicioActionPerformed(evt);
            }
        });
        getContentPane().add(BInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 60, 40));

        JbEliminarFinal_cabeza.setBackground(new java.awt.Color(255, 255, 255));
        JbEliminarFinal_cabeza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JbEliminarFinal_cabeza.setForeground(new java.awt.Color(0, 0, 0));
        JbEliminarFinal_cabeza.setText("Eliminar(final)");
        JbEliminarFinal_cabeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarFinal_cabezaActionPerformed(evt);
            }
        });
        getContentPane().add(JbEliminarFinal_cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, 40));

        JBBORRAR_X_Elemento.setBackground(new java.awt.Color(255, 255, 255));
        JBBORRAR_X_Elemento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBBORRAR_X_Elemento.setForeground(new java.awt.Color(0, 0, 0));
        JBBORRAR_X_Elemento.setText("Borrar X");
        JBBORRAR_X_Elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBORRAR_X_ElementoActionPerformed(evt);
            }
        });
        getContentPane().add(JBBORRAR_X_Elemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 40));

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));

        LabelImagen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelImagen.setForeground(new java.awt.Color(0, 0, 0));
        LabelImagen.setText("      Imagen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 160, 160));

        BSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        BSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        BSiguiente.setText(">");
        BSiguiente.setEnabled(false);
        BSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(BSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 50, 40));

        BFinal.setBackground(new java.awt.Color(255, 255, 255));
        BFinal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BFinal.setForeground(new java.awt.Color(0, 0, 0));
        BFinal.setText("|>");
        BFinal.setEnabled(false);
        BFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFinalActionPerformed(evt);
            }
        });
        getContentPane().add(BFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //ACTION LISTENER DE LOS BOTONES
    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        MostrarTodaLista();
    }//GEN-LAST:event_jBMostrarActionPerformed

    
    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
        String cancion = JOptionPane.showInputDialog("Nombre de la canción");
    if (cancion == null || cancion.isEmpty()) return;

    cargarImagen();
    insertar(cancion, temporalimagen);
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void jBEliminar_frenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminar_frenteActionPerformed
        eliminarFrente();
    }//GEN-LAST:event_jBEliminar_frenteActionPerformed

    private void BAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnteriorActionPerformed
        
    }//GEN-LAST:event_BAnteriorActionPerformed

    private void BInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInicioActionPerformed
        if (frente != null) {
        actual = frente;
        mostrarNodo(actual);
    }
    }//GEN-LAST:event_BInicioActionPerformed

    private void JbEliminarFinal_cabezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarFinal_cabezaActionPerformed
        eliminarCabeza();
    }//GEN-LAST:event_JbEliminarFinal_cabezaActionPerformed

    private void JBBORRAR_X_ElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBORRAR_X_ElementoActionPerformed
  String respuesta = JOptionPane.showInputDialog("Canción a borrar");

    if (respuesta != null && !respuesta.isEmpty()) {
        eliminarPorValor(respuesta);
    }
    }//GEN-LAST:event_JBBORRAR_X_ElementoActionPerformed

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSiguienteActionPerformed
        if (actual != null) {
        actual = actual.getSiguiente();
        mostrarNodo(actual);
    }
    }//GEN-LAST:event_BSiguienteActionPerformed

    private void BFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFinalActionPerformed
         if (cabeza != null) {
        actual = cabeza;
        mostrarNodo(actual);
    }
    }//GEN-LAST:event_BFinalActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //CLASE MAIN ( NO SE TOCA)
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new ListaCircular().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnterior;
    private javax.swing.JButton BFinal;
    private javax.swing.JButton BInicio;
    private javax.swing.JButton BSiguiente;
    private javax.swing.JButton JBBORRAR_X_Elemento;
    private javax.swing.JButton JbEliminarFinal_cabeza;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JButton jBEliminar_frente;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

/*
⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠉⢁⣀⣀⣀⡈⠉⠛⢿⡿⠿⢿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⠏⢀⣴⣾⣿⣿⣿⣿⣿⡟⠃⢀⣀⣤⣤⣄⠉⢿⣿
⣿⣿⣿⣿⣿⡏⠀⣾⣿⣿⣿⣿⣿⣿⠏⠀⣴⣿⣿⣿⣯⣻⣧⠀⢻
⣿⣿⣿⣿⣿⠁⢸⣿⣿⣿⣿⣿⣿⣿⠀⠸⣿⣿⣿⣿⣿⣿⣿⡇⠈
⣿⣿⣿⣿⡏⠀⣼⣿⣿⣿⣿⣿⣿⣿⣧⠀⠹⢿⣿⣿⣿⡿⠟⠀⣼
⣿⣿⣿⡿⠇⠀⠛⠿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⡈⠉⠀⠀⣴⣿⣿
⣿⡿⠁⣀⢠⢤⣤⠀⠀⠉⢀⠀⠀⠈⠉⠻⢿⣿⣿⣿⡇⠀⣿⣿⣿
⡟⠀⣴⣽⣷⣷⠆⠀⣴⣾⣿⣔⡳⢦⡄⣄⣠⣿⣿⣿⡇⠀⣿⣿⣿
⠀⢰⣿⣿⣿⠇⠀⣼⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⠀⢻⣿⣿
⠀⠸⣾⣿⣿⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿⣿
⣧⠀⠻⢿⣿⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿⣿
⣿⣷⣤⣀⣈⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⠟⠙⣿⣿⣿⡏⠀⣼⣿⣿
⣿⣿⣿⣿⣿⡇⠀⣄⠀⠙⠛⠿⠿⠛⠁⢀⣼⣿⣿⣿⡇⠀⣿⣿⣿
⣿⣿⣿⣿⣿⣷⡀⠘⠿⠶⠀⢀⣤⣤⡀⠙⢿⣿⣿⡿⠁⢰⣿⣿⣿
⢻⣿⣿⣿⣿⣿⣿⣦⣤⣤⣴⣿⣿⣿⣷⣄⣀⠈⠁⣀⣠⣿⣿⣿⣿
⣹⣿⣿⣿⡿⢋⣩⣬⣩⣿⠃⣿⣿⣿⣿⢸⣿⡿⢋⣡⣬⣩⣿⣿⣿
⡗⣿⣿⣿⣧⣈⣛⠛⠻⣿⠀⣿⣿⣿⡿⢸⣿⣧⣈⣛⠛⠻⣿⣿⣿
⣿⣿⣿⣿⠹⣿⣿⡿⠂⣿⣇⠸⣿⣿⠃⣼⣿⠻⣿⣿⡿⠀⣿⣿⣿
⣿⣿⣿⣿⣶⣤⣤⣴⣾⣿⣿⣶⣤⣤⣾⣿⣿⣶⣤⣤⣴⣾⣿⣿⣿
⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢰⡿⠋⠁⠀⠀⠈⠉⠙⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢀⣿⠇⠀⢀⣴⣶⡾⠿⠿⠿⢿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⣀⣀⣸⡿⠀⠀⢸⣿⣇⠀⠀⠀⠀⠀⠀⠙⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⣾⡟⠛⣿⡇⠀⠀⢸⣿⣿⣷⣤⣤⣤⣤⣶⣶⣿⠇⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀
⢀⣿⠀⢀⣿⡇⠀⠀⠀⠻⢿⣿⣿⣿⣿⣿⠿⣿⡏⠀⠀⠀⠀⢴⣶⣶⣿⣿⣿⣆
⢸⣿⠀⢸⣿⡇⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⣿⡇⣀⣠⣴⣾⣮⣝⠿⠿⠿⣻⡟
⢸⣿⠀⠘⣿⡇⠀⠀⠀⠀⠀⠀⠀⣠⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠉⠀
⠸⣿⠀⠀⣿⡇⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠀⠀⠀⠀
⠀⠻⣷⣶⣿⣇⠀⠀⠀⢠⣼⣿⣿⣿⣿⣿⣿⣿⣛⣛⣻⠉⠁⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢸⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢸⣿⣀⣀⣀⣼⡿⢿⣿⣿⣿⣿⣿⡿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠙⠛⠛⠛⠋⠁⠀⠙⠻⠿⠟⠋⠑⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
*/



