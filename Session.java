import java.util.Scanner;

public class Session {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);


       // System.out.println("Enter your choise "); ||
        System.out.println("To determine session like spring,summer,winter");        
        System.out.println("Enter Month(in number) ");
        int s;
        s=sc.nextInt();
        switch(s){
            case 3,4,5:System.out.println("Spring session");
                    break;
            case 6,7,8 :System.out.println("Summer session");
                         break;
            case 9,10,11:System.out.println("Autumn");
                         break;
            case 12,1,2:System.out.println("Winter");       
                         break;
            default:System.out.println("Enter only number b/w 1 to 12");
            }

            sc.close();
    }
}
