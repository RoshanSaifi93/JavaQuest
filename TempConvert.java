import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("1.Convert celcious to Fahernit");   
   System.out.println("2.Convert Fahernit to celcious ");
   int choice=sc.nextInt();
   switch(choice){
    case 1:
                 System.out.println("Enter the celcious Temperature");
                 int c=sc.nextInt();
                 float result=(c*9/5+32);
                 System.out.println("Fahernit:"+result+"°F");
                 break;
    case 2:
            System.out.println("Enter the Fahernite Temperature");
                        int f=sc.nextInt();       
                 float result2=((f-32)*5/9);
                 System.out.println("celcius:"+result2+" °C");
                 break;

   }
   sc.close();
    }
}
