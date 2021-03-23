
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
import java.util.LinkedList;
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
     studentFileHandler OlahData = new studentFileHandler() ; 
 LinkedList<student> studentwarninglist = new LinkedList<student>();
 try 
 { 
 // Set up scanner to input file 
    File  FileObject= new File(inputName);
    Scanner FileReader = new Scanner(FileObject);
 // Set up the output file stream 
    FileWriter FileWriter;
 // Print a header to the output file 
    outFile.println ("Students on Academic Warning"); 

 // Process the input file, one token at a time

            while (FileReader.hasNextLine()) {
            try{
                name = FileReader.next();

            creditHrs = FileReader.nextInt();
            qualityPts = FileReader.nextDouble();
            student tempstudent =new student (name,creditHrs,qualityPts);
            gpa = tempstudent.getGradePointAverage();
            
            
            if (tempstudent.getSemesterHoursEarned()<30 && tempstudent.getGradePointAverage()<1.5){
                studentwarninglist.add(tempstudent);
            }
            else if (tempstudent.getSemesterHoursEarned()<60 && tempstudent.getGradePointAverage()<1.75){
                studentwarninglist.add(tempstudent);
            }
            else if  (tempstudent.getGradePointAverage()<2.0){
                studentwarninglist.add(tempstudent);
            }
            
            }  catch (Exception e){
                
            }
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
        OlahData.WriteFile(studentwarninglist,"warning.dat");
        OlahData.ReadFile("warning.dat");
 } 
}