public class forEachLoop {
    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3, 4 }, { 2, 4, 6, 8 }, { 3, 6, 9, 2 } };
        for(int X[]:A){
            for(int Y:X){
                System.out.print(Y+" ");
            }
            System.out.println("\n");
        }
    }    
}
