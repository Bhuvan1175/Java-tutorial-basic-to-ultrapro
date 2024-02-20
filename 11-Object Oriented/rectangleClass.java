class rectangle{
    public int length;
    public int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class rectangleClass {
    public static void main(String[] args) {
        rectangle R1=new rectangle();
        R1.length=5;
        R1.breadth=7;
        System.out.println("Area of Rectangle is: "+R1.area());
        System.out.println("Perimeter of Rectangle is: "+R1.perimeter());
    }    
}
