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
public class Parallels {
    public int paralleID;
    public String parYear;
    public String parSemester;
    public String parSpecial;
    public String parTag;

    public String parCode1;
    public String parCode2;
    public String parCode3;
    public  String parCode4, parSession1, parSession2, parSession3, parSession4;
    
 public Parallels(  int ParalleID, String ParYear, String ParSemester, String ParSpecial,String ParTag, String ParCode1, String ParCode2, String ParCode3, String ParCode4, String ParSession1, String ParSession2, String ParSession3, String ParSession4){
        this.paralleID = ParalleID;
        this.parYear = ParYear;
        this.parSemester = ParSemester;
        this.parTag = ParTag;
        this.parSpecial = ParSpecial;
        this.parCode1 = ParCode1; 
        this.parCode2 = ParCode2;
        this.parCode3 = ParCode3;
        this.parCode4 = ParCode4;
        this.parSession1 = ParSession1;
        this.parSession2 = ParSession2;
        this.parSession3 = ParSession3;
        this.parSession4 = ParSession4;

        
        }

    Parallels(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  public int getParalleID(){
           return paralleID;
        }
  
  public String getParYear(){
            return parYear;
        }
 
   public String getParSemester(){
            return parSemester;
        }
 
    public String getParSpecial(){
            return parSpecial;
        }
    public String getParTag(){
            return parTag;
        }
 
         public String getParCode1(){
            return parCode1;
        }
 
          public String getParCode2(){
            return parCode2;
        }
 
     public String getParCode3(){
            return parCode3;
        }
 
      public String getParCode4(){
            return parCode4;
        }
 
   public String getParSession1(){
            return parSession1;
        }
   public String getParSession2(){
            return parSession2;
        }
   public String getParSession3(){
            return parSession3;
        }
   public String getParSession4(){
            return parSession4;
        }
}
