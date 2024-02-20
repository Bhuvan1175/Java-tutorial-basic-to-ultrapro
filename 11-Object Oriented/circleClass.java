class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class circleClass {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 5;
        System.out.println("c1 Area :" + c1.area());
        System.out.println("c1 Perimeter : " + c1.perimeter());
        System.out.println("c1 Circumference :" + c1.circumference());
    }
}
