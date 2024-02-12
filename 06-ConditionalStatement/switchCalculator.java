import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of a :");
        int a=sc.nextInt();
        System.out.print("Enter Value of b :");
        int b=sc.nextInt();
        System.out.println("Arithmatic Operation");
        System.out.println("-------------------------------------");
        System.out.println("For Addition Press          : +");
        System.out.println("For Subtraction Press       : -");
        System.out.println("for Multiplication Press    : * ");
        System.out.println("For Division Press          : /");
        System.out.println("-------------------------------------");
        System.out.print("Press The Key :");
        
        String operator =sc.next();
        switch (operator) {
            case "+":
                System.out.println("Addition :"+(a+b));
                break;
            case "-":
                System.out.println("Subtraction :"+ (a-b));
                break;
            case "*":
                System.out.println("Multiplication :"+(a*b));
                break;
            case "/":
                System.out.println("Divison : "+(a/b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();
    }
}
