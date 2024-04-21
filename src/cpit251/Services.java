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

 public class Services {
    // Arrays to store service details
    private String[] serviceNames;
    private String[] descriptions;
    private double[] prices;

public Services(){
// Service names
        this.serviceNames = new String[]{"shipment companies", "business consulting", "technical issues","Finish"}; 
// Descriptions
        this.descriptions = new String[]{"help to choose the best comapny to ship yout products", "Offer the best techniques for your concerns", "We'll guide you to graphic designers and developers who suit the nature of your product","(calculate the total amount)"};
// Prices
        this.prices = new double[]{100.0, 200.0, 300.0, 0.0}; 
}
public String[] getServiceNames() {
        return serviceNames;
    }

    // Getter method for descriptions
    public String[] getDescriptions() {
        return descriptions;
    }

    // Getter method for prices
    public double[] getPrices() {
        return prices;
    }
 public void displayCatalog() {
    System.out.println(".............................Welcome to our services catalog.............................\n");

    for (int i = 0; i < serviceNames.length - 1; i++) {
        System.out.println((i + 1) + ". " + serviceNames[i] + " : " + descriptions[i] + " - " + (int)prices[i] + " SR");
    }

    System.out.println(serviceNames.length + ". " + serviceNames[serviceNames.length - 1] + " " + descriptions[serviceNames.length - 1]);
    System.out.println("Please enter the number corresponding to the service you'd like to book: ");
}
// Method to check the type of service based on user choice and return the price
public double checkType(int choice) {
        if (choice >= 1 && choice < serviceNames.length - 1) {
            int index = choice - 1; // modify index to match array indexing
            // Display service details
            System.out.println("You have selected: " + serviceNames[index] + " service\n");
            return prices[index]; // Return the price
        } else {
            return 0.0; // Invalid choice or "Finish" selected, return 0
        }
}
}