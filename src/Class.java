import java.util.Scanner;
public class Class extends User{
    public void logIn()
    {

        System.out.println("You're now in the Classes Page");
    }

    public void displayChoice() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Type 1 for Add a new Class");
        System.out.println("Type 2 for Edit a Class");
        int choice = kb.nextInt();
        switch (choice) {
            case 1:
                Class c = new Class();
                System.out.println("Please enter the new class information you wish to add: ");
                System.out.println("Please enter the id, name and a description: ");
                int id = kb.nextInt();
                String name = kb.nextLine();
                String description = kb.nextLine();
                System.out.println(id);
                System.out.println(name);
                System.out.println(description);
                break;
            case 2:
                System.out.println("Please select the class information you wish to edit: ");
                int id2 = kb.nextInt();
                String name2 = kb.nextLine();
                String description2 = kb.nextLine();
                System.out.println(id2);
                System.out.println(name2);
                System.out.println(description2);
                break;
        }
    }

    public void logOut()
    {
        System.out.println("You have now exited the Class Page");
    }
}
