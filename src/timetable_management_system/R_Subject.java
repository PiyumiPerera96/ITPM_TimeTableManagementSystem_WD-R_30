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
public class R_Subject{
    public int Add_Su_Sub_Tag_ID;
    public String Room_ID;
    public String Session_ID;
    public String Subject_ID;
    public String Tag;
    public String Room_Type;
   
    
    
    
      public R_Subject(int Add_Su_Sub_Tag_ID, String Room_ID, String Session_ID,String Subject_ID,String Tag,String Room_Type){   
       this.Add_Su_Sub_Tag_ID = Add_Su_Sub_Tag_ID;
       this.Room_ID = Room_ID;
       this.Session_ID = Session_ID;
       this.Subject_ID = Subject_ID;
       this.Tag = Tag;
       this.Room_Type = Room_Type;
        
        
    }
     public int getAdd_Su_Sub_Tag_ID(){
        return Add_Su_Sub_Tag_ID;
    }
       public String getRoom_ID(){
        return Room_ID;
    }
      public String getSession_ID(){
      return Session_ID;
    }
      public String getSubject_ID(){
      return Subject_ID;
    }
      public String getTag(){
      return Tag;
    }
     
      public String getRoom_Type(){
      return Room_Type;
    }
       
      
     
            
    
}
