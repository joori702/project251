/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

/**
 *
 * @author HQ
 */
import java.util.ArrayList;

 public class Services {
     /**
    // Arrays to store service details
    private ArrayList<String> serviceNames;
    private ArrayList<String> descriptions;
    private ArrayList<Double> prices;
*/
    private String name;
    private String description;
    private double price;
    static ArrayList<Services> ServiceCatalog = new ArrayList<>();
    public Services(){
     
 }
public Services(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
}
public String getName() {
        return name;
    }

    // Getter method for description
    public String getDescription() {
        return description;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }
    
/**
public Services(){
        serviceNames = new ArrayList<>();
        descriptions = new ArrayList<>();
        prices = new ArrayList<>();

        // Add service details
        serviceNames.add("shipment companies");
        descriptions.add("help to choose the best company to ship your products");
        prices.add(100.0);

        serviceNames.add("business consulting");
        descriptions.add("Offer the best techniques for your concerns");
        prices.add(200.0);

        serviceNames.add("technical issues");
        descriptions.add("We'll guide you to graphic designers and developers who suit the nature of your product");
        prices.add(300.0);

        serviceNames.add("Finish");
        descriptions.add("(calculate the total amount)");
        prices.add(0.0);
}
*/
    /**
public Services(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    
}
// Getter method for serviceNames
    public ArrayList<String> getServiceNames() {
        return serviceNames;
    }

    // Getter method for descriptions
    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    // Getter method for prices
    public ArrayList<Double> getPrices() {
        return prices;
    }
    */
    
/**
 public void displayCatalog() {
        System.out.println(".............................Welcome to our services catalog.............................\n");

        for (int i = 0; i < serviceNames.size() - 1; i++) {
            System.out.println((i + 1) + ". " + serviceNames.get(i) + " : " + descriptions.get(i) + " - " + prices.get(i)+ " SR");
        }

        System.out.println(serviceNames.size() + ". " + serviceNames.get(serviceNames.size() - 1) + " " + descriptions.get(serviceNames.size() - 1));
        System.out.println("Please enter the number corresponding to the service you'd like to book: ");
    }
    */
    
    public static void addService(ArrayList<Services> ServiceCatalog, Services serviceDetails) {
        if(ServiceCatalog.size()>1){
            int indexToInsert = ServiceCatalog.size() - 1;
            ServiceCatalog.add(indexToInsert, serviceDetails);
        }else{
            ServiceCatalog.add(serviceDetails);
        }
    }
    
    public void displayCatalog(ArrayList<Services> serviceCatalog) {
//    Services s1 = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
//    Services s2 = new Services("Business consulting", "Offer the best techniques for your concerns", 200.0);
//    Services s3 = new Services("Technical issues", "We'll guide you to graphic designers and developers who suit the nature of your product", 300.0);
//    Services s4 = new Services("Finish", "(calculate the total amount)", 0.0);
//
//    Services sCata = new Services();
//    ServiceCatalog.add(s1);
//    ServiceCatalog.add(s2);
//    ServiceCatalog.add(s3);
//    ServiceCatalog.add(s4);
//    sCata.displayCatalog(ServiceCatalog);
    System.out.println(".............................Welcome to our services catalog.............................\n");

    for (int i = 0; i < serviceCatalog.size(); i++) {
        Services service = serviceCatalog.get(i);
        System.out.println((i + 1) + ". " + service.getName() + " : " + service.getDescription() + " - " + service.getPrice() + " SR");
    }

//    System.out.println("Please enter the number corresponding to the service you'd like to book:");
}

    public static ArrayList<Services> getServiceCatalog() {
        return ServiceCatalog;
    }

    public static void setServiceCatalog(ArrayList<Services> ServiceCatalog) {
        Services.ServiceCatalog = ServiceCatalog;
    }
     /**
// Method to check the type of service based on user choice and return the price
    public double checkType(int choice) {
        if (choice >= 1 && choice < serviceNames.size() ) {
            int index = choice - 1; // modify index to match array indexing
            // Display service details
            System.out.println("You have selected: " + serviceNames.get(index) + " service\n");
            return prices.get(index); // Return the price
        } else {
            return 0.0; // Invalid choice or "Finish" selected, return 0
        }
    }
    */
     public double checkType(int choice, ArrayList<Services> serviceCatalog) 
  {
    if (choice >= 1 && choice < serviceCatalog.size()) {
        // Display service details
        System.out.println("You have selected: " + serviceCatalog.get(choice - 1).getName() + " service\n");
        return serviceCatalog.get(choice - 1).getPrice(); // Return the price
    } else {
        return 0.0; // Invalid choice or "Finish" selected, return 0
    }
  }
}
