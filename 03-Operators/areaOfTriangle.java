import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter The Base of Triangle :");
        float triangleBase=sc.nextInt();
        System.out.println("\nEnter The Height Of Triangle :");
        float triangleHeight=sc.nextInt();
        float triangleArea=(triangleBase*triangleHeight)/2;
        System.out.println("Area Of Triangle with base "+triangleBase+ " and height "+triangleHeight+ " is : "+triangleArea);
        sc.close();
    }
}
