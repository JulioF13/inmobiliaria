/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyecto.xd.Conexion;
import proyecto.xd.Alquiler;
import proyecto.xd.Alquiler_data;

/**
 *
 * @author julit
 */
public class ListadoAlquileres extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    /**
     * Creates new form ListadoAlquileres
     */
    public ListadoAlquileres() {
        initComponents();
        
        List<Alquiler> alquileres = new ArrayList<Alquiler>();
        
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        
        try
        {
        Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
        Alquiler_data alquilerdata = new Alquiler_data(cn);
        alquileres = alquilerdata.obtenerAlquileres();
        Object[] fila = new Object[modelo.getColumnCount()];
         for(int i = 0; i < alquileres.size(); i++)
         {
             fila[0] = alquileres.get(i).getId();
             fila[1] = alquileres.get(i).getNombre();
             fila[2] = alquileres.get(i).getFechaInicio();
             fila[3] = alquileres.get(i).getFechaFin();
             fila[4] = alquileres.get(i).getCosto();
             fila[5] = alquileres.get(i).getId_inmueble();
             fila[6] = alquileres.get(i).getId_persona();
             
             System.out.println(alquileres.get(i).getNombre());
             modelo.addRow(fila);
         }
         
        }
        catch(Exception e)
        {
            e.getMessage();
        }
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
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(2, 51, 102));
        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Fecha De Inicio", "Fecha De Fin", "Costo", "Id Del Inmueble", "Id De La Persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 640, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 650, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}