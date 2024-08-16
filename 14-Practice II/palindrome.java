import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str1=sc.nextLine();
        String reverse="";
        for (int i = str1.length()-1; i >=0; i--) {
            reverse+=str1.charAt(i);
        }
        System.out.println("Original String : "+str1);
        System.out.println("Reverse String :"+reverse);
        if (str1.equals(reverse)) {
            System.out.println("Its Palindrome String");
        }else{
            System.out.println("Its Not Palindrome String");
        }
        sc.close();
    }
}
