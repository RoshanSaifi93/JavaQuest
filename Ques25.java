package Func1;

import java.util.Scanner;

//WAP to print sum of 12+22+32+..........................n2 
public class Ques25 {
       static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter term to sum 1^2+2^2+3^2+4^2+....n^2 :");
        num=sc.nextInt();
          sc.close();
        return num;
    }

    static int squareSum(int num){
        return (num*(num+1)*(2*num +1))/6;
    }
    public static void main(String[] args) {
        System.out.println(squareSum(input()));
    }
}
