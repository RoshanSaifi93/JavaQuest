package Func1;

import java.util.Scanner;

//WAP to find the factorial of a no.
public class Ques20 {
     static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number to find factorial:");
        num=sc.nextInt();
          sc.close();
        return num;
      
    }
    static int factorial(int num){

        if(num==1)
        {
            return 1;
        }
        int result=num*factorial(num-1);
        return result;
    }
    public static void main(String[] args) {
        int num=input();
        System.out.println(factorial(num));
    }
}
