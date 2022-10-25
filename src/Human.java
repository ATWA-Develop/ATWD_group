public class Human {
    String firstName;
    String lastName;
    String phoneNumber;
    static int id;

    {
        id++;
    }
    Human(String fn, String ln, String p){
        firstName = fn;
        lastName = ln;
        phoneNumber = p;
    }

    void setFirstName(String fn){
        firstName = fn;
    }
    void setLastName(String ln){
        lastName = ln;
    }
    void setPhoneNumber(String p){
        phoneNumber = p;
    }

    void getFirstName(){
        System.out.println("Name: "+firstName);
    }
    void getLastName(){
        System.out.println("Name: "+lastName);
    }
    void getPhoneNumber(){
        System.out.println("Phone number: "+phoneNumber);
    }
    void showHuman(){
        System.out.printf(" id: %d\n First name: %s \n Last name: %s \n Phone number: %s", id, firstName ,lastName, phoneNumber);
    }
}
