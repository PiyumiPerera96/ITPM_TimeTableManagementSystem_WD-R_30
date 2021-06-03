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
public class ConsecutivesLec {
    public int con_Lec_ID;
    public String lecID;
    public String subjectID1;
    public String subjectID2;
    public String subjectID3;
    public String session1;
    public String session2;
    public String session3;
  
    
    
    public ConsecutivesLec(int Con_Lec_ID, String LecID, String SubjectID1, String SubjectID2, String SubjectID3, String Session1, String Session2, String Session3){
       this.con_Lec_ID = Con_Lec_ID;
       this.lecID = LecID;
       this.subjectID1 = SubjectID1;
       this.subjectID2 = SubjectID2;
       this.subjectID3 = SubjectID3;
       this.session1 = Session1;
       this.session2 = Session2;
       this.session3 = Session3;
    }
    
     public int  getCon_Lec_ID(){
            return con_Lec_ID;
       }
     public String getLecID(){
            return lecID;
       }
    
       public String getSubjectID1(){
            return subjectID1;
       }
     
       public String getSubjectID2(){
            return subjectID2;
       }
     
       public String getSubjectID3(){
            return subjectID3;
       }
       
       public String getSession1(){
            return session1;
       }
       
       public String getSession2(){
            return  session2;

       }
       
       public String getSession3(){
            return session3;
       }
}
