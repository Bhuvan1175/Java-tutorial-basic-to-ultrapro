public class digitCount {
    public static void main(String[] args) {
        int n = 12345;
        int ori=n;
        int count = 0;
        while (n>0) {
            n/=10;
            count++;
        }
        System.out.println("Count of "+ori+" : "+count);
    }
}
