import java.util.Scanner;
public class gpSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of a,r,n :");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=1;i<=n;++i){
            System.out.print(term+",");
            term=term*r;
        }
        sc.close();

    }
}
