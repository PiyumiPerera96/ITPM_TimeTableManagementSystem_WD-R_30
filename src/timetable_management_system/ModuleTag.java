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
public class ModuleTag {
    private int indexId;
    private String name;
    private String code;
    private String type01;
    private int type01Code;
     private String type02;
    private int type02Code;
     private String type03;
    private int type03Code;
    
    
      public ModuleTag( int IndexId, String Name, String Code, String Type01, int Type01Code ,String Type02 ,int Type02Code ,String Type03, int Type03Code ){
       this.indexId= IndexId;
        this.name = Name;
        this.code = Code;
        this.type01 = Type01;
        this.type02 = Type02;
        this.type03 = Type03;
        this.type01Code = Type01Code;
        this.type02Code = Type02Code;
        this.type03Code = Type03Code;    
        }
      
        public int getIndexId(){
           return indexId;
       }
        
        public String getName(){
            return name;
        }
        
        public String getCode(){
            return code;
        }
        
        public String getType01(){
            return type01;
        }
        
        public String getType02(){
            return type02;
        }
        
        public String getType03(){
            return type03;
        }
        
        public int getType01Code(){
            return type01Code;
        }
        
        public int getType02Code(){
            return type02Code;
        }
        
        public int getType03Code(){
            return type03Code;
        }
}
