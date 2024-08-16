public class displayDigit {
    public static void main(String[] args) {
        int n = 12345;
        int r;
        while (n>0) {
            r=n%10;
            System.out.println(r);
            n/=10;
        }
        
    }
}
