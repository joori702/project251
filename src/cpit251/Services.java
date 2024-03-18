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
import java.util.*;


public class Services{
    private String name;
    private String Details;
    
    public Services(String name , String Details){
    this.name = name;
    this.Details = Details;
}
    public String getName(){
        return name;
    }

    public String getDetails() {
        return Details;
    }

    public String toString(){
      return name + " service :" + Details;
    }
    
 class ServicesCatalog{
 private List<Services> ListOfServices;
 
 public ServicesCatalog(){
     ListOfServices = new ArrayList<>();
     
     ListOfServices.add(new Services("shipment companies","help to chooes the best comapny to ship yout product") );
     ListOfServices.add(new Services("business consulting","provide best plans to your problems") );
     ListOfServices.add(new Services("technical issues ","We'll guide you to graphic designers and developers who suit the nature of your product") );   
 }

        public List<Services> getListOfServices() {
            return ListOfServices;
        } 
 }
 
}

