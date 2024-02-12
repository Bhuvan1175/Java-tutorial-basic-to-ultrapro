import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the number of rows you want in your multiplication table:");
        int n =sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " : " + (n * i));
        }
        sc.close();
    }
}
