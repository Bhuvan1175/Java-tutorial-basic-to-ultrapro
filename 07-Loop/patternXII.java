import java.util.Scanner;
public class patternXII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int n =sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

    sc.close();
    }

}
