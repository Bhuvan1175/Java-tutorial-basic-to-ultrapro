class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class circleCylinder {
    public static void main(String[] args) {
        Cylinder C = new Cylinder();
        C.radius = 7;
        C.height = 10;
        System.out.println("The volume of the cylinder is " + C.volume());
        System.out.println("The surface area of the cylinder is " + C.area());
    }
}
