public class Human {
    String firstName;
    String lastName;
    static int id;

    {
        id++;
    }
    Human(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    void setFirstName(String fn){
        firstName = fn;
    }
    void setLastName(String ln){
        lastName = ln;
    }
    void getFirstName(){
        System.out.println("Name: "+firstName);
    }
    void getLastName(){
        System.out.println("Name: "+lastName);
    }
    void showHuman(){
        System.out.printf(" id: %d\n First name: %s \n Last name: %s \n", id, firstName ,lastName);
    }
}
