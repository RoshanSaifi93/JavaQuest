import java.util.Scanner;

public class inputasByte {
    public static void main(String[] args) throws Exception {
        // byte[] inputByte=System.in.readAllBytes();// its take input and not stop
        // int inputByte=System.in.read();// its take input and return first symbol
        // ascii values

        // System.out.println("This is your name:"+(char)inputByte);

        // so now have better method for store input container
        Scanner sc = new Scanner(System.in);
       System.out.println("Your roll");
        int roll = sc.nextInt();// it take input till not space
        System.out.println("Yoyr Roll"+roll);
        sc.nextLine();// this is solution
        System.out.println("Enter Your String");
                String name = sc.nextLine();

        System.out.println("Your string is:" + name);
////////////// In this we have to give input after rollNo then space  String name enter 
        sc.close();

    }
}
