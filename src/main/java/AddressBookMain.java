import java.util.*;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

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

        ArrayList<ContactDetails> contactList = addressBook.contactList(cd);
        for (ContactDetails contact : contactList) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getAddress() + " " + contact.getCity() +
                    " " + contact.getState() + " " + contact.getEmail() + " " + contact.getPhoneNumber() + " " + contact.getZip());
        }
    }
}