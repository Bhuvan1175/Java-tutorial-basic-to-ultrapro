public class varargSum {
    
    static int Add(int ...A){
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Add(1,2,3));
    }
}
