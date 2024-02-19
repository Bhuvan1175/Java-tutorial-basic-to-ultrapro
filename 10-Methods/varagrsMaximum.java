public class varagrsMaximum {
    
    static int Max(int ...A){
        if(A.length==0) return Integer.MIN_VALUE;
        int m=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>m){
                m=A[i];
            }
        }
        return m;
    }
    
    public static void main(String[] args) {
        System.out.println(Max(12,1,3,14,6,67,8,8));
    }
}
