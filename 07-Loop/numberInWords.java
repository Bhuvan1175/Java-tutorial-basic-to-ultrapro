import java.util.Scanner;

public class numberInWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num =sc.nextInt();
        String words=" ";
        while(num>0){
            int r=num%10;
            num=num/10;
            words=words+r;
        }
        for(int i=words.length()-1;i>=0;i--){
            char c=words.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print( "Three " );
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print(" Seven ");
                    break;
                case '8':
                    System.out.print( "Eight " );
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
