import java.util.Scanner;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for print Fibonnaci series");
         int f;
         f=sc.nextInt();
         int f1=0;
         int f2=1;
         int next=1;
         System.out.println();
         if(f>2){
            
            System.out.print(0+" "+1);
         while(f!=0){
           next=f1+f2;
           System.out.print(" "+next);
           //int temp=f1;
           f1=f2;
           f2=next;    
            f--;
         }}
         else{
            System.out.println(0+" "+1);
         }
        sc.close();
    }
}
