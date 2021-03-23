/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACurrencyConverter;
// ****************************************************************** 
// RatePanel.java 
// 
// Panel for a program that converts different currencies to 
// U.S. Dollars 
// ****************************************************************** 
import com.sun.javafx.css.Combinator;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class RatePanel extends JPanel 
{ 
 private double[] rate; // exchange rates 
 private String[] currencyName; 
 private JLabel result; 
 private JTextField  testField;
 // ------------------------------------------------------------ 
 // Sets up a panel to convert cost from one of 6 currencies 
 // into U.S. Dollars. The panel contains a heading, a text 
 // field for the cost of the item, a combo box for selecting 
 // the currency, and a label to display the result. 
 // ------------------------------------------------------------ 
 public RatePanel () 
 { 
 JLabel title = new JLabel ("How much is that in dollars?"); 

 title.setAlignmentX (Component.CENTER_ALIGNMENT); 
 title.setFont (new Font ("Helvetica", Font.BOLD, 20)); 
 // Set up the arrays for the currency conversions 
 currencyName = new String[] {"Select the currency..", 
 "European Euro", "Canadian Dollar", 
 "Japanese Yen", "Australian Dollar", 
 "Indian Rupee", "Mexican Peso"}; 
 rate = new double [] {0.0, 1.2103, 0.7351, 
 0.0091, 0.6969, 
 0.0222, 0.0880}; 
 JComboBox box = new JComboBox(currencyName);
         box.setSelectedIndex(4);
         add(box, BorderLayout.PAGE_START);
         
 result = new JLabel (" ------------ "); 
 add (title); 
 testField = new JTextField();
 testField.setText("amount");
 testField.setPreferredSize( new Dimension( 60, 24 ) );
 add(testField);
 add (result); 
 box.addActionListener(new ComboListener());
 
 // create empty JTextField

 } 
 // ****************************************************** 
 // Represents an action listener for the combo box. 
 // ****************************************************** 
 private class ComboListener implements ActionListener 
 { 

 // -------------------------------------------------- 
 // Determines which currency has been selected and 
 // the value in that currency then computes and 
 // displays the value in U.S. Dollars. 

 
 // -------------------------------------------------- 
 public void actionPerformed (ActionEvent event) 
 { 
        int mount = Integer.parseInt(testField.getText()) ;
        JComboBox cb = (JComboBox)event.getSource();
        int countryindx = cb.getSelectedIndex();
 int index = countryindx; 
 result.setText ("1 " + currencyName[index] + 
 " = " + rate[index] * mount+ " U.S. Dollars"); 

 } 
 } 
} 
