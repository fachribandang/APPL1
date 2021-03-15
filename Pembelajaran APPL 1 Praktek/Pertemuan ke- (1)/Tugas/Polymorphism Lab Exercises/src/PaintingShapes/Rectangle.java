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
    public Rectangle(double x,double y) {
        super("Rectangle");
        length = x;
        width = y;
              
    }

    @Override
    double area() {
        return length*width;
       
    }
    
}
