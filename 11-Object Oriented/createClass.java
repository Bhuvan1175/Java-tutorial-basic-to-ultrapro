class create{
    public int a;
    public double value(){
        return a;
    }
}
public class createClass {
    public static void main(String[] args) {
        create c1=new create();
        c1.a=5;
        System.out.println(" Value of variable 'a' is: "+c1.value());
    }
}
