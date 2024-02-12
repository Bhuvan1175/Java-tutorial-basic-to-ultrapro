import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println( "Sum  of the digits is : "+sum);
        if(sum==temp){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println( "It is not an Armstrong number");
        }
        sc.close();
    }    
}
