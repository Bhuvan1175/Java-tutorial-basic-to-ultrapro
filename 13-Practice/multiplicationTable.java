public class multiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 32; i++) {
            System.out.println("\n Table of "+i+ "\n");
            for (int j = 1; j < 11; j++) {
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }
}
