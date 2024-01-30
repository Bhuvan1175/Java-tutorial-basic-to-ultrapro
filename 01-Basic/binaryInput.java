import java.util.Scanner;
public class binaryInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.useRadix(2);
        System.out.println("Enter a number in Binary:");
        int x=sc.nextInt();
        System.out.println(x);
        sc.close();
    }
    
}
