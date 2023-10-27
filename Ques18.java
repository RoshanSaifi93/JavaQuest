package Func1;

import java.util.Scanner;

//  WAP to print the sum of digit of a no.
public class Ques18 {

    static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
          sc.close();
        return num;
      
    }
    static void sumOfDigit(int num){
       int sum=0;
       int copy=num;
       while(num!=0){
        sum+=num%10;
        num/=10;
       }

       System.out.println("Sum of "+copy +": "+sum);

    }
    public static void main(String[] args) {
        int num=input();
        sumOfDigit(num);
    }
}
