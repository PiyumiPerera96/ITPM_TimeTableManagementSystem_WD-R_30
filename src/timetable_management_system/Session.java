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
public class Session {
    private int session_ID;
    private String lec1;
    private String lec2;
    private String tag;
    private String sub_code;
    private String sub_name;
    private int stu_count;
    private int duration;
    private String full_grpID, Maingroup, Subgroup;
   
    
    public Session(int Session_ID, String Lec1, String Lec2, String Tag, String Sub_code, String Sub_name, int Stu_count, int Duration, String Full_grpID, String Maingroup, String Subgroup){
        this.session_ID= Session_ID;
        this.lec1 = Lec1;
        this.lec2 = Lec2;
        this.tag = Tag;
        this.sub_code = Sub_code;
        this.sub_name = Sub_name;
        this.stu_count = Stu_count; 
        this.duration = Duration;
        this.full_grpID = Full_grpID;
        this.Maingroup = Maingroup;
        this.Subgroup = Subgroup;
    }
    
    
    public int getSession_ID(){
        return session_ID;
    }
    
    public String getLec1(){
          return lec1;
    }
      
    public String getLec2(){
          return lec2;
    }
       
    public String getTag(){
          return tag;
    }
    
    public String getSub_code(){
          return sub_code;
    }
    
    public String getSub_name(){
          return sub_name;
    }
    
    public int getStu_count(){
          return stu_count;
    }
    
     public int getDuration(){
          return duration;
    }
     
      public String getFull_grpID(){
          return full_grpID;
    }
      
      public String getMaingroup(){
          return Maingroup;
    }
     
      public String getSubgroup(){
          return Subgroup;
    }
}
