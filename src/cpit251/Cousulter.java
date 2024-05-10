
package cpit251;

import java.util.ArrayList;

class Cousulter extends user {

    public Cousulter(String firstName, String lastName, String phoneNumber, String email, String id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
    }

    
    
      void addCousulter(ArrayList<Cousulter> AddCousulter, Cousulter Cinfo) {
        AddCousulter.add(Cinfo);
        System.out.println(Cinfo.toString());
    }
}
