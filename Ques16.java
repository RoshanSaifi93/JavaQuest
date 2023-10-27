package Func1;

//  WAP to print the  prime number between 1 to 100.
public class Ques16 {

    // for check its prime or not function
    static void isPrime() {
        // int num = 100;
        int flag = 1;

        for (int num = 2; num <= 100; num++) {
            for (int i = num/2; i >=2; i--) {
                if (num % i == 0) {
                    flag = 0;
                    break;

                }

            }
            if (flag == 1) {
                System.out.print(num + " ");
            }
            flag = 1;
        }
    }

    public static void main(String[] args) {
        isPrime();
    }
}
