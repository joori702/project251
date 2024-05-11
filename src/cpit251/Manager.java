
package cpit251;

import java.util.ArrayList;

public class Manager extends user{
    private String name;
    private String description;
    private double price;
     //Constructor 
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
    
    
    /**
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
*/
    Services getService(String serviceName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
     void addManager(ArrayList<Manager> AddManager, Manager Minfo) {
        AddManager.add(Minfo);
        System.out.println(Minfo.toString());
    }
     
     
     
}