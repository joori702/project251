/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HQ
 */
public class Cpit251 {
    
    public static double ComputeTax(double total){
        return total*0.15;
    }
    
    static ArrayList<Owner> AddOwner = new ArrayList<Owner>();
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       owner(scan, AddOwner);
       
       //display catalog section
       double totalWithTax;
       double totalPrice = 0.0;
       int choice = 0;
       Scanner input = new Scanner(System.in);
       Services catalog = new Services();
       ArrayList<Integer> selectedServices = new ArrayList<>();
       catalog.displayCatalog();
  
     
       while (true) 
       {
            if (input.hasNextInt())
            {
                choice = input.nextInt();
                if (choice >= 1 && choice < catalog.getServiceNames().size()) {
                    
                    totalPrice += catalog.checkType(choice);
                    selectedServices.add(choice);
                    System.out.print("Please enter the number corresponding to the next service you'd like to book: ");
                    
                } else if (choice == catalog.getServiceNames().size() && totalPrice == 0.0) {
                    System.out.println("Please enter the number corresponding to the next service you'd like to book:(You have to select a service)");
                } else if (choice == catalog.getServiceNames().size() && totalPrice != 0.0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + (catalog.getServiceNames().size() ));
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
      //compute the total amount of selected services
                    totalWithTax=ComputeTax(totalPrice)+totalPrice;
                    System.out.println("");
                    System.out.println("Total amount: " + (int)totalWithTax +" SR");
                    input.close();
    }
    
    public static void owner(Scanner scan,ArrayList AddOwner){
        System.out.print("Enter owner First name: ");
        String firstName = scan.next();
        
        System.out.print("Enter owner last name: ");
        String lastName = scan.next();
        
        System.out.print("Enter store name: ");
        String BusinessName = scan.next();
        
        System.out.print("Enter onwe PhoneNumber: ");
        String phoneNumber = scan.next();
        
        System.out.print("Enter store Email: ");
        String email = scan.next();
        
        System.out.print("Enter store ID: ");
        String id = scan.next();
        
        System.out.print("Enter store password: ");
        String passWord = scan.next();
        
        
        Owner Oinfo = new Owner( firstName, lastName, BusinessName, phoneNumber, email, id, passWord);
        Oinfo.addOwner(AddOwner, Oinfo);
    }
     
}
