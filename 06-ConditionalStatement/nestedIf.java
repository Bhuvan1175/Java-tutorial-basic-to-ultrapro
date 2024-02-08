public class nestedIf {
    public static void main(String[] args) {
        int a=5,b=6,c=8;
        if(a>b&&a>c){
            System.out.println("A is greater than both B and C");
        }
        else{
            if (b>c) {
                System.out.println("B is greater than C");
            }
            else{
                System.out.println( "C is greater than B" );
            }
        }
    }
}
