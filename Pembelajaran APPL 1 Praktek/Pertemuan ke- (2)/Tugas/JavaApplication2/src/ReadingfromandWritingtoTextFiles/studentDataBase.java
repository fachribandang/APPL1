/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fachr
 */
public class studentDataBase {
  public static void main(String[] args)
  {
    studentFileHandler OlahData = new studentFileHandler() ;  
 LinkedList<student> studentList = new LinkedList<student>();
    studentList.add(new student ("Smith" , 27, 83.7));
    studentList.add(new student ("Jones" , 21, 28.35 ));
    studentList.add(new student ("Walker", 96 ,182.4 ));
    studentList.add(new student ("Doe", 60 ,150 ));
    studentList.add( new student ("Wood", 100 ,400 ));   
    studentList.add (new student ("Street", 33 ,57.4  ));     
    studentList.add (new student ("Taylor", 83 ,190));
    studentList.add (new student ("Smart", 75 ,292.5));   
    studentList.add (new student ("Bird", 84 ,168));   
    studentList.add( new student ("Summers", 52 ,83.2));    

OlahData.WriteFile(studentList,"student.dat");
OlahData.ReadFile("student.dat");


//        for (student item : studentList) 
//        { 
//            String data = item.getName()+" "+item.getSemesterHoursEarned()+" "+item.getQualityPointEarned();
//            System.out.println(data);
//        }
  }  
}
