import java.util.Scanner;

public class RecatangleParFun {
    static void rectanglePar(int l,int b){
        int res=2*(l+b);
        System.out.println("Parameter is "+res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int l,b;
      System.out.println("Enter length and breadth of Reactamhgle");
      l=sc.nextInt();
      b=sc.nextInt();
      rectanglePar(l,b);

    sc.close();
    }
}
