import java.util.Scanner;

public class userAddition {
    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + c);
        obj.close();
    }
}
