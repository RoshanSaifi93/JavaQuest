import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number to check prime or not");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int flag=0;
        for(int i=2;i<=p/2;i++){
            if(p%i==0){
                flag=1;
                break;

            }
        }
        if(flag==0){
            System.out.println("Prime yes");
        }
        else{
            System.out.println("Not prime");

        }

        sc.close();
    }
}
