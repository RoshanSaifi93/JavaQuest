package Func1;

//import java.util.Scanner;

// 13. WAP to check whether the entered character is vowel or not.
public class Ques13  {
    static char input() throws Exception{
   // byte[] inputBytes=System.in.readAllBytes();
     int inputByte=System.in.read();
    // System.err.println( (char)inputByte);
     return (char)inputByte;
        
    }
    static void check() throws Exception{
        char[] vowel={'a','e','i','o','u'};

        char c=input();
        int flag=0;

       for(int i=0;i<vowel.length;i++){
               if(vowel[i]==c){
                flag=1;
              
               }
       }
       if(flag==1){
        System.out.println("Yes itsVowel");
       }
       else{
        System.out.println("No, its not Vowel");
       }


    }
    public static void main(String[] args) throws Exception{
        // char c=input();
        check();
    }
}
