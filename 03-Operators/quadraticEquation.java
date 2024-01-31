import java.util.Scanner;

public class quadraticEquation {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter the coefficients of Quadratic equation: ");
        System.out.println("a =");
        a = sc.nextInt();
        System.out.println("b =");
        b = sc.nextInt();
        System.out.println("c =");
        c = sc.nextInt();

        int Discriminant = b * b - 4 * a * c;

        if (Discriminant > 0) {
            System.out.println("Discriminant Says Its Has Two Distint Root");
        } else if (Discriminant == 0) {
            System.out.println("The Equation has One Real root");
        } else {
            System.out.println("Discriminant says its Has No real Roots");
        }

        r1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
        r2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
        System.out.println("The Roots of " + a + "x^2 + " + b + "x + " + c + " = 0 is : " + r1 + " and " + r2);

        sc.close();
    }

}
