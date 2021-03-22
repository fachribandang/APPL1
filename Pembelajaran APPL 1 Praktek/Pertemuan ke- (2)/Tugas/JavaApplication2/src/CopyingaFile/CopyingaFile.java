/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyingaFile;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class CopyingaFile {
  public static void main(String[] args) throws IOException {
    try {
      Scanner scan = new Scanner(System.in);
      System.out.print("Masukkan nama file yang ingin di copy (misal : TestTileCopying.txt): "); 
      String FileName  = scan.nextLine();

      File  FileObject= new File(FileName);
      FileWriter FileWriter = new FileWriter("Copied"+FileName);
      Scanner FileReader = new Scanner(FileObject);
      
      while (FileReader.hasNextLine()) {
        String data = FileReader.nextLine();
        FileWriter.write(data);
      }
      FileReader.close();
      FileWriter.close();
      
    } catch (FileNotFoundException e) {
      System.out.print("Nama File tidak ada "); 
      e.printStackTrace();
    }



  }
}
