/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author fachr
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
