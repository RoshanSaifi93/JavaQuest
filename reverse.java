import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for reverse");
         int p;
         p=sc.nextInt();
         //int temp=p;
         int sum=0;
         while(p>0){
            int digit=p%10;
            sum=digit+sum*10;
            p/=10;
         }
         System.out.println("Reverse is "+sum);

         sc.close();
    }
}
