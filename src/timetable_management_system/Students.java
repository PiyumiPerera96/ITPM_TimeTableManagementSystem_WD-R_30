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
public class Students {
    
    private int sId;
    private String year;
    private String semester;
    private String programme;
    private String mainGroupNumber;
    private String subGroupNumber;
    private String mainGroupId;
    private String subGroupId;
    
    public Students(int SId,String Year, String Semester,String Programme,String MainGroupNumber,String SubGroupNumber,String MainGroupId,String SubGroupId){
      
        this.sId = SId;
        this.year = Year;
        this.semester = Semester;
        this.programme = Programme;
        this.mainGroupNumber = MainGroupNumber;
        this.subGroupNumber = SubGroupNumber;
        this.mainGroupId = MainGroupId;
        this.subGroupId = SubGroupId;
    }

    
      public int getSID(){
        return sId;
    }
    
      public String getYear(){
          return year;
      }
      
      public String getSemester(){
          return semester;
      }
      
      public String getProgramme(){
          return programme;
      }
      
      public String getMainGroupNumber(){
          return mainGroupNumber;
      }
      
      public String getSubGroupNumber(){
          return subGroupNumber;
      }
      
      public String getMainGroupId(){
          return mainGroupId;
      }
      
      public String getSubGroupId(){
          return subGroupId;
      }
              
}
