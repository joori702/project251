
package cpit251;

import java.util.ArrayList;

public class Manager extends user{

     //Constructor 
     public Manager( ){
    
    }
    public Manager(String firstName, String lastName, String phoneNumber, String email, String id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
    }
    
    public void addService(Services catalog, String serviceName, String description, double price) {
        // Get the ArrayLists from the Services class
        ArrayList<String> serviceNames = catalog.getServiceNames();
        ArrayList<String> descriptions = catalog.getDescriptions();
        ArrayList<Double> prices = catalog.getPrices();

        // Add the new service details
        serviceNames.add(serviceName);
        descriptions.add(description);
        prices.add(price);
    }
 
    
}