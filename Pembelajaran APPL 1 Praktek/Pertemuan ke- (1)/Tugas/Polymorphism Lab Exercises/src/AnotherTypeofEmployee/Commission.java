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
public class Commission extends Hourly{
    protected double totalsales;
    protected double commissionrate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double cs) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionrate = cs;
    }
    
    public void addTotalsales( double totalSales)
    {
        totalsales = totalSales;
    }
    
}
