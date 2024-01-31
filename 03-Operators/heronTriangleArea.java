import java.util.Scanner;
public class heronTriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a,b,c,s;
        System.out.println("Enter The Length of Side 1 :");
        a=sc.nextFloat();
        System.out.println("Enter The Length of Side 2 :");
        b=sc.nextFloat();
        System.out.println("Enter The Length of Side 3 :");
        c=sc.nextFloat();

        s=(a+b+c)/2;
        double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area Of Heron Triangle is :"+Area);
        sc.close();
        

    }
}

