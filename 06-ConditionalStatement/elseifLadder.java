public class elseifLadder {
    public static void main(String[] args) {
        int a=5,b=6,c=8;
        if(a>b&&a>c){
            System.out.println(a+" is greater than both "+b+ " and "+ c);
        }else if(b>c){
            System.out.println(b+" is greater than both "+a+ " and "+ c);
        }else{
            System.out.println(c+" is greater than both "+b+ " and "+ a);
        }
    }
}
