import java.util.Scanner;

public class youngPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();
        if (age<30) {
            System.out.println("Young Person");
        }else{
            System.out.println("Older Person");
        }
        sc.close();

    }
}
