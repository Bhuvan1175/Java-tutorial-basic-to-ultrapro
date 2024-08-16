import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        int r;
        int numberOfDigit=Integer.toString(n).length();
        while (n>0) {
            r=n%10;
            n/=10;
            sum+=Math.pow(r,numberOfDigit);
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
