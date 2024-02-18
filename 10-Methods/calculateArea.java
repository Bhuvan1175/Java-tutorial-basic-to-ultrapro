public class calculateArea{
    
    
    static int Area(int length,int breadth){
        return length*breadth;
    }
    static double Area(int radius){
        return (Math.PI*radius*radius);
    }
    static double Area(double length,double width,double height) {
        return 0.5*(length+width)*height;
    }
    
    public static void main(String[] args) {
        System.out.println(Area(4,5,6));
    }
}