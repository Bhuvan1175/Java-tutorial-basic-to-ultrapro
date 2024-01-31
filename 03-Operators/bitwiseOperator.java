public class bitwiseOperator {
    public static void main(String[] args) {
        int x=0b1010;
        int y=0b1111;
        int xor=x^y;
        System.out.println(xor);
        int z=x&y;
        int s=x|y;
        int l=x<<2;// left shift mean multiply by 2
        int r=x>>2;// right shift mean divide by 2
        System.out.println(z);
        System.out.println(s);
        System.out.println(l);
        System.out.println(r);
    }
}
