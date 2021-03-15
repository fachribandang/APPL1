/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedControl;

// ********************************************************************** 
// SpeedControl.java 
// 
// Demonstrates animation -- balls bouncing off the sides of a panel - 
// with speed controlled by a slider. 
// ********************************************************************** 
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class SpeedControl 
{ 
 // ------------------------------------- 
 // Sets up the frame for the animation. 
 // ------------------------------------- 
 public static void main (String[] args) 
 { 
 JSlider framesPerSecond = new JSlider(JSlider.HORIZONTAL,0,200,30);
 framesPerSecond.setMajorTickSpacing(40);
 framesPerSecond.setMinorTickSpacing(10);
 framesPerSecond.setPaintTicks(true);
 framesPerSecond.setPaintLabels(true);
 framesPerSecond.setAlignmentX(0);
 JFrame frame = new JFrame ("Bouncing Balls"); 
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
 frame.getContentPane.add(new SpeedControlPanel ()); 
 frame.pack(); 
 frame.setVisible(true); 
 } 
} 