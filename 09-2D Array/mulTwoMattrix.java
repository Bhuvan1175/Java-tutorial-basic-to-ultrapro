public class mulTwoMattrix {
    public static void main(String[] args) {
        int A[][]={{3,5,6},{7,9,8},{2,8,9}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[j][k];
                }
            }
        }
        for(int X[]:C){
            for(int Y:X){
                System.out.print(Y+" ");
            }
            System.out.println("\n");
        }
    }
}
 