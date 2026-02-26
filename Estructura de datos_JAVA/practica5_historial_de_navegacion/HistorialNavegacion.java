package com.mycompany.practica5_historial_de_navegacion;

public class HistorialNavegacion extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(HistorialNavegacion.class.getName());

    // Instancia de la lista enlazada
    private ListaHistorial historial = new ListaHistorial();

    // ================= CLASE LISTA =================
    class ListaHistorial {

        private NodoHistorial inicio;
        private NodoHistorial actual;

        public ListaHistorial() {
            inicio = null;
            actual = null;
        }

        // Insertar al inicio (nueva navegación)
        public void navegar(String url) {
            NodoHistorial nuevo = new NodoHistorial(url);

            if (inicio == null) {
                inicio = nuevo;
                actual = nuevo;
            } else {
                nuevo.siguiente = inicio;
                inicio.anterior = nuevo;
                inicio = nuevo;
                actual = nuevo;
            }
        }

        // Página actual
        public String paginaActual() {
            return (actual == null) ? "Sin páginas" : actual.url;
        }

        //Retroceder
        public String retroceder() {
    if (actual != null && actual.siguiente != null) {
        actual = actual.siguiente;
        return actual.url;
    }
    return "No hay páginas anteriores";
}


        // Mostrar historial completo
        public String mostrarHistorial() {
            if (inicio == null) {
                return "Historial vacío";
            }

            String resultado = "";
            NodoHistorial aux = inicio;

            while (aux != null) {
                resultado += aux.url;
                if (aux == actual) {
                    resultado += "  <-- Página actual";
                }
                resultado += "\n";
                aux = aux.siguiente;
            }
            return resultado;
        }
    }

    // ================= CONSTRUCTOR =================
    public HistorialNavegacion() {
        initComponents();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        txtURL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNavegar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblActual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new java.awt.TextArea();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtURL.setBackground(new java.awt.Color(204, 204, 204));
        txtURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("URL:");

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("🌐 Historial de Navegación :)");

        btnNavegar.setBackground(new java.awt.Color(255, 255, 255));
        btnNavegar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNavegar.setForeground(new java.awt.Color(255, 0, 0));
        btnNavegar.setText("Navegar");
        btnNavegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavegarActionPerformed(evt);
            }
        });

        btnRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRetroceder.setForeground(new java.awt.Color(255, 0, 0));
        btnRetroceder.setText("Retroceder");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        lblActual.setBackground(new java.awt.Color(0, 0, 0));
        lblActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblActual.setForeground(new java.awt.Color(0, 0, 0));
        lblActual.setText("Pagina actual");

        jScrollPane1.setViewportView(txtHistorial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtURL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNavegar)
                            .addComponent(btnRetroceder))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addComponent(btnNavegar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetroceder)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addComponent(lblActual))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavegarActionPerformed
        String url = txtURL.getText().trim();

    if (!url.isEmpty()) {
        historial.navegar(url);

        lblActual.setText("Página actual: " + historial.paginaActual());
        txtHistorial.setText(historial.mostrarHistorial());

        txtURL.setText("");
    }
    }//GEN-LAST:event_btnNavegarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        String pagina = historial.retroceder();

    lblActual.setText("Página actual: " + pagina);
    txtHistorial.setText(historial.mostrarHistorial());
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void txtURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLActionPerformed
        btnNavegar.doClick();
    }//GEN-LAST:event_txtURLActionPerformed

  
    
 
    
    //CLASE MAIN
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new HistorialNavegacion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNavegar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblActual;
    private java.awt.TextArea txtHistorial;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
