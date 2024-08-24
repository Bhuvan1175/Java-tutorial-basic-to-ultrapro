import java.util.Scanner;
public class areaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,breadth,height;
        System.out.println("Enter The Lenght of cuboid :");
        length=sc.nextInt();
        System.out.println("Enter The breadth of cuboid :");
        breadth=sc.nextInt();
        System.out.println("Enter The height of cuboid :");
        height=sc.nextInt();

        int totalAreaOfCuboid=2*(length*breadth+breadth*height+height*length);
        int volumeOfCuboid=length*breadth*height;
        System.out.println("Area of Cuboid :"+totalAreaOfCuboid);
        System.out.println("Volume of Cuboid :"+volumeOfCuboid);
        sc.close();
    }
    
}
