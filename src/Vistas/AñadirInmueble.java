/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import proyecto.xd.Conexion;
import proyecto.xd.Inmueble;
import proyecto.xd.Inmueble_data;

/**
 *
 * @author julit
 */
public class AñadirInmueble extends javax.swing.JInternalFrame {

    /**
     * Creates new form AñadirInmueble
     */
    public AñadirInmueble() {
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

        b_salir = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        l_disponibilidad = new javax.swing.JLabel();
        t_disponibilidad = new javax.swing.JTextField();
        t_costo = new javax.swing.JTextField();
        l_costo = new javax.swing.JLabel();
        t_ambientes = new javax.swing.JTextField();
        l_ambientes = new javax.swing.JLabel();
        t_direccion = new javax.swing.JTextField();
        l_direccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(b_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 70, 30));

        bt_guardar.setBackground(new java.awt.Color(0, 51, 102));
        bt_guardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bt_guardar.setForeground(new java.awt.Color(255, 255, 255));
        bt_guardar.setText("Guardar");
        bt_guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_guardar.setName("bt_guardar"); // NOI18N
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 70, 30));

        l_disponibilidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_disponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        l_disponibilidad.setText("Disponibilidad:");
        getContentPane().add(l_disponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        t_disponibilidad.setBackground(new java.awt.Color(0, 51, 102));
        t_disponibilidad.setForeground(new java.awt.Color(255, 255, 255));
        t_disponibilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_disponibilidad.setCaretColor(new java.awt.Color(255, 255, 255));
        t_disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_disponibilidadActionPerformed(evt);
            }
        });
        t_disponibilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_disponibilidadKeyTyped(evt);
            }
        });
        getContentPane().add(t_disponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, 20));

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
        getContentPane().add(t_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 20));

        l_costo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_costo.setForeground(new java.awt.Color(255, 255, 255));
        l_costo.setText("Costo:");
        getContentPane().add(l_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        t_ambientes.setBackground(new java.awt.Color(0, 51, 102));
        t_ambientes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_ambientes.setForeground(new java.awt.Color(255, 255, 255));
        t_ambientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_ambientes.setCaretColor(new java.awt.Color(255, 255, 255));
        t_ambientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ambientesActionPerformed(evt);
            }
        });
        t_ambientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ambientesKeyTyped(evt);
            }
        });
        getContentPane().add(t_ambientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 20));

        l_ambientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_ambientes.setForeground(new java.awt.Color(255, 255, 255));
        l_ambientes.setText("CantAmbientes:");
        getContentPane().add(l_ambientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        t_direccion.setBackground(new java.awt.Color(0, 51, 102));
        t_direccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_direccion.setForeground(new java.awt.Color(255, 255, 255));
        t_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        t_direccion.setCaretColor(new java.awt.Color(255, 255, 255));
        t_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(t_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, 20));

        l_direccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_direccion.setForeground(new java.awt.Color(255, 255, 255));
        l_direccion.setText("Dirección:");
        getContentPane().add(l_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1 Es Disponible y 0 No disponible");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 160, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inmuebles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 410, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_direccionActionPerformed

    private void t_ambientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ambientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_ambientesActionPerformed

    private void t_disponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_disponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_disponibilidadActionPerformed

    private void t_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_costoActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        // TODO add your handling code here:
        Inmueble inmuebles = new Inmueble(t_direccion.getText(),parseInt(t_ambientes.getText()),parseInt(t_costo.getText()) ,parseInt(t_disponibilidad.getText()));
        //crear coneccion en variable conn
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            Inmueble_data inmueble = new Inmueble_data(cn);
            inmueble.insertarInmueble(inmuebles);
        }
        catch(Exception ex)
        {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        String mensaje = "¡Inmueble añadido con exito!";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_b_salirActionPerformed

    private void t_ambientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ambientesKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_ambientesKeyTyped

    private void t_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_costoKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_t_costoKeyTyped

    private void t_disponibilidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_disponibilidadKeyTyped
        // TODO add your handling code here:
               char c = evt.getKeyChar();
        
        if(c < '0' || c > '1') evt.consume();
    }//GEN-LAST:event_t_disponibilidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_salir;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l_ambientes;
    private javax.swing.JLabel l_costo;
    private javax.swing.JLabel l_direccion;
    private javax.swing.JLabel l_disponibilidad;
    private javax.swing.JTextField t_ambientes;
    private javax.swing.JTextField t_costo;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_disponibilidad;
    // End of variables declaration//GEN-END:variables
}
