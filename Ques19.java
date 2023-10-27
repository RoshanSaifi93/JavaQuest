package Func1;
//  WAP to print the Fibonacci series
import java.util.Scanner;

public class Ques19 {

      static int input(){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter term till to print Fibonaci series:");
        num=sc.nextInt();
          sc.close();
        return num;
      
    }

    static void Fibonacci(int num){
        int first=0;
        int second=1;
        int next=first+second;
        if(num==1){
        System.out.println(first);
        }
        else if(num==2){
            System.out.println(0+" "+1);
        }
        else{
            while(num!=0){
                System.err.print(first+" ");
                next=first+second;
                first=second;
                second=next;
                num--;
            }
        }
    }


    public static void main(String[] args) {
        int num=input();
        Fibonacci(num);
    }
}
