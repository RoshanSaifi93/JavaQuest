import java.util.Scanner;
public class Fact {
  public static void main(String[] args) {
    System.out.println("Enter the nume for factorial");
    Scanner sc=new Scanner(System.in);
    int l;
    l=sc.nextInt();
   double fact=1;
   while(l!=1){
    fact*=l;
    l--;
   }
   System.out.println("Factorial is ="+fact);
    sc.close();
  }  
}
