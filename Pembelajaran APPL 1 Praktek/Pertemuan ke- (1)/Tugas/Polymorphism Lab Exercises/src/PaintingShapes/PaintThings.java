/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;
//************************************************************ 
// PaintThings.java 
// 
// Computes the amount of paint needed to paint various 
// things. Uses the amount method of the paint class which 
// takes any Shape as a parameter. 
//***********************************************************
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
import java.text.DecimalFormat; 
public class PaintThings 
{ 
 //----------------------------------------- 
 // Creates some shapes and a Paint object 
 // and prints the amount of paint needed 
 // to paint each shape. 
 //----------------------------------------- 
 public static void main (String[] args) 
 { 
 final double COVERAGE = 350; 
 Paint paint = new Paint(COVERAGE); 
 Rectangle deck; 
 Sphere bigBall; 
 Cylinder tank; 
 double deckAmt, ballAmt, tankAmt; 
 // Instantiate the three shapes to paint 
 // Compute the amount of paint needed for each shape 
 
 // Print the amount of paint for each. 
 DecimalFormat fmt = new DecimalFormat("0.#"); 
 System.out.println ("\nNumber of gallons of paint needed..."); 
 System.out.println ("Deck " + fmt.format(deckAmt)); 
 System.out.println ("Big Ball " + fmt.format(ballAmt)); 
 System.out.println ("Tank " + fmt.format(tankAmt)); 
 } 
}