/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;
public class UseOptionPanes {

    
    public static void main(String[] args) {
        
        
        /*OPTION PANE SIMPLE
        String name = JOptionPane.showInputDialog(null, "Cuál es su nombre?");
        int choice = JOptionPane.showConfirmDialog(null,"ES SU NOMBRE " +name+"?");
        
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "De acuerdo!");
        }else{
            JOptionPane.showMessageDialog(null, "Arreglaremos esto, espere por favor.");
        }
        */
        
      /*VENTANA SIMPLE
        JFrame frame = new JFrame();
      frame.setVisible(true);
        */
      //
      JFrame frame1 = new JFrame();
      /*Image icon = Toolkit.getDefaultToolkit().getImage("state_changer.png");
      frame1.setIconImage(icon);
      JPanel panel = (JPanel)frame1.getContentPane();
      panel.setBackground(Color.red);
      frame1.setSize(new Dimension(400,400));
      
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      frame1.setLocation(dim.width/2-frame1.getSize().width/2, dim.height/2-frame1.getSize().height/2);
      frame1.setTitle("Ventana");
      frame1.setVisible(true);
      */
      
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setSize(new Dimension(300,300));
      frame1.setTitle("Ventana 1");
      frame1.setBackground(Color.ORANGE);
      
      JButton button1 = new JButton();
      button1.setText("Yes!");
      button1.setBackground(Color.BLUE);
      frame1.add(button1);
      //button1.addActionListener(new MessageListener());
      
      
      frame1.setLayout(new FlowLayout());
      
      JButton button2 = new JButton();
      button2.setText("No!");
      button2.setBackground(Color.red);
      frame1.add(button2);
      //button2.addActionListener(new MessageListener());
      
      JLabel label = new JLabel("Escriba algo: ");
      frame1.add(label);
      JTextField fieldt = new JTextField(10);
      frame1.add(fieldt);
      fieldt.addActionListener(new MessageListener(fieldt));
      
       
      // frame.pack(); recoge o encoge todo
      //frame1.pack();
      
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      frame1.setLocation(dim.width/2-frame1.getSize().width/2, dim.height/2-frame1.getSize().height/2);
      
      
      frame1.setVisible(true);
      
      
      //Layouts
      JFrame frame2 = new JFrame();
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setSize(new Dimension(300,300));
      frame2.setTitle("Ventana 1");
      
      frame2.setLayout(new GridLayout(3,3));
        for (int i = 1; i <= 9; i++) {
            frame2.add(new JButton(""+i));
            //frame2.add(new JButton(""+i).addActionListener(new MessageListener())); Falta añadir evento
           
        
        }
        
        
        
      //frame2.pack();
      
      Dimension dim1 = Toolkit.getDefaultToolkit().getScreenSize();
      frame2.setLocation(dim1.width/2-frame2.getSize().width/2, dim1.height/2-frame2.getSize().height/2);
      frame2.setVisible(true);
      
      
      
      
      
      
      
      
    } 
    
}
