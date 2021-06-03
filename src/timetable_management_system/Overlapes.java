/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_management_system;

/**
 *
 * @author NISHADI
 */
public class Overlapes {
    
    public int overID;
    public String overYear;
    public String over_Semester;
    public String overSpecial;
    public String overTag;
    public String overCode1;
    public String overCode2;
    public String overCode3;
    public String overCode4, overSe1, overSe2, overSe3, overSe4;
    
    
    // public Paral alleID = ParalleID;
      //  this.parYear = ParYear;
    
    public Overlapes(int OverID, String OverYear, String Over_Semester, String OverSpecial, String OverTag, String OverCode1, String OverCode2, String OverCode3, String OverCode4, String OverSe1, String OverSe2, String OverSe3, String OverSe4){
        this.overID = OverID;
        this.overYear = OverYear;
        this.over_Semester = Over_Semester;
        this.overCode1 = OverCode1;
        this.overCode2 = OverCode2;
        this.overCode3 = OverCode3;
        this.overCode4 = OverCode4;
        this.overSpecial = OverSpecial;
        this.overTag = OverTag;
        this.overSe1 = OverSe1;
        this.overSe2 = OverSe2;
        this.overSe3 = OverSe3; 
        this.overSe4 = OverSe4;
  
    }
    
     public int getOverID(){
           return overID;
        }
    
    
    public String getOverYear(){
            return overYear;
       }
    
     public String getOver_Semester(){
            return over_Semester;
       }
     public String getOverCode1(){
            return overCode1;
       }
      public String getOverCode2(){
            return overCode2;
       }
     public String getOverCode3(){
            return overCode1;
       }
     public String getOverCode4(){
            return overCode4;
       }
     
   
    public String getOverSpecial(){
            return overSpecial;
       }
     public String getOverTag(){
            return overTag;
       }
  
    public String getOverSe1(){
            return overSe1;
       } 
    
    public String getOverSe2(){
            return overSe2;
       }
      public String getOverSe3(){
            return overSe3;
       }
    
      public String getOverSe4(){
            return overSe4;
       }
      
      
    
}
