package Func1;

import java.util.Scanner;

public class Calculator {
    static void print(String opr) {
        System.out.println("Enter Two number for " + opr);
    }

    static int[] input() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        int[] arr = { a, b };
        return arr;
    }

    static int Addaition() {

        print("Add");
        int[] arr = input();
        return arr[0] + arr[1];
    }

    static int Subtraction() {

        print("Subtraction");
        int[] arr = input();
        return arr[0] - arr[1];
    }

    static int Mutiplication() {

        print("Multiplication");

        int[] arr = input();
        return arr[0] * arr[1];
    }

    static int Division() {

        print("Division");
        int[] arr = input();
        return arr[0] / arr[1];
    }

    public static void main(String[] args) {

        
        System.out.println("Enter your Choice");
        System.out.println("1.Addaition");
        System.out.println("2.Subtraction");
        System.out.println("3.Mutiplication");
        System.out.println("4.Division");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:

                int res = Addaition();
                System.out.println("ADD:" + res);

                break;
            case 2:
                int res1 = Subtraction();
                System.out.println("Sub:" + res1);
                break;
            case 3:
                int res2 = Mutiplication();
                System.out.println("Mul:" + res2);
                break;
            case 4:
                int res3 = Division();
                System.out.println("Divide:" + res3);
                break;
            default:
                System.out.println("Enter valid input");
        }
        sc.close();

    }
}
