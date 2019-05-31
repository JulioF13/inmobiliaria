/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.xd.Alquiler;
import proyecto.xd.Alquiler_data;
import proyecto.xd.Conexion;
import proyecto.xd.Inmueble;

/**
 *
 * @author julit
 */
public class BorrarAlquiler extends javax.swing.JInternalFrame {
    String filtro = "Nombre";
    
    private DefaultTableModel modelo;
    /**
     * Creates new form BorrarAlquiler
     */
    public BorrarAlquiler() {
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

        botoon1 = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        l_inicio = new javax.swing.JLabel();
        t_texto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        b_borrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botoon1.setBackground(new java.awt.Color(0, 51, 102));
        botoon1.setForeground(new java.awt.Color(255, 255, 255));
        botoon1.setText("Buscar");
        botoon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoon1ActionPerformed(evt);
            }
        });
        getContentPane().add(botoon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 80, 20));

        busqueda.setBackground(new java.awt.Color(0, 51, 102));
        busqueda.setForeground(new java.awt.Color(255, 255, 255));
        busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        busqueda.setCaretColor(new java.awt.Color(255, 255, 255));
        busqueda.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, 20));

        combo.setBackground(new java.awt.Color(0, 51, 102));
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "Costo" }));
        combo.setToolTipText("Seleccionar");
        combo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alquileres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 150, 46));

        jScrollPane1.setWheelScrollingEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 51, 102));
        jTextArea1.setColumns(13);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(4);
        jTextArea1.setTabSize(6);
        jTextArea1.setText(" Seleccione el alquiler\n que desea borrar.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 170, 80));

        l_inicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_inicio.setForeground(new java.awt.Color(255, 255, 255));
        l_inicio.setText("Ingrese el alquiler:");
        getContentPane().add(l_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        t_texto.setBackground(new java.awt.Color(0, 51, 102));
        t_texto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_texto.setForeground(new java.awt.Color(255, 255, 255));
        t_texto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_texto.setCaretColor(new java.awt.Color(255, 255, 255));
        t_texto.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        t_texto.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        t_texto.setSelectionColor(new java.awt.Color(255, 255, 255));
        t_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_textoActionPerformed(evt);
            }
        });
        t_texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_textoKeyTyped(evt);
            }
        });
        getContentPane().add(t_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 20));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 70, 30));

        b_borrar.setBackground(new java.awt.Color(0, 51, 102));
        b_borrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_borrar.setForeground(new java.awt.Color(255, 255, 255));
        b_borrar.setText("Borrar");
        b_borrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 70, 30));

        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Fecha De Inicio", "Fecha De Fin", "Costo"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setRowHeight(30);
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 480, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_textoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarActionPerformed
        // TODO add your handling code here:
        Alquiler alquiler = new Alquiler();
        alquiler.setId(parseInt(t_texto.getText()));

        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            Alquiler_data alquilerdata = new Alquiler_data(cn);
            alquilerdata.borrarAlquiler(alquiler);
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar un cliente: " + ex.getMessage());
        }
        
        String mensaje = "¡Alquiler borrado con exito!";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_b_borrarActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        if (combo.getSelectedItem() == "Nombre")
        {
            filtro = "Nombre";
        }
        if (combo.getSelectedItem() == "Costo")
        {
            filtro = "costo";
        }

    }//GEN-LAST:event_comboActionPerformed

    private void botoon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoon1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            Alquiler alquile4 = new Alquiler();
            Alquiler_data alquilerdata = new Alquiler_data(cn);

            List<Alquiler> alq = alquilerdata.obtenerAlquileresPorFiltro(filtro, busqueda.getText());

            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < alq.size(); i++) {
                fila[0] = alq.get(i).getId();
                fila[1] = alq.get(i).getNombre().toUpperCase();
                fila[2] = alq.get(i).getFechaInicio();
                fila[3] = alq.get(i).getFechaFin();
                fila[4] = alq.get(i).getCosto();

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
        t_texto.setText(String.valueOf(tabla.getValueAt(seleccion, 0)));
    }//GEN-LAST:event_tablaMouseClicked

    private void t_textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_textoKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_textoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_borrar;
    private javax.swing.JButton botoon1;
    private javax.swing.JTextField busqueda;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l_inicio;
    private javax.swing.JTextField t_texto;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
