/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.xd.Alquiler;
import proyecto.xd.Alquiler_data;
import proyecto.xd.Conexion;
import proyecto.xd.Inmueble;
import proyecto.xd.Inmueble_data;
import proyecto.xd.persona;
import proyecto.xd.persona_data;

/**
 *
 * @author julit
 */
public class AgregarAlquiler extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarAlquiler
     */
    
    String filtro = "Nombre";
    String filtro2 = "Direccion";
    
    
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    
    public AgregarAlquiler() {
        initComponents();
           
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t_nombre = new javax.swing.JTextField();
        l_nomnhre = new javax.swing.JLabel();
        t_costo = new javax.swing.JTextField();
        l_costo = new javax.swing.JLabel();
        t_fin = new javax.swing.JTextField();
        l_fin = new javax.swing.JLabel();
        t_inicio = new javax.swing.JTextField();
        l_inicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_persona = new javax.swing.JTextField();
        l_personaa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        b_guardar = new javax.swing.JButton();
        botoon1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        busquedai = new javax.swing.JTextField();
        comboi = new javax.swing.JComboBox<>();
        botoni7 = new javax.swing.JButton();
        tablai = new javax.swing.JScrollPane();
        i = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        l_inmueblea1 = new javax.swing.JLabel();
        t_inmueble = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_nombre.setBackground(new java.awt.Color(0, 51, 102));
        t_nombre.setForeground(new java.awt.Color(255, 255, 255));
        t_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 120, 20));

        l_nomnhre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_nomnhre.setForeground(new java.awt.Color(255, 255, 255));
        l_nomnhre.setText("Nombre:");
        getContentPane().add(l_nomnhre, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 110, 50, -1));

        t_costo.setBackground(new java.awt.Color(0, 51, 102));
        t_costo.setForeground(new java.awt.Color(255, 255, 255));
        t_costo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_costo.setCaretColor(new java.awt.Color(255, 255, 255));
        t_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_costoActionPerformed(evt);
            }
        });
        t_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_costoKeyTyped(evt);
            }
        });
        getContentPane().add(t_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 20));

        l_costo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_costo.setForeground(new java.awt.Color(255, 255, 255));
        l_costo.setText("Costo:");
        getContentPane().add(l_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        t_fin.setBackground(new java.awt.Color(0, 51, 102));
        t_fin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_fin.setForeground(new java.awt.Color(255, 255, 255));
        t_fin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_fin.setCaretColor(new java.awt.Color(255, 255, 255));
        t_fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_finActionPerformed(evt);
            }
        });
        getContentPane().add(t_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 120, 20));

        l_fin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_fin.setForeground(new java.awt.Color(255, 255, 255));
        l_fin.setText("Fecha de fin:");
        getContentPane().add(l_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        t_inicio.setBackground(new java.awt.Color(0, 51, 102));
        t_inicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_inicio.setForeground(new java.awt.Color(255, 255, 255));
        t_inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_inicio.setCaretColor(new java.awt.Color(255, 255, 255));
        t_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(t_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 20));

        l_inicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_inicio.setForeground(new java.awt.Color(255, 255, 255));
        l_inicio.setText("Fecha de inicio:");
        getContentPane().add(l_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busquedas de personas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 46));

        t_persona.setBackground(new java.awt.Color(0, 51, 102));
        t_persona.setForeground(new java.awt.Color(255, 255, 255));
        t_persona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_persona.setCaretColor(new java.awt.Color(255, 255, 255));
        t_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_personaActionPerformed(evt);
            }
        });
        t_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_personaKeyTyped(evt);
            }
        });
        getContentPane().add(t_persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 120, 20));

        l_personaa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_personaa.setForeground(new java.awt.Color(255, 255, 255));
        l_personaa.setText("Persona que alquila:");
        getContentPane().add(l_personaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alquileres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 110, 46));

        busqueda.setBackground(new java.awt.Color(0, 51, 102));
        busqueda.setForeground(new java.awt.Color(255, 255, 255));
        busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        busqueda.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, 20));

        combo.setBackground(new java.awt.Color(0, 51, 102));
        combo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "D.N.I" }));
        combo.setToolTipText("Seleccionar");
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 20));

        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "DNI", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 520, 150));

        b_guardar.setBackground(new java.awt.Color(0, 51, 102));
        b_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        b_guardar.setForeground(new java.awt.Color(255, 255, 255));
        b_guardar.setText("Guardar");
        b_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(b_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 70, 30));

        botoon1.setBackground(new java.awt.Color(0, 51, 102));
        botoon1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botoon1.setForeground(new java.awt.Color(255, 255, 255));
        botoon1.setText("Buscar");
        botoon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoon1ActionPerformed(evt);
            }
        });
        getContentPane().add(botoon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busquedas de inmuebles");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 250, 46));

        busquedai.setBackground(new java.awt.Color(0, 51, 102));
        busquedai.setForeground(new java.awt.Color(255, 255, 255));
        busquedai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        busquedai.setCaretColor(new java.awt.Color(255, 255, 255));
        busquedai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaiActionPerformed(evt);
            }
        });
        getContentPane().add(busquedai, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 120, 20));

        comboi.setBackground(new java.awt.Color(0, 51, 102));
        comboi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboi.setForeground(new java.awt.Color(255, 255, 255));
        comboi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Dirección", "Cantidad de ambientes" }));
        comboi.setToolTipText("Seleccionar");
        comboi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboiActionPerformed(evt);
            }
        });
        getContentPane().add(comboi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 20));

        botoni7.setBackground(new java.awt.Color(0, 51, 102));
        botoni7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botoni7.setForeground(new java.awt.Color(255, 255, 255));
        botoni7.setText("Buscar");
        botoni7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoni7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoni7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoni7ActionPerformed(evt);
            }
        });
        getContentPane().add(botoni7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 70, 20));

        i.setBackground(new java.awt.Color(0, 51, 102));
        i.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        i.setForeground(new java.awt.Color(255, 255, 255));
        i.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Dirección", "Cantidad Ambientes", "Costo", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        i.setRowHeight(30);
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        tablai.setViewportView(i);

        getContentPane().add(tablai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 540, 160));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, 70, 30));

        l_inmueblea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_inmueblea1.setForeground(new java.awt.Color(255, 255, 255));
        l_inmueblea1.setText("Inmueble que alquila:");
        getContentPane().add(l_inmueblea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        t_inmueble.setBackground(new java.awt.Color(0, 51, 102));
        t_inmueble.setForeground(new java.awt.Color(255, 255, 255));
        t_inmueble.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_inmueble.setCaretColor(new java.awt.Color(255, 255, 255));
        t_inmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_inmuebleActionPerformed(evt);
            }
        });
        t_inmueble.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_inmuebleKeyTyped(evt);
            }
        });
        getContentPane().add(t_inmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_inicioActionPerformed

    private void t_finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_finActionPerformed

    private void t_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_costoActionPerformed

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreActionPerformed

    private void t_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_personaActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        // TODO add your handling code here:
  
    Alquiler a = new Alquiler(t_nombre.getText(),LocalDate.parse(t_inicio.getText()),LocalDate.parse(t_fin.getText()) ,parseInt(t_costo.getText()), parseLong(t_inmueble.getText()), parseLong(t_persona.getText()));
        
    try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            Alquiler_data alquiler = new Alquiler_data(cn);
            alquiler.insertarAlquiler(a);
        }
    catch(Exception ex)
        {
            System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
    
        String mensaje = "¡Alquiler añadido con exito!";
        JOptionPane.showMessageDialog(this, mensaje);
        
    }//GEN-LAST:event_b_guardarActionPerformed

    private void botoon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoon1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            persona p = new persona();
            persona_data personadata = new persona_data(cn);
            //personadata.obtenerPersonasPorFiltro(filtro, busqueda.getText());
            
            List<persona> per = personadata.obtenerPersonasPorFiltro(filtro, busqueda.getText());
            
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < per.size(); i++) {
                fila[0] = per.get(i).getId();
                fila[1] = per.get(i).getNombre().toUpperCase();
                fila[2] = per.get(i).getDni();
                fila[3] = per.get(i).getCelular();
                
                modelo.addRow(fila);
            }
            
        }
        catch(Exception e)
        {
            e.getMessage();
        }

    }//GEN-LAST:event_botoon1ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        if (combo.getSelectedItem() == "Nombre")
         {
             filtro = "Nombre";
        }
        if (combo.getSelectedItem() == "D.N.I")
             {
                 filtro = "DNI";
        }
        
    }//GEN-LAST:event_comboActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int seleccion = tabla.rowAtPoint(evt.getPoint());
        t_persona.setText(String.valueOf(tabla.getValueAt(seleccion, 0)));
        t_nombre.setText(String.valueOf(tabla.getValueAt(seleccion, 1)));
    }//GEN-LAST:event_tablaMouseClicked

    private void busquedaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaiActionPerformed

    private void comboiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboiActionPerformed
        // TODO add your handling code here:
        if (comboi.getSelectedItem() == "Dirección")
        {
            filtro2 = "direccion";
        }
        if (comboi.getSelectedItem() == "Cantidad de ambientes")
        {
            filtro2 = "cantAmbientes";
        }
    }//GEN-LAST:event_comboiActionPerformed

    private void botoni7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoni7ActionPerformed
        // TODO add your handling code here:
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            Inmueble_data inmuebledata = new Inmueble_data(cn);

            List<Inmueble> inm = inmuebledata.obtenerInmueblesPorFiltro(filtro2, busquedai.getText());

            modelo2 = (DefaultTableModel) i.getModel();
            modelo2.setRowCount(0);
            Object[] fila = new Object[modelo2.getColumnCount()];

            for (int i = 0; i < inm.size(); i++) {
                fila[0] = inm.get(i).getId();
                fila[1] = inm.get(i).getDireccion();
                fila[2] = inm.get(i).getCantAmbientes();
                fila[3] = inm.get(i).getCosto();
                fila[4] = inm.get(i).getDisponibilidad();

                modelo2.addRow(fila);
            }

        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }//GEN-LAST:event_botoni7ActionPerformed

    private void iMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseClicked
        // TODO add your handling code here:
        int seleccion = i.rowAtPoint(evt.getPoint());
        t_inmueble.setText(String.valueOf(i.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_iMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_inmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_inmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_inmuebleActionPerformed

    private void t_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_costoKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_costoKeyTyped

    private void t_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_personaKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_personaKeyTyped

    private void t_inmuebleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_inmuebleKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_inmuebleKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton botoni7;
    private javax.swing.JButton botoon1;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField busquedai;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboi;
    private javax.swing.JTable i;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_costo;
    private javax.swing.JLabel l_fin;
    private javax.swing.JLabel l_inicio;
    private javax.swing.JLabel l_inmueblea1;
    private javax.swing.JLabel l_nomnhre;
    private javax.swing.JLabel l_personaa;
    private javax.swing.JTextField t_costo;
    private javax.swing.JTextField t_fin;
    private javax.swing.JTextField t_inicio;
    private javax.swing.JTextField t_inmueble;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_persona;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablai;
    // End of variables declaration//GEN-END:variables
}
