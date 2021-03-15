/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
public class Cylinder  extends Shape 
{
    private double radius, height;
    public Cylinder(double ra,double he) {
        super("Cylinder");
        radius = ra;
        height = he;
               
    }

    @Override
    double area() {
     double n=0;
     n = Math.PI*radius*radius*height; 
     return n;
    }
    @Override
    public String toString() 
    { 
    return super.toString() + " of radius " + radius + " and height " +height; 
    } 
}
