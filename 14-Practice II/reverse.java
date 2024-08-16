import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = sc.nextInt();
        int temp=n;
        int rev=0;
        int r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Original Num : "+temp);
        System.out.println("Rverse Num : "+rev);
        sc.close();
    }
}
