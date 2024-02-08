import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Year :");
        int Year=sc.nextInt();
        if(Year%4==0){
            if(Year%100==0){
                if(Year%400==0){
                    System.out.println("Its A Leap Year");
                }else{
                    System.out.println("Its Not Leap Year");
                }
            }else{
                System.out.println("Its Leap Year");
            }
        }else{
            System.out.println("Ordinary Year");
        }
        sc.close();
    }
}
