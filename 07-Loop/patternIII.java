import java.util.Scanner;
public class patternIII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int n =sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n;j++){
                System.out.print((j+i)+" ");
            }
            System.out.println("");
        }
    sc.close();
    }

}
