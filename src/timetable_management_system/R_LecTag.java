/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable_management_system;

/**
 *
 * @author Vidushan
 */

public class R_LecTag {
    public int Add_Su_L_SG_ID;
    public String Room_ID;
    public String Session_iD;
    public String Lec_ID;
    public String Tag;
    public String Room_Type;
    
    
    public R_LecTag(int Add_Su_L_SG_ID, String Room_ID, String Session_iD,String Lec_ID,String Tag ,String Room_Type ){
        
       this.Add_Su_L_SG_ID = Add_Su_L_SG_ID;
       this.Room_ID = Room_ID;
       this.Session_iD = Session_iD;
       this.Lec_ID = Lec_ID;
       this.Tag = Tag;
       this.Room_Type = Room_Type;
        
        
    }
     public int getAdd_Su_L_SG_ID(){
        return Add_Su_L_SG_ID;
    }
       public String getRoom_ID(){
        return Room_ID;
    }
      public String getSession_iD(){
      return Session_iD;
    }
      public String getLec_ID(){
      return Lec_ID;
    }
      public String getTag(){
      return Tag;
    }
      public String getRoom_Type(){
      return Room_Type;
    }
       
      
     
            
    
}

    

