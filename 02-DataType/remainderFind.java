import java.util.Scanner;

public class remainderFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of Divisor : ");
        double divisor = sc.nextDouble();
        System.out.print("Enter The Value of Quotient : ");
        double quotient = sc.nextDouble();
        System.out.print("Enter The value Of Dividend : ");
        double dividend = sc.nextDouble();
        double remainder = dividend - quotient * divisor;
        System.out.println("Remainder of Calculating " + dividend + " / " + divisor + " is : " + remainder);
        double remai = dividend % divisor;
        System.out.println("Remainder of Calculating " + dividend + " / " + divisor + " is : " + remai);
        sc.close();
    }
}
