//import java.lang.System;
//import java.io.*;
//import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arr[] = { 1, 2, 3, 7, 5 };

        int n = arr.length;
        int s = 10;

        int st = 0, sp = 1;
        int start = 0;
        int end = 0;
        int curr_sum = arr[st];
        for (int i = st + 1; i <= sp; i++) {
            curr_sum += arr[i];
            if (curr_sum == s) {
                start = st+1;
                end = sp+1;
                for (int j = start; j < end; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                System.out.println(start +" from postion" );
                System.out.println(end +" To this postion");
                break;
            } else if (curr_sum < s) {
                if (sp < n)
                    sp++;
                else {
                    break;
                }
            } else {
                st++;
                i = st;
                curr_sum = arr[i];
            }

        }

    }
}
