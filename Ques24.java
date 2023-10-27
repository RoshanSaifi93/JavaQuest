package Func1;

import java.util.Scanner;

// WAP to print sum of  1+2+3+.............................n 
public class Ques24 {
     static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter term to sum 1+2+3+4+....n :");
        num=sc.nextInt();
          sc.close();
        return num;
    }

    static int linearSum(int num){
        return (num*(num+1))/2;
    }
    public static void main(String[] args) {
        System.out.println(linearSum(input()));
    }
}
