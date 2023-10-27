import java.util.Scanner;
public class menuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choise ");
        System.out.println("1.Addition");        
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        int choise=sc.nextInt();
        int a,b;
        System.out.println("ENter two number");
        a=sc.nextInt();                  
        b=sc.nextInt();
        switch(choise){
            case 1: 
                   System.out.println("Addition is "+(a+b));
                   break;
            case 2: 
                   System.out.println("subraction is "+(a-b));
                   break;
            case 3:  System.out.println("multipy is "+(a*b));
                   break;
            case 4:  System.out.println("division is "+(a/b));
                   break;
            default:System.out.println("ENter only 1,2,3,4");            
        }
        sc.close();
    }
}
