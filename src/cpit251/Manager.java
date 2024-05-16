
package cpit251;

import java.util.ArrayList;

public class Manager extends user{
    //attributes
    private String name;
    private String description;
    private double price;
    
    //Constructors
    public Manager( ){
    
    }
    public Manager(String firstName, String lastName, String phoneNumber, String email, String id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
    }
    
    public Manager(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
}
    //getters and setters
    Services getService(String serviceName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
    //methods
     void addManager(ArrayList<Manager> AddManager, Manager Minfo) {
        AddManager.add(Minfo);
        System.out.println(Minfo.toString());
    }
     
     
     
}