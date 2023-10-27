package Func1;

import java.util.Scanner;

// WAP to reverse the no.
public class Ques21 {
     static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number for reverse Number:");
        num=sc.nextInt();
          sc.close();
        return num;
    }
    static int reverse(int num){
        int copyOfNum=0;
        while(num!=0){
            int digit=num%10;
            copyOfNum=copyOfNum*10+digit;
            num/=10;
        }
        return copyOfNum;
    }

    public static void main(String[] args) {
        System.err.println(reverse(input()));
    }
}
