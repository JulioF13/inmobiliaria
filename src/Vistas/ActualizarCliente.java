/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import proyecto.xd.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author julit
 */
public class ActualizarCliente extends javax.swing.JInternalFrame {

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
        jTextArea1.setText("Ingrese el DNI de la  persona\nque deseas  actualizar");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 46));

        t_ndni.setBackground(new java.awt.Color(0, 51, 102));
        t_ndni.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_ndni.setForeground(new java.awt.Color(255, 255, 255));
        t_ndni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_ndni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ndniActionPerformed(evt);
            }
        });
        getContentPane().add(t_ndni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, -1));

        l_dnia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_dnia.setForeground(new java.awt.Color(255, 255, 255));
        l_dnia.setText("Ingrese DNI:");
        getContentPane().add(l_dnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        t_dnia.setBackground(new java.awt.Color(0, 51, 102));
        t_dnia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_dnia.setForeground(new java.awt.Color(255, 255, 255));
        t_dnia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_dnia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dniaActionPerformed(evt);
            }
        });
        getContentPane().add(t_dnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, -1));

        l_nnombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_nnombre.setForeground(new java.awt.Color(255, 255, 255));
        l_nnombre.setText("Nuevo Nombre:");
        getContentPane().add(l_nnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        t_nnombre.setBackground(new java.awt.Color(0, 51, 102));
        t_nnombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_nnombre.setForeground(new java.awt.Color(255, 255, 255));
        t_nnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(t_nnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 170, -1));

        l_ndni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_ndni.setForeground(new java.awt.Color(255, 255, 255));
        l_ndni.setText("Nuevo DNI:");
        getContentPane().add(l_ndni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        l_ntelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_ntelefono.setForeground(new java.awt.Color(255, 255, 255));
        l_ntelefono.setText("Nuevo Nro. de Telefono:");
        getContentPane().add(l_ntelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        t_ntelefono.setBackground(new java.awt.Color(0, 51, 102));
        t_ntelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_ntelefono.setForeground(new java.awt.Color(255, 255, 255));
        t_ntelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_ntelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ntelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(t_ntelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 170, -1));

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
        getContentPane().add(b_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 70, 30));

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
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 560));

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
        
        
        
    }//GEN-LAST:event_b_guardarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_b_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_guardar;
    private javax.swing.JButton b_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l_dnia;
    private javax.swing.JLabel l_ndni;
    private javax.swing.JLabel l_nnombre;
    private javax.swing.JLabel l_ntelefono;
    private javax.swing.JTextField t_dnia;
    private javax.swing.JTextField t_ndni;
    private javax.swing.JTextField t_nnombre;
    private javax.swing.JTextField t_ntelefono;
    // End of variables declaration//GEN-END:variables
}
