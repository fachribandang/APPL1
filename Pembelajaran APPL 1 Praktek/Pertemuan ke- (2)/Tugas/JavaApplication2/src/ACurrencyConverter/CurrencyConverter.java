// *********************************************************************** 
// CurrencyConverter.java 
// 
// Computes the dollar value of the cost of an item in another currency. 
// *********************************************************************** 

package ACurrencyConverter;
import java.awt.*; 
import javax.swing.*; 
public class CurrencyConverter 
{ 
 public static void main (String[] args) 
 { 
 JFrame frame = new JFrame ("Currency Converter"); 
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 

 RatePanel ratePanel = new RatePanel ();
    frame.setPreferredSize(new Dimension(400, 300));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
 frame.getContentPane().add(ratePanel); 
 frame.pack(); 
 frame.setVisible(true); 
 } 
} 