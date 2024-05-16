
package cpit251;

import static cpit251.Cpit251.ComputeTax;
import java.util.ArrayList;

public class Payment { 

//methods
public static void payment(ArrayList<Services> selectedServices) {
        double totalPrice = 0.0;

        // Calculate the total price of selected services
        for (Services service : selectedServices) {
            totalPrice += service.getPrice();
        }

        // Calculate the total amount with tax
        double totalWithTax = ComputeTax(totalPrice) + totalPrice;

        // Print the invoice
        generateInvoice(selectedServices, totalWithTax);
    }

public static void generateInvoice(ArrayList<Services> selectedServices, double totalPrice) {
    System.out.println("-----------------------------------------------");
    System.out.println("           Invoice for Selected Services      ");
    System.out.println("-----------------------------------------------");
    for (int i = 0; i < selectedServices.size(); i++) {
        Services service = selectedServices.get(i);
        System.out.println((i + 1) + ". " + service.getName() + " : " + service.getDescription() + " - " + service.getPrice() + " SR");
    }
    System.out.println("-----------------------------------------------");
    System.out.println("Total Amount: " + (int) totalPrice + " SR");
    System.out.println("-----------------------------------------------\n");
 }

}
