package Func1;

import java.util.Scanner;

//WAP to print the square root of a no.
public class Ques23 {
     static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number for SquareRoot of a given Number:");
        num=sc.nextInt();
          sc.close();
        return num;
    }

    static int squareRoot(int num){
        int ans=1;
        for(int i=1;i<=num;i++){
              if(i*i<=num){
               ans=i;
              }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(input()));
    }
}
