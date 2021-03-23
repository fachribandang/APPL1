/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
        try {
            this.Reader = new FileReader(NamaFIle);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void WriteFile() {
        try {
            this.Writer = new FileWriter(NamaFIle);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(studentFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
