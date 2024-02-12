import java.util.Scanner;

public class dayFromNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7:");
        int Day=sc.nextInt();
        if(Day==1)System.out.println( "Monday" );
        else if(Day==2)System.out.println("Tuesday");
        else if(Day==3)System.out.println("Wednesday");
        else if(Day==4)System.out.println("Thrusday");
        else if(Day==5)System.out.println("Friday");
        else if(Day==6)System.out.println("Saturday");
        else System.out.println("Sunday");
        sc.close();
    }
}
