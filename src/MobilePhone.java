import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone
    {
        private Scanner scanner = new Scanner(System.in);
        private ArrayList<Contact> contacts;

        public MobilePhone()
            {
                contacts = new ArrayList<>();
            }

        //store (add) a contact
        public void addContact()
            {
                System.out.print("Enter name of contact: ");
                String name = scanner.nextLine();
                System.out.print("Enter the phone number for: " + name);
                String phoneNumber = scanner.nextLine();
                Contact contact = new Contact(name, phoneNumber);
                contacts.add(contact);
                System.out.println(name + "");
            }

        private boolean exists(String name)
            {
                if (contacts.isEmpty())
                    {
                        return false;
                    }
                for (Contact contact: contacts)
                    {
                        if (name.equalsIgnoreCase(contact.getName()))
                            {
                                return true;
                            }
                    }
                return false;
            }

        public void modify()
            {
                System.out.println("Input option");
                System.out.println("1: for modifying name");
                System.out.println("2: for modifying number");
                System.out.print("Option: ");
                String option = scanner.nextLine();
                if (option.equals("1"))
                    {
                        System.out.print("Input name to modify: ");
                        String name = scanner.nextLine();
                        if (exists(name))
                            {

                            }
                    }
            }
    }
