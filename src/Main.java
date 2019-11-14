import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ArrayList<User> userDB = new ArrayList<>();//database
        System.out.println("Admin Log in information");
        user.setId(001);
        user.setName("Prasanti");
        user.setUserEmail("admin1@gmail.com");
        user.setPassword("password");
        userDB.add(user);

        //check for userInfo arraylist
        for (User u : userDB) {
            System.out.println(u.getId());
            System.out.println(u.getName());
            System.out.println(u.getUserEmail());
            System.out.println(u.getPassword());
        } //this works

        System.out.println("Welcome to Prasanti's School System");
        Scanner kb = new Scanner(System.in);
        String loginYes = "yes";
        //prompt user to enter login info
        System.out.println("Would you like to login as Admin? (Y/N)");
        String a = kb.nextLine();
        if (a.equalsIgnoreCase("yes") || (a.equalsIgnoreCase("y"))){
            String yesNo = "yes";
            //check
            for (User u : userDB) {
                System.out.println("Please enter in your email: ");
                String e = kb.nextLine();
                System.out.println("Enter Admin password: ");
                String p = kb.nextLine();
                if (!u.getUserEmail().equalsIgnoreCase(e) && u.getPassword().equalsIgnoreCase(p)) {
                    System.out.println("Invalid email and/or password");
                } else if (u.getUserEmail().equalsIgnoreCase(e) && u.getPassword().equalsIgnoreCase(p)) {
                    do {
                        System.out.println("You logged in!");
                        System.out.println("What would you like to do? Please select a category (Student, Faculty, or Class) ");
                        System.out.println("Type 1 for Student");
                        System.out.println("Type 2 for Faculty");
                        System.out.println("Type 3 for Class");
                        System.out.println("Type 4 to view all the information");
                        int category = kb.nextInt();
                        switch (category) {
                            case 1:
                                Student s = new Student();
                                s.logIn();
                                s.displayChoice();
                                s.logOut();
                                break;
                            case 2:
                                Faculty f = new Faculty();
                                f.logIn();
                                f.displayChoice();
                                f.logOut();
                                break;
                            case 3:
                                Class c = new Class();
                                c.logIn();
                                c.displayChoice();
                                c.logOut();
                                break;
                            case 4:
                                Information i = new Information();
                                i.logIn();
                                i.displayInformation();
                                break;
                        }//end switch
                        System.out.println("Do you want to continue? (Yes/No)");
                        yesNo = kb.next();
                        System.out.println("");
                    }
                    while (yesNo.equalsIgnoreCase("yes"));
                    u.logOut();
                    System.out.println("BYE BYE");
                }//end else-if
                //end for
            }//end main
        } else {//end of if else statement for logging in as Admin
            System.out.println("Thank you for visiting Prasanti's School System.");
        }
    }
}