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
    static ArrayList<Cousulter> AddCousulter = new ArrayList<Cousulter>();
    static ArrayList<Owner> AddOwner = new ArrayList<Owner>();
    static ArrayList<Manager> AddManager = new ArrayList<Manager>();
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       owner(scan, AddOwner);
       Manager(scan, AddManager);
       String choose = null;
       
       //login and signup
       do{
            System.out.println("-----------------------------------------------/n");
            System.out.println("               Welcome to Yusr                 /n");
            System.out.println("-----------------------------------------------/n");
            System.out.print("Choose L for Login and S for signup or E for exit: ");
            choose=scan.next();
        if(choose.equalsIgnoreCase("S")){
            System.out.print("Choose C for Cuonsulter and O for Owner and M for Manager: ");
            String choose1 = scan.next();
                if(choose1.equalsIgnoreCase("C")){
                       Cousulter (scan, AddCousulter);
                }
                else if(choose1.equalsIgnoreCase("O")){
                        owner(scan, AddOwner); 
                }
                else{
                     Manager(scan, AddManager); 
                }
        }
        else if(choose.equalsIgnoreCase("L"))
            System.out.println("Welcom Back");
        
        else
            System.out.println("Thank you, visit us again");
        }while(!choose.equalsIgnoreCase("E"));
     
        System.out.println("");

    
       
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

    private static void Manager(Scanner scan, ArrayList AddManager) {
        System.out.println("Enter to view services catalog: ");
        Services catalog = new Services();
        catalog.displayCatalog();
        
        System.out.println("Enter the sevice name: ");
        String serviceName = scan.next();
        
        System.out.println("Enter service description: ");
        String serviceDescription = scan.next();
        
        System.out.println("Enter service price: ");
        double servicePrice = scan.nextDouble();
        
        /*
        Manager sino = new Manager(catalog,serviceName ,serviceDescription,servicePrice );
        Services Sinfo = new Services(catalog,serviceName ,serviceDescription,servicePrice );
        sinfo.addService(addService ,Sinfo );
        */
        
        Manager M1 = new Manager();
        M1.addService(catalog, serviceName, serviceDescription, servicePrice);
        
        
    }

    private static void Cousulter(Scanner scan, ArrayList AddCousulter) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
