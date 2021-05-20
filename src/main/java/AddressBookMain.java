
import java.util.*;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    addressBook.addContactDetails();
                    break;

                case 2:
                    flag =false;
                    break;
            }
        }
    }
}