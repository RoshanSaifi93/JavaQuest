package Func1;

import java.util.Scanner;

//  WAP to check whether the given no. is prime or not.
public class Ques15 {
    // for user input
    static int input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Num. to chack its prime or not");
        int num=sc.nextInt();
             sc.close();
        return num;

   

    }
    // for check its prime or not function
    static void isPrime(){
        int num=input();
        int flag=1;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
               flag=0;

            }
            if(flag==0){
                System.out.println("No its not prime");
                break;
            }
        }
        if(flag==1){
            System.out.println("Yes its prime");
        }
    }
    public static void main(String[] args) {
        isPrime();
    }
}
