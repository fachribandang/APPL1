/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fachr
 */
public class studentDataBase {
  public static void main(String[] args)
  {
    studentFileHandler OlahData = new studentFileHandler() ;  
    student[] studentList=new student[10];
    studentList[0]=new student ("Smith" , 27, 83.7);
    studentList[1]=new student ("Jones" , 21, 28.35 );
    studentList[2]=new student ("Walker", 96 ,182.4 );
    studentList[3]=new student ("Doe", 60 ,150 );
    studentList[4]=new student ("Wood", 100 ,400 );   
    studentList[5]=new student ("Street", 33 ,57.4  );     
    studentList[6]=new student ("Taylor", 83 ,190);
    studentList[7]=new student ("Smart", 75 ,292.5);   
    studentList[8]=new student ("Bird", 84 ,168);   
    studentList[9]=new student ("Summers", 52 ,83.2);    

//    OlahData.WriteFile(studentList);

//        for (student item : studentList) 
//        { 
//            String data = item.getName()+" "+item.getSemesterHoursEarned()+" "+item.getQualityPointEarned();
//            System.out.println(data);
//        }
  }  
}
