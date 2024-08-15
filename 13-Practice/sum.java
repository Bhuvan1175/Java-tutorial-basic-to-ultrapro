import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        System.out.print("Enter the any Natural Number :- ");
        n=sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            sum+=i;
        }
        System.out.println("SUM from 1 to "+n+" : "+sum);
        sc.close();
    }
}
