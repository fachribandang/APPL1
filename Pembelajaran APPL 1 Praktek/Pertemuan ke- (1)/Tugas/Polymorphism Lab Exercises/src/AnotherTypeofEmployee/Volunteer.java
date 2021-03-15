/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnotherTypeofEmployee;


//******************************************************************** 
// Firm.java Author: Lewis/Loftus 
// 
// Demonstrates polymorphism via inheritance. 
//********************************************************************
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
public class Volunteer extends StaffMember 
{
 //----------------------------------------------------------------- 
 // Sets up a volunteer using the specified information. 
 //----------------------------------------------------------------- 
 public Volunteer (String eName, String eAddress, String ePhone) 
 { 
 super (eName, eAddress, ePhone); 
 } 
 //----------------------------------------------------------------- 
 // Returns a zero pay value for this volunteer. 
 //----------------------------------------------------------------- 
 public double pay() 
 { 
 return 0.0; 
 }  
}
