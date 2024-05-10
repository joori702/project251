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
    static ArrayList<Services> ServiceCatalog = new ArrayList<>();

//-----------------------------------------------------------------------------------
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
//       owner(scan, AddOwner);
//       Manager(scan, AddManager);
       String choose = null;
       
       //login and signup
       do{
            System.out.println("-----------------------------------------------\n");
            System.out.println("               Welcome to Yusr                 \n");
            System.out.println("-----------------------------------------------\n");
            System.out.print("Choose L for Login and S for signup or E for exit: ");
            choose=scan.next();
        if(choose.equalsIgnoreCase("S")){
            LandS(scan);
        }
        else if(choose.equalsIgnoreCase("L")){
            System.out.println("Welcome Back");
            LandS(scan);
        
        }else
            System.out.println("Thank you, visit us again");
        }while(!choose.equalsIgnoreCase("E"));
     
        System.out.println("");

    
       
      
    }
//--------------------------------------------------------------
    //display catalog section
 
  /**  
   public static void Cata(Scanner scan){
        double totalWithTax;
        double totalPrice = 0.0;
        int choice = 0;
//       Scanner input = new Scanner(System.in);  canceled
       Services catalog = new Services();
       ArrayList<Integer> selectedServices = new ArrayList<>();
       catalog.displayCatalog();
  
     
       while (true) 
       {
            if (scan.hasNextInt())
            {
                choice = scan.nextInt();
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
                scan.next();
            }
        }
      //compute the total amount of selected services
                    totalWithTax=ComputeTax(totalPrice)+totalPrice;
                    System.out.println("");
                    System.out.println("Total amount: " + (int)totalWithTax +" SR");
                    
    
    }
 */
    
    
    public static void LandS(Scanner scan){
        System.out.print("Choose C for Cuonsulter and O for Owner and M for Manager: ");
            String choose1 = scan.next();
                if(choose1.equalsIgnoreCase("C")){
                       Cousulter (scan, AddCousulter);
                       
                }
                else if(choose1.equalsIgnoreCase("O")){
                        owner(scan, AddOwner); 
                        //Cata(scan);
                        Services(scan, ServiceCatalog);//updated
                }
                else{
                     Manager(scan, AddManager); 
                     
                }
        
        
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
        Services(scan, ServiceCatalog);
        
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
        Services sCata = new Services();
        Services newAddService = new Services(serviceName, serviceDescription, servicePrice);
        sCata.addService(ServiceCatalog, newAddService);
        System.out.println("Service added successfully");
        
        
        
        
        
    }

    private static void Cousulter(Scanner scan, ArrayList AddCousulter) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Display catalog Section
    private static void Services(Scanner scan, ArrayList ServiceCatalog){
        
    Services s1 = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
    Services s2 = new Services("Business consulting", "Offer the best techniques for your concerns", 200.0);
    Services s3 = new Services("Technical issues", "We'll guide you to graphic designers and developers who suit the nature of your product", 300.0);
    Services s4 = new Services("Finish", "(calculate the total amount)", 0.0);

    Services sCata = new Services();
    sCata.addService(ServiceCatalog, s1);
    sCata.addService(ServiceCatalog, s2);
    sCata.addService(ServiceCatalog, s3);
    sCata.addService(ServiceCatalog, s4);
    sCata.displayCatalog(ServiceCatalog);
    
    int choice=0;
    double totalWithTax;
    double totalPrice = 0.0;
    ArrayList<Integer> selectedServices = new ArrayList<>();

    while (true)
    {
        if (scan.hasNextInt()) {
            choice = scan.nextInt();
            if (choice >= 1 && choice < ServiceCatalog.size()) {

                totalPrice += sCata.checkType(choice, ServiceCatalog);
                selectedServices.add(choice);
                System.out.print("Please enter the number corresponding to the next service you'd like to book: ");

            } else if (choice == ServiceCatalog.size() && totalPrice == 0.0) {
                System.out.println("Please enter the number corresponding to the next service you'd like to book:(You have to select a service)");
            } else if (choice == ServiceCatalog.size() && totalPrice != 0.0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and " + ServiceCatalog.size());
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scan.next();
        }
    }
                    totalWithTax=ComputeTax(totalPrice)+totalPrice;
                    System.out.println("");
                    
                    System.out.println("Total amount: " + (int)totalWithTax +" SR");
    
     
}
    
}
