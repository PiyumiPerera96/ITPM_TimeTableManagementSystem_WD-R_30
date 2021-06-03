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
public class LocationC {
    
    private int locationId;
    private String buildingName;
    private String  roomNumber;
    private int capacity;
    private String roomType;
    
    public LocationC(int LocationId, String BuildingName, String  RoomNumber, int Capcity,String RoomType){
        this.buildingName = BuildingName;
        this.roomNumber = RoomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.locationId = LocationId;
                
    }
    
    public int getLocationId(){
        return locationId;
    }
       public String getBuildingName(){
        return buildingName;
    }
       
       public String getRoomNumber(){
           return roomNumber;
       }
       
       
       public int getCapacity(){
           return capacity;
       }
       
       public String getRoomType(){
           return roomType;
       }
}
