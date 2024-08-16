public class secondLargest {
    public static void main(String[] args) {
        int A[]={3,44,55,2,5,10,47,9,8,100};
        int max1,max2;
        max1=max2=A[0];
        for (int i = 0; i < A.length; i++) {
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            }else if(max2<A[i]){
                max2=A[i];
            }
        }
        System.out.println("Second Maximum Number : "+max2);
    }    
}
