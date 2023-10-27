import java.util.Scanner;

public class ArmstrongFun {

    static int countDig(int temp) {
        int count = 0;
        // System.out.println("We run first digit count");
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // power calculate
    static int power(int base, int exp) {
        int temp = 1;
        // System.out.println("We run power func");
        while (exp > 0) {
            temp = temp * base;
            exp--;
        }
        return temp;
    }

    // is arm finction
    static void isArm(int num) {
        int temp = num;
        int isArm = 0;
        // coundDigit
        int count = countDig(num);
        // calculate
        while (temp != 0) {
            int digit = temp % 10;
            isArm += power(digit, count);
            temp /= 10;
        }
        if (isArm == num) {
            System.out.println("Yes its armsrong");
        } else {
            System.out.println("Not arm");
        }

    }

    public static void main(String[] args) {
        // Solution obj1;
        // obj1.isArm(153);
       
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
         isArm(n);
        sc.close();
    }
}
