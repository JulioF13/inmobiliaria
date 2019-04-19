/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author julit
 */
public class Ventana {
    
    private JFrame ventana;
    private JDialog dialogo;
    
    public Ventana()
    {
        ventana = new JFrame("Ventanilla");
        dialogo = new JDialog(dialogo, "Hola", true);
    }
    
    public void mostrarVentana()
    {
        ventana.getContentPane().setBackground(Color.yellow);
        ventana.setVisible(true);
        ventana.setBounds(350, 350, 400, 400);
        dialogo.setBounds(400, 400, 100, 100);
        //dialogo.setVisible(true);
        
        /*JFrame f = new JFrame();
        f.setTitle("Boton");
        f.setSize(200, 150);*/
        ventana.getContentPane().setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        ventana.getContentPane().add(b);
        
        
        String[] list = {"Blanco", "Negro", "Amarillo"};
        JComboBox c = new JComboBox(list);

        ventana.getContentPane().add(c);
        ventana.setVisible(true);
    }
}
