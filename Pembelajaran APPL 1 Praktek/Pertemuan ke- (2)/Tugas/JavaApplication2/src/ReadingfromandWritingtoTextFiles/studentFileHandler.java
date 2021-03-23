/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fachr
 */
public class studentFileHandler {
    
    String NamaFIle= "students.dat";
    FileWriter Writer;
    FileReader Reader;  
    public void ReadFile() {
      File  FileObject= new File(NamaFIle);
        try {
            Scanner reader = new Scanner(FileObject);
            while (reader.hasNextLine()) {
            String data = reader.nextLine();
            reader.close();
      }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void WriteFile(student[] studentsList) {
        try {
            Writer = new FileWriter(NamaFIle);
        } catch (IOException ex) {
            Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (student item : studentsList) 
        { 
            String data = item.getName()+" "+item.getSemesterHoursEarned()+" "+item.getQualityPointEarned();
            try {
                Writer.write(data);
            } catch (IOException ex) {
                Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            Writer.close();
        } catch (IOException ex) {
            Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
