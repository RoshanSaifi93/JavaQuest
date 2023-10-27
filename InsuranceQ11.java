package Func1;

import java.util.Scanner;

public class InsuranceQ11 {
    // I am just do for git
    // Take User Details
    static void userDetails(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Person Name");
        String name=sc.nextLine();
        System.out.println("Enter Gender");
        String gender=sc.nextLine();
        System.out.println("Enter your age ");
        int age=sc.nextInt();
             // it not wait for take city input 
    // so aplly extra 
          sc.nextLine();

        System.out.println("Enter Your city with (metro/non-metro)");
        
        String city= sc.nextLine();
        System.out.println("Yout city:"+city+" male:"+gender);
     
     

        operation(name,gender,age,city);
           sc.close();
    }

    // opertion
    static void operation(String name, String gender, int age, String city) {
        System.out.println("Name:"+name+"Gender:"+gender+" age"+age+" city+:"+city);
        if (age >= 25 && age <= 35 && gender == "male" && city=="metro") {
            System.out.println("perium is 6%");
        }
        else  if (age >= 25 && age <= 40 && gender == "male" && city=="non-metro") {
                         System.out.println("perium is 4%");
        }
        else if (age >= 25 && age <= 42 && gender == "female" && city=="metro") {
            System.out.println("perium is 3%");
        }
        else  if (age >= 25 && age <= 45 && gender == "female" && city=="non-metro") {
                         System.out.println("perium is 2%");
        }
        else{
            System.out.println("Not Insured");
        }
    }

    public static void main(String[] args) {

        // user Detlis
        userDetails();
    }
}
