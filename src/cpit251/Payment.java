package cpit251;

import cpit251.Service;
import java.util.ArrayList;

/**
 *
 * @author rawan
 */
public class Payment {

    private String paymentOption;
    private String StoreName;
    private int orderID;
    private String customerFirstName;
    private String customerLastName;
    ;
    private String date;
    private double totalPrice;
    private double discount;
    private ArrayList<Service> orderinfo;

    public Payment() {
    }

    public Payment(String StoreName, String customerFirstName, String customerLastName) {

        this.StoreName = StoreName;
        this.orderinfo = new ArrayList<>();
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public int getBillID() {
        int billID = (int) ((100) * Math.random() + 1);
        return billID;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public void addServic(Service service){
        orderinfo.add(service);
    }

    public String printBill() {

        String servicesString = "";
        for (Service service : orderinfo) {
            servicesString += "\n" + service;
        }
        String result = "\n------------------------------------------------------------"
                + "\n                              Services STORE"
                + "\n------------------------------------------------------------"
                + "\n                        Store:" + this.StoreName
                + "\n\nInvoice No:" + getBillID() + "\n"
                + servicesString
                + "\n____________________________________________________________"
                + "\nSUBTOTAL: " + subTotal() + " SR"
                + "\nTOTAL: " + (subTotal() + calculateTax(subTotal())) + " SR";
        return result;
    }

    public double subTotal() {
        double price =0;
        for(Service service:orderinfo){
            price+=service.getPrice();
        }
        return price - discount;
    }

    public static double calculateTax(double subtotal) {
        return subtotal * 0.15;
    }
}
