
package cpit251;

/**
 *
 * @author DELL
 */
public class Owner extends user{
    //attributes
    private String BusinessName;
    
    //Constructor

    public Owner(String BusinessName, String firstName, String lastName, int phoneNumber, String email, int id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
        this.BusinessName = BusinessName;
    }
    
    
    //getters and setters

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }
    
}
