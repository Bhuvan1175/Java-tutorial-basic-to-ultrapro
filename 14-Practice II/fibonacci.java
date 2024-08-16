import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program of Fibonacci Series");
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series");
        System.out.print(a+","+b+",");
        for (int i = 0; i < n-2; i++) {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        sc.close();
    }
}
