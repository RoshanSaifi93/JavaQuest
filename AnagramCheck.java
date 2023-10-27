import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] arr = str1.split("");
        String str2 = sc.nextLine();
        String[] arr2 = str2.split("");
        Arrays.sort(arr);
        for(String s:arr){
                    System.err.println(s);  

        }
        Arrays.sort(arr2);
     //   System.out.println(arr);
     int i=0;
     int flag=1;
           for(int j=0;j<arr.length;j++){
             System.out.println(arr[j]);

                 if(arr[j]==arr2[i]){
                    System.out.println(arr2[i]);
                    i++;
                    flag=1;
                 }
                 else{
                   flag=0;

                    break;
                 }
           }
           if(flag==1){
            System.out.println("True");
           }
           else{
             System.out.println("False");
           }
        // System.out.println(arr.equals(arr2));
       // int flag = 1;
        // for (int i = 0; i < arr.length; i++) {

        //     if (flag == 1) {
        //         for (int j = 0; j < arr2.length; j++) {
        //             if (arr[i] == arr2[j]) {
        //                 System.out.println(arr[j]);
        //                 flag = 1;                    
        //             } 
        //         }
        //     } 
        // }
        // if (flag == 1) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }

        sc.close();
    }
}
