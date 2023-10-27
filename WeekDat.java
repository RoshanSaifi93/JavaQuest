import java.util.Scanner;
class  WeekDat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


       // System.out.println("Enter your choise ");
        System.out.println("To determone which day in week or weekend /weekDay");        
        System.out.println("Enter Day(in string ) ");
        String s;
        s=sc.nextLine();
        switch(s){

            case ("monday" ):System.out.println("Week Day");
                          break;
            case ("tuesday" ):System.out.println("Week Day");
                          break;
            case ("wednesday" ):System.out.println("Week Day");
                          break;
            case ("thrusday" ):System.out.println("Week Day");
                          break;
            case ("friday" ):System.out.println("Week Day");
                          break;
            case ("saturday" ):System.out.println("Weekend Day");
                          break;
            case ("sunday" ):System.out.println("WeekEnd Day");
                          break;
            default:System.out.println("Enter name like-monday,tuesday ...");

        }
        sc.close();
    }
}