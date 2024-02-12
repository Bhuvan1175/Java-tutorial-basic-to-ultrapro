import java.util.Scanner;
public class patternXI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int n =sc.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n-i+1;j++){
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    sc.close();
    }

}
