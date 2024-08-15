public class prePostIns {
    public static void main(String[] args) {
        int a=2;
        int x=4;
        int b=5;
        // int c=a*x++ + b;
        int d=a*++x + b;
        // System.out.println(c);
        System.out.println(d);
    }
}
