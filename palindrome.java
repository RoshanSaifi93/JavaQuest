import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for print Fibonnaci series");
         int p;
         p=sc.nextInt();
         int temp=p;
         int sum=0;
         while(p>0){
            int digit=p%10;
            sum=digit+sum*10;
            p/=10;
         }
         if(sum==temp){
            System.out.println("Yes its Palindrom"+sum);
         }
         else{
            System.out.println("No its not"+sum);
         }
         sc.close();
    }
}
