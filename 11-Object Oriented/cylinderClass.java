class cylinder {
    public double height;
    public double radius;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double circumfernce() {
        return 2 * Math.PI * radius;
    }

    public double surfaceArea() {
        return 2 * lidArea() + circumfernce() * height;
    }

    public double volume() {
        return lidArea() * height;
    }
}

public class cylinderClass {
    public static void main(String[] args) {
        cylinder C1 = new cylinder();
        C1.radius = 8;
        C1.height = 10;
        System.out.println("The area of the base is " + C1.lidArea());
        System.out.println("The perimeter of the cylinder is " + C1.circumfernce());
        System.out.println("The total surface area of the cylinder is " + C1.surfaceArea());
        System.out.println("The volume of the cylinder is " + C1.volume());
    }
}
