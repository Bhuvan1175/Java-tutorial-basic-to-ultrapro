import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        long fact=1;
        System.out.print("Enter the any Natural Number :- ");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" : "+fact);
        sc.close();
    }
}
