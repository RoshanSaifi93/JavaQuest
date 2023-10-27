import java.util.Scanner;

public class EvenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.println("Enter the range to print in Between prime");
         a=sc.nextInt();         
         b=sc.nextInt();
         int flag=1;
         if(a==1){
            a=2;
         }
         for(int i=a;i<=b;i++){
            for(int j=2;j<(i/2);j++){
                
                if(i%j==0){
                   flag=0;
                   break;
                }
               
            }
            if(flag==1){
                System.out.print(i+" ");
            }
            flag=1;
         }

        sc.close();

    }
}
