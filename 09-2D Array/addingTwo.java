public class addingTwo {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 3, 6, 9, 2 } };
        int B[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 3, 6, 9, 2 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((A[i][j] * B[i][j]) + " ");
            }
            System.out.println("\n");
        }
    }
}
 