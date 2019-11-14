import java.util.Scanner;

public class Faculty extends User {

    public void logIn()
    {
        System.out.println("You're now in the Faculty Page");
    }

    public void displayChoice() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Type 1 for Add a new Faculty");
        System.out.println("Type 2 for Edit a Faculty");
        System.out.println("Type 3 for Hire a Faculty");
        int choice = kb.nextInt();
        switch (choice) {
            case 1:
                Faculty f = new Faculty();
                System.out.println("Please enter the new faculty information you wish to add: ");
                System.out.println("Please enter the name and id");
                String name = kb.nextLine();
                int id = kb.nextInt();
                System.out.println(name);
                System.out.println(id);
                break;
            case 2:
                System.out.println("Please select the faculty information you wish to edit: ");
                String name2 = kb.nextLine();
                int id2 = kb.nextInt();
                System.out.println(name2);
                System.out.println(id2);
                break;
            case 3:
                System.out.println("Please select the id number of the faculty you wish to hire: ");
                int id3 = kb.nextInt();
                System.out.println("Faculty " + id3 + " has been hired.");
                break;
        }
    }
    public void logOut()
    {
        System.out.println("You have now exited the Faculty Page");
    }

}
