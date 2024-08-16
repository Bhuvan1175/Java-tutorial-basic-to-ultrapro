public class pattern_VII {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
