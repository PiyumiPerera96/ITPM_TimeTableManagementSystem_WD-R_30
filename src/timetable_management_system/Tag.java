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
public class Tag {

   private String id;
     private String moduleTypeCode;
    private String moduleType;
    
    
    public Tag( String Id,String ModuleTypeCode, String ModuleType){
        this.id = Id;
        this.moduleTypeCode = ModuleTypeCode;
        this.moduleType = ModuleType;
       
        
    }
    
    
      public String getId(){
       return id;
   }
   
      public String getModuleTypeCode(){
        return moduleTypeCode;
    }
    public String getModuleType(){
        return moduleType;
    }

  
    
    
}
