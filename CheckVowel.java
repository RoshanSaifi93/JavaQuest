import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

        System.out.println("Enter Character");
        String c=sc.next();
        if(c.charAt(0)=='a'||c.charAt(0)=='e'||c.charAt(0)=='i'||c.charAt(0)=='u'||c.charAt(0)=='o' ){
            System.out.println("It is cahracter ");

        }
        else{
            System.out.println("It is consotent");
        }

        sc.close();


    }
}
