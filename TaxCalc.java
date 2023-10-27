import java.util.Scanner;

public class TaxCalc {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your sallery");
        int sallery=sc.nextInt();
        if(sallery<=10000){
            System.out.println("No Tax apply");
        }
        else if(sallery>10000 && sallery<20000){
            System.out.println("Tax apply 10% on your Sallery"+sallery);
            System.out.println(" Tax apply is"+sallery*0.1);
            System.out.println(" Rest Sallery"+(sallery-sallery*0.1));

        }
 else if(sallery>20000 && sallery<30000){
            System.out.println("Tax apply 15% on your Sallery"+sallery);
            System.out.println("Tax apply is  "+sallery*0.15);
             System.out.println("Rest Sallery"+(sallery-sallery*0.15));

        }
        else{
             System.out.println("Tax apply 25% on your Sallery"+sallery);
            System.out.println("Tax apply is "+sallery*0.25); 
            System.out.println("rest sallery "+(sallery-sallery*0.25));
        }
        sc.close();
    }
}
