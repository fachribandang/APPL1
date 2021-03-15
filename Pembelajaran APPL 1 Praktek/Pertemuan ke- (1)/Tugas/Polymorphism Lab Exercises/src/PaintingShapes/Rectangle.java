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
public class Rectangle extends Shape 
{
    private double length,width;
    public Rectangle(double len,double wid) {
        super("Rectangle");
        length = len;
        width = wid;
              
    }

    @Override
    double area() {
        return length*width;
       
    }
    @Override
    public String toString() 
    { 
    return super.toString() + " of length " + length + " and width " +width; 
    } 
}
