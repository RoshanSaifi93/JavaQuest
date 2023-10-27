import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Enter the Num");
        Scanner sc=new Scanner(System.in);
        int num;
        int sum=0;
        num=sc.nextInt(); 
        int temp=num; 
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;

        }
        sc.close();
        System.out.println("SUM of given num"+temp+"= "+sum);
    }
}
