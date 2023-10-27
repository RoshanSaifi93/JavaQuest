import java.util.Scanner;

public class Interstfun {
    static void interstCalc(int p,int r,int t){
        float res=(p*r*t)/100;
        System.out.println("Annual value you give : "+res);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        System.out.println("Enter Principle value");
        p=sc.nextInt();
         System.out.println("Enter rate value");
        r=sc.nextInt();
         System.out.println("Enter time value");
        t=sc.nextInt();
   sc.close();
        interstCalc(p,r,t);

    }
}
