package getdatafb;

import com.restfb.Facebook;

/**
 *
 * @author DangVanTu
 */
public class MyDataFromFB {

    @Facebook("id")
    private String id;
    
    @Facebook("firstName")
    private String firstName;
    
    @Facebook("lastName")
    private String lastName;
    
    @Facebook("Name")
    private String fullName;
    
    @Facebook("email")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "User : " + id + " " + firstName + " " + lastName + " " + email;
    }
}
