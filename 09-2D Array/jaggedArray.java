public class jaggedArray {
    public static void main(String[] args) {
        int B[][]={{1,2},{1,2,3,4,5},{1,2,3}};
        // int B[][];
        // B = new int[3][];
        // B[0] = new int[2];
        // B[1] = new int[5];
        // B[2] = new int[3];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
