import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    public ArrayList<ContactDetails> contactList = new ArrayList<>();

    public  ArrayList<ContactDetails> contactList(ContactDetails cd){
        contactList.add(cd);
        return contactList;
    }

    public void addContactDetails(){
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the contact details: ");
        System.out.println("Enter the First Name: " );
        String firstName = sc.next();
        System.out.println("Enter the Last Name: " );
        String lastName = sc.next();
        System.out.println("Enter the Address: ");
        String address = sc.next();
        System.out.println("Enter the City: ");
        String city = sc.next();
        System.out.println("Enter the State: ");
        String state = sc.next();
        System.out.println("Enter the Email: ");
        String email = sc.next();
        System.out.println("Enter the Phone Number: ");
        String phoneNumber = sc.next();
        System.out.println("Enter the Zip Code: ");
        String zip = sc.next();
        ContactDetails cd = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);

    }

}