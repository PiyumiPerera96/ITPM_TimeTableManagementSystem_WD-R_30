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
public class Consecutives {
    
    public int con_Stu_ID;
    public String con_Stu_GroupID;
    public String con_Stu_Code1;
    public String con_Stu_Code2;
    public String con_Stu_Code3; 
    public String con_Stu_Se1;
    public String con_Stu_Se2;
    public String con_Stu_Se3;
  
    
    public Consecutives(int Con_Stu_ID, String Con_Stu_GroupID, String Con_Stu_Code1, String Con_Stu_Code2, String Con_Stu_Code3, String Con_Stu_Se1, String Con_Stu_Se2, String Con_Stu_Se3){

       this.con_Stu_ID= Con_Stu_ID;
       this.con_Stu_GroupID= Con_Stu_GroupID;
       this.con_Stu_Code1 = Con_Stu_Code1;
       this.con_Stu_Code2 = Con_Stu_Code2;
       this.con_Stu_Code3 = Con_Stu_Code3;
       this.con_Stu_Se1 = Con_Stu_Se1;
       this.con_Stu_Se2 = Con_Stu_Se2;
       this.con_Stu_Se3 = Con_Stu_Se3;
       
    }
      
    
    
    public int getCon_Stu_ID(){
            return con_Stu_ID;
    }
    
    public String getCon_Stu_GroupID(){
            return con_Stu_GroupID;
    }
       
    public String getCon_Stu_Code1(){
            return con_Stu_Code1;
    }
        
    public String getCon_Stu_Code2(){
            return con_Stu_Code2;
    }
         
    public String getCon_Stu_Code3(){
            return con_Stu_Code3;
    }
          
    public String getCon_Stu_Se1(){
            return con_Stu_Se1;
    }
       
    public String getCon_Stu_Se2(){
            return con_Stu_Se2;
       }
     
    public String getCon_Stu_Se3(){
            return con_Stu_Se3;
    }
     
     
    
     
     
     
     
     
     
     
     
              
      
}
