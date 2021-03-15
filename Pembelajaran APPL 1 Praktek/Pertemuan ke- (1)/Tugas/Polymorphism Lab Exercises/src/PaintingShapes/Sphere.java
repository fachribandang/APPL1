/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;
//***************************************** 
// Sphere.java 
// 
// Represents a sphere. 
//*****************************************
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
public class Sphere extends Shape 
{ 
 private double radius; //radius in feet 
 //---------------------------------- 
 // Constructor: Sets up the sphere. 
 //---------------------------------- 
    public Sphere(double r) 
    { 
    super("Sphere"); 
    radius = r; 
    } 
 //----------------------------------------- 
 // Returns the surface area of the sphere. 
 //----------------------------------------- 
 @Override
 public double area() 
 { 
 return 4*Math.PI*radius*radius; 
 } 
 //----------------------------------- 
 // Returns the sphere as a String. 
 //----------------------------------- 
 @Override
 public String toString() 
 { 
 return super.toString() + " of radius " + radius; 
 } 
} 