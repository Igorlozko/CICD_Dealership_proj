import java.util.*;
public class Create_account_feature {

    // what the class has to be able to do:
    // bring up a menu and ask them to enter their name min 3 char
    // age over 18
    // branch location min 3 char

    // object created can be called upon to get data or information
  /*  static Scanner key = new Scanner(System.in);
    public  static void askforname(){
        System.out.println("Please enter yur name: ");
        String name = key.nextLine();
        String[] stringName = name("");
        System.out.println("Name entered :"+ name);
        System.out.println();
    }

    public static void askforage(){
        System.out.println("Please enter yur age: ");
        int age = key.nextInt();
        System.out.println("Age entered :"+age);
        System.out.println();
    }

*/
  public static   ArrayList<Cmake> list = new ArrayList<Cmake>();
  public static Scanner scan = new Scanner(System.in);
  public static boolean contain = false; // declare the boolean variable for store the status of name matching
public static void enter_car_make() {
    // enter the car make

   // ArrayList<Cmake> list = new ArrayList<Cmake>();
    String a = "";

    do {
        System.out.println("Enter your car make:  ");
        String car1 = scan.nextLine();
        Cmake cmake = new Cmake(); // initialize a new people object
        cmake.setName(car1); // set the name to above people
        list.add(cmake); // add car object into ArrayList of People
        System.out.println("Would you like to enter another make? (Y/N)");
        a = scan.nextLine();
    }
    while (a.equalsIgnoreCase("Y"));
}


    public static void search_car_make() {
        // should be a seperate piece of code
        // search for car make
        System.out.println("Pleaes enter the make for search");
        String name = scan.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(name + " is in position " + i);
                contain = true; // set contain variable to true when match the given name with people in ArrayList
                break; // if match the name, break the loop
            }
        }
        if (!contain) { // if not contain the people with given name in ArrayList, execute following message
            System.out.println("this people not contain in list");
        }
    }

}
