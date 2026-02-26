//LIBRERIAS
package com.mycompany.practica_6_controlescolar;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Control_Escolar extends javax.swing.JFrame {
    Nodo cabeza = null;
Nodo cola = null;
Nodo actual = null;
DefaultTableModel modeloTabla;

ImageIcon fotoActual = null;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Control_Escolar.class.getName());

    
    //Metodo para escalar la imagen
    private ImageIcon escalarImagen(ImageIcon img) {
    Image imagen = img.getImage();
    Image nueva = imagen.getScaledInstance(
            Imagen.getWidth(),
            Imagen.getHeight(),
            Image.SCALE_SMOOTH
    );
    return new ImageIcon(nueva);
}
    
    
//METODO MOSTRAR ALUMNO
    private void mostrarAlumno(Nodo a) {

    if (a == null) {
        Nombre.setText("Nombre = null");
        Carrera.setText("Carrera:    null");
        Correo.setText("Correo:    null");
        Imagen.setIcon(null);
        Imagen.setText("Imagen");
        return;
    }

    Nombre.setText("Nombre = " + a.nombre + " " + a.apPaterno + " " + a.apMaterno);
    Carrera.setText("Carrera:    " + a.carrera);
    Correo.setText("Correo:    " + a.correo);

    if (a.foto != null) {
        Imagen.setIcon(escalarImagen(a.foto));
        Imagen.setText("");
    } else {
        Imagen.setIcon(null);
        Imagen.setText("Imagen");
    }
}

    //METODO Actualizar tabla
private void actualizarTabla() {

    modeloTabla.setRowCount(0); // Limpiar tabla

    Nodo aux = cabeza;
    while (aux != null) {
        modeloTabla.addRow(new Object[]{
            aux.nombre + " " + aux.apPaterno,
            aux.carrera,
            aux.correo
        });
        aux = aux.siguiente;
    }
}

//METODO INSERTAR EN X
private void insertarEnPosicion(int posicion, Nodo nuevo) {

    if (posicion <= 0) {
        JOptionPane.showMessageDialog(this, "La posición debe ser mayor a 0");
        return;
    }

    // Lista vacía
    if (cabeza == null) {
        if (posicion == 1) {
            cabeza = cola = actual = nuevo;
            return;
        } else {
            JOptionPane.showMessageDialog(this, "La lista está vacía");
            return;
        }
    }

    // METODO PARA INSERTAR EN INICIO
    if (posicion == 1) {
        nuevo.siguiente = cabeza;
        cabeza.anterior = nuevo;
        cabeza = nuevo;
        actual = nuevo;
        return;
    }

    // Recorrer la lista
    Nodo aux = cabeza;
    int contador = 1;

    while (aux.siguiente != null && contador < posicion - 1) {
        aux = aux.siguiente;
        contador++;
    }

    // Insertar al final
    if (aux.siguiente == null) {
        aux.siguiente = nuevo;
        nuevo.anterior = aux;
        cola = nuevo;
    }
    // Insertar en medio
    else {
        nuevo.siguiente = aux.siguiente;
        nuevo.anterior = aux;
        aux.siguiente.anterior = nuevo;
        aux.siguiente = nuevo;
    }

    actual = nuevo;
}

    //CONSTRUCTOR
    public Control_Escolar() {
        
        initComponents();
        modeloTabla = new DefaultTableModel();
modeloTabla.addColumn("Nombre");
modeloTabla.addColumn("Carrera");
modeloTabla.addColumn("Correo");
Tabla.setModel(modeloTabla);

    }

  
    
    
    
    //BOTONES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        EscogerX = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InsertarNombre = new javax.swing.JTextField();
        InsertarApellidoPaterno = new javax.swing.JTextField();
        InsertarApellidoMaterno = new javax.swing.JTextField();
        InsertarCarrera = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Actualizartabla = new javax.swing.JButton();
        InsertarFotografia = new javax.swing.JButton();
        InsertarCorreo = new javax.swing.JTextField();
        InsertarAlumno = new javax.swing.JButton();
        DardeBaja = new javax.swing.JButton();
        MostrarAlumno = new javax.swing.JButton();
        InsertarX = new javax.swing.JButton();
        txtPosicion = new javax.swing.JTextField();

        jLabel9.setText("jLabel9");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        Nombre.setText("Nombre = null");

        Carrera.setText("Carrera:    null ");

        Correo.setText("Correo:    null");

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(0, 0, 0));
        Inicio.setText("<|");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Anterior.setBackground(new java.awt.Color(255, 255, 255));
        Anterior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Anterior.setForeground(new java.awt.Color(0, 0, 0));
        Anterior.setText("<");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        EscogerX.setBackground(new java.awt.Color(255, 255, 255));
        EscogerX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EscogerX.setForeground(new java.awt.Color(0, 0, 0));
        EscogerX.setText("x");
        EscogerX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscogerXActionPerformed(evt);
            }
        });

        Siguiente.setBackground(new java.awt.Color(255, 255, 255));
        Siguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Siguiente.setForeground(new java.awt.Color(0, 0, 0));
        Siguiente.setText(">");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Ultimo.setBackground(new java.awt.Color(255, 255, 255));
        Ultimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ultimo.setForeground(new java.awt.Color(0, 0, 0));
        Ultimo.setText("|>");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Imagen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Imagen.setText("                Imagen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EscogerX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Carrera)
                                    .addComponent(Correo))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Carrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscogerX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siguiente)
                    .addComponent(Ultimo)
                    .addComponent(Anterior)
                    .addComponent(Inicio))
                .addGap(72, 72, 72))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido paterno");

        jLabel6.setText("Apellido materno");

        jLabel7.setText("Carrera");

        jLabel8.setText("Correo electronico");

        InsertarNombre.setBackground(new java.awt.Color(255, 255, 255));
        InsertarNombre.setForeground(new java.awt.Color(0, 0, 0));
        InsertarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarNombreActionPerformed(evt);
            }
        });

        InsertarApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        InsertarApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        InsertarApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarApellidoPaternoActionPerformed(evt);
            }
        });

        InsertarApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        InsertarApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        InsertarApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarApellidoMaternoActionPerformed(evt);
            }
        });

        InsertarCarrera.setBackground(new java.awt.Color(255, 255, 255));
        InsertarCarrera.setForeground(new java.awt.Color(0, 0, 0));
        InsertarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCarreraActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setForeground(new java.awt.Color(0, 0, 0));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.setShowGrid(true);
        jScrollPane2.setViewportView(Tabla);

        Actualizartabla.setBackground(new java.awt.Color(255, 255, 255));
        Actualizartabla.setForeground(new java.awt.Color(0, 0, 0));
        Actualizartabla.setText("Actualizar tabla");
        Actualizartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizartablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(Actualizartabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actualizartabla)
                .addGap(249, 249, 249))
        );

        InsertarFotografia.setBackground(new java.awt.Color(255, 255, 255));
        InsertarFotografia.setForeground(new java.awt.Color(0, 0, 0));
        InsertarFotografia.setText("Insertar fotografia");
        InsertarFotografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarFotografiaActionPerformed(evt);
            }
        });

        InsertarCorreo.setBackground(new java.awt.Color(255, 255, 255));
        InsertarCorreo.setForeground(new java.awt.Color(0, 0, 0));
        InsertarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InsertarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(InsertarApellidoPaterno)
                                    .addComponent(InsertarApellidoMaterno)
                                    .addComponent(InsertarCarrera)
                                    .addComponent(InsertarCorreo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(InsertarFotografia)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertarApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(InsertarApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(InsertarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertarFotografia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        InsertarAlumno.setBackground(new java.awt.Color(255, 102, 102));
        InsertarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InsertarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        InsertarAlumno.setText("Insertar alumno");
        InsertarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAlumnoActionPerformed(evt);
            }
        });

        DardeBaja.setBackground(new java.awt.Color(255, 102, 102));
        DardeBaja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DardeBaja.setForeground(new java.awt.Color(0, 0, 0));
        DardeBaja.setText("Dar de baja alumno");
        DardeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DardeBajaActionPerformed(evt);
            }
        });

        MostrarAlumno.setBackground(new java.awt.Color(255, 102, 102));
        MostrarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MostrarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        MostrarAlumno.setText("Mostrar alumno");
        MostrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAlumnoActionPerformed(evt);
            }
        });

        InsertarX.setBackground(new java.awt.Color(255, 255, 255));
        InsertarX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InsertarX.setForeground(new java.awt.Color(0, 0, 0));
        InsertarX.setText("Insertar en X=");
        InsertarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarXActionPerformed(evt);
            }
        });

        txtPosicion.setBackground(new java.awt.Color(255, 255, 255));
        txtPosicion.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(InsertarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertarX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DardeBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarAlumno)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertarAlumno)
                    .addComponent(DardeBaja)
                    .addComponent(MostrarAlumno)
                    .addComponent(InsertarX)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCorreoActionPerformed

    private void InsertarApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarApellidoPaternoActionPerformed

    private void InsertarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAlumnoActionPerformed
        if (InsertarNombre.getText().isEmpty() ||
        InsertarApellidoPaterno.getText().isEmpty() ||
        InsertarCarrera.getText().isEmpty() ||
        InsertarCorreo.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this,
                "No se permiten campos vacíos",
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Nodo nuevo = new Nodo(
            InsertarNombre.getText(),
            InsertarApellidoPaterno.getText(),
            InsertarApellidoMaterno.getText(),
            InsertarCarrera.getText(),
            InsertarCorreo.getText(),
            fotoActual
    );

    if (cabeza == null) {
        cabeza = cola = actual = nuevo;
    } else {
        nuevo.siguiente = cabeza;
        cabeza.anterior = nuevo;
        cabeza = nuevo;
        actual = cabeza;
    }

    mostrarAlumno(actual);
    JOptionPane.showMessageDialog(this, "Alumno insertado correctamente");
    }//GEN-LAST:event_InsertarAlumnoActionPerformed

    
    //BOTON PARA DAR DE BAJA
    private void DardeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DardeBajaActionPerformed
         if (cabeza == null) {
        JOptionPane.showMessageDialog(this, "No hay alumnos registrados");
        return;
    }

    if (cabeza == cola) {
        cabeza = cola = actual = null;
    } else if (actual == cabeza) {
        cabeza = cabeza.siguiente;
        cabeza.anterior = null;
        actual = cabeza;
    } else if (actual == cola) {
        cola = cola.anterior;
        cola.siguiente = null;
        actual = cola;
    } else {
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
        actual = actual.siguiente;
    }

    mostrarAlumno(actual);
    JOptionPane.showMessageDialog(this, "Alumno eliminado");
    }//GEN-LAST:event_DardeBajaActionPerformed

    
    //BOTON PARA MOSTRAR
    private void MostrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAlumnoActionPerformed
         if (actual == null) {
        JOptionPane.showMessageDialog(this, "No hay alumno para mostrar");
        return;
    }

    mostrarAlumno(actual);
    }//GEN-LAST:event_MostrarAlumnoActionPerformed

    
    //INSERTAR FOTOS CON JFILECHOOSER
    private void InsertarFotografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarFotografiaActionPerformed
            JFileChooser chooser = new JFileChooser();
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        File archivo = chooser.getSelectedFile();
        fotoActual = new ImageIcon(archivo.getAbsolutePath());
        Imagen.setIcon(escalarImagen(fotoActual));
        Imagen.setText("");
    }
    }//GEN-LAST:event_InsertarFotografiaActionPerformed

    
    //ESCOGER EN QUE POSICION INSERTAR ALUMNO
    private void EscogerXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscogerXActionPerformed
            if (cabeza == null) {
        JOptionPane.showMessageDialog(this, "No hay alumnos registrados");
        return;
    }

    int opcion = JOptionPane.showConfirmDialog(
            this,
            "¿Seguro que deseas eliminar este alumno?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
    );

    if (opcion != JOptionPane.YES_OPTION) {
        return;
    }

    // Si solo hay un nodo
    if (cabeza == cola) {
        cabeza = cola = actual = null;
    }
    // Si es el primero
    else if (actual == cabeza) {
        cabeza = cabeza.siguiente;
        cabeza.anterior = null;
        actual = cabeza;
    }
    // Si es el último
    else if (actual == cola) {
        cola = cola.anterior;
        cola.siguiente = null;
        actual = cola;
    }
    // Si está en medio
    else {
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
        actual = actual.siguiente;
    }

    
    mostrarAlumno(actual);
    JOptionPane.showMessageDialog(this, "Alumno eliminado correctamente");
    }//GEN-LAST:event_EscogerXActionPerformed

    private void InsertarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarNombreActionPerformed

    private void InsertarApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarApellidoMaternoActionPerformed

    private void InsertarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCarreraActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
         actual = cabeza;
    mostrarAlumno(actual);
    }//GEN-LAST:event_InicioActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
            actual = cola;
    mostrarAlumno(actual);
    }//GEN-LAST:event_UltimoActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        if (actual != null && actual.siguiente != null) {
        actual = actual.siguiente;
    }
    mostrarAlumno(actual);
    }//GEN-LAST:event_SiguienteActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        if (actual != null && actual.anterior != null) {
        actual = actual.anterior;
    }
    mostrarAlumno(actual);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void ActualizartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizartablaActionPerformed
        actualizarTabla();

    }//GEN-LAST:event_ActualizartablaActionPerformed

    
    private void InsertarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarXActionPerformed
         if (InsertarNombre.getText().isEmpty() ||
        InsertarApellidoPaterno.getText().isEmpty() ||
        InsertarCarrera.getText().isEmpty() ||
        InsertarCorreo.getText().isEmpty() ||
        txtPosicion.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "No se permiten campos vacíos");
        return;
    }

    int pos;
    try {
        pos = Integer.parseInt(txtPosicion.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La posición debe ser un número");
        return;
    }

    Nodo nuevo = new Nodo(
            InsertarNombre.getText(),
            InsertarApellidoPaterno.getText(),
            InsertarApellidoMaterno.getText(),
            InsertarCarrera.getText(),
            InsertarCorreo.getText(),
            fotoActual
    );

    insertarEnPosicion(pos, nuevo);
    mostrarAlumno(actual);
    actualizarTabla();

    JOptionPane.showMessageDialog(this, "Alumno insertado en la posición " + pos);

    }//GEN-LAST:event_InsertarXActionPerformed

    private void txtPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosicionActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //MAIN
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
        java.awt.EventQueue.invokeLater(() -> new Control_Escolar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizartabla;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Correo;
    private javax.swing.JButton DardeBaja;
    private javax.swing.JButton EscogerX;
    private javax.swing.JLabel Imagen;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton InsertarAlumno;
    private javax.swing.JTextField InsertarApellidoMaterno;
    private javax.swing.JTextField InsertarApellidoPaterno;
    private javax.swing.JTextField InsertarCarrera;
    private javax.swing.JTextField InsertarCorreo;
    private javax.swing.JButton InsertarFotografia;
    private javax.swing.JTextField InsertarNombre;
    private javax.swing.JButton InsertarX;
    private javax.swing.JButton MostrarAlumno;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Siguiente;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton Ultimo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.List list1;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
