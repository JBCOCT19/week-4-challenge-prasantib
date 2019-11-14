import java.util.Scanner;

public class Student extends User {
    Student() {
    }

    public void logIn() {
        System.out.println("You're now in the Students Page!");
    }

    public void displayChoice() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Type 1 for Add a new Student");
        System.out.println("Type 2 for Edit a Student");
        System.out.println("Type 3 for Enroll a Student");
        int choice = kb.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter the name and id: ");
                String name = kb.nextLine();
                int studentId = kb.nextInt();
                System.out.println("Student id: " + studentId + "/n" + name + ".");
                break;
            case 2:
                System.out.println("Please select the information you wish to edit: ");
                String name2 = kb.nextLine();
                int id2 = kb.nextInt();
                System.out.println(name2);
                System.out.println(id2);
                break;
            case 3:
                System.out.println("Please select the id number of the student you wish to enroll: ");
                int id3 = kb.nextInt();
                System.out.println("Student " + id3 + " has been enrolled");
                break;
        }
    }

    public void logOut() {
        System.out.println("You have now exited the Faculty Page");
    }
}
