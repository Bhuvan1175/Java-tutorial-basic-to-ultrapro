import java.util.Scanner;

public class radixNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NAy Number :");
        String num=sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Octale Radix 8");
        }else if(num.matches("[0-9 A-F]+")){
            System.out.println("Hexadecimal Radix 16");
        }else if(num.matches("[0-9]+")){
            System.out.println("Decimal Radix 10");
        }else{
            System.out.println("Invalid Radix");
        }
        sc.close();
    }
}
