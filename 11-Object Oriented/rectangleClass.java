class Rectangle {
    private double length;
    private double breadth;

    public double getlength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setlength(double l) {
        length = l;
    }

    public void setbreadth(double b) {
        breadth = b;
    }

    public double Area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class rectangleClass {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setlength(10.5);
        R1.setbreadth(6.7);
        System.out.println("Area Of Rectangle :" + R1.Area());
        System.out.println("Perimeter Of Rectangle :" + R1.perimeter());
        System.out.println("Length :" + R1.getlength());
        System.out.println("Breadth :" + R1.getbreadth());
    }
}
