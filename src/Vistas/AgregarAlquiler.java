/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author julit
 */
public class AgregarAlquiler extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarAlquiler
     */
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

        t_inmueblea = new javax.swing.JTextField();
        l_inmueblea = new javax.swing.JLabel();
        t_costo = new javax.swing.JTextField();
        l_costo = new javax.swing.JLabel();
        t_fin = new javax.swing.JTextField();
        l_fin = new javax.swing.JLabel();
        t_inicio = new javax.swing.JTextField();
        l_inicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_personaa = new javax.swing.JTextField();
        l_personaa = new javax.swing.JLabel();
        b_buscari = new javax.swing.JButton();
        b_buscarp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_inmueblea.setBackground(new java.awt.Color(0, 51, 102));
        t_inmueblea.setForeground(new java.awt.Color(255, 255, 255));
        t_inmueblea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_inmueblea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_inmuebleaActionPerformed(evt);
            }
        });
        getContentPane().add(t_inmueblea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, -1));

        l_inmueblea.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_inmueblea.setForeground(new java.awt.Color(255, 255, 255));
        l_inmueblea.setText("Inmueble que alquila:");
        getContentPane().add(l_inmueblea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        t_costo.setBackground(new java.awt.Color(0, 51, 102));
        t_costo.setForeground(new java.awt.Color(255, 255, 255));
        t_costo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_costoActionPerformed(evt);
            }
        });
        getContentPane().add(t_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 110, -1));

        l_costo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_costo.setForeground(new java.awt.Color(255, 255, 255));
        l_costo.setText("Costo:");
        getContentPane().add(l_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        t_fin.setBackground(new java.awt.Color(0, 51, 102));
        t_fin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_fin.setForeground(new java.awt.Color(255, 255, 255));
        t_fin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_finActionPerformed(evt);
            }
        });
        getContentPane().add(t_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, -1));

        l_fin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_fin.setForeground(new java.awt.Color(255, 255, 255));
        l_fin.setText("Fecha de fin:");
        getContentPane().add(l_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        t_inicio.setBackground(new java.awt.Color(0, 51, 102));
        t_inicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        t_inicio.setForeground(new java.awt.Color(255, 255, 255));
        t_inicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_inicioActionPerformed(evt);
            }
        });
        getContentPane().add(t_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 110, 20));

        l_inicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_inicio.setForeground(new java.awt.Color(255, 255, 255));
        l_inicio.setText("Fecha de inicio:");
        getContentPane().add(l_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alquileres");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 110, 46));

        t_personaa.setBackground(new java.awt.Color(0, 51, 102));
        t_personaa.setForeground(new java.awt.Color(255, 255, 255));
        t_personaa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t_personaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_personaaActionPerformed(evt);
            }
        });
        getContentPane().add(t_personaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, -1));

        l_personaa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        l_personaa.setForeground(new java.awt.Color(255, 255, 255));
        l_personaa.setText("Persona que alquila:");
        getContentPane().add(l_personaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        b_buscari.setBackground(new java.awt.Color(0, 51, 102));
        b_buscari.setText("Buscar...");
        b_buscari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscariActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscari, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 20));

        b_buscarp.setBackground(new java.awt.Color(0, 51, 102));
        b_buscarp.setText("Buscar...");
        b_buscarp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_buscarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarpActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 80, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

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

    private void t_inmuebleaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_inmuebleaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_inmuebleaActionPerformed

    private void t_personaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_personaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_personaaActionPerformed

    private void b_buscariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscariActionPerformed

    private void b_buscarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscarpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscari;
    private javax.swing.JButton b_buscarp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l_costo;
    private javax.swing.JLabel l_fin;
    private javax.swing.JLabel l_inicio;
    private javax.swing.JLabel l_inmueblea;
    private javax.swing.JLabel l_personaa;
    private javax.swing.JTextField t_costo;
    private javax.swing.JTextField t_fin;
    private javax.swing.JTextField t_inicio;
    private javax.swing.JTextField t_inmueblea;
    private javax.swing.JTextField t_personaa;
    // End of variables declaration//GEN-END:variables
}
