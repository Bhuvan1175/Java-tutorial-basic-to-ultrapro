import java.util.Scanner;
public class quadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.println("Enter the coefficients of the quadratic equation");
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        System.out.println("Enter the value of c");
        c=sc.nextInt();
        r1=(-b+Math.sqrt(b*b-4*a*c))/2;
        r2=(-b-Math.sqrt(b*b-4*a*c))/2;
        System.out.println("Roots Are :"+ r1+" "+r2);
        sc.close();
    }
}
