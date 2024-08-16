public class maximum {
    public static void main(String[] args) {
        int A[]={3,44,55,2,5,10,47,9,8,100};
        int max=A[0];
        for (int i = 0; i < A.length; i++) {
            if(max<A[i]){
                max=A[i];
            }
        }
        System.out.println("maximum Number : "+max);
    }    
}
