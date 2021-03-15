

package PolymorphicSorting;
// ****************************************************** 
// Numbers.java 
// 
// Demonstrates selectionSort on an array of integers. 
// ******************************************************
/*
Created By 	:Fachri Muhammad Bandang Haq
NIM 		:191524042
Course		:D4-1B
E-mail 		:fachri.muhammad.tif419@polban.ac.id
Date		:２０２１年３月１５日
 */
import java.util.Scanner; 
public class Strings 
{ 
 // -------------------------------------------- 
 // Reads in an array of integers, sorts them, 
 // then prints them in sorted order. 
 // -------------------------------------------- 
 public static void main (String[] args) 
 { 
    String[] StrList; 
    int size; 
    Scanner scan = new Scanner(System.in); 
    System.out.print ("\nHow many integers do you want to sort? "); 
    size = scan.nextInt(); 
    StrList = new String[size]; 
    System.out.println ("\nEnter the numbers..."); 
    for (int i = 0; i < size; i++){
       StrList[i] = scan.next();
    } 
    Sorting.selectionSort(StrList);
    System.out.println ("\nYour numbers in sorted order..."); 
    for (int i = 0; i < size; i++){
       System.out.print(StrList[i] + " ");
    }
    System.out.println (); 
    } 
}  