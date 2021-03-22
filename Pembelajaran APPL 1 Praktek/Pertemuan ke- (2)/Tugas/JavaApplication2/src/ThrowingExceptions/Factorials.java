// **************************************************************** 
// Factorials.java 
// 
// Reads integers from the user and prints the factorial of each. 
// 
// **************************************************************** 
package ThrowingExceptions;
import java.util.Scanner; 
public class Factorials 
{ 
 public static void main(String[] args) 
 { 
    String keepGoing ="y";
    Scanner scan = new Scanner(System.in); 
    
    while (keepGoing.equals("y") || keepGoing.equals("Y")) 
    { 

        int val = -1;
        while (val < 0 || val >=16){
            System.out.print("Enter an integer: "); 
            val=  scan.nextInt(); 
        try{
            if (val <= -1 || val >=16)
                throw new IllegalArgumentException("Niai tidak boleh negatif! dan tidak lebih dari 16!");
        }catch(Exception e) 
            {
                    System.out.println("Niai tidak boleh negatif! dan tidak lebih dari 16!"); 
            }
        }
        System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val)); 
        System.out.print("Another factorial? (y/n) "); 
        keepGoing = scan.next(); 
    } 
 } 
} 