class Cylinder {
    private int radius;
    private int height;
    
    // Parameterless constructor 
    public Cylinder() {
        radius = height = 1;
    }
    
    // Constructor with parameters
    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public int getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }
    public void setradius(int r){
         radius=r;
    }
    public void setheight(int h){
        height=h;
   }
    
    public int area() {
        return (int) (Math.PI * radius * radius);
    }
    
    public int volume() {
        return area() * height;
    }
}

public class cylinderConstructor {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setradius(10);
        c1.setheight(0);
        System.out.println("Area of default cylinder is: " + c1.area());
        System.out.println("Volume of default cylinder is: " + c1.volume());
    }    
}
