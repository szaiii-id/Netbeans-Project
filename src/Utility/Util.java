/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author solosz
 */
public class Util {
    
    public static void resetForm(JTextField... inputs) {
        for (JTextField input : inputs) {
            input.setText("");
        }
    }
    
    public static void resetForm(JTextArea... inputs) {
        for (JTextArea input : inputs) {
            input.setText("");
        }
    }
    
    public static void resetForm(JComboBox... inputs) {
        for (JComboBox input : inputs) {
            input.setSelectedIndex(0);
        }
    }
    
    
}
