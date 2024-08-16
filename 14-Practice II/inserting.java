public class inserting {
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=3;
        A[1]=5;
        A[2]=7;
        A[3]=9;
        A[4]=11;
        A[5]=13;
        int n=6;
        for (int i=0;i<n;i++) {
            System.out.print(A[i] +",");
        }
        System.out.println("");




        int X=21;
        int index=4;
        for (int i = n; i > index; i--) {
            A[i]=A[i-1];
        }
        A[index]=X;




        for (int i=0;i<n;i++) {
            System.out.print(A[i] +",");
        }
        System.out.println("");
    }
}
