import java.util.Scanner;
public class triangleArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int base, height;
        // float area;
        // System.out.println("Enter the base of the triangle:");
        // base=sc.nextInt();
        // System.out.println("Enter the height of the triangle:");
        // height=sc.nextInt();
        // area=0.5f*base*height;
        // System.out.println("Area Of Triangle :"+area);

        int a,b,c;
        float s;
        double heroins;
        System.out.println("Enter the first side of the triangle:");
        a=sc.nextInt();
        System.out.println("Enter the second side of the triangle:");
        b=sc.nextInt();
        System.out.println("Enter the third side of the triangle:");
        c=sc.nextInt();
        s=(a+b+c)/2;
        System.out.println("Area Of Triangle :"+s);
        heroins=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle :"+heroins);
        sc.close();

    }
}
