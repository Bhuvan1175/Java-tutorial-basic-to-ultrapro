import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Any Number :");
        a = sc.nextInt();
        System.out.println("You Entered Number is "+a);
        sc.close();
    }
}