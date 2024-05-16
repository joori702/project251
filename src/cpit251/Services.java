
package cpit251;

import java.util.ArrayList;

 public class Services {
    //attributes
    private String name;
    private String description;
    private double price;
    static ArrayList<Services> ServiceCatalog = new ArrayList<>();
    
    //Constructors
    public Services(){
     
 }
    public Services(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
}
  //getters and setters
   public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    public static ArrayList<Services> getServiceCatalog() {
        return ServiceCatalog;
    }

    public static void setServiceCatalog(ArrayList<Services> ServiceCatalog) {
        Services.ServiceCatalog = ServiceCatalog;
    }
    
    //methods
    public static void addService(ArrayList<Services> ServiceCatalog, Services serviceDetails) {
        if(serviceDetails.getName()!="Shipment companies"& serviceDetails.getName()!="Business consulting"&serviceDetails.getName()!="Technical issues"&serviceDetails.getName()!="Finish"){
            int indexToInsert = ServiceCatalog.size() - 1;
            ServiceCatalog.add(indexToInsert, serviceDetails);
        }else{
            ServiceCatalog.add(serviceDetails);
        }
    }
    
    public void displayCatalog(ArrayList<Services> serviceCatalog) {
    System.out.println(".............................Welcome to our services catalog.............................\n");

    for (int i = 0; i < serviceCatalog.size(); i++) {
        Services service = serviceCatalog.get(i);
        System.out.println((i + 1) + ". " + service.getName() + " : " + service.getDescription() + " - " + service.getPrice() + " SR");
    }
}
    
     public double checkType(int choice, ArrayList<Services> serviceCatalog) 
  {
    if (choice >= 1 && choice < serviceCatalog.size()) {

        System.out.println("You have selected: " + serviceCatalog.get(choice - 1).getName() + " service\n");
        return serviceCatalog.get(choice - 1).getPrice(); 
    } else {
        return 0.0; 
    }
  }
}
