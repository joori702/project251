
package cpit251;

import java.util.ArrayList;

public class Owner extends user{
    //attributes
    public String BusinessName;
    
   //Constructors
   public Owner(String firstName, String lastName, String BusinessName, String phoneNumber, String email, String id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
        this.BusinessName = BusinessName;
    }

    public Owner() {
    }
    
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }
    
    //methods
     void addOwner(ArrayList<Owner> AddOwner, Owner Oinfo) {
        AddOwner.add(Oinfo);
        System.out.println(Oinfo.toString());
    }
    
}
