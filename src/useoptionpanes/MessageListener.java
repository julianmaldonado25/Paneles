/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.event.*;
import javax.swing.*;
public class MessageListener implements ActionListener {
    protected JTextField field;
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Dio clic al botón"+ this.getField());
    }

    public MessageListener(JTextField text) {
        this.field = text;
        
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }
    
    
    
}
