/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;
//***************************************** 
// Shape.java 
// 
// Represents an abstract shape object. 
//*****************************************
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
public abstract class Shape {
    protected String shapeName;
    
    abstract void area();
    
    @Override
    public String toString ()
    {
        return shapeName;
    }
}
