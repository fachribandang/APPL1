/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingfromandWritingtoTextFiles;

/**
 *
 * @author fachr
 */
public class student 
{
    private String Name;
    private Integer SemesterHoursEarned;
    private Double QualityPointEarned;
    student (String name,Integer Hours, double Point){
    this.Name=name;
    this.SemesterHoursEarned=Hours;
    this.QualityPointEarned=Point;     
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Integer getSemesterHoursEarned() {
        return SemesterHoursEarned;
    }
    public void setSemesterHoursEarned(Integer SemesterHoursEarned) {
        this.SemesterHoursEarned = SemesterHoursEarned;
    }
    public double getQualityPointEarned() {
        return QualityPointEarned;
    }
    public void setQualityPointEarned(double QualityPointEarned) {
        this.QualityPointEarned = QualityPointEarned;
    }
    
    public double getGradePointAverage(){
        return QualityPointEarned / SemesterHoursEarned;
    }   
    
    public String tofullkontent(){
        
        String tempI = SemesterHoursEarned.toString();
        String tempD = QualityPointEarned.toString();
        return Name + " "+ tempI+ " "+ tempD;
                }
}
