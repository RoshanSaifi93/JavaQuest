import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                boolean r=true;
                        int balance=2157;

        while(r){
        System.out.println("Enter your choise ");
        System.out.println("1.widthdraw");        
        System.out.println("2.Deposit");
        System.out.println("3.Balance Check");
        System.out.println("Exit ");
        int password=1234;
        int choise=sc.nextInt();
        switch(choise){
            case 1: System.out.println("ENter password");
                  int t=sc.nextInt();
                if(password==t){
                   System.out.println("ENter widthdraw amount");
                     int wid=sc.nextInt();
                     if(wid<=balance){
                        balance=balance-wid;
                        System.out.println("Successfully widthdraw"+wid);
                        
                     }        
            }
            else{
                System.out.println("PIn Incorrect");
            }

                   break;
            case 2: System.out.println("ENter password");
                  int t1=sc.nextInt();
                if(password==t1){
                   System.out.println("ENter deposit amount");
                     int depo=sc.nextInt();
                     balance+=depo;
                     System.out.println("Successfully deposit"+depo);
                }
                   break;
            case 3:  System.out.println("ENter password");
                  int t2=sc.nextInt();
                if(password==t2){
                   System.out.println("Your balance "+balance);
                }
           
                   break;
            case 4: r=false;
            break;
            
            default:System.out.println("ENter only 1,2,3,4");            
        }
    }
        sc.close();
}

}