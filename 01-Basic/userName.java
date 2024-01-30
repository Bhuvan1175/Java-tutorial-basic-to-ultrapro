import java.util.Scanner;
public class userName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name;
        name=sc.nextLine();
        System.out.println("Helllo "+name);
        //Close the scanner to avoid resource leakage
        sc.close();
    }
}
