
package cpit251;

import java.util.ArrayList;

public class report extends Services{

    //methods
    void generateReport(String firstName,ArrayList selectedServices, double totalPrice, double totalWithTax){
        System.out.println("------------------------------------------------------------------------");
        System.out.println(firstName+"'s report");
        System.out.println("Selected items:");
        System.out.println(selectedServices);
        System.out.println("Total Price:");
        System.out.println(totalPrice);
        System.out.println("Total Price with Tax:");
        System.out.println(totalWithTax);
        System.out.println("------------------------------------------------------------------------");
    }
   
}
