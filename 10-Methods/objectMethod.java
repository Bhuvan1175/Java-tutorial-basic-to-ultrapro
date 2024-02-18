public class objectMethod {
    static int maxi(int x,int y){
        if(x>y) return x;
        else return y;
    }    
    public static void main(String[] args) {
        int a=10,b=4;
        // objectMethod obj=new objectMethod();
        // int c=obj.maxi(a, b);
        System.out.println(maxi(a,b));
    }
}
