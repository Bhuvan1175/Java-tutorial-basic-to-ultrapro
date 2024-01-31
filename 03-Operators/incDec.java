public class incDec {
    public static void main(String[] args) {
        int x = 9;
        x++;
        System.out.println(x);

        int z = 5;
        int y = z++;
        System.out.println(z + " " + y);

        int a = 2;
        int c = 2 * a++ + 2 * ++a;// 2*2+2*4=12
        System.out.println(c);

        char alpha='A';
        alpha++;
        System.out.println(alpha);

        float f=3.4f;
        f++;
        System.out.println(f);
    }
}
