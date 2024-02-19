public class variableArguments {
    static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30,40,50);
        show(new int[]{1,2,3,4,5,6,7});// This is how we can pass Anonymus Array.
    }
}
