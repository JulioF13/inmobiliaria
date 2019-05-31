/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import proyecto.xd.*;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julit
 */
public class ActualizarCliente extends javax.swing.JInternalFrame {

    String filtro = "Nombre";
     private DefaultTableModel modelo;
    /**
     * Creates new form ActualizarCliente
     */
    public ActualizarCliente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botoon1 = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_ndni = new javax.swing.JTextField();
        l_dnia = new javax.swing.JLabel();
        t_dnia = new javax.swing.JTextField();
        l_nnombre = new javax.swing.JLabel();
        t_nnombre = new javax.swing.JTextField();
        l_ndni = new javax.swing.JLabel();
        l_ntelefono = new javax.swing.JLabel();
        t_ntelefono = new javax.swing.JTextField();
        b_guardar = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 51, 102));
        jTextArea1.setColumns(13);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(4);
        jTextArea1.setTabSize(6);
        jTextArea1.setText("Ingrese el DNI anterior de \nla  persona que desea \nactualizar");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 180, -1));

        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "DNI", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setRowHeight(30);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 520, 150));

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
        getContentPane().add(botoon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 20));

        busqueda.setBackground(new java.awt.Color(0, 51, 102));
        busqueda.setForeground(new java.awt.Color(255, 255, 255));
        busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        busqueda.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 20));

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
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busquedas de personas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 46));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 140, 46));

        t_ndni.setBackground(new java.awt.Color(0, 51, 102));
        t_ndni.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_ndni.setForeground(new java.awt.Color(255, 255, 255));
        t_ndni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_ndni.setCaretColor(new java.awt.Color(255, 255, 255));
        t_ndni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ndniActionPerformed(evt);
            }
        });
        t_ndni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ndniKeyTyped(evt);
            }
        });
        getContentPane().add(t_ndni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 150, -1));

        l_dnia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_dnia.setForeground(new java.awt.Color(255, 255, 255));
        l_dnia.setText("Ingrese DNI:");
        getContentPane().add(l_dnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        t_dnia.setBackground(new java.awt.Color(0, 51, 102));
        t_dnia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_dnia.setForeground(new java.awt.Color(255, 255, 255));
        t_dnia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_dnia.setCaretColor(new java.awt.Color(255, 255, 255));
        t_dnia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dniaActionPerformed(evt);
            }
        });
        t_dnia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_dniaKeyTyped(evt);
            }
        });
        getContentPane().add(t_dnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, -1));

        l_nnombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_nnombre.setForeground(new java.awt.Color(255, 255, 255));
        l_nnombre.setText("Nuevo Nombre:");
        getContentPane().add(l_nnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        t_nnombre.setBackground(new java.awt.Color(0, 51, 102));
        t_nnombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_nnombre.setForeground(new java.awt.Color(255, 255, 255));
        t_nnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_nnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        t_nnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nnombreKeyTyped(evt);
            }
        });
        getContentPane().add(t_nnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 150, -1));

        l_ndni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_ndni.setForeground(new java.awt.Color(255, 255, 255));
        l_ndni.setText("Nuevo DNI:");
        getContentPane().add(l_ndni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        l_ntelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_ntelefono.setForeground(new java.awt.Color(255, 255, 255));
        l_ntelefono.setText("Nuevo Nro. de Telefono:");
        getContentPane().add(l_ntelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        t_ntelefono.setBackground(new java.awt.Color(0, 51, 102));
        t_ntelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_ntelefono.setForeground(new java.awt.Color(255, 255, 255));
        t_ntelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_ntelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        t_ntelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ntelefonoActionPerformed(evt);
            }
        });
        t_ntelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ntelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(t_ntelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 150, -1));

        b_guardar.setBackground(new java.awt.Color(0, 51, 102));
        b_guardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_guardar.setForeground(new java.awt.Color(255, 255, 255));
        b_guardar.setText("Guardar");
        b_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(b_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 70, 30));

        b_salir.setBackground(new java.awt.Color(0, 51, 102));
        b_salir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_salir.setForeground(new java.awt.Color(255, 255, 255));
        b_salir.setText("Salir");
        b_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 550, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_dniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_dniaActionPerformed

    private void t_ndniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ndniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_ndniActionPerformed

    private void t_ntelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ntelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_ntelefonoActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        // TODO add your handling code here:
        
        
        persona personas = new persona();
        
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
        persona_data personadata = new persona_data(cn);
        personadata.actualizarPersona(personas, t_nnombre.getText(), parseInt(t_ndni.getText()), parseInt(t_ntelefono.getText()), parseInt(t_dnia.getText()));
        }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar cliente: " + ex.getMessage());
        }
        
        String mensaje = "¡Cliente actualizado con exito!";
        JOptionPane.showMessageDialog(this, mensaje);
        
        
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_b_salirActionPerformed

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
                fila[0] = per.get(i).getNombre().toUpperCase();
                fila[1] = per.get(i).getDni();
                fila[2] = per.get(i).getCelular();

                modelo.addRow(fila);
            }

        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }//GEN-LAST:event_botoon1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int seleccion = tabla.rowAtPoint(evt.getPoint());
        t_dnia.setText(String.valueOf(tabla.getValueAt(seleccion, 1)));
        t_ndni.setText(String.valueOf(tabla.getValueAt(seleccion, 1)));
        t_nnombre.setText(String.valueOf(tabla.getValueAt(seleccion, 0)));
        t_ntelefono.setText(String.valueOf(tabla.getValueAt(seleccion, 2)));
    }//GEN-LAST:event_tablaMouseClicked

    private void t_dniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_dniaKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_dniaKeyTyped

    private void t_ndniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ndniKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_ndniKeyTyped

    private void t_ntelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ntelefonoKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_ntelefonoKeyTyped

    private void t_nnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nnombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_t_nnombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton botoon1;
    private javax.swing.JTextField busqueda;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l_dnia;
    private javax.swing.JLabel l_ndni;
    private javax.swing.JLabel l_nnombre;
    private javax.swing.JLabel l_ntelefono;
    private javax.swing.JTextField t_dnia;
    private javax.swing.JTextField t_ndni;
    private javax.swing.JTextField t_nnombre;
    private javax.swing.JTextField t_ntelefono;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
