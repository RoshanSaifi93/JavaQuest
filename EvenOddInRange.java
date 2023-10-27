//import java.util.ArrayList;
import java.util.Scanner;
public class EvenOddInRange {
    public static void main(String[] args) {

        System.out.println("Enter the range");
        Scanner sc=new Scanner(System.in);
        int l,r;
        l=sc.nextInt();       
        r=sc.nextInt();
        //ArrayList<int> a(l);
        System.out.println("Even ");
        for(int i=l;i<=r;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Odd ");
         for(int i=l;i<=r;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        sc.close();
        
    }
}
