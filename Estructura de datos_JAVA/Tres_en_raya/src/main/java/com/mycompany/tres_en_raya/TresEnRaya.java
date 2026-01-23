
package com.mycompany.tres_en_raya;
//LEONEL FIGUEROA JAUREGUI                                 19/01/2026
//PRACTICA 1

public class TresEnRaya extends javax.swing.JFrame {
    // ===== CONTROL DEL JUEGO =====

// Jugadores
Jugadores jugador1;
Jugadores jugador2;
Jugadores jugadorActual;

// Botones del tablero (1 al 9)
javax.swing.JButton[] botones = new javax.swing.JButton[9];

// Control del botón iniciar / reiniciar
boolean juegoIniciado = false;


// Control de rondas y jugadas
int jugadas = 0;
int rondas = 0;   // máximo 5 rondas

// Ranking (máx 5 jugadores)
Jugadores[] ranking = new Jugadores[5];

// Iconos
javax.swing.Icon iconX;
javax.swing.Icon iconO;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TresEnRaya.class.getName());

    
public TresEnRaya() {
    initComponents();
    inicializarJuego();
}

// METODO para iniciar o reiniciar el juego
private void inicializarJuego() {

    // Cargar iconos (asegúrate que estén en src/assets/)
    iconX = new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/X_grande.png"));
    iconO = new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/circulo.png"));

    // Guardar botones en el arreglo según tu orden:
    botones[0] = jButton1;
    botones[1] = jButton2;
    botones[2] = jButton3;
    botones[3] = jButton4;
    botones[4] = jButton5;
    botones[5] = jButton6;
    botones[6] = jButton7;
    botones[7] = jButton8;
    botones[8] = jButton9;

    // Limpiar tablero y desbloquear botones
    for (javax.swing.JButton b : botones) {
        b.setIcon(null);                   // quitar icono
        b.putClientProperty("ocupado", false); // desbloquear para jugar
        b.setEnabled(true);                // opcional, para asegurar compatibilidad
    }

    // Texto inicial del turno
    TurnoLabel.setText("Turno: - / 5");

    // Configurar botón como INICIAR al principio
    juegoIniciado = false;
    IniciarJuegoBoton.setText("INICIAR JUEGO");
    IniciarJuegoBoton.setBackground(new java.awt.Color(0, 153, 0)); // Verde

    // Reiniciar puntajes y contadores
    PuntajeJugador1.setText("Puntaje: 0");
    PuntajeJugador2.setText("Puntaje: 0");
    jugador1 = null;
    jugador2 = null;
    jugadorActual = null;
    jugadas = 0;
    rondas = 0;
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        BotonImagenGato = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TurnoLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreJugador1 = new javax.swing.JTextField();
        NombreJugador2 = new javax.swing.JTextField();
        PuntajeJugador2 = new javax.swing.JLabel();
        PuntajeJugador1 = new javax.swing.JLabel();
        RecordBoton = new javax.swing.JButton();
        IniciarJuegoBoton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(45, 158, 149));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 84, 73));

        BotonImagenGato.setBackground(new java.awt.Color(255, 255, 255));
        BotonImagenGato.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        BotonImagenGato.setForeground(new java.awt.Color(0, 0, 0));
        BotonImagenGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/refugio-de-animales.png"))); // NOI18N
        BotonImagenGato.setToolTipText("");
        BotonImagenGato.setBorder(null);
        BotonImagenGato.setContentAreaFilled(false);
        BotonImagenGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImagenGatoActionPerformed(evt);
            }
        });
        jPanel1.add(BotonImagenGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 80));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setToolTipText("");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 84, 73));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setToolTipText("");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 84, 73));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setToolTipText("");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 84, 73));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 84, 73));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setToolTipText("");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 84, 73));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setToolTipText("");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 84, 73));

        jLabel1.setBackground(new java.awt.Color(102, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("# TRES EN RAYA #");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 400, 67));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(8, 398));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 98, 8, 380));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 98, -1, 380));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 222, 350, -1));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, 360, -1));

        TurnoLabel.setBackground(new java.awt.Color(255, 255, 255));
        TurnoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TurnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        TurnoLabel.setText("Turno: 0/5");
        jPanel1.add(TurnoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 180, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/X_grande.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/circulo.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 84, 73));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/X_chiquita.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Icons/chicocirculo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        NombreJugador1.setBackground(new java.awt.Color(255, 255, 255));
        NombreJugador1.setForeground(new java.awt.Color(0, 0, 0));
        NombreJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJugador1ActionPerformed(evt);
            }
        });
        jPanel1.add(NombreJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 120, 30));

        NombreJugador2.setBackground(new java.awt.Color(255, 255, 255));
        NombreJugador2.setForeground(new java.awt.Color(0, 0, 0));
        NombreJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJugador2ActionPerformed(evt);
            }
        });
        jPanel1.add(NombreJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 120, 30));

        PuntajeJugador2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PuntajeJugador2.setForeground(new java.awt.Color(204, 0, 0));
        PuntajeJugador2.setText("Puntaje: 0");
        jPanel1.add(PuntajeJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        PuntajeJugador1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PuntajeJugador1.setForeground(new java.awt.Color(204, 0, 0));
        PuntajeJugador1.setText("Puntaje: 0");
        jPanel1.add(PuntajeJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        RecordBoton.setBackground(new java.awt.Color(255, 255, 204));
        RecordBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecordBoton.setForeground(new java.awt.Color(0, 0, 0));
        RecordBoton.setText("RECORD");
        RecordBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordBotonActionPerformed(evt);
            }
        });
        jPanel1.add(RecordBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 130, 40));

        IniciarJuegoBoton.setBackground(new java.awt.Color(102, 0, 0));
        IniciarJuegoBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IniciarJuegoBoton.setText("INICIAR JUEGO");
        IniciarJuegoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarJuegoBotonActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarJuegoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 160, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de los jugadores:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jugar(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonImagenGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImagenGatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonImagenGatoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jugar(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jugar(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jugar(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jugar(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jugar(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jugar(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jugar(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jugar(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NombreJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJugador1ActionPerformed

    private void NombreJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJugador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJugador2ActionPerformed

    private void RecordBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordBotonActionPerformed
        mostrarRanking();
    }//GEN-LAST:event_RecordBotonActionPerformed

    private void IniciarJuegoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarJuegoBotonActionPerformed
    if (!juegoIniciado) {
    // ===== INICIAR JUEGO =====
    
    // Leer nombres
    String nombre1 = NombreJugador1.getText();
    String nombre2 = NombreJugador2.getText();

    if (nombre1.isEmpty() || nombre2.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Por favor escribe el nombre de los dos jugadores");
        return;
    }

    // Crear jugadores
    jugador1 = new Jugadores(nombre1, "X", 0);
    jugador2 = new Jugadores(nombre2, "O", 0);
    jugadorActual = jugador1;

    // Reiniciar contadores
    jugadas = 0;
    rondas = 1;

    // Limpiar y activar tablero
    for (javax.swing.JButton b : botones) {
        b.setIcon(null);
        b.setEnabled(true);
    }

    // Cambiar botón a modo REINICIAR
    juegoIniciado = true;
    IniciarJuegoBoton.setText("REINICIAR");
    IniciarJuegoBoton.setBackground(new java.awt.Color(153, 0, 0)); // Rojo

    // Mostrar turno inicial
    TurnoLabel.setText("Turno: " + jugadorActual.getNombre() + " (Ronda " + rondas + "/5)");

} else {
     // ===== REINICIAR JUEGO =====
    
    // Reiniciar puntajes de la partida
    if (jugador1 != null) jugador1.setPuntos(0);
    if (jugador2 != null) jugador2.setPuntos(0);

    PuntajeJugador1.setText("Puntaje: 0");
    PuntajeJugador2.setText("Puntaje: 0");

    // Limpiar tablero
    limpiarTablero();

    // Reiniciar ronda y jugadas
    rondas = 1;
    jugadas = 0;

    // Mantener el jugador actual como jugador1
    jugadorActual = jugador1;

    // Mostrar turno inicial
    TurnoLabel.setText("Turno: " + jugadorActual.getNombre() + " (Ronda " + rondas + "/5)");

    // Cambiar botón a modo REINICIAR
    juegoIniciado = true;
    IniciarJuegoBoton.setText("REINICIAR");
    IniciarJuegoBoton.setBackground(new java.awt.Color(153, 0, 0)); // Rojo
}

                
    }//GEN-LAST:event_IniciarJuegoBotonActionPerformed

    
    //METODO PARA JUGAR
private void jugar(javax.swing.JButton boton) {

    if (!juegoIniciado) return;

    // Si el botón ya fue jugado
    if (boton.getClientProperty("ocupado") != null && (boolean) boton.getClientProperty("ocupado")) return;

    // Colocar icono según jugador actual
    if (jugadorActual == jugador1) {
        boton.setIcon(iconX);
    } else {
        boton.setIcon(iconO);
    }

    // Marcar botón como ocupado
    boton.putClientProperty("ocupado", true);
    jugadas++;

    // 🔥 Verificar ganador
    if (hayGanador()) {
        Jugadores ganador = jugadorActual; // el jugador que hizo la última jugada
        ganador.setPuntos(ganador.getPuntos() + 1);
        PuntajeJugador1.setText("Puntaje: " + jugador1.getPuntos());
        PuntajeJugador2.setText("Puntaje: " + jugador2.getPuntos());

        javax.swing.JOptionPane.showMessageDialog(this, "🎉 ¡Ganó " + ganador.getNombre() + " esta ronda!");

        rondas++;
        if (rondas > 5) {
            terminarJuego();
            return;
        }

        limpiarTablero();
        // El turno sigue siendo del siguiente jugador
        TurnoLabel.setText("Turno: " + jugadorActual.getNombre() + " (Ronda " + rondas + "/5)");
        return;
    }

    // 🔥 Verificar empate
    if (jugadas == 9) {
        javax.swing.JOptionPane.showMessageDialog(this, "🤝 EMPATE\nNadie gana esta ronda");

        rondas++;
        if (rondas > 5) {
            terminarJuego();
            return;
        }

        limpiarTablero();
        TurnoLabel.setText("Turno: " + jugadorActual.getNombre() + " (Ronda " + rondas + "/5)");
        return;
    }

    // 🔹 Cambiar turno al siguiente jugador solo si no hay ganador ni empate
    jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;

    // 🔹 Actualizar label del turno
    TurnoLabel.setText("Turno: " + jugadorActual.getNombre() + " (Ronda " + rondas + "/5)");
}



 //METODO PARA VERIFICAR EL GANADOR
private boolean hayGanador() {

    // Combinaciones ganadoras (índices del arreglo botones)
    int[][] combinaciones = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},
        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},
        {0, 4, 8},
        {2, 4, 6}
    };

    for (int[] combo : combinaciones) {

        javax.swing.Icon a = botones[combo[0]].getIcon();
        javax.swing.Icon b = botones[combo[1]].getIcon();
        javax.swing.Icon c = botones[combo[2]].getIcon();

        // Si los tres tienen icono y son iguales → HAY GANADOR
        if (a != null && a.equals(b) && a.equals(c)) {
            return true;
        }
    }

    return false;
}

//METODO PARA LIMPIAR EL TABLERO
private void limpiarTablero() {
    for (javax.swing.JButton b : botones) {
        b.setIcon(null);
        b.putClientProperty("ocupado", false); // desbloquear
    }
    jugadas = 0;
}


//METODO PARA TERMINAR EL JUEGO
private void terminarJuego() {

    juegoIniciado = false;

    if (jugador1.getPuntos() > jugador2.getPuntos()) {
        javax.swing.JOptionPane.showMessageDialog(this, "🏆 GANADOR FINAL: " + jugador1.getNombre());
        agregarAlRanking(jugador1); // 🔹 suma la victoria histórica
    } else if (jugador2.getPuntos() > jugador1.getPuntos()) {
        javax.swing.JOptionPane.showMessageDialog(this, "🏆 GANADOR FINAL: " + jugador2.getNombre());
        agregarAlRanking(jugador2); // 🔹 suma la victoria histórica
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "🤝 EMPATE FINAL\nAmbos jugadores empataron");
    }

    // Bloquear tablero y reiniciar variables de la partida
    for (javax.swing.JButton b : botones) {
        b.setEnabled(false);
        b.putClientProperty("ocupado", false);
    }

    IniciarJuegoBoton.setText("INICIAR JUEGO");
    IniciarJuegoBoton.setBackground(new java.awt.Color(0, 153, 0));

    if (jugador1 != null) jugador1.setPuntos(0);
    if (jugador2 != null) jugador2.setPuntos(0);
    PuntajeJugador1.setText("Puntaje: 0");
    PuntajeJugador2.setText("Puntaje: 0");

    rondas = 0;
    jugadas = 0;

    TurnoLabel.setText("Turno: - / 5");
}




// MOSTRAR RANKING TOP 5 POR VICTORIAS
private void mostrarRanking() {

    String texto = "🏆 TOP 5 JUGADORES 🏆\n\n";

    boolean hayDatos = false;

    for (int i = 0; i < ranking.length; i++) {

        if (ranking[i] != null) {
            hayDatos = true;
            texto += (i + 1) + ". " 
                   + ranking[i].getNombre() 
                   + " - " + ranking[i].getVictorias() + " victorias\n";
        }
    }

    if (!hayDatos) {
        texto = "Aún no hay jugadores en el ranking 😅";
    }

    javax.swing.JOptionPane.showMessageDialog(this, texto);
}




//METODO PARA AGREGAR AL RANKING
private void agregarAlRanking(Jugadores jugador) {

    // Buscar si el jugador ya está en el ranking
    for (int i = 0; i < ranking.length; i++) {
        if (ranking[i] != null && ranking[i].getNombre().equals(jugador.getNombre())) {
            // Usar el objeto existente y sumar la victoria
            ranking[i].sumarVictoria();
            ordenarRanking();
            return; // ya está actualizado, no agregar duplicado
        }
    }

    // Si no estaba en el ranking, agregar en la primera posición vacía o al final
    for (int i = 0; i < ranking.length; i++) {
        if (ranking[i] == null) {
            ranking[i] = new Jugadores(jugador.getNombre(), jugador.getTurno(), 0);
            ranking[i].sumarVictoria(); // sumar la primera victoria
            ordenarRanking();
            break;
        }
    }

    // Mantener orden por victorias
    ordenarRanking();
}



// MÉTODO  PARA ORDENAR EL RANKING DE MAYOR A MENOR VICTORIAS
private void ordenarRanking() {
    for (int i = 0; i < ranking.length - 1; i++) {
        for (int j = i + 1; j < ranking.length; j++) {
            if (ranking[i] != null && ranking[j] != null) {
                if (ranking[j].getVictorias() > ranking[i].getVictorias()) {
                    Jugadores temp = ranking[i];
                    ranking[i] = ranking[j];
                    ranking[j] = temp;
                }
            }
        }
    }
}



    



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
       

       
        java.awt.EventQueue.invokeLater(() -> new TresEnRaya().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonImagenGato;
    private javax.swing.JButton IniciarJuegoBoton;
    private javax.swing.JTextField NombreJugador1;
    private javax.swing.JTextField NombreJugador2;
    private javax.swing.JLabel PuntajeJugador1;
    private javax.swing.JLabel PuntajeJugador2;
    private javax.swing.JButton RecordBoton;
    private javax.swing.JLabel TurnoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}


