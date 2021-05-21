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

    public boolean editContactDetails(String Name)
    {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(Name))
            {
                System.out.println("Enter the detail which needs to be updated:");

                System.out.println("1 : First Name of the contact to be edited");
                System.out.println("2 : Last Name of the contact to be edited");
                System.out.println("3 : Address of the contact to be edited");
                System.out.println("4 : City of the contact to be edited");
                System.out.println("5 : State of the contact to be edited");
                System.out.println("6 : Email of the contact to be edited");
                System.out.println("7 : Phone Number of the contact to be edited");
                System.out.println("8 : Zip of the contact to be edited");

                System.out.println("Select the index for the contact detail you want to edit ");

                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    {
                        System.out.println("Enter First Name: ");
                        String firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter last name: ");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Enter Address: ");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter City: ");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Enter State: ");
                        String state =sc.next();
                        contact.setState(state);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Enter Email: ");
                        String email = sc.next();
                        contact.setZip(email);
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Enter Phone Number:");
                        String phoneNumber = sc.next();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Enter Zip Code: ");
                        String zip = sc.next();
                        contact.setZip(zip);
                        break;
                    }

                }

                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    public boolean deleteContact(String name) {
        int flag = 0;
        for(ContactDetails contact: contactList)
        {
            if(contact.getFirstName().equals(name))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }
}

