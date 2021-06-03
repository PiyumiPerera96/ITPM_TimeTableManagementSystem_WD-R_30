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
public class R_Group {
    public int Add_Su_G_SG_ID ;
    public String Room_ID;
    public String Session_ID;
    public String Sub_Group_iD;
    public String Group_ID;
    public String Tag;
    public String Room_Type;
    
    
    public R_Group(int Add_Su_G_SG_ID, String Room_ID, String Session_ID,String Sub_Group_iD,String Group_ID,String Tag ,String Room_Type ){
        
       this.Add_Su_G_SG_ID = Add_Su_G_SG_ID;
       this.Room_ID = Room_ID;
       this.Session_ID = Session_ID;
       this.Sub_Group_iD = Sub_Group_iD;
       this.Group_ID = Group_ID;
       this.Tag = Tag;
       this.Room_Type = Room_Type;
        
        
    }
     public int getAdd_Su_G_SG_ID(){
        return Add_Su_G_SG_ID;
    }
       public String getRoom_ID(){
        return Room_ID;
    }
      public String getSession_ID(){
      return Session_ID;
    }
      public String getSub_Group_iD(){
      return Sub_Group_iD;
    }
      public String getGroup_ID(){
      return Group_ID;
    }
      public String getTag(){
      return Tag;
    }
      public String getRoom_Type(){
      return Room_Type;
    }
       
    
    
}
