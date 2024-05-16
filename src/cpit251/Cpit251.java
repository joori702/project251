
package cpit251;

import static cpit251.Services.ServiceCatalog;
import java.util.ArrayList;
import java.util.Scanner;
import  static cpit251.Payment.payment;

public class Cpit251 {
 //--------------variable initialization section----------------------
    public static double totalWithTax;
    public static double totalPrice = 0.0;
    
    public static ArrayList<Integer> selectedServices = new ArrayList<>();
    static ArrayList<Cousulter> AddCousulter = new ArrayList<Cousulter>();
    static ArrayList<Owner> AddOwner = new ArrayList<Owner>();
    static ArrayList<Manager> AddManager = new ArrayList<Manager>();
 //---------------------------Main Section------------------------ 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       String choose = null;
       Services s1 = new Services("Shipment companies", "help to choose the best company to ship your products", 100.0);
       Services s2 = new Services("Business consulting", "Offer the best techniques for your concerns", 200.0);
       Services s3 = new Services("Technical issues", "We'll guide you to graphic designers and developers who suit the nature of your product", 300.0);
       Services s4 = new Services("Finish", "(calculate the total amount)", 0.0);

       Services sCata = new Services();
       ServiceCatalog.add(s1);
       ServiceCatalog.add(s2);
       ServiceCatalog.add(s3);
       ServiceCatalog.add(s4);
       
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
 //---------------------------Methods Section------------------------
  public static void LandS(Scanner scan){
        System.out.print("Choose C for Cuonsulter and O for Owner and M for Manager: ");
            String choose1 = scan.next();
                if(choose1.equalsIgnoreCase("C")){
                       Cousulter (scan, AddCousulter);
                       sessionsSchedule();
                }
                else if(choose1.equalsIgnoreCase("O")){
                        owner(scan, AddOwner); 
                        Services(scan, Services.getServiceCatalog());
                }
                else{
                     Manager(scan, AddManager); 
                     managerControls(scan);
                }
    }
 //--------------Compute Tax method----------------------    
   public static double ComputeTax(double total){
        return total*0.15;
    }
 
//--------------Add Owner method----------------------  
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
//--------------Add Manager method----------------------  
    public static void Manager(Scanner scan, ArrayList AddManager) {
        //adding a manager
        System.out.print("Enter manager First name: ");
        String firstName = scan.next();

        System.out.print("Enter manager last name: ");
        String lastName = scan.next();

        System.out.print("Enter manager PhoneNumber: ");
        String phoneNumber = scan.next();

        System.out.print("Enter store Email: ");
        String email = scan.next();

        System.out.print("Enter your ID: ");
        String id = scan.next();

        System.out.print("Enter your password: ");
        String passWord = scan.next();


        Manager Minfo = new Manager( firstName, lastName, phoneNumber, email, id, passWord);
        Minfo.addManager(AddManager, Minfo);

    }
//--------------Manager Controls method----------------------     
    public static void managerControls(Scanner scan) {
        report Report=new report();
        Owner owner= new Owner();
        
        Services s= new Services();
        
        System.out.println("Enter to 'v' to view services catalog or Enter 'p' to print a report: ");

        String choose2 = scan.next();
        
        if(choose2.equalsIgnoreCase("v")){

        s.displayCatalog(Services.getServiceCatalog());
        System.out.println("Enter the sevice name: ");
        String serviceName = scan.nextLine();
        scan.nextLine();
        
        System.out.println("Enter service description: ");
        String serviceDescription = scan.nextLine();
        
        System.out.println("Enter service price: ");
        double servicePrice = scan.nextDouble();
        
        Services newAddService = new Services(serviceName, serviceDescription, servicePrice);
        s.addService(Services.getServiceCatalog(),newAddService);
        System.out.println("Service added successfully");
        }
        
        else if(choose2.equalsIgnoreCase("p")){
        Report.generateReport(owner.getFirstName(), selectedServices, totalPrice, totalWithTax);
        }    
    }
//--------------Add Cousulter method----------------------  
   public static void Cousulter(Scanner scan, ArrayList AddCousulter) {
        
        System.out.print("Enter First name: ");
        String firstName = scan.next();

        System.out.print("Enter last name: ");
        String lastName = scan.next();

        System.out.print("Enter PhoneNumber: ");
        String phoneNumber = scan.next();

        System.out.print("Enter store Email: ");
        String email = scan.next();

        System.out.print("Enter employee ID: ");
        String id = scan.next();

        System.out.print("Enter your password: ");
        String passWord = scan.next();

        Cousulter Cinfo = new Cousulter( firstName, lastName, phoneNumber, email, id, passWord);
        Cinfo.addCousulter(AddCousulter, Cinfo);
    }
//--------------Print Cousulter Sessions Schedule method----------------------    
    public static void sessionsSchedule(){
    System.out.println("your sessions schedule for the week ");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Sunday:    1. 8-9am session,    2. 10-11am session,   3. 12-1pm session");
    System.out.println("Monday:    No Sessions");
    System.out.println("Tuesday:   1. 8-9am session,    2. 11-12am session");
    System.out.println("Wednesday: 1. 8-9am session,    2. 10-11am session,   3. 12-1pm session");
    System.out.println("Thursday:  1. 9-10am session,   2. 10-11am session,   3. 11-12am session");
    System.out.println("------------------------------------------------------------------------");
}
//--------------Display Catalog method----------------------    
    private static void Services(Scanner scan, ArrayList ServiceCatalog){
    Services sCata = new Services();
    sCata.displayCatalog(ServiceCatalog);
    
    int choice=0;
    double totalWithTax;
    double totalPrice = 0.0;
    ArrayList<Services> selectedServices = new ArrayList<>();
    System.out.println("Please enter the number corresponding to the service you'd like to book:");
    
    while (true)
    {
        if (scan.hasNextInt()) {
            choice = scan.nextInt();
            if (choice >= 1 && choice < ServiceCatalog.size()) {

                totalPrice += sCata.checkType(choice, ServiceCatalog);
                selectedServices.add(sCata.ServiceCatalog.get(choice - 1));
                System.out.print("Please enter the number corresponding to the next service you'd like to book: ");

            } else if (choice == ServiceCatalog.size() && totalPrice == 0.0) {
                System.out.println("Please enter the number corresponding to the next service you'd like to book:(You have to select a service)");
            } else if (choice == ServiceCatalog.size() && totalPrice != 0.0) 
            {
                break;

            } else {
                System.out.println("Invalid input. Please enter a number between 1 and " + ServiceCatalog.size());
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scan.next();
        }
    }
//--------------Payment method----------------------   
     payment(selectedServices);
    }

}     
