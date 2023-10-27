//package week2Frid.leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter year to check leap year or not");
   int y=sc.nextInt();
   if(y%400==0 || (y%100!=0 && y%4==0)){
        System.out.println("This is leap year"+y);
   }
    else{
                System.out.println("This is not  leap year "+y);
    }
   

   sc.close();
        
    }
}
