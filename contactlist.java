public abstract class Contact {

    private String contactId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String contactId,String firstName,String lastName, String address, String phoneNumber, String emailAddress)
    {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public void setContactId(String input){
        this.contactId = input;
    }
    public String getContactId(){
        return contactId;
    }

    public void setFirstName(String input){
        this.firstName = input;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String input){
        this.lastName = input;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAddress(String input){
        this.address = input;
    }
    public String getAddress(){
        return address;
    }

    public void setPhoneNumber(String input){
        this.phoneNumber = input;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmailAddress(String input){
        this.emailAddress = input;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    void displayContact(){
        System.out.println("Contact ID:" + contactId + " First Name:" + firstName + " Last Name:" + lastName);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email Address:" + emailAddress);
    }

}