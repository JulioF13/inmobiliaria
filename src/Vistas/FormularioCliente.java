/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import proyecto.xd.*;
import java.sql.*;
/**
 *
 * @author julit
 */
public class FormularioCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioCliente
     */
    public FormularioCliente() {
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

        t_telefono = new javax.swing.JTextField();
        l_nombre = new javax.swing.JLabel();
        l_dni = new javax.swing.JLabel();
        bt_guardar = new javax.swing.JButton();
        l_telefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_dni = new javax.swing.JTextField();
        b_salir2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_telefono.setBackground(new java.awt.Color(0, 51, 102));
        t_telefono.setForeground(new java.awt.Color(255, 255, 255));
        t_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(t_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, -1));

        l_nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_nombre.setForeground(new java.awt.Color(255, 255, 255));
        l_nombre.setText("Nombre:");
        getContentPane().add(l_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        l_dni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_dni.setForeground(new java.awt.Color(255, 255, 255));
        l_dni.setText("DNI:");
        getContentPane().add(l_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        bt_guardar.setBackground(new java.awt.Color(0, 51, 102));
        bt_guardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bt_guardar.setForeground(new java.awt.Color(255, 255, 255));
        bt_guardar.setText("Guardar");
        bt_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_guardar.setName("bt_guardar"); // NOI18N
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 70, 30));

        l_telefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_telefono.setForeground(new java.awt.Color(255, 255, 255));
        l_telefono.setText("Telefono:");
        getContentPane().add(l_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 100, 46));

        t_nombre.setBackground(new java.awt.Color(0, 51, 102));
        t_nombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_nombre.setForeground(new java.awt.Color(255, 255, 255));
        t_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, 20));

        t_dni.setBackground(new java.awt.Color(0, 51, 102));
        t_dni.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_dni.setForeground(new java.awt.Color(255, 255, 255));
        t_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dniActionPerformed(evt);
            }
        });
        getContentPane().add(t_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, -1));

        b_salir2.setBackground(new java.awt.Color(0, 51, 102));
        b_salir2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_salir2.setForeground(new java.awt.Color(255, 255, 255));
        b_salir2.setText("Salir");
        b_salir2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_salir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salir2ActionPerformed(evt);
            }
        });
        getContentPane().add(b_salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 370, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_telefonoActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        // TODO add your handling code here:
        persona p = new persona(t_nombre.getText(),parseInt(t_dni.getText()), parseInt(t_telefono.getText()));
        //crear coneccion en variable conn
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
        persona_data personadata = new persona_data(cn);
        personadata.insertarPersona(p);
        }
        catch(Exception ex)
        {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreActionPerformed

    private void t_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_dniActionPerformed

    private void b_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salir2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_b_salir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_salir2;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l_dni;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_telefono;
    private javax.swing.JTextField t_dni;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_telefono;
    // End of variables declaration//GEN-END:variables
}
