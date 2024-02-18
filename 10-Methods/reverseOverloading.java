public class reverseOverloading {
    
    static int reversed(int num){
        int rev=0;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return rev;
    }
    static void reversed(int A[]){
        for(int i=A.length-1;i>=0;i--){
            System.out.print(" "+A[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(reversed(2345)); 
        int A[]={1,2,3,4,5};
        reversed(A); 
    }    
}
