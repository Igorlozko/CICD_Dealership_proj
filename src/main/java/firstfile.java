import java.util.Scanner;

public class firstfile {

    public static void main(String args[]){
     //   System.out.println("Hello");
       // Create_account_feature.askforname();
       // Create_account_feature.askforage();
        System.out.println("User enter \n\re: enter a new car make\n\rs:search for a car make ");
         Scanner ui = new Scanner(System.in);
         if(ui.equals("e")){
             Create_account_feature.enter_car_make();
         }
         else if(ui.equals("s")){
             Create_account_feature.search_car_make();
         }
         else
         {
             System.out.println("Incorrect varible");
         }


    }

}
