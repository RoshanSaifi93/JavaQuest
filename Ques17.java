package Func1;
//  WAP to print the even number and odd number between 1 to 100
public class Ques17 {
    static void isEven(){
        System.out.print("Even :");
           for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
           }
           System.out.println();
    }

      static void isOdd(){
        System.out.print("Odd :");
           for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
           }
    }
    public static void main(String[] args) {
        isEven();
        isOdd();
    }
}
