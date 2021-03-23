
package ReadingfromandWritingtoTextFiles;
// **************************************************************************** 
// Warning.java 
// 
// Reads student data from a text file and writes data to another text file. 
// **************************************************************************** 

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
public class Warning 
{ 
 // -------------------------------------------------------------------- 
 // Reads student data (name, semester hours, quality points) from a 
 // text file, computes the GPA, then writes data to another file 
 // if the student is placed on academic warning. 
 // -------------------------------------------------------------------- 
 public static void main (String[] args) throws FileNotFoundException 
 { 
 int creditHrs; // number of semester hours earned 
 double qualityPts; // number of quality points earned 
 double gpa; // grade point (quality point) average 
 String line, name, inputName = "students.dat"; 
 String outputName = "warning.dat"; 
try 
 { 
 // Set up scanner to input file 
    File  FileObject= new File(inputName);
    Scanner FileReader = new Scanner(FileObject);
 // Set up the output file stream 
    FileWriter FileWriter;
 // Print a header to the output file 
    outFile.println (); 
    outFile.println ("Students on Academic Warning"); 
    outFile.println (); 
 // Process the input file, one token at a time 
            while (FileReader.hasNextLine()) {
            name = FileReader.next();  
            creditHrs = FileReader.nextInt();
            qualityPts = FileReader.nextDouble();
            student tempstudent =new student (name,creditHrs,qualityPts);
                System.out.println(tempstudent.tofullkontent());
            }
            FileReader.close();
 } 
 catch (FileNotFoundException exception) 
 { 
 System.out.println ("The file " + inputName + " was not found."); 
 } 
 catch (IOException exception) 
 { 
 System.out.println (exception); 
 } 
 catch (NumberFormatException e) 
 { 
 System.out.println ("Format error in input file: " + e); 
 } 
 } 
}